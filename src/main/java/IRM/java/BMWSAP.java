package IRM.java;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BMWSAP {

	private String id,plant_name,TotalWeight,CustomerCode,TotalVisits,status,CustomerSAPCode,ActualVisitMonth,MSG,pull_datetime,plant,ActiveVistis,incativeVistis,customerId,Plantname,CustomerID,ActualMonthAndYear;
	public String getPlant() {
		return plant;
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
