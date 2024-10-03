package com.resustainability.reisp.controller;

import java.io.IOException;
import java.net.InetAddress;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.BrainBox;
import com.resustainability.reisp.model.SBU;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.service.HydCnDService;


@RestController
@RequestMapping("/reone")
public class HIMSWController {

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	Logger logger = Logger.getLogger(HIMSWController.class);
	
	@Autowired
	 HydCnDService service;
	
	@RequestMapping(value = "/HIMSW", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView MSWAPI(@ModelAttribute User user, HttpSession session,HttpServletRequest request,HttpServletResponse response,Object handler) {
		ModelAndView model = new ModelAndView(PageConstants.MSW);
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/getHIMSWList", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String checkMethod(@RequestHeader("Authorization") String authentication, @RequestBody SBU obj1,BrainBox obj,HttpSession session,HttpServletResponse response , Errors filterErrors) throws JsonProcessingException {
		List<BrainBox> companiesList = null;
		 String json = null;
		 boolean flag = false;
		 boolean call_service = true;
		 boolean log = true;
		 int logInfo = 0;
		 HashMap<String, String> data = new HashMap<String, String>();
		 ObjectMapper objectMapper = new ObjectMapper();
		try {
			if(!StringUtils.isEmpty(obj1.getDate())) {
				obj1.setFrom_date(obj1.getDate());
			}
			 String user_id1 = "rechwbhimsw";
			 String password1 = "Y1298extvbddyzB";
			 String pair=new String(Base64.decodeBase64(authentication.substring(6)));
		     String userName=pair.split(":")[0];
		     String password=pair.split(":")[1];
		     obj1.setUser_id(userName);
		     obj1.setPassword(password);
		     InetAddress ip = InetAddress.getLocalHost();
		     System.out.println("IP address: " + ip.getHostAddress());
		     String newIp = ip.getHostAddress();
			 String Myip = "10.100.3.11";
			 String IP [] = {"10.2.24.18","10.2.24.81","10.2.28.164","196.12.46.130","117.200.48.237","112.133.222.124","61.0.227.124","14.99.138.146","34.93.149.251",Myip,newIp}; 
				if(IP.length > 0) {
					for(int i=0; i< IP.length; i++) {
						if(IP[i].contentEquals(newIp)  ) {
								flag = true;
						}
					}
					System.out.println(flag);
				}
				obj1.setPTC_status(null);
			 if(flag) {
				 if(!user_id1.contentEquals(obj1.getUser_id()) || !password1.contentEquals(obj1.getPassword())) {
					 call_service = false;
					 data = new HashMap<String, String>();
					 data.put("200","User Name or Password Incorrect!");
					 json = objectMapper.writeValueAsString(data);
					 obj1.setMSG("User Name or Password Incorrect!");
				 }
				 else if(StringUtils.isEmpty(obj1.getFrom_date())) {
					 call_service = false;
					 data = new HashMap<String, String>();
					 data.put("200","Date not mentioned! Please mention this format : from_date : { m/d/yyyy }");
					 json = objectMapper.writeValueAsString(data);
					 obj1.setMSG("Date not mentioned!");
				 }
				 obj1.setUser_ip(newIp);
				 if(call_service) {
					 companiesList = service.getHydCNDList(obj1,obj,response);
					 logInfo = service.getLogInfo(obj1,obj,companiesList);
					 if(companiesList.size() > 0 && logInfo == 0 ){
						 json = objectMapper.writeValueAsString(companiesList);
						 obj1.setMSG(companiesList.size()+" Data synched");
						 obj1.setPTC_status("Y");
						 log = true;
					 }else if(companiesList.size() > 0 &&  logInfo == 0 && !StringUtils.isEmpty(obj1.getRepulled()) && "Yes".equalsIgnoreCase(obj1.getRepulled()) ){
						 json = objectMapper.writeValueAsString(companiesList);
						 obj1.setMSG(companiesList.size()+" Data synched");
						 obj1.setPTC_status("Y");
						 log = true;
					 }else if(companiesList.size() > 0 &&  logInfo > 0 && !StringUtils.isEmpty(obj1.getRepulled()) && "Yes".equalsIgnoreCase(obj1.getRepulled()) ){
						 json = objectMapper.writeValueAsString(companiesList);
						 obj1.setMSG(companiesList.size()+" Data synched");
						 obj1.setPTC_status("Y");
						 log = true;
					 }else if(companiesList.size() > 0 &&  logInfo > 0 && !StringUtils.isEmpty(obj1.getRepulled()) && "No".equalsIgnoreCase(obj1.getRepulled()) ){
						 data = new HashMap<String, String>();
						 data.put("200","Data Already pulled before! If you want to pull again Change header (repulled : Yes)");
						 json = objectMapper.writeValueAsString(data);
						 log = false;
					 }else if(companiesList.size() > 0 &&  logInfo > 0 && StringUtils.isEmpty(obj1.getRepulled()) ){
						 data = new HashMap<String, String>();
						 data.put("200","Data Already pulled before! If you want to pull again, Add header (repulled : Yes)");
						 json = objectMapper.writeValueAsString(data);
						 log = false;
					
					 }else {
						 companiesList = new ArrayList<BrainBox>(1);
						 data = new HashMap<String, String>();
						 data.put("200", "No New Records are Available For the Selected Date! Data Already pulled before! If you want to pull again, Add header (repulled : Yes)");
							 json = objectMapper.writeValueAsString(data);
							 obj1.setMSG("No New Records are Available For the Selected Date! Data Already pulled before! If you want to pull again, Add header (repulled : Yes)");
					  }
				 }else {
					 companiesList = new ArrayList<BrainBox>(1);
				 }
				
			 }else {
				 data = new HashMap<String, String>();
				 obj1.setUser_ip(newIp);
				 data.put("200","No Access for this IP Address: "+newIp);
			     json = objectMapper.writeValueAsString(data);
			     obj1.setMSG("No Access for this IP Address"+ " : "+newIp);
			     companiesList = new ArrayList<BrainBox>(1);
			 }
			 if(log) {service.getLogsOfResults(companiesList,obj1);}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			if("Index 0 out of bounds for length 0".contentEquals(e.getMessage())) {
				data = new HashMap<String, String>();
				 data.put("200","Please enter User Name and Password!");
				json = objectMapper.writeValueAsString(data);
			}else {
				data = new HashMap<String, String>();
				data.put("200","Internal Error! Please contact Support");
				json = objectMapper.writeValueAsString(data);
			}
			logger.error("getMSWBilaspurList : " + e.getMessage());
		}
		return json;
	}
	
}
