package com.resustainability.reisp.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.resustainability.reisp.common.EMailSender;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
@Controller
public class Schedular {
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    } 
	public static Logger logger = Logger.getLogger(Schedular.class);
	
	@Autowired
	LoginController loginController;
	
	@Autowired
	
	@Value("${common.error.message}")
	public String commonError;
	
	@Value("${run.cron.jobs}")
	public boolean is_cron_jobs_enabled;
	
	@Value("${run.cron.jobs.in.qa}")
	public boolean is_cron_jobs_enabled_in_qa;
	

    private static final String SOURCE_DB_URL = "jdbc:sqlserver://10.100.3.14:1433;databaseName=EasyWdms";
    private static final String SOURCE_USER = "sa";
    private static final String SOURCE_PASS = "Ramky#2022";
    
    // API Details
    private static final String API_URL = "https://mcdonline.nic.in/nnapi-ndmc/api/vehicleRFID/narela/pushVehicleRfidDetails";
    private static final String API_USER = "TRUSERAPI";
    private static final String API_PASS = "TRNINE2022";
    
	/**********************************************************************************/
	
	//@Scheduled(cron = "${cron.expression.user.login.timeout11}")
	public void userLoginTimeout(){
		boolean flag = true;
		if(flag) {
		     logger.error("userLoginTimeout : Method executed every day. Current time is :"+ new Date());	    
		     JSONObject responseJson = new JSONObject();
		        String userId = null;
		        String userName = null;
		        String role = null;
		        LocalDate fromDate = null;
		        LocalDate toDate = null;
		        long startTime = System.currentTimeMillis();
		        String output = "";

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
		                        latestDateOfInspection = latestRecordRs.getTimestamp("increment_date_val");
		                    }

		                    latestRecordRs.close();

		                    // Build the main query based on the latest record
		                    String query = "SELECT [TagId] as vehiclefidNo, [Lat] as latitude, [Lng] as longitude, " +
		                            "[TDate] as dateOfInspection, [damaged], [gps], [vehicleCondition], " +
		                            "[lastServiceDate], [creationMode] FROM [dbDelhiRamkySWM].[dbo].[UhfTransaction] " +
		                            "WHERE TagId is not null ";

		                    if (latestVehiclefidNo != null && latestDateOfInspection != null) {
		                    	 query = query+ "AND [TDate] > '" + latestDateOfInspection + "' ";
		                    }

		                    query = query+ " ORDER BY [TagId] DESC";

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

		// Format it without the [Asia/Kolkata] part
		String formattedDate = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));

		// Add it to the JSON object
		obj1.put("dateOfInspection", formattedDate);
		                    //    obj1.put("dateOfInspection", rs.getTimestamp("dateOfInspection").toLocalDateTime());
		                        obj1.put("damaged", rs.getString("damaged"));
		                        obj1.put("gps", rs.getString("gps"));
		                        obj1.put("vehicleCondition", rs.getString("vehicleCondition"));
		                        
		                        ZonedDateTime lastServiceDate1 = rs.getTimestamp("lastServiceDate")
		                                .toLocalDateTime()
		                                .atZone(ZoneId.of("Asia/Kolkata"));

		                		// Format it without the [Asia/Kolkata] part
		                		String lastServiceDate = lastServiceDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));

		                		// Add it to the JSON object
		                		obj1.put("lastServiceDate", lastServiceDate);
		                       // obj1.put("lastServiceDate", rs.getTimestamp("lastServiceDate").toLocalDateTime());
		                        obj1.put("creationMode", rs.getString("creationMode"));

		                        jsonArray.put(obj1);

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
							if(jsonArray.length() > 0) {
								   output = pushDataToAPI(jsonArray.toString());
								   logger.error("NAREELA VEHICLE DATA API :"+ output);	
								   EMailSender emailSender = new EMailSender();
				    			    emailSender.send("saidileep.p@resustainability.com", "Narella - Vehicle Data","arun.kumar@resustainability.com", jsonArray.toString(), null, output);
				    			    if("\"success\"".equalsIgnoreCase(output)) { 
				    			    	System.out.println("Data Uploadeed successfully");
				    			    	
				    			    }
							}else {
								logger.error("NAREELA VEHICLE DATA API :"+ output);	
								output = "No Increment Data";
								 EMailSender emailSender = new EMailSender();
				    			    emailSender.send("saidileep.p@resustainability.com", "Narella - No Increment Data","saidileep.p@resustainability.com", jsonArray.toString(), null, output);
				    			    if("\"success\"".equalsIgnoreCase(output)) { 
				    			    	System.out.println("Data Sent successfully");
				    			    	
				    			    }
							}
		                    // Push the data to the API
		                 
		                    System.out.println(output);
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }

		    }
	}


    private static final String SOURCE_DB_URL2 = "jdbc:sqlserver://10.100.3.14:1433;databaseName=EasyWdms";
    private static final String SOURCE_USER2 = "sa";
    private static final String SOURCE_PASS2 = "Ramky#2022";

    private static final String DEST_DB_URL = "jdbc:sqlserver://10.125.145.217:1433;databaseName=INOPSETPDB";
    private static final String DEST_USER = "appuser";
    private static final String DEST_PASS = "Appuser@123$";
    
    
		    // Method to push data to API
		    private static String pushDataToAPI(String jsonData) {
		        StringBuilder response = new StringBuilder();

		        try {
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
		            logger.error("NAREELA VEHICLE DATA API response:"+ response);	
		            in.close();
		            conn.disconnect();

		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        return response.toString();
		    }
	
	
		 //   @Scheduled(cron = "${cron.expression.generate.assign.responsibility}")
			public void ATtDta() throws ClassNotFoundException{
		    	 Connection sourceConn = null;
		         Connection destConn = null;
		         PreparedStatement selectStmt = null;
		         PreparedStatement insertStmt = null;
		         PreparedStatement getEmpIdStmt = null;
		         ResultSet rs = null;

		         try {
		        	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		             // Establish connection to the source database
		             sourceConn = DriverManager.getConnection(SOURCE_DB_URL2, SOURCE_USER2, SOURCE_PASS2);

		             // Get the latest id from the source table
		             String getLastInsertIdQuery = "SELECT MAX(id) as max_id FROM [EasyWdms].[dbo].[iclock_transaction]";
		             PreparedStatement getLastInsertIdStmt = sourceConn.prepareStatement(getLastInsertIdQuery);
		             ResultSet lastInsertIdRs = getLastInsertIdStmt.executeQuery();
		             int lastInsertId = 0;
		             if (lastInsertIdRs.next()) {
		                 lastInsertId = lastInsertIdRs.getInt("max_id");
		             }
		             lastInsertIdRs.close();
		             getLastInsertIdStmt.close();

		             // Establish connection to the destination database
		             destConn = DriverManager.getConnection(DEST_DB_URL, DEST_USER, DEST_PASS);

		             // Prepare the select statement for the destination database
		             String selectQuery = "SELECT  [id], [emp_code], [punch_time], [punch_state], [verify_type], [work_code], " +
		                     "[terminal_sn], [terminal_alias], [area_alias], [longitude], [latitude], [gps_location], [mobile], " +
		                     "[source], [purpose], [crc], [is_attendance], [reserved], [upload_time], [sync_status], [sync_time], " +
		                     "[emp_id], [terminal_id], [company_id], [mask_flag], [temperature] " +
		                     "FROM [EasyWdms].[dbo].[iclock_transaction] " +
		                     "WHERE  cast(punch_time as date) = cast(getdate()-1 as date) ORDER BY punch_time DESC";
		             selectStmt = sourceConn.prepareStatement(selectQuery);
		            // selectStmt.setInt(1, lastInsertId);
		             rs = selectStmt.executeQuery();

		             // Prepare the insert statement for the source database
		             String insertQuery = "INSERT INTO [INOPSETPDB].[dbo].[iclock_transaction] ( [emp_code], [punch_time], " +
		                     "[punch_state], [verify_type], [work_code], [terminal_sn], [terminal_alias], [area_alias], [longitude], " +
		                     "[latitude], [gps_location], [mobile], [source], [purpose], [crc], [is_attendance], [reserved], " +
		                     "[upload_time], [sync_status], [sync_time], [emp_id], [terminal_id], [company_id], [mask_flag], " +
		                     "[temperature], [last_insert_narella_id], generated_by) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		             insertStmt = destConn.prepareStatement(insertQuery);

		             // Prepare the statement to get emp_id from the destination database
		             String getEmpIdQuery = "SELECT [id] FROM [INOPSETPDB].[dbo].[personnel_employee] WHERE emp_code = ?";
		             getEmpIdStmt = destConn.prepareStatement(getEmpIdQuery);

		             // Loop through the result set and insert data into the source table
		             while (rs.next()) {
		                 int id = rs.getInt("id");
		                 System.out.println(id);
		                 insertStmt.setString(1, rs.getString("emp_code"));
		                 insertStmt.setTimestamp(2, rs.getTimestamp("punch_time"));
		                 insertStmt.setString(3, rs.getString("punch_state"));
		                 insertStmt.setString(4, rs.getString("verify_type"));
		                 insertStmt.setString(5, rs.getString("work_code"));
		                 insertStmt.setString(6, rs.getString("terminal_sn"));
		                 insertStmt.setString(7, rs.getString("terminal_alias"));
		                 insertStmt.setString(8, "MSW-CTN-IPMSWL-DL-Narela Bawana");
		                 insertStmt.setDouble(9, rs.getDouble("longitude"));
		                 insertStmt.setDouble(10, rs.getDouble("latitude"));
		                 insertStmt.setString(11, rs.getString("gps_location"));
		                 insertStmt.setString(12, rs.getString("mobile"));
		                 insertStmt.setString(13, rs.getString("source"));
		                 insertStmt.setString(14, rs.getString("purpose"));
		                 insertStmt.setString(15, rs.getString("crc"));
		                 insertStmt.setBoolean(16, rs.getBoolean("is_attendance"));
		                 insertStmt.setString(17, rs.getString("reserved"));
		                 insertStmt.setTimestamp(18, rs.getTimestamp("upload_time"));
		                 insertStmt.setString(19, rs.getString("sync_status"));
		                 insertStmt.setTimestamp(20, rs.getTimestamp("sync_time"));
		                 insertStmt.setString(21, rs.getString("emp_id"));
		                 insertStmt.setString(22, rs.getString("terminal_id"));
		                 insertStmt.setString(23, rs.getString("company_id"));
		                 insertStmt.setString(24, rs.getString("mask_flag"));
		                 insertStmt.setDouble(25, rs.getDouble("temperature"));
		                 insertStmt.setInt(26, rs.getInt("id")); // Set the last_insert_narella_id
		                 insertStmt.setString(27, "RE Scheduler");

		                 // Retrieve emp_id from destination database based on emp_code
		                 getEmpIdStmt.setString(1, rs.getString("emp_code"));
		                 ResultSet empIdRs = getEmpIdStmt.executeQuery();
		                 String empId = null;
		                 if (empIdRs.next()) {
		                     empId = empIdRs.getString("id");
		                 }
		                 empIdRs.close();

		                 // Set emp_id in the insert statement
		                 insertStmt.setString(21, empId); // Assuming emp_id is a String type

		                 // Execute the insert statement
		                 int flag = insertStmt.executeUpdate();
		                 System.out.println(flag);
		             }

		             System.out.println("Data transfer completed successfully.");

		         } catch (SQLException e) {
		             e.printStackTrace();
		         } finally {
		             // Close resources
		             try {
		                 if (rs != null) rs.close();
		                 if (selectStmt != null) selectStmt.close();
		                 if (insertStmt != null) insertStmt.close();
		                 if (getEmpIdStmt != null) getEmpIdStmt.close();
		                 if (sourceConn != null) sourceConn.close();
		                 if (destConn != null) destConn.close();
		             } catch (SQLException e) {
		                 e.printStackTrace();
		             }
		         }
		     
			}
	

	/**********************************************************************************/	
	
}
