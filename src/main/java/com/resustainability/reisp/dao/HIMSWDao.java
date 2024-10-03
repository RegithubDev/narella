package com.resustainability.reisp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.resustainability.reisp.model.BrainBox;
import com.resustainability.reisp.model.SBU;

@Repository
public class HIMSWDao {
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
			String user_id = "rechwbhimsw";
			String password = "Y1298extvbddyzB";
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
					+ "Party as Location, Transporter as Transporter, LEFT(CONVERT(varchar, Datein, 24),11) AS DateIN, "
					+ "RIGHT(CONVERT(varchar, Timein, 24),11) AS TimeIN, LEFT(CONVERT(varchar, Dateout, 24),11) AS DateOUT,InDateTime as Date_And_TimeIn,OutDateTime as Date_And_TimeOut, "
					+ "RIGHT(CONVERT(varchar, Timeout, 24),11) AS TimeOUT,Firstweight as GROSSWeight, SiteID, Secondweight as TareWeight,CONTAINERID,"
					+ "NetWT as NetWeight, typeofwaste AS TypeofMaterial FROM weight WITH (nolock) "
					+ "WHERE (Trno IS NOT NULL) AND (Vehicleno IS NOT NULL) AND (Datein IS NOT NULL)"
					+ "AND (Timein IS NOT NULL) AND (Firstweight IS NOT NULL) AND (Dateout IS NOT NULL) AND "
					+ "(Timeout IS NOT NULL) AND (Secondweight IS NOT NULL) AND (NetWT IS NOT NULL) and(SiteID is not null) AND SITEID IN"
					+ "('WB1','WB2','WB3')  and NetWT <> '' and NetWT is not null ";
					int arrSize = 0;
				    if(!StringUtils.isEmpty(obj1) && !StringUtils.isEmpty(obj1.getFrom_date())) {
				    	qry = qry + " AND CONVERT(varchar(10), [OutDateTime], 105) = CONVERT(varchar(10), ?, 105) ";
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
}
