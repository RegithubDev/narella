package com.resustainability.reisp.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.resustainability.reisp.common.DateParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.StringUtils;

import com.resustainability.reisp.model.BMW;
import com.resustainability.reisp.model.BMWSAP;
import com.resustainability.reisp.model.BMWSAPOUTPUT;
import com.resustainability.reisp.model.BrainBox;
import com.resustainability.reisp.model.DashBoardWeighBridge;
import com.resustainability.reisp.model.SBU;

@Repository
public class BMWDao {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate ;
	
	@Autowired
	DataSourceTransactionManager transactionManager;

	public List<BrainBox> getHydCNDList(SBU obj1, BrainBox obj, HttpServletResponse response) throws Exception{
		List<BrainBox> menuList = null;
		boolean flag = false;
		int count = 0;
		try{  
			String user_id = "recgwbbmw";
			String password = "X1298extvbddyzA";
			//String Myip = Inet4Address.getLocalHost().getHostAddress();
			String Myip = "10.100.3.11";
			String time = " 12:00:00AM";
			String IP [] = {"10.2.24.18","10.2.24.81","10.2.28.164","196.12.46.130","117.200.48.237","112.133.222.124","61.0.227.124","14.99.138.146","34.93.149.251",Myip}; 
			if(IP.length > 0) {
				for(int i=0; i< IP.length; i++) {
					if(IP[i].contentEquals(Myip)  ) {
						if(user_id.contentEquals(obj1.getUser_id()) && password.contentEquals(obj1.getPassword())) {
							flag = true;
						}
					}
				}
				System.out.println(flag);
			}
			if(flag) {
			String qry = "SELECT SITEID as TransactionNo1,Trno as TransactionNo2,TRANSPORTER as Transporter,PARTY as Transferstation, Vehicleno as VehicleNo, Material as Zone, "
					+ "Party as Location, Transporter as Transporter, LEFT(CONVERT(varchar, Datein, 24),9) AS DateIN, "
					+ "RIGHT(CONVERT(varchar, Timein, 24),11) AS TimeIN, LEFT(CONVERT(varchar, Dateout, 24),9) AS DateOUT, "
					+ "RIGHT(CONVERT(varchar, Timeout, 24),11) AS TimeOUT,Firstweight as GROSSWeight, SiteID, Secondweight as TareWeight,"
					+ "NetWT as NetWeight, typeofwaste AS TypeofMaterial FROM weight WITH (nolock) "
					+ "WHERE (Trno IS NOT NULL) AND (Vehicleno IS NOT NULL) AND (Datein IS NOT NULL)"
					+ "AND (Timein IS NOT NULL) AND (Firstweight IS NOT NULL) AND (Dateout IS NOT NULL) AND "
					+ "(Timeout IS NOT NULL) AND (Secondweight IS NOT NULL) AND (NetWT IS NOT NULL) and(SiteID is not null) AND SITEID IN"
					+ "('WB1','WB2','WB3')  and NetWT <> '' and NetWT is not null ";
					int arrSize = 0;
				    if(!StringUtils.isEmpty(obj1) && !StringUtils.isEmpty(obj1.getFrom_date())) {
				    	qry = qry + " AND CONVERT(varchar(10), DATEOUT, 105) = CONVERT(varchar(10), ?, 105) ";
						arrSize++;
					}
					qry = qry +"  ORDER BY TRNO desc "; 
					Object[] pValues = new Object[arrSize];
					int i = 0;
					if(!StringUtils.isEmpty(obj1) && !StringUtils.isEmpty(obj1.getFrom_date())) {
						pValues[i++] = obj1.getFrom_date()+time;;
					}
			menuList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<BrainBox>(BrainBox.class));
		}else {
			menuList = new ArrayList<BrainBox>(1);
		}
		}catch(Exception e){ 
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
		return menuList;
	}

	public Object getLogsOfResults(List<BrainBox> hydList, SBU obj1) throws SQLException {
		int count = 0;
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			if(hydList.size() > 0) {
				for(BrainBox obj : hydList) {
					obj.setGROSSWeight(obj1.getPTC_status());
					obj.setTareWeight(obj1.getMSG());
					obj.setDateOUT(obj1.getUser_ip());					
					String insertQry = "INSERT INTO [hyd_logs] (user_ip,weight_TRNO,VEHICLENO,PTC_status,PTCDT,MSG)"
							+ " values (:dateOUT,:TransactionNo2,:VehicleNo,:GROSSWeight,GETDATE(),:TareWeight)  ";
					
					BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
				    count = namedParamJdbcTemplate.update(insertQry, paramSource);
				}
			}else {
				BrainBox obj = new BrainBox();
				obj.setGROSSWeight(null);
				obj.setTareWeight(obj1.getMSG());
				obj.setDateOUT(obj1.getUser_ip());		
				String insertQry = "INSERT INTO [hyd_logs] (user_ip,weight_TRNO,VEHICLENO,PTC_status,PTCDT,MSG) values (:dateOUT,:TransactionNo2,:VehicleNo,:GROSSWeight,GETDATE(),:TareWeight)  "
				+ " ";
				
				BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
			    count = namedParamJdbcTemplate.update(insertQry, paramSource);
			}
		
			
		}catch(Exception e){ 
			e.printStackTrace();
			throw new SQLException(e.getMessage());
			
		}
		return count;
	}

	public int getLogInfo(SBU obj1, BrainBox obj, List<BrainBox> companiesList) throws SQLException {
		int count = 0;
		try{  
			if(!StringUtils.isEmpty(companiesList) && companiesList.size() > 0) {
				for (BrainBox obj11 : companiesList) {
					String checkingLogQry = "SELECT count(*) from [hyd_logs] where weight_TRNO= ? and VEHICLENO= ?";
					count = jdbcTemplate.queryForObject(checkingLogQry, new Object[] {obj11.getTransactionNo2(),obj11.getVehicleNo()}, Integer.class);
				}
			}
		}catch(Exception e){ 
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
		return count;
	}

	public boolean pushBMWList(BMW obj1, BrainBox objs, List<BMW> pushedRecords, HttpServletResponse response) throws SQLException {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			if(!StringUtils.isEmpty(obj1)) {
				BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj1);
					obj1.setCabsTransID(obj1.getCabsTransID());
					obj1.setCustomerDistrict(obj1.getDistrictName());
					obj1.setCollectionLatitude(obj1.getLat());
					obj1.setCollectionLongitude(obj1.getLon());	

					obj1.setYellowWeight(obj1.getYellow_Weight());
					obj1.setServiceFrequency(obj1.getServiceFrequency());
					obj1.setCytotoxicCount(obj1.getCytotoxic_Count());	

					obj1.setTotalWeight(obj1.getTotal_Weight());
					obj1.setRoute(obj1.getRoute());
					obj1.setCustomerCABSCode(obj1.getPartner_Id());	

					obj1.setWhitesWeight(obj1.getWhites_Weight()); 
					obj1.setBlueCount(obj1.getBlue_Count());
					obj1.setPlant(obj1.getPlantLocation());	

					obj1.setVehicleRegNo(obj1.getVehicleRegNo());
					obj1.setRedWeight(obj1.getRed_Weight());
					obj1.setBlueWeight(obj1.getBlue_Weight());	

					obj1.setCustomerTown(obj1.getTownName());
					obj1.setCustomerSAPCode(obj1.getSap_Id());
					obj1.setCustomerName(obj1.getPartner_Name());	

					obj1.setTotalCount(obj1.getTotal_Count());
					obj1.setActualVisitMonth(obj1.getMonth());
					obj1.setYellowCount(obj1.getYellow_Count());	

					obj1.setCytotoxicWeight(obj1.getCytotoxic_Weight());
					obj1.setRedCount(obj1.getRed_Count());
					obj1.setTypeofEstablishment(obj1.getEstablishment_Type());	

					obj1.setActualVisitYear(obj1.getYear());
					obj1.setVisitDayTime(DateParser.parseDateTime(obj1.getDate()));
					obj1.setManifestNo(obj1.getManifestNo());	

					obj1.setCompany(obj1.getPlantName());
					obj1.setWhitesCount(obj1.getWhites_Count());
					obj1.setAPIType(obj1.getAPIType());	
					obj1.setActualVisitDate(obj1.getVisitDate());
					
					String insertQry = "INSERT INTO [bmw_detailed] " 
							+ "(company,plant,route,CustomerDistrict,CustomerTown,VehicleRegNo,CustomerName,CustomerCABSCode,"
							+ "CustomerSAPCode,TypeofEstablishment,ManifestNo,ActualVisitDate,ActualVisitMonth,ActualVisitYear"
							+ ",VisitDayTime,ServiceFrequency,BlueCount,BlueWeight,RedCount,RedWeight,YellowCount,YellowWeight,"
							+ "CytotoxicCount,CytotoxicWeight,WhitesCount,WhitesWeight,TotalCount,TotalWeight,CollectionLatitude,"
							+ "CollectionLongitude,ServerDateTime,APIType,CabsTransID,APIID,CustomerStatus)"
							+ " VALUES"
							+ " (:company,:plant,:route,:CustomerDistrict,:CustomerTown,:VehicleRegNo,:CustomerName,"
							+ ":CustomerCABSCode,:CustomerSAPCode,:TypeofEstablishment,:ManifestNo,:ActualVisitDate,"
							+ ":ActualVisitMonth,:ActualVisitYear,:VisitDayTime,:ServiceFrequency,:BlueCount,:BlueWeight,"
							+ ":RedCount,:RedWeight,:YellowCount,:YellowWeight,:CytotoxicCount,:CytotoxicWeight,:WhitesCount,"
							+ ":WhitesWeight,:TotalCount,:TotalWeight,:CollectionLatitude,:CollectionLongitude,getdate(),"
							+ ":APIType,:CabsTransID,:APIID,:CustomerStatus)";
					
					paramSource = new BeanPropertySqlParameterSource(obj1);	 
				    count = namedParamJdbcTemplate.update(insertQry, paramSource);
				    if(count > 0) {
				    	flag = true;
				    }
				    if("start".equalsIgnoreCase(obj1.getLog())) {
				    	flag = true;
				    	obj1.setMsg("Success");
				    	obj1.setPTC_status("Y");
				    	String logQry = "INSERT INTO [bmw_logs] "
								+ "(APIID,	PTC_status,	PTCDT,	MSG, Logs )"
								+ " VALUES"
								+ " (	:APIID,	:PTC_status,	getdate(),	:Msg, :Log)";
						
						paramSource = new BeanPropertySqlParameterSource(obj1);		 
					    count = namedParamJdbcTemplate.update(logQry, paramSource);
				    }else if("end".equalsIgnoreCase(obj1.getLog())) {
				    	obj1.setMsg("Success");
				    	obj1.setPTC_status("Y");
				    	String logQry = "INSERT INTO [bmw_logs] "
				    			+ "(	APIID,	PTC_status,	PTCDT,	MSG, Logs)"
								+ " VALUES"
								+ " (	:APIID,	:PTC_status,	getdate(),	:Msg, :Log)";
						
						paramSource = new BeanPropertySqlParameterSource(obj1);		 
					    count = namedParamJdbcTemplate.update(logQry, paramSource);
				    }
				}
			
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
			e.printStackTrace();
			throw new SQLException(e.getMessage());
			
		}
		return flag;
	}
	public int getCountOfRecords(BMW obj1) throws SQLException {
		int count = 0;
		try{  
			
					String checkingLogQry = "SELECT count(*) from [bmw_detailed] where CabsTransID = ? ";
					count = jdbcTemplate.queryForObject(checkingLogQry, new Object[] {obj1.getCabsTransID()}, Integer.class);
		}catch(Exception e){ 
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
		return count;
	}

	public boolean uploadBMWList(BMW bmw, BrainBox obj, List<BMW> pushedRecords, HttpServletResponse response) throws SQLException {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		try {
			
			if(!StringUtils.isEmpty(bmw)) {
				BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(bmw);
					 
				String checkingLogQry = "SELECT count(*) from [customers_master] where customer = ? ";
				count = jdbcTemplate.queryForObject(checkingLogQry, new Object[] {bmw.getCustomer()}, Integer.class);
			
				if(count == 0) {
					 String insertQry = "INSERT into  customers_master "
							+ "(customer,serverTime,Registrationnumber,SA_STATUSBLOCK,SPCB_CD,NO_BEDS_INV,SD_Plantcode,SD_Plantname,NAME1,NAME_CO,STREET,CITY,POSTCODE,STATECODE,COUNTRY,LANGU,MOBILENUMBER,MAILID,"
							+ "CUSTOMERGROUP,AUFSD,ACTSERVICECERTFROMDATE,ACTSERVICECERTTODATE,SERVICESTARTDATE,"
							+ "REGISTRATIONDATE,UPPERSLABINKG,RATEREVISIONPERIOD,RATEREVISION,LATLONGONPICKUPPOINT,CUSTOMERAGREEMENTFROM,CUSTOMERAGREEMENTTO,"
							+ "CUS_GRP,CUSTOMERFACILITY,CUSTOMERFACILITYTYPE,"
							+ "CUSTOMERFREQUENCY,NOOFPICKUPLOCATION,ACTIVE_INACTIVE,NOOFDAYSSERVEDINMONTH,CHNGIND,created_date,BATCHID,EXECUTIVE_EMAIL,EXECUTIVE_CONTACT)"
							+ " VALUES"
							+ " (:customer,getdate(),:Registrationnumber,:SA_STATUSBLOCK,:SPCB_CD,:NO_BEDS_INV,:SD_Plantcode,:SD_Plantname,:NAME1,:NAME_CO,:STREET,:CITY,:POSTCODE,:STATECODE,:COUNTRY,:LANGU,:MOBILENUMBER,:MAILID,:CUSTOMERGROUP,:AUFSD,:ACTSERVICECERTFROMDATE,:ACTSERVICECERTTODATE,:SERVICESTARTDATE,"
							+ ":REGISTRATIONDATE,:UPPERSLABINKG,:RATEREVISIONPERIOD,:RATEREVISION,:LATLONGONPICKUPPOINT,:CUSTOMERAGREEMENTFROM,:CUSTOMERAGREEMENTTO,:CUS_GRP,:CUSTOMERFACILITY,:CUSTOMERFACILITYTYPE,"
							+ ":CUSTOMERFREQUENCY,:NOOFPICKUPLOCATION,:ACTIVE_INACTIVE,:NOOFDAYSSERVEDINMONTH,:CHNGIND,getdate(),:BATCHID,:EXECUTIVE_EMAIL,:EXECUTIVE_CONTACT); ";
					 
					 	paramSource = new BeanPropertySqlParameterSource(bmw);	 
					    namedParamJdbcTemplate.update(insertQry, paramSource);
					    
				}else if(count > 0){
					String updateQry =" UPDATE customers_master SET Registrationnumber = :Registrationnumber, SA_STATUSBLOCK = :SA_STATUSBLOCK, SPCB_CD = :SPCB_CD, NO_BEDS_INV = :NO_BEDS_INV, "
								+ "	SD_Plantcode = :SD_Plantcode "
								+ "	, SD_Plantname = :SD_Plantname, NAME1 = :NAME1, NAME_CO = :NAME_CO, "
								+ "	STREET = :STREET, CITY = :CITY "
								+ "	, POSTCODE = :POSTCODE, STATECODE = :STATECODE, COUNTRY = :COUNTRY, LANGU = :LANGU, "
								+ "	MOBILENUMBER = :MOBILENUMBER "
								+ "	, MAILID = :MAILID, CUSTOMERGROUP = :CUSTOMERGROUP, AUFSD = :AUFSD,  "
								+ "	ACTSERVICECERTFROMDATE = :ACTSERVICECERTFROMDATE, ACTSERVICECERTTODATE = :ACTSERVICECERTTODATE, SERVICESTARTDATE = :SERVICESTARTDATE,  "
								+ "	REGISTRATIONDATE = :REGISTRATIONDATE,UPPERSLABINKG = :UPPERSLABINKG,RATEREVISIONPERIOD = :RATEREVISIONPERIOD ,"
								+ "	RATEREVISION = :RATEREVISION,LATLONGONPICKUPPOINT = :LATLONGONPICKUPPOINT,  "
								+ "	CUSTOMERAGREEMENTFROM = :CUSTOMERAGREEMENTFROM,CUSTOMERAGREEMENTTO = :CUSTOMERAGREEMENTTO,  "
								+ "	CUS_GRP = :CUS_GRP,CUSTOMERFACILITY = :CUSTOMERFACILITY , "
								+ "	CUSTOMERFACILITYTYPE = :CUSTOMERFACILITYTYPE,ACTIVE_INACTIVE = :ACTIVE_INACTIVE,  "
								+ "	CUSTOMERFREQUENCY = :CUSTOMERFREQUENCY,NOOFPICKUPLOCATION = :NOOFPICKUPLOCATION , "
								+ "	NOOFDAYSSERVEDINMONTH = :NOOFDAYSSERVEDINMONTH,  "
								+ "	CHNGIND = :CHNGIND,BATCHID = :BATCHID,  "
								+ "	EXECUTIVE_EMAIL = :EXECUTIVE_EMAIL,updated_date = getdate(),  "
								+ "	EXECUTIVE_CONTACT = :EXECUTIVE_CONTACT where customer= :customer ";
					paramSource = new BeanPropertySqlParameterSource(bmw);	 
				    namedParamJdbcTemplate.update(updateQry, paramSource);
				}
					 
				  if(count > 0) {
					  flag = true;
					    bmw.setMsg("Data Uploded Successfully");
					    bmw.setStatus("Success");
					    String insertLogQry = "INSERT into  customerMaster_logs "
								+ "(BATCHID,log_recordedTime,status,MSG)"
								+ " VALUES"
								+ " (:BATCHID,getdate(),:status,:msg); ";
						 
						 	paramSource = new BeanPropertySqlParameterSource(bmw);	 
						    namedParamJdbcTemplate.update(insertLogQry, paramSource);
				  }
				}
			
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
			e.printStackTrace();
			    bmw.setMsg(e.getMessage());
			    bmw.setStatus("Error");
			    String insertLogQry = "INSERT into  customerMaster_logs "
						+ "(BATCHID,log_recordedTime,status,MSG)"
						+ " VALUES"
						+ " (:BATCHID,getdate(),:status,:msg); ";
				 
			    BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(bmw);	 
			    namedParamJdbcTemplate.update(insertLogQry, paramSource);
			throw new SQLException(e.getMessage());
			
		}
		return flag;
	}

	public String uploadData(String url, BMW bmw) {
		 String json = null;
		 boolean call_service = true;
		 boolean log = true;
		 int logInfo = 0;
		 HashMap<String, String> data = new HashMap<String, String>();
		 ObjectMapper objectMapper = new ObjectMapper();
		try {
			boolean flag = false; 
			if(!url.equals(null) && !"".equals(url) && url.contains(",")) {
				String[] url_split1 = url.split("\\$");
				String url_split2 = url_split1[1];
				String[] url_split3 = url_split2.split("\\,");
				int  i = 0;
					for(int j = 0; j<= (url_split3.length - 1); j++ ) {
						String[] url_split4 = url_split3[i].split("\\&");
						if( i == 0) {
							bmw.setSID(url_split4[0]);
							bmw.setMID(url_split4[1]);
							bmw.setRFID(url_split4[2]);
							 String inputDate = url_split4[3].replace("//*", ""); // Example input date in DDMMYYYYHHMMSS format

						        SimpleDateFormat inputFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
						        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						        String outputDate = "";
						        try {
						            java.util.Date date = inputFormat.parse(inputDate);
						            outputDate =  outputFormat.format(date);
						        } catch (ParseException e) {
						            e.printStackTrace();
						        }
							bmw.setDOT(outputDate);
						}else {
							bmw.setRFID(url_split4[0]);
							 String inputDate = url_split4[1].replace("//*", ""); // Example input date in DDMMYYYYHHMMSS format

						        SimpleDateFormat inputFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
						        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						        String outputDate = "";
						        try {
						            java.util.Date date = inputFormat.parse(inputDate);
						            outputDate =  outputFormat.format(date);
						        } catch (ParseException e) {
						            e.printStackTrace();
						        }
							bmw.setDOT(outputDate);
						}
				
						NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
						BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(bmw);
						String insertQry = "INSERT INTO [sillicon_ws_data] " 
								+ "(SID,	MID,	RFID,	DOT,	serverTime)"
								+ " VALUES"
								+ " (:SID,	:MID,	:RFID,	:DOT,	getdate())";
						
						paramSource = new BeanPropertySqlParameterSource(bmw);	 
					   int count = namedParamJdbcTemplate.update(insertQry, paramSource);
					  if(count > 0) {
						  flag = true;
					  }
					  i++;
					}
				
			}else {
				String[] url_split1 = url.split("\\$");
				String url_split2 = url_split1[1];
				String[] url_split4 = url_split2.split("\\&");
					bmw.setSID(url_split4[0]);
					bmw.setMID(url_split4[1]);
					bmw.setRFID(url_split4[2]);
					String inputDate = url_split4[3].replace("//*", ""); // Example input date in DDMMYYYYHHMMSS format

			        SimpleDateFormat inputFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
			        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			        String outputDate = "";
			        try {
			            java.util.Date date = inputFormat.parse(inputDate);
			            outputDate =  outputFormat.format(date);
			        } catch (ParseException e) {
			            e.printStackTrace();
			        }
					bmw.setDOT(outputDate);
					NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
					BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(bmw);
					String insertQry = "INSERT INTO [sillicon_ws_data] " 
							+ "(SID,	MID,	RFID,	DOT,	serverTime)"
							+ " VALUES"
							+ " (:SID,	:MID,	:RFID,	:DOT,	getdate())";
					
					paramSource = new BeanPropertySqlParameterSource(bmw);	 
				   int count = namedParamJdbcTemplate.update(insertQry, paramSource);
				  if(count > 0) {
					  flag = true;
				  }
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	
	public List<BMWSAPOUTPUT> getTransactionsSummeryList(BMWSAP obj, BMWSAP dB) {
		List<BMWSAPOUTPUT> objsList = new ArrayList<BMWSAPOUTPUT>();
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(dB);		 
			
			
			String ERQ2 = "  UPDATE ALL_BMW_Sites.dbo.bmw_detailed SET [plant] = LTRIM(RTRIM(REPLACE(REPLACE(REPLACE(REPLACE([plant], "
					+ "CHAR(10), CHAR(32)), CHAR(13), CHAR(32)), CHAR(160), CHAR(32)),CHAR(9),CHAR(32))))";
			paramSource = new BeanPropertySqlParameterSource(obj);	 
			namedParamJdbcTemplate.update(ERQ2, paramSource);
			
			String ERQ3 = "  UPDATE ALL_BMW_Sites.dbo.bmw_detailed SET [CustomerSAPCode] = LTRIM(RTRIM(REPLACE(REPLACE(REPLACE(REPLACE([CustomerSAPCode], "
					+ "CHAR(10), CHAR(32)), CHAR(13), CHAR(32)), CHAR(160), CHAR(32)),CHAR(9),CHAR(32))))";
			paramSource = new BeanPropertySqlParameterSource(obj);	 
			namedParamJdbcTemplate.update(ERQ3, paramSource);
			
			String ERQ = "  UPDATE [MasterDB].[dbo].[master_table] SET [project_code] = LTRIM(RTRIM(REPLACE(REPLACE(REPLACE(REPLACE([project_code], "
					+ "CHAR(10), CHAR(32)), CHAR(13), CHAR(32)), CHAR(160), CHAR(32)),CHAR(9),CHAR(32))))";
			paramSource = new BeanPropertySqlParameterSource(obj);	 
			namedParamJdbcTemplate.update(ERQ, paramSource);
			
			String ERQ1 = "  UPDATE [MasterDB].[dbo].[master_table] SET [project_name] = LTRIM(RTRIM(REPLACE(REPLACE(REPLACE(REPLACE([project_name], "
					+ "CHAR(10), CHAR(32)), CHAR(13), CHAR(32)), CHAR(160), CHAR(32)),CHAR(9),CHAR(32))))";
			paramSource = new BeanPropertySqlParameterSource(obj);	 
			namedParamJdbcTemplate.update(ERQ1, paramSource);
			
			
		    String qry = "  SELECT (select profit_center from [MasterDB].[dbo].[master_table] where company = MAX(d.company)) AS profit_center,		  "
		    		+ "		(select profit_center_name from [MasterDB].[dbo].[master_table] where company = MAX(d.company)) AS profit_center_name,  "
		    		+ "		(select project_code from [MasterDB].[dbo].[master_table] where company = MAX(d.company)) AS project_code,  "
		    		+ "		 MAX(d.plant) AS plant_name,max(CustomerCABSCode) as customerId, "
		    		+ "		  (select count(distinct([ManifestNo])) from ALL_BMW_Sites.dbo.bmw_detailed  "
		    		+ "where CustomerSAPCode = MAX(d.CustomerSAPCode) ";
		    		if(!StringUtils.isEmpty(dB) && !StringUtils.isEmpty(dB.getActualVisitMonth())) {
				    	qry = qry + " AND ActualVisitMonth = '"+dB.getActualVisitMonth()+"'";
					}
		    		qry = qry +  ") AS totalVisits,  "
		    		+ "				 SUM(TRY_CAST(TotalCount AS FLOAT )) as TotalCount,  "
		    		+ "				 SUM(TRY_CAST(TotalWeight AS FLOAT )) as TotalWeight,  "
		    		+ "				 MAX(d.company) AS company, "
		    		+ "				 (select company_code from [MasterDB].[dbo].[master_table] where company = MAX(d.company)) AS company_code,  "
		    		+ "(select count(distinct([ManifestNo])) from ALL_BMW_Sites.dbo.bmw_detailed  "
		    		+ "where CustomerSAPCode = MAX(d.CustomerSAPCode) and CustomerStatus = 'true'"
		    		;
		    		if(!StringUtils.isEmpty(dB) && !StringUtils.isEmpty(dB.getActualVisitMonth())) {
				    	qry = qry + " AND ActualVisitMonth = '"+dB.getActualVisitMonth()+"'";
					}
		    		qry = qry + ") AS ActiveVistis,  "
		    		+ "(select count(distinct([ManifestNo])) from ALL_BMW_Sites.dbo.bmw_detailed  "
		    		+ "where CustomerSAPCode = MAX(d.CustomerSAPCode) and CustomerStatus = 'false'"
		    		;
		    		if(!StringUtils.isEmpty(dB) && !StringUtils.isEmpty(dB.getActualVisitMonth())) {
				    	qry = qry + " AND ActualVisitMonth = '"+dB.getActualVisitMonth()+"'";
					}
		    		qry = qry + ") AS incativeVisits, "
		    		+ "				 MAX(d.plant) AS plant_name,				MAX(d.TypeofEstablishment) AS TypeofEstablishment,			  "
		    		+ "				 MAX(d.ServiceFrequency) AS ServiceFrequency,				MAX(d.ActualVisitMonth) AS ActualVisitMonth,	  "
		    		+ "				 MAX(d.CustomerStatus) AS CustomerStatus,CustomerSAPCode as customerID   "
		    		+ "				FROM ALL_BMW_Sites.dbo.bmw_detailed d   "
		    		+ "				left join [MasterDB].[dbo].[master_table] m on m.project_name = d.plant 		 "
		    		+ "				 where CustomerSAPCode is not null ";
			
		    if(!StringUtils.isEmpty(dB) && !StringUtils.isEmpty(dB.getProject_code())) {
		    	qry = qry + "and  m.project_code = '"+dB.getProject_code()+"'";
			}
		    if(!StringUtils.isEmpty(dB) && !StringUtils.isEmpty(dB.getCustomerSAPCode())) {
		    	qry = qry + " AND d.CustomerSAPCode = '"+dB.getCustomerSAPCode()+"'";
			}
		    if(!StringUtils.isEmpty(dB) && !StringUtils.isEmpty(dB.getActualVisitMonth())) {
		    	qry = qry + " AND d.ActualVisitMonth = '"+dB.getActualVisitMonth()+"'";
			}
			qry = qry +"  group by CustomerSAPCode,ActualVisitMonth "; 
			
			
			objsList = jdbcTemplate.query( qry, new BeanPropertyRowMapper<BMWSAPOUTPUT>(BMWSAPOUTPUT.class));
			if(objsList.size() > 0 ) {
				dB.setMSG("DATA Pulled");
				dB.setStatus("Success");
				String insertQry = "INSERT INTO [bmw_summery_logs] (project_code,CustomerCode,ActualVisitMonth,MSG,pull_datetime,status)"
						+ " values (:project_code,:CustomerSAPCode,:ActualVisitMonth,:MSG,GETDATE(),:status)  ";
				
				paramSource = new BeanPropertySqlParameterSource(dB);		 
			    int count = namedParamJdbcTemplate.update(insertQry, paramSource);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objsList;
	}
}
