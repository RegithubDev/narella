package com.resustainability.reisp.login.filer;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.resustainability.reisp.common.UrlGenerator;
import com.resustainability.reisp.controller.BMWController.LowercasePropertyNamingStrategy;
import com.resustainability.reisp.dao.UserDao;
import com.resustainability.reisp.model.BMW;
import  com.resustainability.reisp.model.User;


public class AuthenticationInterceptor extends HandlerInterceptorAdapter{
	Logger logger = Logger.getLogger(AuthenticationInterceptor.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws IOException {
		String requestURI = null;
		String context_path = null;
		boolean flag = false;
		try {
			requestURI = request.getRequestURI();
			UrlGenerator ugObj = new UrlGenerator();
			context_path = ugObj.getContextPath();
			if(requestURI.equals("/rfid")) {
				response.sendRedirect("/"+context_path+"/reone/rfid");
				return true;
			}
			
			if(requestURI.equals("/"+context_path+"/add-new-user") &&  !requestURI.equals("/"+context_path+"/login")) {
				
				 return true;
			}
			if( !requestURI.equals("/"+context_path+"/") && !requestURI.equals("/"+context_path+"/reone/getMSWBilaspurList") ){
				String Myip = Inet4Address.getLocalHost().getHostAddress();
				String IP [] = {"10.11.10.102","122.168.198.195","34.93.149.251",Myip}; 
				if(IP.length > 0) {
					for(int i=0; i< IP.length; i++) {
						if(IP[i].contentEquals(Myip) ) {
							flag =true;
							//response.sendRedirect("/"+context_path+"/reone/push-bmw-data");
							return flag;
						}
					}
					if(!flag) {
						response.sendError(500);
					}
				}
			}else {
				if( !requestURI.equals("/"+context_path+"/logout")){
					 User userData = (User) request.getSession().getAttribute("user");
					 String single_login_session_id = (String)request.getSession().getAttribute("SESSION_ID");
					 if(userData != null){
						 int session_count = 0;
						 try {
							// session_count =  checkUserLoginDetails(userData);
							 if(session_count > 1) {
								 request.getSession().invalidate();
								 response.sendRedirect("/"+context_path+"/login");
							 }else {
								 response.sendRedirect("/"+context_path+"/home");
							 }
						 	} finally {}
					 }
				}
			}
		} catch (Exception e) {
			logger.error("preHandle : " + e.getMessage());
			return false;
		}
		  return true;
	}

	public int checkUserLoginDetails(User obj) throws Exception {
		int totalRecords = 0;
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String subQry = " and device_type_no = 2";
			if(obj.getDevice_type().equals("mobile")) {
				subQry = " and device_type_no = 1";
			}
			String qry = "select count(user_id) from [user_audit_log] where user_logout_time is null or  user_logout_time = '' "+ subQry;
			int arrSize = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getUser_session_id())) {
				qry = qry + " and user_session_id = ? ";
				arrSize++; 
			}	
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getUser_session_id())) {
				pValues[i++] = obj.getUser_session_id();
			}
			totalRecords = jdbcTemplate.queryForObject( qry,pValues,Integer.class);
			if(totalRecords > 1) {
			//	String updateQry = "update [user_audit_log] set user_logout_time=GETDATE()  where user_id= :user_id and user_logout_time is null or  user_logout_time = '' ";
			//	BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
			//    namedParamJdbcTemplate.update(updateQry, paramSource);
			}
		}catch(Exception e){ 
			e.printStackTrace();
			throw new Exception(e);
		}
		return totalRecords;
		
		
	}
}
