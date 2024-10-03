package com.resustainability.reisp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BMWSAP {

	private String id,plant_name,TotalWeight,project_code,month,year,password,user_id,period,CustomerCode,TotalVisits,status,CustomerSAPCode,ActualVisitMonth,MSG,pull_datetime,plant,ActiveVistis,incativeVistis,customerId,Plantname,CustomerID,ActualMonthAndYear;
	public String getPlant() {
		return plant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	public String getTotalWeight() {
		return TotalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		TotalWeight = totalWeight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getCustomerSAPCode() {
		return CustomerSAPCode;
	}

	public void setCustomerSAPCode(String customerSAPCode) {
		CustomerSAPCode = customerSAPCode;
	}

	public String getPlant_name() {
		return plant_name;
	}

	public void setPlant_name(String plant_name) {
		this.plant_name = plant_name;
	}

	public String getCustomerCode() {
		return CustomerCode;
	}

	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}

	public String getActualVisitMonth() {
		return ActualVisitMonth;
	}

	public void setActualVisitMonth(String actualVisitMonth) {
		ActualVisitMonth = actualVisitMonth;
	}

	public String getMSG() {
		return MSG;
	}

	public void setMSG(String mSG) {
		MSG = mSG;
	}

	public String getPull_datetime() {
		return pull_datetime;
	}

	public void setPull_datetime(String pull_datetime) {
		this.pull_datetime = pull_datetime;
	}

	@JsonProperty("Plantname")
	public String getPlantname() {
		return Plantname;
	}

	public void setPlantname(String plantname) {
		Plantname = plantname;
	}
	@JsonProperty("CustomerID")
	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	@JsonProperty("ActualMonthAndYear")
	public String getActualMonthAndYear() {
		return ActualMonthAndYear;
	}

	public void setActualMonthAndYear(String actualMonthAndYear) {
		ActualMonthAndYear = actualMonthAndYear;
	}
	
	public String getTotalVisits() {
		return TotalVisits;
	}

	public void setTotalVisits(String totalVisits) {
		TotalVisits = totalVisits;
	}

	public String getActiveVistis() {
		return ActiveVistis;
	}

	public void setActiveVistis(String activeVistis) {
		ActiveVistis = activeVistis;
	}

	public String getIncativeVistis() {
		return incativeVistis;
	}

	public void setIncativeVistis(String incativeVistis) {
		this.incativeVistis = incativeVistis;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
