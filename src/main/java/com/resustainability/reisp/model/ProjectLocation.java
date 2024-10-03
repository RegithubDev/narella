package com.resustainability.reisp.model;

public class ProjectLocation {

	private String id,	location_code,	location_name,	project_code,project_name,	status,	created_date,	created_by,modified_by,	modified_date,
	all_location,active_location,inActive_location;

	public String getAll_location() {
		return all_location;
	}

	public void setAll_location(String all_location) {
		this.all_location = all_location;
	}

	public String getActive_location() {
		return active_location;
	}

	public void setActive_location(String active_location) {
		this.active_location = active_location;
	}

	public String getInActive_location() {
		return inActive_location;
	}

	public void setInActive_location(String inActive_location) {
		this.inActive_location = inActive_location;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation_code() {
		return location_code;
	}

	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
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
	
}
