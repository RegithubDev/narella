package com.resustainability.reisp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.DepartmentDao;
import com.resustainability.reisp.model.Department;

@Service
public class DepartmentService {
	@Autowired
	DepartmentDao dao;

	public List<Department> getSBUList(Department obj) throws Exception {
		return dao.getSBUList(obj);
	}

	public List<Department> getDepartmentsList(Department obj) throws Exception  {
		return dao.getDepartmentsList(obj);
	}

	public List<Department> getSBUsFilterList(Department obj)  throws Exception {
		return dao.getSBUsFilterList(obj);
	}

	public List<Department> getDepartmentFilterList(Department obj) throws Exception  {
		return dao.getDepartmentFilterList(obj);
	}

	public List<Department> getStatusFilterListFromDepartment(Department obj)  throws Exception {
		return dao.getStatusFilterListFromDepartment(obj);
	}

	public boolean addDepartment(Department obj) throws Exception  {
		return dao.addDepartment(obj);
	}

	public boolean updateDepartment(Department obj)  throws Exception {
		return dao.updateDepartment(obj);
	}

	public List<Department> checkUniqueIfForDept(Department obj) throws Exception {
		return dao.checkUniqueIfForDept(obj);
	}
}
