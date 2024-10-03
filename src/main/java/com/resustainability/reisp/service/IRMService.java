package com.resustainability.reisp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.IRMDao;
import com.resustainability.reisp.model.IRM;
import com.resustainability.reisp.model.Project;
import com.resustainability.reisp.model.ProjectLocation;
import com.resustainability.reisp.model.RoleMapping;
import com.resustainability.reisp.model.User;


@Service
public class IRMService {

	@Autowired
	IRMDao dao;

	public List<Project> getProjectstList(User obj) throws SQLException {
		return dao.getProjectstList(obj);
	}

	public List<RoleMapping> getDepartments(RoleMapping obj) throws Exception  {
		return dao.getDepartments(obj);
	}

	public List<ProjectLocation> getLocations(ProjectLocation obj) throws Exception  {
		return dao.getLocations(obj);
	}

	public List<RoleMapping> getRoleMappingforIRMForm(RoleMapping obj) throws Exception {
		return dao.getRoleMappingforIRMForm(obj);
	}

	public boolean irmSubmit(IRM obj) throws Exception {
		return dao.irmSubmit(obj);
	}

	public List<IRM> getIRMList(IRM obj)  throws Exception {
		return dao.getIRMList(obj);
	}

	public List<IRM> getIncidentFilterListFromIRM(IRM obj) throws Exception  {
		return dao.getIncidentFilterListFromIRM(obj);
	}

	public List<IRM> getStatusFilterListFromIRM(IRM obj) throws Exception  {
		return dao.getStatusFilterListFromIRM(obj);
	}

	public List<IRM> getProjectstListIRMUpdate(IRM irm) throws Exception  {
		return dao.getProjectstListIRMUpdate(irm);
	}

	public List<IRM> getDepartmentsIRMUpdate(IRM irm)  throws Exception {
		return dao.getDepartmentsIRMUpdate(irm);
	}

	public List<IRM> getLocationstListIRMUpdate(IRM irm) throws Exception  {
		return dao.getLocationstListIRMUpdate(irm);
	}

	public IRM getIRMDocumentDEtails(IRM irm)  throws Exception {
		return dao.getIRMDocumentDEtails(irm);
	}

	public boolean irmUpdateSubmit(IRM obj)  throws Exception {
		return dao.irmUpdateSubmit(obj);
	}

	public List<IRM> getIRMHistoryList(IRM obj) throws Exception {
		return dao.getIRMHistoryList(obj);
	}

	public List<IRM> getSBUFilterListFromIRM(IRM obj) throws Exception {
		return dao.getSBUFilterListFromIRM(obj);
	}

	public List<IRM> getProjectFilterListFromIRM(IRM obj) throws Exception {
		return dao.getProjectFilterListFromIRM(obj);
	}

	public List<RoleMapping> getRoleMappedOrNot(RoleMapping obj) throws Exception {
		return dao.getRoleMappedOrNot(obj);
	}

	public List<IRM> getUserListIRMUpdate(IRM irm) throws SQLException {
		return dao.getUserListIRMUpdate(irm);
	}
	
	
}
