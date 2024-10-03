package com.resustainability.reisp.controller;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.resustainability.reisp.common.DateParser;
import com.resustainability.reisp.common.FileUploads;
import com.resustainability.reisp.constants.CommonConstants;
import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.BMW;
import com.resustainability.reisp.model.BMWSAP;
import com.resustainability.reisp.model.BMWSAPOUTPUT;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.DashBoardWeighBridge;
import com.resustainability.reisp.model.IRM;
import com.resustainability.reisp.model.Project;
import com.resustainability.reisp.model.ProjectLocation;
import com.resustainability.reisp.model.RoleMapping;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.service.BMWService;
import com.resustainability.reisp.service.IRMService;
@RestController
@RequestMapping("/reone")
public class RestIRMController {

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	Logger logger = Logger.getLogger(RestIRMController.class);
	
	@Autowired
	IRMService service;
	
	@Value("${common.error.message}")
	public String commonError;
	
	@Value("${record.dataexport.success}")
	public String dataExportSucess;
	
	@Value("${record.dataexport.invalid.directory}")
	public String dataExportInvalid;
	
	@Value("${record.dataexport.error}")
	public String dataExportError;
	
	@Value("${record.dataexport.nodata}")
	public String dataExportNoData;
	
	@Value("${template.upload.common.error}")
	public String uploadCommonError;
	
	@Value("${template.upload.formatError}")
	public String uploadformatError;
	
	@Autowired
	BMWService service1;
	
	
	@RequestMapping(value = "/ajax/getSAPData", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String  getIRMList1(@RequestBody BMWSAP obj, @RequestHeader("Authorization") String authentication,HttpSession session,HttpServletResponse response , Errors filterErrors) {
		List<BMWSAPOUTPUT> companiesList = new ArrayList<>();
		String userId = null;
		String json = null;
		String role = null;
		HashMap<String, String> data = new HashMap<String, String>();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			 boolean call_service = true;
			userId = (String) session.getAttribute("USER_ID");
			role = (String) session.getAttribute("BASE_ROLE");
			 String user_id1 = "recgwbsap";
			 String password1 = "X1298extvbddyzB";
			 String pair=new String(Base64.decodeBase64(authentication.substring(6)));
		     String userName=pair.split(":")[0];
		     String password=pair.split(":")[1];
		     obj.setUser_id(userName);
		     obj.setPassword(password);
		     if(!user_id1.contentEquals(obj.getUser_id()) || !password1.contentEquals(obj.getPassword())) {
				 call_service = false;
				 data = new HashMap<String, String>();
				 data.put("500","User Name or Password Incorrect!");
				 json = objectMapper.writeValueAsString(data);
			 }
		     if(call_service) {
			BMWSAP  DB = new BMWSAP();
			    
			     if(!StringUtils.isEmpty(obj.getProject_code()) && !StringUtils.isEmpty(obj.getPeriod())  && !StringUtils.isEmpty(obj.getYear())) {
			    	
			         String[] financialYearShortcuts = {"Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan", "Feb", "Mar"};
			         if(Integer.parseInt(obj.getPeriod()) > 0 && Integer.parseInt(obj.getPeriod()) < 12) {
			        	 DB.setProject_code(obj.getProject_code());
				    	 DB.setCustomerSAPCode(obj.getCustomerID());
			        	 DB.setActualVisitMonth(financialYearShortcuts[Integer.parseInt(obj.getPeriod())-1]+" "+obj.getYear());
				    	 companiesList =  service1.getTransactionsSummeryList(obj,DB);
				    	 Gson gson = new Gson();
				    	 json = gson.toJson(companiesList);
			         }else {
			        	 json = "No Data found (or) Body Parameters or Values Mismatch";
			         }
			         }else {
			        	 json = "Plant code, Period and Year are Mandatory Please provide and Try Again";
			         }
			    }
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getIRMList : " + e.getMessage());
		}
		return json;
	}
	
	 private static final Map<Integer, String[]> monthMap = new HashMap<>();
	 private static String[] getMonthInfo(int parseInt) {
			return monthMap.get(parseInt);
		}
	public class MonthInfo {
	   

	    static {
	        monthMap.put(1, new String[]{"Apr", "April", "apr"});
	        monthMap.put(2, new String[]{"May", "May", "may"});
	        monthMap.put(3, new String[]{"Jun", "June", "jun"});
	        monthMap.put(4, new String[]{"Jul", "July", "jul"});
	        monthMap.put(5, new String[]{"Aug", "August", "aug"});
	        monthMap.put(6, new String[]{"Sep", "September", "sep"});
	        monthMap.put(7, new String[]{"Oct", "October", "oct"});
	        monthMap.put(8, new String[]{"Nov", "November", "nov"});
	        monthMap.put(9, new String[]{"Dec", "December", "dec"});
	        monthMap.put(10, new String[]{"Jan", "January", "jan"});
	        monthMap.put(11, new String[]{"Feb", "February", "feb"});
	        monthMap.put(12, new String[]{"Mar", "March", "mar"});
	    }
	   
	

	    
	@RequestMapping(value = "/ajax/getIRMList", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getIRMList(@RequestBody IRM obj,HttpSession session) {
		List<IRM> companiesList = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			obj.setUser(userId);
			obj.setRole(role);
			if(!StringUtils.isEmpty(obj.getFrom_and_to())) {
				if(obj.getFrom_and_to().contains("to")) {
					String [] dates = obj.getFrom_and_to().split("to");
					obj.setFrom_date(dates[0].trim());
					obj.setTo_date(dates[1].trim());
				}else {
					obj.setFrom_date(obj.getFrom_and_to());
				}
			}
			//obj.setFrom_date(DateParser.parseTrickyDate(obj.getFrom_date()));
			//obj.setTo_date(DateParser.parseTrickyDate(obj.getTo_date()));
			companiesList = service.getIRMList(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getIRMList : " + e.getMessage());
		}
		return companiesList;
	}
	
	@RequestMapping(value = "/ajax/getIRMListReport", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getIRMListReport(@RequestBody IRM obj,HttpSession session) {
		List<IRM> companiesList = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			obj.setRole(role);
			if(!StringUtils.isEmpty(obj.getFrom_and_to())) {
				if(obj.getFrom_and_to().contains("to")) {
					String [] dates = obj.getFrom_and_to().split("to");
					obj.setFrom_date(dates[0].trim());
					obj.setTo_date(dates[1].trim());
				}else {
					obj.setFrom_date(obj.getFrom_and_to());
				}
			}
			//obj.setFrom_date(DateParser.parseTrickyDate(obj.getFrom_date()));
			//obj.setTo_date(DateParser.parseTrickyDate(obj.getTo_date()));
			companiesList = service.getIRMList(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getIRMList : " + e.getMessage());
		}
		return companiesList;
	}
	}

}
