package com.resustainability.reisp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.RoleMasterDao;
import com.resustainability.reisp.model.RoleMaster;

@Service
public class RoleMasterService {

	@Autowired
	RoleMasterDao dao;

	public List<RoleMaster> getRoleMasterList(RoleMaster obj) throws Exception {
		return dao.getRoleMasterList(obj);
	}

	public List<RoleMaster> getRoleMasterFilterList(RoleMaster obj) throws Exception {
		return dao.getRoleMasterFilterList(obj);
	}

	public List<RoleMaster> getIncidentTypeFilterList(RoleMaster obj) throws Exception {
		return dao.getIncidentTypeFilterList(obj);
	}

	public boolean addRoleMaster(RoleMaster obj) throws Exception {
		return dao.addRoleMaster(obj);
	}

	public boolean updateRoleMaster(RoleMaster obj) throws Exception {
		return dao.updateRoleMaster(obj);
	}
	
	
	
}
