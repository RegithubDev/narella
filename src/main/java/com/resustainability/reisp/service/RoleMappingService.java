package com.resustainability.reisp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.RoleMappingDao;
import com.resustainability.reisp.model.RoleMapping;
@Service
public class RoleMappingService {
	@Autowired
	RoleMappingDao dao;

	public List<RoleMapping> getProjectsList(RoleMapping obj) throws SQLException {
		return dao.getProjectsList(obj);
	}

	public List<RoleMapping> getDeptsList(RoleMapping obj) throws SQLException {
		return dao.getDeptsList(obj);
	}

	public List<RoleMapping> getEmpstList(RoleMapping obj) throws SQLException {
		return dao.getEmpstList(obj);
	}

	public List<RoleMapping> getRolestList(RoleMapping obj) throws SQLException {
		return dao.getRolestList(obj);
	}

	public List<RoleMapping> getRoleMappingsList(RoleMapping obj) throws Exception {
		return dao.getRoleMappingsList(obj);
	}

	public List<RoleMapping> getDeptFilterList(RoleMapping obj) throws Exception {
		return dao.getDeptFilterList(obj);
	}

	public List<RoleMapping> getProjectFilterFromRoleMapping(RoleMapping obj) throws Exception {
		return dao.getProjectFilterFromRoleMapping(obj);
	}

	public List<RoleMapping> getRoleMasterFilterList(RoleMapping obj) throws Exception {
		return dao.getRoleMasterFilterList(obj);
	}

	public List<RoleMapping> getempFilterList(RoleMapping obj) throws Exception {
		return dao.getempFilterList(obj);
	}

	public boolean addRoleMapping(RoleMapping obj)throws Exception  {
		return dao.addRoleMapping(obj);
	}

	public boolean updateRoleMapping(RoleMapping obj)throws Exception  {
		return dao.updateRoleMapping(obj);
	}

	public List<RoleMapping> getFilteredRolesList(RoleMapping obj) throws Exception {
		return dao.getFilteredRolesList(obj);
	}

	public List<RoleMapping> getMappingUserSecurity(RoleMapping obj) throws Exception {
		return dao.getMappingUserSecurity(obj);
	}
}
