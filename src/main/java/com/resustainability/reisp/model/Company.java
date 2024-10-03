package com.resustainability.reisp.model;

public class Company {

	private String id,	company_code,	company_name,	status,	created_date,	created_by,	modified_date,modified_by,all_companies,active_companies,inActive_companies;

	public String getAll_companies() {
		return all_companies;
	}

	public void setAll_companies(String all_companies) {
		this.all_companies = all_companies;
	}

	public String getActive_companies() {
		return active_companies;
	}

	public void setActive_companies(String active_companies) {
		this.active_companies = active_companies;
	}

	public String getInActive_companies() {
		return inActive_companies;
	}

	public void setInActive_companies(String inActive_companies) {
		this.inActive_companies = inActive_companies;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	
	
}
