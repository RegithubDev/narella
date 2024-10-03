package com.resustainability.reisp.model;

public class Project {

	private String id,	company_code,company_name,	sbu_code,sbu_name,	project_code,	project_name,	status,	created_date,	created_by,	modified_date,
	modified_by,all_projects,active_projects,inActive_projects;;

	public String getAll_projects() {
		return all_projects;
	}

	public void setAll_projects(String all_projects) {
		this.all_projects = all_projects;
	}

	public String getActive_projects() {
		return active_projects;
	}

	public void setActive_projects(String active_projects) {
		this.active_projects = active_projects;
	}

	public String getInActive_projects() {
		return inActive_projects;
	}

	public void setInActive_projects(String inActive_projects) {
		this.inActive_projects = inActive_projects;
	}

	public String getSbu_name() {
		return sbu_name;
	}

	public void setSbu_name(String sbu_name) {
		this.sbu_name = sbu_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
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

	public String getSbu_code() {
		return sbu_code;
	}

	public void setSbu_code(String sbu_code) {
		this.sbu_code = sbu_code;
	}

	public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
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
