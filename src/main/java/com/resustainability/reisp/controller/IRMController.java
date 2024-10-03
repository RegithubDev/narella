package com.resustainability.reisp.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.resustainability.reisp.common.DateParser;
import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.IRM;
import com.resustainability.reisp.model.Project;
import com.resustainability.reisp.model.ProjectLocation;
import com.resustainability.reisp.model.RoleMapping;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.service.IRMService;
import com.resustainability.reisp.service.IRMService;

@Controller
public class IRMController {

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	Logger logger = Logger.getLogger(IRMController.class);
	
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
	
	
	@RequestMapping(value = "/irm", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irm(@ModelAttribute User user, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irmMain);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/irm-report", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irmReport(@ModelAttribute User user, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irmReport);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/ajax/getIRMList", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getIRMList(@ModelAttribute IRM obj,HttpSession session) {
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
	public List<IRM> getIRMListReport(@ModelAttribute IRM obj,HttpSession session) {
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
	
	@RequestMapping(value = "/ajax/getIRMHistoryList", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getIRMHistoryList(@ModelAttribute IRM obj,HttpSession session) {
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
			obj.setFrom_date(DateParser.parseTrickyDate(obj.getFrom_date()));
			obj.setTo_date(DateParser.parseTrickyDate(obj.getTo_date()));
			companiesList = service.getIRMHistoryList(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getIRMHistoryList : " + e.getMessage());
		}
		return companiesList;
	}
	
	
	@RequestMapping(value = "/update-irm-form", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irmUpdateForm(@ModelAttribute IRM irm, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irmUpdate);
		try {
			List <IRM> projectsList = service.getProjectstListIRMUpdate(irm);
			model.addObject("projectsList", projectsList);

			List <IRM> deptsList = service.getDepartmentsIRMUpdate(irm);
			model.addObject("deptsList", deptsList);
			
			List <IRM> locationsList = service.getLocationstListIRMUpdate(irm);
			model.addObject("locationsList", locationsList);
			
			List <IRM> userList = service.getUserListIRMUpdate(irm);
			model.addObject("userList", userList);
			
			IRM IRMDetails = service.getIRMDocumentDEtails(irm);
			model.addObject("IRMDetails", IRMDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/update-irm-form/{document_code}", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irmUpdateFormWithID(@ModelAttribute IRM irm,@PathVariable("document_code") String document_code , HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irmUpdate);
		try {
			irm.setDepartment_code(document_code);
			List <IRM> projectsList = service.getProjectstListIRMUpdate(irm);
			model.addObject("projectsList", projectsList);

			List <IRM> deptsList = service.getDepartmentsIRMUpdate(irm);
			model.addObject("deptsList", deptsList);
			
			List <IRM> locationsList = service.getLocationstListIRMUpdate(irm);
			model.addObject("locationsList", locationsList);
			
			IRM IRMDetails = service.getIRMDocumentDEtails(irm);
			model.addObject("IRMDetails", IRMDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/ajax/getSBUFilterListFromIRM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getSBUFilterListFromIRM(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			obj.setUser(userId);
			obj.setRole(role);
			departments = service.getSBUFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getSBUFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getProjectFilterListFromIRM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getProjectFilterListFromIRM(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			obj.setUser(userId);
			obj.setRole(role);
			departments = service.getProjectFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getProjectFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getIncidentFilterListFromIRM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getIncidentFilterListFromIRM(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			obj.setUser(userId);
			obj.setRole(role);
			departments = service.getIncidentFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getIncidentFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getStatusFilterListFromIRM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getStatusFilterListFromIRM(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			obj.setUser(userId);
			obj.setRole(role);
			departments = service.getStatusFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getStatusFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getSBUFilterListFromIRMReport", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getSBUFilterListFromIRMReport(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			obj.setRole(role);
			departments = service.getSBUFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getSBUFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getProjectFilterListFromIRMReport", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getProjectFilterListFromIRMReport(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			obj.setRole(role);
			departments = service.getProjectFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getProjectFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getIncidentFilterListFromIRMReport", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getIncidentFilterListFromIRMReport(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			obj.setRole(role);
			departments = service.getIncidentFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getIncidentFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getStatusFilterListFromIRMReport", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<IRM> getStatusFilterListFromIRMReport(@ModelAttribute IRM obj,HttpSession session) {
		List<IRM> departments = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			obj.setRole(role);
			departments = service.getStatusFilterListFromIRM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getStatusFilterListFromIRM : " + e.getMessage());
		}
		return departments;
	}
	
	
	
	@RequestMapping(value = "/irm-add-incident", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irmAddIncident(@ModelAttribute User user, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irmAdd);
		try {
			List <Project> projectsList = service.getProjectstList(user);
			model.addObject("projectsList", projectsList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	@RequestMapping(value = "/ajax/getDepartments", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<RoleMapping> getDepartments(@ModelAttribute RoleMapping obj,HttpSession session) {
		List<RoleMapping> departments = null;
		String userId = null;
		String userName = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			departments = service.getDepartments(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getDepartments : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getRoleMappedOrNot", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<RoleMapping> getRoleMappedOrNot(@ModelAttribute RoleMapping obj,HttpSession session) {
		List<RoleMapping> departments = null;
		String userId = null;
		String userName = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			departments = service.getRoleMappedOrNot(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getRoleMappedOrNot : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/ajax/getLocations", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ProjectLocation> getLocations(@ModelAttribute ProjectLocation obj,HttpSession session) {
		List<ProjectLocation> location = null;
		String userId = null;
		String userName = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			location = service.getLocations(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getLocations : " + e.getMessage());
		}
		return location;
	}
	
	@RequestMapping(value = "/ajax/getRoleMappingforIRMForm", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<RoleMapping> getRoleMappingforIRMForm(@ModelAttribute RoleMapping obj,HttpSession session) {
		List<RoleMapping> departments = null;
		String userId = null;
		String userName = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			obj.setProject(obj.getProject_code());
			departments = service.getRoleMappingforIRMForm(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getRoleMappingforIRMForm : " + e.getMessage());
		}
		return departments;
	}
	
	@RequestMapping(value = "/irm-submit", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView irmSubmit(@ModelAttribute IRM obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String userName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/irm");
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			obj.setUser_id(userId);
			obj.setUser_name(userName);
			String email = (String) session.getAttribute("USER_EMAIL");
			obj.setEmail(email);
			obj.setCreated_by(userId);
			flag = service.irmSubmit(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Incident Added Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Adding Incident is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/irm-update-submit", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView irmUpdateSubmit(@ModelAttribute IRM obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String userName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/irm");
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			obj.setUser_id(userId);
			obj.setUser_name(userName);
			String email = (String) session.getAttribute("USER_EMAIL");
			obj.setEmail(email);
			obj.setCreated_by(userId);
			flag = service.irmUpdateSubmit(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Incident Added Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Adding Incident is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	

	@RequestMapping(value = "/export-irm", method = {RequestMethod.GET,RequestMethod.POST})
	public void exportIRM(HttpServletRequest request, HttpServletResponse response,HttpSession session,@ModelAttribute IRM obj,RedirectAttributes attributes){
		ModelAndView view = new ModelAndView(PageConstants.irmMain);
		List<IRM> dataList = new ArrayList<IRM>();
		String userId = null;String userName = null;
		try {
			userId = (String) session.getAttribute("USER_ID");userName = (String) session.getAttribute("USER_NAME");
			view.setViewName("redirect:/irm");
			if(!StringUtils.isEmpty(obj.getFrom_and_to())) {
				if(obj.getFrom_and_to().contains("to")) {
					String [] dates = obj.getFrom_and_to().split("to");
					obj.setFrom_date(dates[0].trim());
					obj.setTo_date(dates[1].trim());
				}else {
					obj.setFrom_date(obj.getFrom_and_to());
				}
			}
			dataList = service.getIRMList(obj); 
			if(dataList != null && dataList.size() > 0){
	            XSSFWorkbook  workBook = new XSSFWorkbook ();
	            XSSFSheet sheet = workBook.createSheet(WorkbookUtil.createSafeSheetName("IRM"));
		        workBook.setSheetOrder(sheet.getSheetName(), 0);
		        
		        byte[] blueRGB = new byte[]{(byte)0, (byte)176, (byte)240};
		        byte[] yellowRGB = new byte[]{(byte)255, (byte)192, (byte)0};
		        byte[] greenRGB = new byte[]{(byte)146, (byte)208, (byte)80};
		        byte[] redRGB = new byte[]{(byte)255, (byte)0, (byte)0};
		        byte[] whiteRGB = new byte[]{(byte)255, (byte)255, (byte)255};
		        
		        boolean isWrapText = true;boolean isBoldText = true;boolean isItalicText = false; int fontSize = 11;String fontName = "Times New Roman";
		        CellStyle blueStyle = cellFormating(workBook,blueRGB,HorizontalAlignment.CENTER,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        CellStyle yellowStyle = cellFormating(workBook,yellowRGB,HorizontalAlignment.CENTER,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        CellStyle greenStyle = cellFormating(workBook,greenRGB,HorizontalAlignment.CENTER,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        CellStyle redStyle = cellFormating(workBook,redRGB,HorizontalAlignment.CENTER,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        CellStyle whiteStyle = cellFormating(workBook,whiteRGB,HorizontalAlignment.CENTER,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        
		        CellStyle indexWhiteStyle = cellFormating(workBook,whiteRGB,HorizontalAlignment.LEFT,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        
		        isWrapText = true;isBoldText = false;isItalicText = false; fontSize = 9;fontName = "Times New Roman";
		        CellStyle sectionStyle = cellFormating(workBook,whiteRGB,HorizontalAlignment.LEFT,VerticalAlignment.CENTER,isWrapText,isBoldText,isItalicText,fontSize,fontName);
		        
		        
	            XSSFRow headingRow = sheet.createRow(0);
	        	String headerString = "Incident Code,SBU,Project,Department,Location,PTW,Risk,Date" + 
	    				"";
	            String[] firstHeaderStringArr = headerString.split("\\,");
	            
	            for (int i = 0; i < firstHeaderStringArr.length; i++) {		        	
		        	Cell cell = headingRow.createCell(i);
			        cell.setCellStyle(greenStyle);
					cell.setCellValue(firstHeaderStringArr[i]);
				}
	            
	            short rowNo = 1;
	            for (IRM obj1 : dataList) {
	                XSSFRow row = sheet.createRow(rowNo);
	                int c = 0;
	            
	                Cell cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue(obj1.getDocument_code());
					
	                cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getSbu_code()+" - "+obj1.getSbu_name());
					
					cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getProject_code()+" - "+obj1.getProject_name());
					
					cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getDepartment_code()+" - "+obj1.getDepartment_name());
					
					cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getLocation_code()+" - "+obj1.getLocation_name());
					
					cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getPtw_code());
					
					cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getRisk_type());
					
					cell = row.createCell(c++);
					cell.setCellStyle(sectionStyle);
					cell.setCellValue (obj1.getCreated_date());
					
	                rowNo++;
	            }
	            for(int columnIndex = 0; columnIndex < firstHeaderStringArr.length; columnIndex++) {
	        		sheet.setColumnWidth(columnIndex, 25 * 200);
				}
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
                Date date = new Date();
                String fileName = "IRM_"+dateFormat.format(date);
                
	            try{
	                /*FileOutputStream fos = new FileOutputStream(fileDirectory +fileName+".xls");
	                workBook.write(fos);
	                fos.flush();*/
	            	
	               response.setContentType("application/.csv");
	 			   response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
	 			   response.setContentType("application/vnd.ms-excel");
	 			   // add response header
	 			   response.addHeader("Content-Disposition", "attachment; filename=" + fileName+".xlsx");
	 			   
	 			    //copies all bytes from a file to an output stream
	 			   workBook.write(response.getOutputStream()); // Write workbook to response.
		           workBook.close();
	 			    //flushes output stream
	 			    response.getOutputStream().flush();
	            	
	                
	                attributes.addFlashAttribute("success",dataExportSucess);
	            	//response.setContentType("application/vnd.ms-excel");
	            	//response.setHeader("Content-Disposition", "attachment; filename=filename.xls");
	            	//XSSFWorkbook  workbook = new XSSFWorkbook ();
	            	// ...
	            	// Now populate workbook the usual way.
	            	// ...
	            	//workbook.write(response.getOutputStream()); // Write workbook to response.
	            	//workbook.close();
	            }catch(FileNotFoundException e){
	                //e.printStackTrace();
	                attributes.addFlashAttribute("error",dataExportInvalid);
	            }catch(IOException e){
	                //e.printStackTrace();
	                attributes.addFlashAttribute("error",dataExportError);
	            }
         }else{
        	 attributes.addFlashAttribute("error",dataExportNoData);
         }
		}catch(Exception e){	
			e.printStackTrace();
			logger.error("exportCompany : : User Id - "+userId+" - User Name - "+userName+" - "+e.getMessage());
			attributes.addFlashAttribute("error", commonError);			
		}
		//return view;
	}
	

	private CellStyle cellFormating(XSSFWorkbook workBook,byte[] rgb,HorizontalAlignment hAllign, VerticalAlignment vAllign, boolean isWrapText,boolean isBoldText,boolean isItalicText,int fontSize,String fontName) {
		CellStyle style = workBook.createCellStyle();
		//Setting Background color  
		//style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		if (style instanceof XSSFCellStyle) {
		   XSSFCellStyle xssfcellcolorstyle = (XSSFCellStyle)style;
		   xssfcellcolorstyle.setFillForegroundColor(new XSSFColor(rgb, null));
		}
		//style.setFillPattern(FillPatternType.ALT_BARS);
		style.setBorderBottom(BorderStyle.MEDIUM);
		style.setBorderTop(BorderStyle.MEDIUM);
		style.setBorderLeft(BorderStyle.MEDIUM);
		style.setBorderRight(BorderStyle.MEDIUM);
		style.setAlignment(hAllign);
		style.setVerticalAlignment(vAllign);
		style.setWrapText(isWrapText);
		
		Font font = workBook.createFont();
        //font.setColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());
        font.setFontHeightInPoints((short)fontSize);  
        font.setFontName(fontName);  //"Times New Roman"
        
        font.setItalic(isItalicText); 
        font.setBold(isBoldText);
        // Applying font to the style  
        style.setFont(font); 
        
        return style;
	}
}
