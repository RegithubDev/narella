package com.resustainability.reisp.controller;


import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Base64;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.resustainability.reisp.common.EMailSender;
import com.resustainability.reisp.model.LucknowUATPushAPIModel;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping("/reone")
public class VehicleRFIDDataPush {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    Logger logger = Logger.getLogger(VehicleRFIDDataPush.class);

    private static final String SOURCE_DB_URL = "jdbc:sqlserver://10.100.3.14:1433;databaseName=EasyWdms";
    private static final String SOURCE_USER = "sa";
    private static final String SOURCE_PASS = "Ramky#2022";

    // API Details
    private static final String API_URL = "https://mcdonline.nic.in/nnapi-ndmc/api/vehicleRFID/narela/pushVehicleRfidDetails";
    private static final String API_USER = "TRUSERAPI";
    private static final String API_PASS = "TRNINE2022";

    @RequestMapping(value = "/ajax/pushVehicleRFIDDataAPI", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String pushVehicleRFIDDataAPI(@RequestBody LucknowUATPushAPIModel obj, HttpSession session) {
        JSONObject responseJson = new JSONObject();
        String userId = null;
        String userName = null;
        String role = null;
        LocalDate fromDate = null;
        LocalDate toDate = null;
        boolean flag = false;
        long startTime = System.currentTimeMillis();
        String output = "";

        try {
            // Fetch session attributes
            userId = (String) session.getAttribute("USER_ID");
            userName = (String) session.getAttribute("USER_NAME");
            role = (String) session.getAttribute("BASE_ROLE");
            obj.setRole(role);

            if (!"reapi".equalsIgnoreCase(obj.getUser_name()) || !"DqwertyuiopI#&!187".equalsIgnoreCase(obj.getPassword())) {
                responseJson.put("200", "User Name or Password Incorrect!");
                return responseJson.toString();
            }

            // Date validation
            if (!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date()) && !StringUtils.isEmpty(obj.getTo_date() )) {
                String fromDateString = obj.getFrom_date();
                String toDateString = obj.getTo_date();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                if (fromDateString != null && !fromDateString.isEmpty()) {
                    fromDate = LocalDate.parse(fromDateString, formatter);
                }
                if (toDateString != null && !toDateString.isEmpty()) {
                    toDate = LocalDate.parse(toDateString, formatter);
                }
                // Check if fromDate is before toDate
                if (fromDate != null && toDate != null && fromDate.isBefore(toDate)) {
                    flag = true; // Proceed if fromDate is less than toDate
                }else if (fromDate != null && toDate != null && fromDate.equals(toDate)) {
                    flag = true; // Proceed if fromDate is less than toDate
                } else {
                    flag = false; // Handle the case where fromDate is not less than toDate
                    responseJson.put("200", "From date should be less than To date!");
                    return responseJson.toString();
                }
            }
       

            if (flag) {
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection conn = DriverManager.getConnection(SOURCE_DB_URL, SOURCE_USER, SOURCE_PASS);

                    // Get the latest record from `vechicleRFIDTransDetails` table
                    String latestRecordQuery = "SELECT TOP 1 [vehiclefidNo],increment_date_val, [log_date] FROM [dbDelhiRamkySWM].[dbo].[vechicleRFIDTransDetails] ORDER BY [increment_date_val] DESC";
                    Statement stmt = conn.createStatement();
                    ResultSet latestRecordRs = stmt.executeQuery(latestRecordQuery);

                    String latestVehiclefidNo = null;
                    Timestamp latestDateOfInspection = null;

                    if (latestRecordRs.next()) {
                        latestVehiclefidNo = latestRecordRs.getString("vehiclefidNo");
                        latestDateOfInspection = latestRecordRs.getTimestamp("log_date");
                    }

                    latestRecordRs.close();

                    // Build the main query based on the latest record
                    String query = "SELECT [TagId] as vehiclefidNo, [Lat] as latitude, [Lng] as longitude, " +
                            "[TDate] as dateOfInspection, [damaged], [gps], [vehicleCondition], " +
                            "[lastServiceDate], [creationMode] FROM [dbDelhiRamkySWM].[dbo].[UhfTransaction] " +
                            "WHERE TagId is not null ";

                    if (!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date()) && !StringUtils.isEmpty(obj.getTo_date() )) {
                    	  query = query+ " AND CAST([TDate] AS DATE) BETWEEN cast('"+obj.getFrom_date()+"' as date) AND cast('"+obj.getTo_date()+"' as date) ";
        	        } else if (!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getFrom_date())) {
        	        	  query = query+" AND CAST([TDate] AS DATE) = cast('"+obj.getFrom_date()+"' as date) ";
        	        } else if (!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getTo_date())) {
        	        	  query = query+" AND CAST([TDate] AS DATE) =  cast('"+obj.getTo_date()+"' as date) ";
        	        }

                    query = query+ " ORDER BY [TDate] DESC";

                    ResultSet rs = stmt.executeQuery(query);
                    JSONArray jsonArray = new JSONArray();

                    while (rs.next()) {
                        JSONObject obj1 = new JSONObject();
                        obj1.put("vehiclefidNo", rs.getString("vehiclefidNo"));
                        obj1.put("latitude", rs.getString("latitude"));
                        obj1.put("longitude", rs.getString("longitude"));
                        ZonedDateTime zonedDateTime = rs.getTimestamp("dateOfInspection")
                                .toLocalDateTime()
                                .atZone(ZoneId.of("Asia/Kolkata"));

                        String formattedDate = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
                       
                        
                        obj1.put("dateOfInspection", formattedDate);
                        obj1.put("damaged", rs.getString("damaged"));
                        obj1.put("gps", rs.getString("gps"));
                        obj1.put("vehicleCondition", rs.getString("vehicleCondition"));
                        
                        ZonedDateTime zonedDateTime2 = rs.getTimestamp("lastServiceDate")
                                .toLocalDateTime()
                                .atZone(ZoneId.of("Asia/Kolkata"));

                        String formattedDate2 = zonedDateTime2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
                       
                        
                        obj1.put("lastServiceDate",formattedDate2);
                        obj1.put("creationMode", rs.getString("creationMode"));

                        jsonArray.put(obj1);

                        // Insert into `vechicleRFIDTransDetails` table
                        String insertQuery = "INSERT INTO [dbDelhiRamkySWM].[dbo].[vechicleRFIDTransDetails] " +
                                "([vehiclefidNo],increment_date_val, [log_date]) VALUES (?, ?, getdate())";
                        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                        insertStmt.setString(1, rs.getString("vehiclefidNo"));
                        insertStmt.setTimestamp(2, rs.getTimestamp("dateOfInspection"));
                        insertStmt.executeUpdate();
                        insertStmt.close();
                    }

                    rs.close();
                    stmt.close();
                    conn.close();

                    // Push the data to the API
                    output = pushDataToAPI(jsonArray.toString());
                    System.out.println(jsonArray.toString());
                    logger.error("NAREELA VEHICLE DATA API :"+ output);	
					 //  EMailSender emailSender = new EMailSender();
	    			   // emailSender.send("saidileep.p@resustainability.com", "Narella - Vehicle Data","arun.kumar@resustainability.com", jsonArray.toString(), null, output);
	    			 
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (DateTimeParseException e) {
            responseJson.put("status", "error");
            responseJson.put("message", "Invalid date format. Please use 'yyyy-MM-dd'.");
            responseJson.put("responseTime", System.currentTimeMillis() - startTime + " ms");
        } catch (Exception e) {
            e.printStackTrace();
            responseJson.put("status", "error");
            responseJson.put("message", e.getMessage());
            responseJson.put("responseTime", System.currentTimeMillis() - startTime + " ms");
        }

        return output;
    }

    // Method to push data to API
    private static String pushDataToAPI(String jsonData) {
        StringBuilder response = new StringBuilder();
        boolean flag = true;
        try {
        	if(flag) {
                URL url = new URL(API_URL);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");

                String auth = API_USER + ":" + API_PASS;
                String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
                conn.setRequestProperty("Authorization", "Basic " + encodedAuth);

                conn.setDoOutput(true);
                try (OutputStream os = conn.getOutputStream()) {
                    os.write(jsonData.getBytes());
                    os.flush();
                }

                BufferedReader in;
                if (conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) {
                    in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                } else {
                    in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                }

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                conn.disconnect();
        	}
  

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response.toString();
    }
}
