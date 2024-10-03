package com.resustainability.reisp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.IRM;
import com.resustainability.reisp.model.SBU;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.service.CompanyService;
import com.resustainability.reisp.service.IRMService;
import com.resustainability.reisp.service.ProjectService;

@Controller
public class BrainBoxController {

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	Logger logger = Logger.getLogger(BrainBoxController.class);
	
	@Autowired
	CompanyService service;
	 
	@Autowired 
	IRMService service1; 
	
	@Autowired 
	ProjectService service2;
	
	@RequestMapping(value = "/bb-is", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView bbForm(@ModelAttribute User user, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.bbForm);
		Company obj = null;
		try {
			List<Company> companiesList = service.getCompaniesList(obj);
			model.addObject("companiesList", companiesList);
			
			List <IRM> projectsList = service1.getProjectstListIRMUpdate(null);
			model.addObject("projectsList", projectsList);

			List <IRM> deptsList = service1.getDepartmentsIRMUpdate(null);
			model.addObject("deptsList", deptsList);
			
			List<SBU> sbuList = service2.getSbuList(null);
			model.addObject("sbuList", sbuList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	
	
}
