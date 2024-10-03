package IRM.java;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BMW {
	
private String company,plant,CustomerDistrict,user_id,password,repulled,user_ip,msg,PTC_status,CustomerTown,CustomerName,CustomerCABSCode,CustomerSAPCode,
	TypeofEstablishment,ActualVisitDate,ActualVisitMonth,ActualVisitYear,VisitDayTime,BlueCount,BlueWeight,
	RedCount,RedWeight,YellowCount,YellowWeight,CytotoxicCount,CytotoxicWeight,WhitesCount,WhitesWeight,TotalCount,Logs,
	CollectionLatitude,ServerDateTime,uniqueID,Active,
	
	name,h_no,sap_customer_id,active,mobile,customer_email
,executive_email,supervisor_contact_no,supervisor_email,route_mbd_display_name,hospital_type,contact_person
,establishment_type,contract_start_date,contract_end_date,service_frequency,street,city,zip,no_of_beds
,town_display_name,district_display_name,pcb_id,spcb_unique_client_code,plant_name,sd_plant_code,state_code,SPCB_CD,NO_BEDS_INV,SD_Plantcode,SD_Plantname
,actual_service_start_date,customer_group,service_block_status_from_sales,SID,	MID,	RFID,	DOT,	serverTime,customer,Registrationnumber,

kUNNR,nAME1,nAME_CO,sTREET,cITY,pOSTCODE,sTATECODE,cOUNTRY,lANGU,mOBILENUMBER,mAILID,cUSTOMERGROUP,aUFSD,aCTSERVICECERTFROMDATE,aCTSERVICECERTTODATE,sERVICESTARTDATE,
rEGISTRATIONDATE,uPPERSLABINKG,rATEREVISIONPERIOD,rATEREVISION,lATLONGONPICKUPPOINT,cUSTOMERAGREEMENTFROM,cUSTOMERAGREEMENTTO,cUS_GRP,cUSTOMERFACILITY,cUSTOMERFACILITYTYPE,
cUSTOMERFREQUENCY,nOOFPICKUPLOCATION,aCTIVE_INACTIVE,sERVEDINMONTHORNOT,nOOFDAYSSERVEDINMONTH,SA_STATUSBLOCK,Plantname,CustomerID,ActualMonthAndYear
;
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

@JsonProperty("SA_STATUSBLOCK")
public String getSA_STATUSBLOCK() {
	return SA_STATUSBLOCK;
}

public void setSA_STATUSBLOCK(String sA_STATUSBLOCK) {
	SA_STATUSBLOCK = sA_STATUSBLOCK;
}

@JsonProperty("SPCB_CD")
public String getSPCB_CD() {
	return SPCB_CD;
}

public void setSPCB_CD(String sPCB_CD) {
	SPCB_CD = sPCB_CD;
}
@JsonProperty("NO_BEDS_INV")
public String getNO_BEDS_INV() {
	return NO_BEDS_INV;
}

public void setNO_BEDS_INV(String nO_BEDS_INV) {
	NO_BEDS_INV = nO_BEDS_INV;
}
@JsonProperty("SD_PLANTCODE")
public String getSD_Plantcode() {
	return SD_Plantcode;
}

public void setSD_Plantcode(String sD_Plantcode) {
	SD_Plantcode = sD_Plantcode;
}
@JsonProperty("SD_PLANTNAME")
public String getSD_Plantname() {
	return SD_Plantname;
}

public void setSD_Plantname(String sD_Plantname) {
	SD_Plantname = sD_Plantname;
}
@JsonProperty("CUSTOMER")
public String getCustomer() {
	return customer;
}

public void setCustomer(String customer) {
	this.customer = customer;
}
@JsonProperty("REGISTRATIONNUMBER")
public String getRegistrationnumber() {
	return Registrationnumber;
}

public void setRegistrationnumber(String registrationnumber) {
	Registrationnumber = registrationnumber;
}





public String getSID() {
	return SID;
}

public void setSID(String sID) {
	SID = sID;
}

public String getMID() {
	return MID;
}

public void setMID(String mID) {
	MID = mID;
}

public String getRFID() {
	return RFID;
}

public void setRFID(String rFID) {
	RFID = rFID;
}

public String getDOT() {
	return DOT;
}

public void setDOT(String dOT) {
	DOT = dOT;
}

public String getServerTime() {
	return serverTime;
}

public void setServerTime(String serverTime) {
	this.serverTime = serverTime;
}

@JsonProperty("KUNNR")
public String getkUNNR() {
	return kUNNR;
}

public void setkUNNR(String kUNNR) {
	this.kUNNR = kUNNR;
}

@JsonProperty("NAME1")
public String getnAME1() {
	return nAME1;
}

public void setnAME1(String nAME1) {
	this.nAME1 = nAME1;
}
@JsonProperty("NAME_CO")
public String getnAME_CO() {
	return nAME_CO;
}

public void setnAME_CO(String nAME_CO) {
	this.nAME_CO = nAME_CO;
}
@JsonProperty("STREET")
public String getsTREET() {
	return sTREET;
}

public void setsTREET(String sTREET) {
	this.sTREET = sTREET;
}
@JsonProperty("CITY")
public String getcITY() {
	return cITY;
}

public void setcITY(String cITY) {
	this.cITY = cITY;
}
@JsonProperty("POSTCODE")
public String getpOSTCODE() {
	return pOSTCODE;
}

public void setpOSTCODE(String pOSTCODE) {
	this.pOSTCODE = pOSTCODE;
}
@JsonProperty("STATECODE")
public String getsTATECODE() {
	return sTATECODE;
}

public void setsTATECODE(String sTATECODE) {
	this.sTATECODE = sTATECODE;
}
@JsonProperty("COUNTRY")
public String getcOUNTRY() {
	return cOUNTRY;
}

public void setcOUNTRY(String cOUNTRY) {
	this.cOUNTRY = cOUNTRY;
}
@JsonProperty("LANGU")
public String getlANGU() {
	return lANGU;
}

public void setlANGU(String lANGU) {
	this.lANGU = lANGU;
}
@JsonProperty("MOBILENUMBER")
public String getmOBILENUMBER() {
	return mOBILENUMBER;
}

public void setmOBILENUMBER(String mOBILENUMBER) {
	this.mOBILENUMBER = mOBILENUMBER;
}
@JsonProperty("MAILID")
public String getmAILID() {
	return mAILID;
}

public void setmAILID(String mAILID) {
	this.mAILID = mAILID;
}
@JsonProperty("CUSTOMERGROUP")
public String getcUSTOMERGROUP() {
	return cUSTOMERGROUP;
}

public void setcUSTOMERGROUP(String cUSTOMERGROUP) {
	this.cUSTOMERGROUP = cUSTOMERGROUP;
}
@JsonProperty("AUFSD")
public String getaUFSD() {
	return aUFSD;
}

public void setaUFSD(String aUFSD) {
	this.aUFSD = aUFSD;
}
@JsonProperty("ACTSERVICECERTFROMDATE")
public String getaCTSERVICECERTFROMDATE() {
	return aCTSERVICECERTFROMDATE;
}

public void setaCTSERVICECERTFROMDATE(String aCTSERVICECERTFROMDATE) {
	this.aCTSERVICECERTFROMDATE = aCTSERVICECERTFROMDATE;
}
@JsonProperty("ACTSERVICECERTTODATE")
public String getaCTSERVICECERTTODATE() {
	return aCTSERVICECERTTODATE;
}

public void setaCTSERVICECERTTODATE(String aCTSERVICECERTTODATE) {
	this.aCTSERVICECERTTODATE = aCTSERVICECERTTODATE;
}
@JsonProperty("SERVICESTARTDATE")
public String getsERVICESTARTDATE() {
	return sERVICESTARTDATE;
}

public void setsERVICESTARTDATE(String sERVICESTARTDATE) {
	this.sERVICESTARTDATE = sERVICESTARTDATE;
}
@JsonProperty("REGISTRATIONDATE")
public String getrEGISTRATIONDATE() {
	return rEGISTRATIONDATE;
}

public void setrEGISTRATIONDATE(String rEGISTRATIONDATE) {
	this.rEGISTRATIONDATE = rEGISTRATIONDATE;
}
@JsonProperty("UPPERSLABINKG")
public String getuPPERSLABINKG() {
	return uPPERSLABINKG;
}

public void setuPPERSLABINKG(String uPPERSLABINKG) {
	this.uPPERSLABINKG = uPPERSLABINKG;
}
@JsonProperty("RATEREVISIONPERIOD")
public String getrATEREVISIONPERIOD() {
	return rATEREVISIONPERIOD;
}

public void setrATEREVISIONPERIOD(String rATEREVISIONPERIOD) {
	this.rATEREVISIONPERIOD = rATEREVISIONPERIOD;
}
@JsonProperty("RATEREVISION")
public String getrATEREVISION() {
	return rATEREVISION;
}

public void setrATEREVISION(String rATEREVISION) {
	this.rATEREVISION = rATEREVISION;
}
@JsonProperty("LATLONGONPICKUPPOINT")
public String getlATLONGONPICKUPPOINT() {
	return lATLONGONPICKUPPOINT;
}

public void setlATLONGONPICKUPPOINT(String lATLONGONPICKUPPOINT) {
	this.lATLONGONPICKUPPOINT = lATLONGONPICKUPPOINT;
}
@JsonProperty("CUSTOMERAGREEMENTFROM")
public String getcUSTOMERAGREEMENTFROM() {
	return cUSTOMERAGREEMENTFROM;
}

public void setcUSTOMERAGREEMENTFROM(String cUSTOMERAGREEMENTFROM) {
	this.cUSTOMERAGREEMENTFROM = cUSTOMERAGREEMENTFROM;
}
@JsonProperty("CUSTOMERAGREEMENTTO")
public String getcUSTOMERAGREEMENTTO() {
	return cUSTOMERAGREEMENTTO;
}

public void setcUSTOMERAGREEMENTTO(String cUSTOMERAGREEMENTTO) {
	this.cUSTOMERAGREEMENTTO = cUSTOMERAGREEMENTTO;
}
@JsonProperty("CUS_GRP")
public String getcUS_GRP() {
	return cUS_GRP;
}

public void setcUS_GRP(String cUS_GRP) {
	this.cUS_GRP = cUS_GRP;
}
@JsonProperty("CUSTOMERFACILITY")
public String getcUSTOMERFACILITY() {
	return cUSTOMERFACILITY;
}

public void setcUSTOMERFACILITY(String cUSTOMERFACILITY) {
	this.cUSTOMERFACILITY = cUSTOMERFACILITY;
}
@JsonProperty("CUSTOMERFACILITYTYPE")
public String getcUSTOMERFACILITYTYPE() {
	return cUSTOMERFACILITYTYPE;
}

public void setcUSTOMERFACILITYTYPE(String cUSTOMERFACILITYTYPE) {
	this.cUSTOMERFACILITYTYPE = cUSTOMERFACILITYTYPE;
}
@JsonProperty("CUSTOMERFREQUENCY")
public String getcUSTOMERFREQUENCY() {
	return cUSTOMERFREQUENCY;
}

public void setcUSTOMERFREQUENCY(String cUSTOMERFREQUENCY) {
	this.cUSTOMERFREQUENCY = cUSTOMERFREQUENCY;
}
@JsonProperty("NOOFPICKUPLOCATION")
public String getnOOFPICKUPLOCATION() {
	return nOOFPICKUPLOCATION;
}

public void setnOOFPICKUPLOCATION(String nOOFPICKUPLOCATION) {
	this.nOOFPICKUPLOCATION = nOOFPICKUPLOCATION;
}
@JsonProperty("ACTIVE_INACTIVE")
public String getaCTIVE_INACTIVE() {
	return aCTIVE_INACTIVE;
}

public void setaCTIVE_INACTIVE(String aCTIVE_INACTIVE) {
	this.aCTIVE_INACTIVE = aCTIVE_INACTIVE;
}
@JsonProperty("SERVEDINMONTHORNOT")
public String getsERVEDINMONTHORNOT() {
	return sERVEDINMONTHORNOT;
}

public void setsERVEDINMONTHORNOT(String sERVEDINMONTHORNOT) {
	this.sERVEDINMONTHORNOT = sERVEDINMONTHORNOT;
}
@JsonProperty("NOOFDAYSSERVEDINMONTH")
public String getnOOFDAYSSERVEDINMONTH() {
	return nOOFDAYSSERVEDINMONTH;
}

public void setnOOFDAYSSERVEDINMONTH(String nOOFDAYSSERVEDINMONTH) {
	this.nOOFDAYSSERVEDINMONTH = nOOFDAYSSERVEDINMONTH;
}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getH_no() {
	return h_no;
}

public void setH_no(String h_no) {
	this.h_no = h_no;
}

public String getSap_customer_id() {
	return sap_customer_id;
}

public void setSap_customer_id(String sap_customer_id) {
	this.sap_customer_id = sap_customer_id;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getCustomer_email() {
	return customer_email;
}

public void setCustomer_email(String customer_email) {
	this.customer_email = customer_email;
}

public String getExecutive_email() {
	return executive_email;
}

public void setExecutive_email(String executive_email) {
	this.executive_email = executive_email;
}

public String getSupervisor_contact_no() {
	return supervisor_contact_no;
}

public void setSupervisor_contact_no(String supervisor_contact_no) {
	this.supervisor_contact_no = supervisor_contact_no;
}

public String getSupervisor_email() {
	return supervisor_email;
}

public void setSupervisor_email(String supervisor_email) {
	this.supervisor_email = supervisor_email;
}

public String getRoute_mbd_display_name() {
	return route_mbd_display_name;
}

public void setRoute_mbd_display_name(String route_mbd_display_name) {
	this.route_mbd_display_name = route_mbd_display_name;
}

public String getHospital_type() {
	return hospital_type;
}

public void setHospital_type(String hospital_type) {
	this.hospital_type = hospital_type;
}

public String getContact_person() {
	return contact_person;
}

public void setContact_person(String contact_person) {
	this.contact_person = contact_person;
}

public String getEstablishment_type() {
	return establishment_type;
}

public void setEstablishment_type(String establishment_type) {
	this.establishment_type = establishment_type;
}

public String getContract_start_date() {
	return contract_start_date;
}

public void setContract_start_date(String contract_start_date) {
	this.contract_start_date = contract_start_date;
}

public String getContract_end_date() {
	return contract_end_date;
}

public void setContract_end_date(String contract_end_date) {
	this.contract_end_date = contract_end_date;
}

public String getService_frequency() {
	return service_frequency;
}

public void setService_frequency(String service_frequency) {
	this.service_frequency = service_frequency;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
}

public String getNo_of_beds() {
	return no_of_beds;
}

public void setNo_of_beds(String no_of_beds) {
	this.no_of_beds = no_of_beds;
}

public String getTown_display_name() {
	return town_display_name;
}

public void setTown_display_name(String town_display_name) {
	this.town_display_name = town_display_name;
}

public String getDistrict_display_name() {
	return district_display_name;
}

public void setDistrict_display_name(String district_display_name) {
	this.district_display_name = district_display_name;
}

public String getPcb_id() {
	return pcb_id;
}

public void setPcb_id(String pcb_id) {
	this.pcb_id = pcb_id;
}

public String getSpcb_unique_client_code() {
	return spcb_unique_client_code;
}

public void setSpcb_unique_client_code(String spcb_unique_client_code) {
	this.spcb_unique_client_code = spcb_unique_client_code;
}

public String getPlant_name() {
	return plant_name;
}

public void setPlant_name(String plant_name) {
	this.plant_name = plant_name;
}

public String getSd_plant_code() {
	return sd_plant_code;
}

public void setSd_plant_code(String sd_plant_code) {
	this.sd_plant_code = sd_plant_code;
}

public String getState_code() {
	return state_code;
}

public void setState_code(String state_code) {
	this.state_code = state_code;
}

public String getActual_service_start_date() {
	return actual_service_start_date;
}

public void setActual_service_start_date(String actual_service_start_date) {
	this.actual_service_start_date = actual_service_start_date;
}

public String getCustomer_group() {
	return customer_group;
}

public void setCustomer_group(String customer_group) {
	this.customer_group = customer_group;
}

public String getService_block_status_from_sales() {
	return service_block_status_from_sales;
}

public void setService_block_status_from_sales(String service_block_status_from_sales) {
	this.service_block_status_from_sales = service_block_status_from_sales;
}

	@JsonProperty("BATCHID")
	private String APIID;
	
	@JsonProperty("Active")
	private String CustomerStatus;
	
	
	@JsonProperty("id")
	private String CabsTransID;
	
	@JsonProperty("Log")
	private String Log;
	
	@JsonProperty("Count")
	private String Count;
	
	@JsonProperty("ManifestNo")
	private String ManifestNo;
	
	@JsonProperty("VehicleRegNo")
	private String VehicleRegNo;
	
	@JsonProperty("ServiceFrequency")
	private String ServiceFrequency;
	
	@JsonProperty("APIType")
	private String APIType;
	
	@JsonProperty("TotalWeight")
	private String TotalWeight;
	
	@JsonProperty("CollectionLongitude")
	private String CollectionLongitude;

	@JsonProperty("DistrictName")
	private String DistrictName;
	
	@JsonProperty("Lat")
	private String Lat;
	
	@JsonProperty("Lon")
	private String Lon;
	
	@JsonProperty("Vehicle_Name")
	private String route;
	
	@JsonProperty("Yellow_Weight")
	private String Yellow_Weight;
	
	@JsonProperty("Cytotoxic_Count")
	private String Cytotoxic_Count;
	
	@JsonProperty("Total_Weight")
	private String Total_Weight;
	
	@JsonProperty("Partner_Id")
	private String Partner_Id;
	
	@JsonProperty("Whites_Weight")
	private String Whites_Weight;
	
	@JsonProperty("Blue_Count")
	private String Blue_Count;
	
	@JsonProperty("PlantLocation")
	private String PlantLocation;
	
	@JsonProperty("Red_Weight")
	private String Red_Weight;
	
	@JsonProperty("Blue_Weight")
	private String Blue_Weight;
	
	@JsonProperty("TownName")
	private String TownName;
	
	@JsonProperty("Sap_Id")
	private String Sap_Id;
	
	@JsonProperty("Partner_Name")
	private String Partner_Name;
	
	@JsonProperty("Total_Count")
	private String Total_Count;
	
	@JsonProperty("Month")
	private String Month;
	@JsonProperty("Yellow_Count")
	private String Yellow_Count;
	
	@JsonProperty("Cytotoxic_Weight")
	private String Cytotoxic_Weight;
	
	@JsonProperty("Red_Count")
	private String Red_Count;
	
	@JsonProperty("Establishment_Type")
	private String Establishment_Type;
	
	@JsonProperty("Year")
	private String Year;
	@JsonProperty("Date")
	private String Date;
	
	@JsonProperty("PlantName")
	private String PlantName;
	
	@JsonProperty("Whites_Count")
	private String Whites_Count;
	
	@JsonProperty("Visit_Date")
	private String VisitDate;
	
	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	public String getCustomerStatus() {
		return CustomerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		CustomerStatus = customerStatus;
	}

	public String getAPIID() {
		return APIID;
	}

	public void setAPIID(String APIID) {
		this.APIID = APIID;
	}
	
public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

public String getLogs() {
		return Logs;
	}

	public void setLogs(String logs) {
		Logs = logs;
	}

public String getCabsTransID() {
		return CabsTransID;
	}

	public void setCabsTransID(String cabsTransID) {
		CabsTransID = cabsTransID;
	}



public String getLog() {
		return Log;
	}

	public void setLog(String log) {
		Log = log;
	}

	public String getCount() {
		return Count;
	}

	public void setCount(String count) {
		Count = count;
	}

public BMW() {
}

public String getLon() {
	return Lon;
}

public void setLon(String lon) {
	Lon = lon;
}

public String getDistrictName() {
	return DistrictName;
}

public void setDistrictName(String districtName) {
	DistrictName = districtName;
}

public String getLat() {
	return Lat;
}

public void setLat(String lat) {
	Lat = lat;
}


public String getYellow_Weight() {
	return Yellow_Weight;
}

public void setYellow_Weight(String yellow_Weight) {
	Yellow_Weight = yellow_Weight;
}

public String getCytotoxic_Count() {
	return Cytotoxic_Count;
}

public void setCytotoxic_Count(String cytotoxic_Count) {
	Cytotoxic_Count = cytotoxic_Count;
}

public String getTotal_Weight() {
	return Total_Weight;
}

public void setTotal_Weight(String total_Weight) {
	Total_Weight = total_Weight;
}



public String getPartner_Id() {
	return Partner_Id;
}

public void setPartner_Id(String partner_Id) {
	Partner_Id = partner_Id;
}

public String getWhites_Weight() {
	return Whites_Weight;
}

public void setWhites_Weight(String whites_Weight) {
	Whites_Weight = whites_Weight;
}

public String getBlue_Count() {
	return Blue_Count;
}

public void setBlue_Count(String blue_Count) {
	Blue_Count = blue_Count;
}

public String getPlantLocation() {
	return PlantLocation;
}

public void setPlantLocation(String plantLocation) {
	PlantLocation = plantLocation;
}

public String getRed_Weight() {
	return Red_Weight;
}

public void setRed_Weight(String Red_Weight) {
	this.Red_Weight = Red_Weight;
}

public String getBlue_Weight() {
	return Blue_Weight;
}

public void setBlue_Weight(String blue_Weight) {
	Blue_Weight = blue_Weight;
}

public String getTownName() {
	return TownName;
}

public void setTownName(String townName) {
	TownName = townName;
}

public String getSap_Id() {
	return Sap_Id;
}

public void setSap_Id(String sap_Id) {
	Sap_Id = sap_Id;
}

public String getPartner_Name() {
	return Partner_Name;
}

public void setPartner_Name(String partner_Name) {
	Partner_Name = partner_Name;
}

public String getTotal_Count() {
	return Total_Count;
}

public void setTotal_Count(String total_Count) {
	Total_Count = total_Count;
}

public String getMonth() {
	return Month;
}

public void setMonth(String month) {
	Month = month;
}

public String getYellow_Count() {
	return Yellow_Count;
}

public void setYellow_Count(String yellow_Count) {
	Yellow_Count = yellow_Count;
}

public String getCytotoxic_Weight() {
	return Cytotoxic_Weight;
}

public void setCytotoxic_Weight(String cytotoxic_Weight) {
	Cytotoxic_Weight = cytotoxic_Weight;
}

public String getRed_Count() {
	return Red_Count;
}

public void setRed_Count(String Red_Count) {
	this.Red_Count = Red_Count;
}

public String getEstablishment_Type() {
	return Establishment_Type;
}

public void setEstablishment_Type(String establishment_Type) {
	Establishment_Type = establishment_Type;
}

public String getYear() {
	return Year;
}

public void setYear(String year) {
	Year = year;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public String getPlantName() {
	return PlantName;
}

public void setPlantName(String plantName) {
	PlantName = plantName;
}

public String getWhites_Count() {
	return Whites_Count;
}

public void setWhites_Count(String whites_Count) {
	Whites_Count = whites_Count;
}

public String getVisitDate() {
	return VisitDate;
}

public void setVisitDate(String visitDate) {
	VisitDate = visitDate;
}


public String getRepulled() {
	return repulled;
}

public void setRepulled(String repulled) {
	this.repulled = repulled;
}

public String getUser_ip() {
	return user_ip;
}

public void setUser_ip(String user_ip) {
	this.user_ip = user_ip;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public String getPTC_status() {
	return PTC_status;
}

public void setPTC_status(String pTC_status) {
	PTC_status = pTC_status;
}

public String getUser_id() {
	return user_id;
}

public void setUser_id(String user_id) {
	this.user_id = user_id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getPlant() {
	return plant;
}

public void setPlant(String plant) {
	this.plant = plant;
}

public String getRoute() {
	return route;
}

public void setRoute(String route) {
	this.route = route;
}

public String getCustomerDistrict() {
	return CustomerDistrict;
}

public void setCustomerDistrict(String customerDistrict) {
	CustomerDistrict = customerDistrict;
}

public String getCustomerTown() {
	return CustomerTown;
}

public void setCustomerTown(String customerTown) {
	CustomerTown = customerTown;
}

public String getVehicleRegNo() {
	return VehicleRegNo;
}

public void setVehicleRegNo(String vehicleRegNo) {
	VehicleRegNo = vehicleRegNo;
}

public String getCustomerName() {
	return CustomerName;
}

public void setCustomerName(String customerName) {
	CustomerName = customerName;
}

public String getCustomerCABSCode() {
	return CustomerCABSCode;
}

public void setCustomerCABSCode(String customerCABSCode) {
	CustomerCABSCode = customerCABSCode;
}

public String getCustomerSAPCode() {
	return CustomerSAPCode;
}

public void setCustomerSAPCode(String customerSAPCode) {
	CustomerSAPCode = customerSAPCode;
}

public String getTypeofEstablishment() {
	return TypeofEstablishment;
}

public void setTypeofEstablishment(String typeofEstablishment) {
	TypeofEstablishment = typeofEstablishment;
}

public String getManifestNo() {
	return ManifestNo;
}

public void setManifestNo(String manifestNo) {
	ManifestNo = manifestNo;
}

public String getActualVisitDate() {
	return ActualVisitDate;
}

public void setActualVisitDate(String actualVisitDate) {
	ActualVisitDate = actualVisitDate;
}

public String getActualVisitMonth() {
	return ActualVisitMonth;
}

public void setActualVisitMonth(String actualVisitMonth) {
	ActualVisitMonth = actualVisitMonth;
}

public String getActualVisitYear() {
	return ActualVisitYear;
}

public void setActualVisitYear(String actualVisitYear) {
	ActualVisitYear = actualVisitYear;
}

public String getVisitDayTime() {
	return VisitDayTime;
}

public void setVisitDayTime(String visitDayTime) {
	VisitDayTime = visitDayTime;
}

public String getServiceFrequency() {
	return ServiceFrequency;
}

public void setServiceFrequency(String serviceFrequency) {
	ServiceFrequency = serviceFrequency;
}

public String getBlueCount() {
	return BlueCount;
}

public void setBlueCount(String blueCount) {
	BlueCount = blueCount;
}

public String getBlueWeight() {
	return BlueWeight;
}

public void setBlueWeight(String blueWeight) {
	BlueWeight = blueWeight;
}

public String getRedCount() {
	return RedCount;
}

public void setRedCount(String redCount) {
	RedCount = redCount;
}

public String getRedWeight() {
	return RedWeight;
}

public void setRedWeight(String redWeight) {
	RedWeight = redWeight;
}

public String getYellowCount() {
	return YellowCount;
}

public void setYellowCount(String yellowCount) {
	YellowCount = yellowCount;
}

public String getYellowWeight() {
	return YellowWeight;
}

public void setYellowWeight(String yellowWeight) {
	YellowWeight = yellowWeight;
}

public String getCytotoxicCount() {
	return CytotoxicCount;
}

public void setCytotoxicCount(String cytotoxicCount) {
	CytotoxicCount = cytotoxicCount;
}

public String getCytotoxicWeight() {
	return CytotoxicWeight;
}

public void setCytotoxicWeight(String cytotoxicWeight) {
	CytotoxicWeight = cytotoxicWeight;
}

public String getWhitesCount() {
	return WhitesCount;
}

public void setWhitesCount(String whitesCount) {
	WhitesCount = whitesCount;
}

public String getWhitesWeight() {
	return WhitesWeight;
}

public void setWhitesWeight(String whitesWeight) {
	WhitesWeight = whitesWeight;
}

public String getTotalCount() {
	return TotalCount;
}

public void setTotalCount(String totalCount) {
	TotalCount = totalCount;
}

public String getTotalWeight() {
	return TotalWeight;
}

public void setTotalWeight(String totalWeight) {
	TotalWeight = totalWeight;
}

public String getCollectionLatitude() {
	return CollectionLatitude;
}

public void setCollectionLatitude(String collectionLatitude) {
	CollectionLatitude = collectionLatitude;
}

public String getCollectionLongitude() {
	return CollectionLongitude;
}

public void setCollectionLongitude(String collectionLongitude) {
	CollectionLongitude = collectionLongitude;
}

public String getServerDateTime() {
	return ServerDateTime;
}

public void setServerDateTime(String serverDateTime) {
	ServerDateTime = serverDateTime;
}

public String getAPIType() {
	return APIType;
}

public void setAPIType(String APIType) {
	this.APIType = APIType;
}



}
