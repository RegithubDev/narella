package com.resustainability.reisp.common;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class UrlGenerator {
	Logger logger = Logger.getLogger(UrlGenerator.class);
	public String getURLBase() {
		String base_url = "";
		try {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
			        .getRequestAttributes()).getRequest();
		    URL requestURL = new URL(request.getRequestURL().toString());
		    String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
		    base_url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
		}catch (Exception e) {
			logger.error("getURLBase : " + e.getMessage());
		}
		return base_url;
	}
	
	public String getIpAddress(){
		String ip_address = "";
		try {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
			        .getRequestAttributes()).getRequest();
			
		    URL requestURL = new URL(request.getRequestURL().toString());
		    String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
		    ip_address = request.getServerName().toString();
			
		} catch (Exception e) {
			logger.error("getIpAddress : " + e.getMessage());
		}
		return ip_address;
	}
	
	public String getContextPath(){
		String context_path = "";
		try {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
			        .getRequestAttributes()).getRequest();
		    context_path = request.getContextPath().toString();
		    if(!StringUtils.isEmpty(context_path)) {
		    	context_path = context_path.replaceAll("/", "");
		    }
		} catch (Exception e) {
			logger.error("getContextPath : " + e.getMessage());
		}
		return context_path;
	}

	public String getNGINXFilesBasePath(){
		String base_path = "";
		try {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
			        .getRequestAttributes()).getRequest();
			String ip_address = request.getServerName().toString();

		    if("10.203.10.158".equals(ip_address) || "203.153.40.44".equals(ip_address)) {
		    	base_path = "D:/"+getContextPath();
		    }else if("13.235.73.61".equals(ip_address)) {
		    	base_path = "usr/share/nginx/html/"+getContextPath();
		    }else if("127.0.0.1".equals(ip_address) || "localhost".contains(ip_address)) {
		    	base_path = "D:/reisp/src/main/webapp/";
		    }
		} catch (Exception e) {
			logger.error("getNGINXFilesBasePath : " + e.getMessage());
		}
		return base_path;
	}
	
}
