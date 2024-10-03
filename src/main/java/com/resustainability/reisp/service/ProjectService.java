package com.resustainability.reisp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.ProjectDao;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.Project;
import com.resustainability.reisp.model.SBU;


@Service
public class ProjectService {

	@Autowired
	 ProjectDao dao;

	public List<Project> getProjectsList(Project obj)  throws Exception {
		return dao.getProjectsList(obj);
	}

	public List<Project> getCompanyFilterList(Project obj) throws Exception  {
		return dao.getCompanyFilterList(obj);
	}

	public List<Project> getProjectFilterList(Project obj)  throws Exception {
		return dao.getProjectFilterList(obj);
	}

	public List<Project> getStatusFilterList(Project obj) throws Exception  {
		return dao.getStatusFilterList(obj);
	}

	public boolean addProject(Project obj)  throws Exception {
		return dao.addProject(obj);
	}

	public boolean updateProject(Project obj) throws Exception  {
		return dao.updateProject(obj);
	}

	public List<Project> getSBUsList(Project obj) throws Exception {
		return dao.getSBUsList(obj);
	}

	public List<SBU> getCompaniesList(Project obj) throws SQLException {
		return dao.getCompaniesList(obj);
	}

	public List<SBU> getSbuList(Project obj) throws SQLException {
		return dao.getSbuList(obj);
	}

	public List<Project> getFilteredSBUsList(Project obj) throws Exception {
		return dao.getFilteredSBUsList(obj);
	}

	public List<Project> checkUniqueIfForProject(Project obj) throws Exception {
		return dao.checkUniqueIfForProject(obj);
	}
}
