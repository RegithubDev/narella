package com.resustainability.reisp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetAddress;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.resustainability.reisp.common.UrlGenerator;
import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.BrainBox;
import com.resustainability.reisp.model.SBU;
import com.resustainability.reisp.model.BMW;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.service.BMWService;


@RestController
@RequestMapping("/reone")
public class BMWController { 

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    } 
	Logger logger = Logger.getLogger(BMWController.class);
	   
	@Autowired
	BMWService service;
	
	@RequestMapping(value = "/BMW", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView MSWAPI(@ModelAttribute User user, HttpSession session,HttpServletRequest request,HttpServletResponse response,Object handler) {
		ModelAndView model = new ModelAndView(PageConstants.MSW);
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	public class LowercasePropertyNamingStrategy extends PropertyNamingStrategy {
	    @Override
	    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
	        return defaultName.toLowerCase();
	    }
	} 

	@RequestMapping(value = "/push-bmw-data", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@JsonProperty
	public String pushBMWList(@RequestHeader("Authorization") String authentication,  @RequestBody List<BMW> obja, BMW obj1,BrainBox obj,HttpSession session,HttpServletResponse response , Errors filterErrors) throws JsonProcessingException {
		List<BrainBox> companiesList = null;
		 String json = null;
		 String jsonD = "";
		 boolean call_service = true;
		 boolean log = true;
		 int logInfo = 0;
		 HashMap<String, String> data = new HashMap<String, String>();
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.setPropertyNamingStrategy(new LowercasePropertyNamingStrategy());
		try {
			 List<BMW> pushedRecords = null;
			boolean flag = false;
			int totalCounts = 0;
			 String user_id1 = "recgwbbmw";
			 String password1 = "X1298extvbddyzA";
			 String pair=new String(Base64.decodeBase64(authentication.substring(6)));
		     String userName=pair.split(":")[0];
		     String password=pair.split(":")[1];
		     obj1.setUser_id(userName);
		     obj1.setPassword(password);
		     InetAddress ip = InetAddress.getLocalHost();
		     System.out.println("IP address: " + ip.getHostAddress());
		     String newIp = ip.getHostAddress();
			 String Myip = "10.100.3.11";
			 String IP [] = {Myip,newIp,"34.93.255.93","34.143.205.133"}; 
				if(IP.length > 0) {
					for(int i=0; i< IP.length; i++) {
						if(IP[i].contentEquals(newIp)  ) {
								flag = true;
						}
					}
					System.out.println(flag);
				}
				obj1.setPTC_status(null);
			 if(flag ) {
				 if(!user_id1.contentEquals(obj1.getUser_id()) || !password1.contentEquals(obj1.getPassword())) {
					 call_service = false;
					 data = new HashMap<String, String>();
					 data.put("500","User Name or Password Incorrect!");
					 json = objectMapper.writeValueAsString(data);
					 obj1.setMsg("User Name or Password Incorrect!");
				 }
				 String  ids = "";
				 LocalDate currentDate = LocalDate.now();
			     String date = currentDate.toString();
			     date = date.replaceAll("-", "");
			     String unique = date;
				 obj1.setUser_ip(newIp);
				 String id = null;
				 boolean handsUp = true;
				 if(call_service) {
					 for(BMW bmw : obja) {
					 
					 if(null == id) {
						 id = bmw.getCabsTransID();
					 }else {
						  if(id.equalsIgnoreCase(bmw.getCabsTransID())) {
						    	 handsUp = false;
						    	 id = bmw.getCabsTransID();
						     }
					 }
					
				     int count = service.getCountOfRecords(bmw);
				   
				     if(count == 0 && handsUp) {
				    	 id = bmw.getCabsTransID();
				    	 totalCounts++;
						 flag  = service.pushBMWList(bmw,obj,obja,response);
						 if(flag && "start".equalsIgnoreCase(bmw.getLog())) {
							 data = new HashMap<String, String>();
							 data.put("Success","Accepted");
							json = objectMapper.writeValueAsString(data);
						 }else {
							 data = new HashMap<String, String>();
							 data.put("500","Opps Data Not Inserted!");
							json = objectMapper.writeValueAsString(data);
						 }
						 if( "end".equalsIgnoreCase(bmw.getLog())) {
							 data = new HashMap<String, String>();
							 data.put("Success", totalCounts+" Records Inserted & Last Inserted ID => "+bmw.getCabsTransID() + " from Batch => "+bmw.getAPIID()+" "+jsonD);
							json = objectMapper.writeValueAsString(data);
						 }
				     }else {
				    	 id = bmw.getCabsTransID();
				    	 data = new HashMap<String, String>();
				    	 ids = "["+id+"]"+ids;
						 data.put("500",totalCounts+" Records Inserted & Duplicate "+ids+" ID found from Batch => "+bmw.getAPIID());
						 jsonD = objectMapper.writeValueAsString(data);
						 json = jsonD;
				     }
					
					}
				 }else {
					 companiesList = new ArrayList<BrainBox>(1);
				 }
				
			 }else {
				 data = new HashMap<String, String>();
				 obj1.setUser_ip(newIp);
				 data.put("500","No Access for this IP Address: "+newIp);
			     json = objectMapper.writeValueAsString(data);
			     obj1.setMsg("No Access for this IP Address"+ " : "+newIp);
			     companiesList = new ArrayList<BrainBox>(1);
			 }
		  
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			if("Index 0 out of bounds for length 0".contentEquals(e.getMessage())) {
				data = new HashMap<String, String>();
				 data.put("500","Please enter User Name and Password!");
				json = objectMapper.writeValueAsString(data);
			}else if("Conversion failed when converting the".contentEquals(e.getMessage())){
				data = new HashMap<String, String>();
				data.put("500",""+e.getMessage()+"");
				json = objectMapper.writeValueAsString(data);
			}
			else {
				data = new HashMap<String, String>();
				data.put("500",getStackTraceAsString(e));
				json = objectMapper.writeValueAsString(data);
			}
			logger.error("getBMWList : " + e.getMessage());
		}
		return json;
	}
	public static String getStackTraceAsString(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        return sw.toString();
    }
	
	@RequestMapping(value = "/upload-sap-data", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@JsonProperty
	public String uploadBMWList(@RequestHeader("Authorization") String authentication,  @RequestBody List<BMW> obja, BMW obj1,BrainBox obj,HttpSession session,HttpServletResponse response , Errors filterErrors) throws JsonProcessingException {
		 String json = null;
		 boolean call_service = true;
		 boolean log = true;
		 int logInfo = 0;
		 String  ids = "";
		 HashMap<String, String> data = new HashMap<String, String>();
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.setPropertyNamingStrategy(new LowercasePropertyNamingStrategy());
		try {
			boolean flag = false; 
			int totalCounts = 0;
			 String user_id1 = "recgwbsap";
			 String password1 = "X1298extvbddyzB";
			 String pair=new String(Base64.decodeBase64(authentication.substring(6)));
		     String userName=pair.split(":")[0];
		     String password=pair.split(":")[1];
		     obj1.setUser_id(userName);
		     obj1.setPassword(password);
		     InetAddress ip = InetAddress.getLocalHost();
		     System.out.println("IP address: " + ip.getHostAddress());
		     String newIp = ip.getHostAddress();
			 String Myip = "10.100.3.11";
			 flag = true;
			
				obj1.setPTC_status(null);
			 if(flag ) {
				 if(!user_id1.contentEquals(obj1.getUser_id()) || !password1.contentEquals(obj1.getPassword())) {			
					 call_service = false;
					 data = new HashMap<String, String>();
					 data.put("500","User Name or Password Incorrect!");
					 json = objectMapper.writeValueAsString(data);
					 obj1.setMsg("User Name or Password Incorrect!");
				 }
				 String id = null;
				 obj1.setUser_ip(newIp);
				 if(call_service) {
					 for(BMW bmw : obja) {
						if("0000-00-00".equals(bmw.getaCTSERVICECERTFROMDATE())) {
							bmw.setaCTSERVICECERTFROMDATE(null);
						}
						if("0000-00-00".equals(bmw.getaCTSERVICECERTTODATE())) {
							bmw.setaCTSERVICECERTTODATE(null);
						}
						if("0000-00-00".equals(bmw.getsERVICESTARTDATE())) {
							bmw.setsERVICESTARTDATE(null);
						}
						 id = bmw.getCustomer();
						 ids = id+","+ids;
						 ids = ids.replaceFirst("^,", "");
						 ids = ids.replaceAll(",$", "."); 
				    	 totalCounts++;
						 flag  = service.uploadBMWList(bmw,obj,obja,response);
						 if(flag ) {
							 data = new HashMap<String, String>();
							 data.put("Success", obja.size()+" Records Effected & Last Inserted => "+ids+" for BatchID => "+bmw.getBATCHID());
							json = objectMapper.writeValueAsString(data);
						 }
						 
					}
				 }
			 }else {
				 data = new HashMap<String, String>();
				 obj1.setUser_ip(newIp);
				 data.put("500","No Access for this IP Address: "+newIp);
			     json = objectMapper.writeValueAsString(data);
			     obj1.setMsg("No Access for this IP Address"+ " : "+newIp);
			 }
		  
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			if("Index 0 out of bounds for length 0".contentEquals(e.getMessage())) {
				data = new HashMap<String, String>();
				 data.put("500","Please enter User Name and Password!");
				json = objectMapper.writeValueAsString(data);
			}else if("Conversion failed when converting the".contentEquals(e.getMessage())){
				data = new HashMap<String, String>();
				data.put("500",""+e.getMessage()+"");
				json = objectMapper.writeValueAsString(data);
			}
			else {
				data = new HashMap<String, String>();
				data.put("500",getStackTraceAsString(e));
				json = objectMapper.writeValueAsString(data);
			}
			logger.error("uploadBMWList : " + e.getMessage());
		}
		return json;
	}

	@RequestMapping(value = "/rfid", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@JsonProperty
	public String rfid( BMW obj1,BrainBox obj,HttpSession session,HttpServletRequest request,HttpServletResponse response , Errors filterErrors) throws JsonProcessingException {
		 String json = null;
		 boolean call_service = true;
		 boolean log = true;
		 String requestURI = null;
		 String context_path = null;
		 int logInfo = 0;
		 HashMap<String, String> data = new HashMap<String, String>();
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.setPropertyNamingStrategy(new LowercasePropertyNamingStrategy());
		try {
			boolean flag = false; 
			int totalCounts = 0;
			BMW bmw  = new BMW();
			requestURI = request.getRequestURI();
			UrlGenerator ugObj = new UrlGenerator();
			context_path = ugObj.getContextPath();
			StringBuilder requestURL = new StringBuilder(request.getRequestURL().toString());
			String queryString = request.getQueryString();
			if(queryString != null) {
				json = service.uploadData(requestURL.append('?').append(queryString).toString(),bmw);
				 data.put("200","$RFID=0#");
			     json = "$RFID=0#";
			}
			
		  
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("uploadBMWList : " + e.getMessage());
			 json = "$RFID=0#";
		}
		return json;
	}
}
