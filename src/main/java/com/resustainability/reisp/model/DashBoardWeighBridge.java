package com.resustainability.reisp.model;

import java.util.List;

public class DashBoardWeighBridge {

	private String   UID,plant,cabsTransID,actualVisitDate,indicator_name,uniqueAPIIDs,
	route,customerTown,vehicleRegNo,aPIType,aPIID,visitDayTime,PTCDT1
		      ,TRNO,VEHICLENO,MATERIAL,count,min,dmNmae,days_diff,PARTY,all_wb,all_sites,visitDays,customerStatus,TRANSPORTER,curDAte,BILLDCNO,BILLWEIGHT,DATEIN,TIMEIN,FIRSTWEIGHT,USER1,DATEOUT,TIMEOUT,SECONDWEIGHT,USER2,SITEID,STATUS,FIRSTFRONTPOTO
		   ,FIRSTBACKPOTO,SECONDFRONTPOTO,SECONDBACKPOTO,NETWT,SW_SITEID,TRIPNO,SHIFTNO,TRANSFERWASTEIE ,TRANSFERWASTE,MANIFESTNUMBER ,MANIFESTWEIGHT,MEMBERSHIPCODE
		   ,INGATEPASSNO ,INMETERREADING,OUTGATEPASSNO,OUTMETERREADING ,TRANSFERID,TYPEOFWASTE,TOTALKMSTRAVELLED ,BILLABLEWEIGHT,TOTALTRANSPORTCHARGES ,BARCODENUM
		   ,Remarks,FIRSTWEIGHTACTUAL,TYPEOFVEHICLE ,DRIVERNAME,status ,WeightTransNo,VEHICLECAPACITY,TotalVisits,ActiveVistis,incativeVistis,customerId,id ,weight_TRNO,PTC_status ,PTCDT ,MSG,user_ip ,CONTAINERID,REMARKS,
		    	    	    	      company ,greenWB,no_of_wbR,no_of_wb2
		    	    	    	    	      ,sbu
		    	    	    	    	      ,project
		    	    	    	    	      ,project_name
		    	    	    	    	      ,location
		    	    	    	    	      ,project_status
		    	    	    	    	      ,no_of_wb
		    	    	    	    	      ,wb_site_id
		    	    	    	    	      ,db_name
		    	    	    	    	      ,table_name
		    	    	    	    	      ,api_status
		    	    	    	    	      ,api_consumed_by
		    	    	    	    	      ,developed_by,dailyCount,to_date,from_date 
		    	    	    	    	     ,CustomerSAPCodeCount
		    	    	    	    	      ,CustomerDistrict
		    	    	    	    	      ,CustomerTown
		    	    	    	    	      ,VehicleRegNo
		    	    	    	    	      ,CustomerName
		    	    	    	    	      ,CustomerCABSCode
		    	    	    	    	      ,CustomerSAPCode
		    	    	    	    	      ,TypeofEstablishment
		    	    	    	    	      ,ManifestNo
		    	    	    	    	      ,ActualVisitDate
		    	    	    	    	      ,ActualVisitMonth
		    	    	    	    	      ,ActualVisitYear
		    	    	    	    	      ,VisitDayTime
		    	    	    	    	      ,ServiceFrequency
		    	    	    	    	      ,VisitDays
		    	    	    	    	      ,BlueCount
		    	    	    	    	      ,BlueWeight
		    	    	    	    	      ,RedCount
		    	    	    	    	      ,RedWeight
		    	    	    	    	      ,YellowCount
		    	    	    	    	      ,YellowWeight
		    	    	    	    	      ,CytotoxicCount
		    	    	    	    	      ,CytotoxicWeight
		    	    	    	    	      ,WhitesCount
		    	    	    	    	      ,WhitesWeight
		    	    	    	    	      ,TotalCount
		    	    	    	    	      ,TotalWeight
		    	    	    	    	      ,CollectionLatitude
		    	    	    	    	      ,CollectionLongitude
		    	    	    	    	      ,ServerDateTime
		    	    	    	    	      ,APIType
		    	    	    	    	      ,CabsTransID
		    	    	    	    	      ,APIID
		    	    	    	    	      ,CustomerStatus,ActualVisitMonthR,profit_center
		    	    	    	    	      ,profit_center_name,
		    	    	    	    	      company_code,CustomerCode,plant_name,no_of_visits,visitsPerMonth,last_modified;
	
	List<DashBoardWeighBridge> transactionsList;
	

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

	public String getUniqueAPIIDs() {
		return uniqueAPIIDs;
	}

	public void setUniqueAPIIDs(String uniqueAPIIDs) {
		this.uniqueAPIIDs = uniqueAPIIDs;
	}

	public String getPTCDT1() {
		return PTCDT1;
	}

	public void setPTCDT1(String pTCDT1) {
		PTCDT1 = pTCDT1;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getCustomerCode() {
		return CustomerCode;
	}

	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}

	public String getPlant_name() {
		return plant_name;
	}

	public void setPlant_name(String plant_name) {
		this.plant_name = plant_name;
	}

	public String getNo_of_visits() {
		return no_of_visits;
	}

	public void setNo_of_visits(String no_of_visits) {
		this.no_of_visits = no_of_visits;
	}

	public String getVisitsPerMonth() {
		return visitsPerMonth;
	}

	public void setVisitsPerMonth(String visitsPerMonth) {
		this.visitsPerMonth = visitsPerMonth;
	}

	public String getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}

	public String getProfit_center() {
		return profit_center;
	}

	public void setProfit_center(String profit_center) {
		this.profit_center = profit_center;
	}

	public String getProfit_center_name() {
		return profit_center_name;
	}

	public void setProfit_center_name(String profit_center_name) {
		this.profit_center_name = profit_center_name;
	}

	public String getCustomerSAPCodeCount() {
		return CustomerSAPCodeCount;
	}

	public void setCustomerSAPCodeCount(String customerSAPCodeCount) {
		CustomerSAPCodeCount = customerSAPCodeCount;
	}

	public String getActualVisitMonthR() {
		return ActualVisitMonthR;
	}

	public void setActualVisitMonthR(String actualVisitMonthR) {
		ActualVisitMonthR = actualVisitMonthR;
	}

	public String getCustomerDistrict() {
		return CustomerDistrict;
	}

	public void setCustomerDistrict(String customerDistrict) {
		CustomerDistrict = customerDistrict;
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

	public void setAPIType(String aPIType) {
		APIType = aPIType;
	}

	public String getAPIID() {
		return APIID;
	}

	public void setAPIID(String aPIID) {
		APIID = aPIID;
	}

	public String getVisitDayTime() {
		return visitDayTime;
	}

	public void setVisitDayTime(String visitDayTime) {
		this.visitDayTime = visitDayTime;
	}

	public String getVisitDays() {
		return visitDays;
	}

	public void setVisitDays(String visitDays) {
		this.visitDays = visitDays;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public String getIndicator_name() {
		return indicator_name;
	}

	public void setIndicator_name(String indicator_name) {
		this.indicator_name = indicator_name;
	}

	public String getAll_wb() {
		return all_wb;
	}

	public void setAll_wb(String all_wb) {
		this.all_wb = all_wb;
	}

	public String getCabsTransID() {
		return cabsTransID;
	}

	public void setCabsTransID(String cabsTransID) {
		this.cabsTransID = cabsTransID;
	}

	public String getActualVisitDate() {
		return actualVisitDate;
	}

	public void setActualVisitDate(String actualVisitDate) {
		this.actualVisitDate = actualVisitDate;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getCustomerTown() {
		return customerTown;
	}

	public void setCustomerTown(String customerTown) {
		this.customerTown = customerTown;
	}

	public String getVehicleRegNo() {
		return vehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

	public String getaPIType() {
		return aPIType;
	}

	public void setaPIType(String aPIType) {
		this.aPIType = aPIType;
	}

	public String getaPIID() {
		return aPIID;
	}

	public void setaPIID(String aPIID) {
		this.aPIID = aPIID;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getDmNmae() {
		return dmNmae;
	}

	public void setDmNmae(String dmNmae) {
		this.dmNmae = dmNmae;
	}

	public String getNo_of_wb2() {
		return no_of_wb2;
	}

	public void setNo_of_wb2(String no_of_wb2) {
		this.no_of_wb2 = no_of_wb2;
	}

	public String getNo_of_wbR() {
		return no_of_wbR;
	}

	public void setNo_of_wbR(String no_of_wbR) {
		this.no_of_wbR = no_of_wbR;
	}

	public String getGreenWB() {
		return greenWB;
	}

	public void setGreenWB(String greenWB) {
		this.greenWB = greenWB;
	}

	public String getAll_sites() {
		return all_sites;
	}

	public void setAll_sites(String all_sites) {
		this.all_sites = all_sites;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getCONTAINERID() {
		return CONTAINERID;
	}

	public void setCONTAINERID(String cONTAINERID) {
		CONTAINERID = cONTAINERID;
	}

	public String getWeightTransNo() {
		return WeightTransNo;
	}

	public void setWeightTransNo(String weightTransNo) {
		WeightTransNo = weightTransNo;
	}

	public String getDays_diff() {
		return days_diff;
	}

	public void setDays_diff(String days_diff) {
		this.days_diff = days_diff;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<DashBoardWeighBridge> getTransactionsList() {
		return transactionsList;
	}

	public void setTransactionsList(List<DashBoardWeighBridge> transactionsList) {
		this.transactionsList = transactionsList;
	}

	public String getDailyCount() {
		return dailyCount;
	}

	public void setDailyCount(String dailyCount) {
		this.dailyCount = dailyCount;
	}

	public String getCurDAte() {
		return curDAte;
	}

	public void setCurDAte(String curDAte) {
		this.curDAte = curDAte;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSbu() {
		return sbu;
	}

	public void setSbu(String sbu) {
		this.sbu = sbu;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProject_status() {
		return project_status;
	}

	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}

	public String getNo_of_wb() {
		return no_of_wb;
	}

	public void setNo_of_wb(String no_of_wb) {
		this.no_of_wb = no_of_wb;
	}

	public String getWb_site_id() {
		return wb_site_id;
	}

	public void setWb_site_id(String wb_site_id) {
		this.wb_site_id = wb_site_id;
	}

	public String getDb_name() {
		return db_name;
	}

	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getApi_status() {
		return api_status;
	}

	public void setApi_status(String api_status) {
		this.api_status = api_status;
	}

	public String getApi_consumed_by() {
		return api_consumed_by;
	}

	public void setApi_consumed_by(String api_consumed_by) {
		this.api_consumed_by = api_consumed_by;
	}

	public String getDeveloped_by() {
		return developed_by;
	}

	public void setDeveloped_by(String developed_by) {
		this.developed_by = developed_by;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getTRNO() {
		return TRNO;
	}

	public void setTRNO(String tRNO) {
		TRNO = tRNO;
	}

	public String getVEHICLENO() {
		return VEHICLENO;
	}

	public void setVEHICLENO(String vEHICLENO) {
		VEHICLENO = vEHICLENO;
	}

	public String getMATERIAL() {
		return MATERIAL;
	}

	public void setMATERIAL(String mATERIAL) {
		MATERIAL = mATERIAL;
	}

	public String getPARTY() {
		return PARTY;
	}

	public void setPARTY(String pARTY) {
		PARTY = pARTY;
	}

	public String getTRANSPORTER() {
		return TRANSPORTER;
	}

	public void setTRANSPORTER(String tRANSPORTER) {
		TRANSPORTER = tRANSPORTER;
	}

	public String getBILLDCNO() {
		return BILLDCNO;
	}

	public void setBILLDCNO(String bILLDCNO) {
		BILLDCNO = bILLDCNO;
	}

	public String getBILLWEIGHT() {
		return BILLWEIGHT;
	}

	public void setBILLWEIGHT(String bILLWEIGHT) {
		BILLWEIGHT = bILLWEIGHT;
	}

	public String getDATEIN() {
		return DATEIN;
	}

	public void setDATEIN(String dATEIN) {
		DATEIN = dATEIN;
	}

	public String getTIMEIN() {
		return TIMEIN;
	}

	public void setTIMEIN(String tIMEIN) {
		TIMEIN = tIMEIN;
	}

	public String getFIRSTWEIGHT() {
		return FIRSTWEIGHT;
	}

	public void setFIRSTWEIGHT(String fIRSTWEIGHT) {
		FIRSTWEIGHT = fIRSTWEIGHT;
	}

	public String getUSER1() {
		return USER1;
	}

	public void setUSER1(String uSER1) {
		USER1 = uSER1;
	}

	public String getDATEOUT() {
		return DATEOUT;
	}

	public void setDATEOUT(String dATEOUT) {
		DATEOUT = dATEOUT;
	}

	public String getTIMEOUT() {
		return TIMEOUT;
	}

	public void setTIMEOUT(String tIMEOUT) {
		TIMEOUT = tIMEOUT;
	}

	public String getSECONDWEIGHT() {
		return SECONDWEIGHT;
	}

	public void setSECONDWEIGHT(String sECONDWEIGHT) {
		SECONDWEIGHT = sECONDWEIGHT;
	}

	public String getUSER2() {
		return USER2;
	}

	public void setUSER2(String uSER2) {
		USER2 = uSER2;
	}

	public String getSITEID() {
		return SITEID;
	}

	public void setSITEID(String sITEID) {
		SITEID = sITEID;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getFIRSTFRONTPOTO() {
		return FIRSTFRONTPOTO;
	}

	public void setFIRSTFRONTPOTO(String fIRSTFRONTPOTO) {
		FIRSTFRONTPOTO = fIRSTFRONTPOTO;
	}

	public String getFIRSTBACKPOTO() {
		return FIRSTBACKPOTO;
	}

	public void setFIRSTBACKPOTO(String fIRSTBACKPOTO) {
		FIRSTBACKPOTO = fIRSTBACKPOTO;
	}

	public String getSECONDFRONTPOTO() {
		return SECONDFRONTPOTO;
	}

	public void setSECONDFRONTPOTO(String sECONDFRONTPOTO) {
		SECONDFRONTPOTO = sECONDFRONTPOTO;
	}

	public String getSECONDBACKPOTO() {
		return SECONDBACKPOTO;
	}

	public void setSECONDBACKPOTO(String sECONDBACKPOTO) {
		SECONDBACKPOTO = sECONDBACKPOTO;
	}

	public String getNETWT() {
		return NETWT;
	}

	public void setNETWT(String nETWT) {
		NETWT = nETWT;
	}

	public String getSW_SITEID() {
		return SW_SITEID;
	}

	public void setSW_SITEID(String sW_SITEID) {
		SW_SITEID = sW_SITEID;
	}

	public String getTRIPNO() {
		return TRIPNO;
	}

	public void setTRIPNO(String tRIPNO) {
		TRIPNO = tRIPNO;
	}

	public String getSHIFTNO() {
		return SHIFTNO;
	}

	public void setSHIFTNO(String sHIFTNO) {
		SHIFTNO = sHIFTNO;
	}

	public String getTRANSFERWASTEIE() {
		return TRANSFERWASTEIE;
	}

	public void setTRANSFERWASTEIE(String tRANSFERWASTEIE) {
		TRANSFERWASTEIE = tRANSFERWASTEIE;
	}

	public String getTRANSFERWASTE() {
		return TRANSFERWASTE;
	}

	public void setTRANSFERWASTE(String tRANSFERWASTE) {
		TRANSFERWASTE = tRANSFERWASTE;
	}

	public String getMANIFESTNUMBER() {
		return MANIFESTNUMBER;
	}

	public void setMANIFESTNUMBER(String mANIFESTNUMBER) {
		MANIFESTNUMBER = mANIFESTNUMBER;
	}

	public String getMANIFESTWEIGHT() {
		return MANIFESTWEIGHT;
	}

	public void setMANIFESTWEIGHT(String mANIFESTWEIGHT) {
		MANIFESTWEIGHT = mANIFESTWEIGHT;
	}

	public String getMEMBERSHIPCODE() {
		return MEMBERSHIPCODE;
	}

	public void setMEMBERSHIPCODE(String mEMBERSHIPCODE) {
		MEMBERSHIPCODE = mEMBERSHIPCODE;
	}

	public String getINGATEPASSNO() {
		return INGATEPASSNO;
	}

	public void setINGATEPASSNO(String iNGATEPASSNO) {
		INGATEPASSNO = iNGATEPASSNO;
	}

	public String getINMETERREADING() {
		return INMETERREADING;
	}

	public void setINMETERREADING(String iNMETERREADING) {
		INMETERREADING = iNMETERREADING;
	}

	public String getOUTGATEPASSNO() {
		return OUTGATEPASSNO;
	}

	public void setOUTGATEPASSNO(String oUTGATEPASSNO) {
		OUTGATEPASSNO = oUTGATEPASSNO;
	}

	public String getOUTMETERREADING() {
		return OUTMETERREADING;
	}

	public void setOUTMETERREADING(String oUTMETERREADING) {
		OUTMETERREADING = oUTMETERREADING;
	}

	public String getTRANSFERID() {
		return TRANSFERID;
	}

	public void setTRANSFERID(String tRANSFERID) {
		TRANSFERID = tRANSFERID;
	}

	public String getTYPEOFWASTE() {
		return TYPEOFWASTE;
	}

	public void setTYPEOFWASTE(String tYPEOFWASTE) {
		TYPEOFWASTE = tYPEOFWASTE;
	}

	public String getTOTALKMSTRAVELLED() {
		return TOTALKMSTRAVELLED;
	}

	public void setTOTALKMSTRAVELLED(String tOTALKMSTRAVELLED) {
		TOTALKMSTRAVELLED = tOTALKMSTRAVELLED;
	}

	public String getBILLABLEWEIGHT() {
		return BILLABLEWEIGHT;
	}

	public void setBILLABLEWEIGHT(String bILLABLEWEIGHT) {
		BILLABLEWEIGHT = bILLABLEWEIGHT;
	}

	public String getTOTALTRANSPORTCHARGES() {
		return TOTALTRANSPORTCHARGES;
	}

	public void setTOTALTRANSPORTCHARGES(String tOTALTRANSPORTCHARGES) {
		TOTALTRANSPORTCHARGES = tOTALTRANSPORTCHARGES;
	}

	public String getBARCODENUM() {
		return BARCODENUM;
	}

	public void setBARCODENUM(String bARCODENUM) {
		BARCODENUM = bARCODENUM;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getFIRSTWEIGHTACTUAL() {
		return FIRSTWEIGHTACTUAL;
	}

	public void setFIRSTWEIGHTACTUAL(String fIRSTWEIGHTACTUAL) {
		FIRSTWEIGHTACTUAL = fIRSTWEIGHTACTUAL;
	}

	public String getTYPEOFVEHICLE() {
		return TYPEOFVEHICLE;
	}

	public void setTYPEOFVEHICLE(String tYPEOFVEHICLE) {
		TYPEOFVEHICLE = tYPEOFVEHICLE;
	}

	public String getDRIVERNAME() {
		return DRIVERNAME;
	}

	public void setDRIVERNAME(String dRIVERNAME) {
		DRIVERNAME = dRIVERNAME;
	}

	public String getVEHICLECAPACITY() {
		return VEHICLECAPACITY;
	}

	public void setVEHICLECAPACITY(String vEHICLECAPACITY) {
		VEHICLECAPACITY = vEHICLECAPACITY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWeight_TRNO() {
		return weight_TRNO;
	}

	public void setWeight_TRNO(String weight_TRNO) {
		this.weight_TRNO = weight_TRNO;
	}

	public String getPTC_status() {
		return PTC_status;
	}

	public void setPTC_status(String pTC_status) {
		PTC_status = pTC_status;
	}

	public String getPTCDT() {
		return PTCDT;
	}

	public void setPTCDT(String pTCDT) {
		PTCDT = pTCDT;
	}

	public String getMSG() {
		return MSG;
	}

	public void setMSG(String mSG) {
		MSG = mSG;
	}

	public String getUser_ip() {
		return user_ip;
	}

	public void setUser_ip(String user_ip) {
		this.user_ip = user_ip;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	
	
	
	
	
} 
