package com.resustainability.reisp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.CompanyDao;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.Department;
import com.resustainability.reisp.model.User;

@Service
public class CompanyService {
	@Autowired
	CompanyDao dao;

	public List<Company> getCompaniesList(Company obj) throws Exception {
		return dao.getCompaniesList(obj);
	}

	public List<Company> getCompanyFilterList(Company obj) throws Exception {
		return dao.getCompanyFilterList(obj);
	}

	public Company getStacksDetails(Company obj) throws Exception {
		return dao.getStacksDetails(obj);
	}

	public boolean addCompany(Company obj) throws Exception  {
		return dao.addCompany(obj);
	}

	public boolean updateCompany(Company obj) throws Exception   {
		return dao.updateCompany(obj);
	}

	public List<Company> getStatusFilterList(Company obj) throws Exception  {
		return dao.getStatusFilterList(obj);
	}

	public List<Company> checkUniqueIfForCompany(Company obj) throws Exception {
		return dao.checkUniqueIfForCompany(obj);
	}
}
