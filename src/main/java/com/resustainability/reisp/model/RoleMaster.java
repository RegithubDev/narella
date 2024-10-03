package com.resustainability.reisp.model;

public class RoleMaster {

	private String id,level1,level2,incident_report,level3,safety_type,incident_code,incident_type,level;

	public String getIncident_report() {
		return incident_report;
	}

	public void setIncident_report(String incident_report) {
		this.incident_report = incident_report;
	}

	public String getIncident_code() {
		return incident_code;
	}

	public void setIncident_code(String incident_code) {
		this.incident_code = incident_code;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getIncident_type() {
		return incident_type;
	}

	public void setIncident_type(String incident_type) {
		this.incident_type = incident_type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLevel1() {
		return level1;
	}

	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2() {
		return level2;
	}

	public void setLevel2(String level2) {
		this.level2 = level2;
	}

	public String getLevel3() {
		return level3;
	}

	public void setLevel3(String level3) {
		this.level3 = level3;
	}

	public String getSafety_type() {
		return safety_type;
	}

	public void setSafety_type(String safety_type) {
		this.safety_type = safety_type;
	}
	
}
