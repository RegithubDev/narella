package com.resustainability.reisp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.SBUDao;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.SBU;

@Service
public class SBUService {
	@Autowired
	SBUDao dao;

	public List<SBU> getSBUsList(SBU obj)  throws Exception {
		return dao.getSBUsList(obj);
	}

	public List<SBU> getCompanyFilterList(SBU obj)  throws Exception {
		return dao.getCompanyFilterList(obj);
	}

	public List<SBU> getSBUFilterList(SBU obj)  throws Exception {
		return dao.getSBUFilterList(obj);
	}

	public boolean addSBU(SBU obj)  throws Exception {
		return dao.addSBU(obj);
	}

	public boolean updateSBU(SBU obj) throws Exception  {
		return dao.updateSBU(obj);
	}

	public List<SBU> getCompaniesList(SBU obj) throws Exception {
		return dao.getCompaniesList(obj);
	}

	public List<SBU> getStatusFilterListFromSBU(SBU obj) throws Exception {
		return dao.getStatusFilterListFromSBU(obj);
	}

	public List<SBU> checkUniqueIfForSBU(SBU obj) throws Exception {
		return dao.checkUniqueIfForSBU(obj);
	}
	
}
