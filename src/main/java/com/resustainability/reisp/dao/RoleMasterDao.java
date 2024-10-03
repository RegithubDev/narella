package com.resustainability.reisp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

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

import com.resustainability.reisp.model.RoleMaster;

@Repository
public class RoleMasterDao {


	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	DataSourceTransactionManager transactionManager;

	public List<RoleMaster> getRoleMasterList(RoleMaster obj) throws Exception {
		List<RoleMaster> objsList = null;
		try {
			int arrSize = 0;
			String qry =" select id,incident_report,incident_code,incident_type from [role_master] c "
					+ " where c.incident_type is not null and c.incident_type <> '' ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIncident_type())) {
				qry = qry + " and incident_type = ? ";
				arrSize++;
			}
			qry = qry + " ORDER BY incident_type ASC ";
			Object[] pValues = new Object[arrSize];
			int i = 0;

			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIncident_type())) {
				pValues[i++] = obj.getIncident_type();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<RoleMaster>(RoleMaster.class));
		
		}catch(Exception e){ 
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<RoleMaster> getRoleMasterFilterList(RoleMaster obj) throws Exception {
		List<RoleMaster> objsList = new ArrayList<RoleMaster>();
		try {
			String qry = "SELECT  incident_type,incident_code "
					+ " FROM [role_master] where incident_type is not null and incident_type <> ''  "; 
			int arrSize = 0;
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIncident_type())) {
				qry = qry + " and incident_type = ? ";
				arrSize++;
			}
			qry = qry + " group by incident_type,incident_code order by incident_type asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
		
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIncident_type())) {
				pValues[i++] = obj.getIncident_type();
			}	
			objsList = jdbcTemplate.query( qry, pValues, new BeanPropertyRowMapper<RoleMaster>(RoleMaster.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<RoleMaster> getIncidentTypeFilterList(RoleMaster obj) throws Exception {
		List<RoleMaster> objsList = new ArrayList<RoleMaster>();
		try {
			String qry = "SELECT  incident_type "
					+ " FROM [role_master] where incident_type is not null and incident_type <> ''  "; 
			int arrSize = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIncident_type())) {
				qry = qry + "and incident_type = ? ";
				arrSize++;
			}
			qry = qry + " group by  incident_type order by incident_type asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getIncident_type())) {
				pValues[i++] = obj.getIncident_type();
			}	
			
			objsList = jdbcTemplate.query( qry, pValues, new BeanPropertyRowMapper<RoleMaster>(RoleMaster.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public boolean addRoleMaster(RoleMaster obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [role_master] (incident_report,incident_code,incident_type) VALUES (:incident_report,:incident_code,:incident_type)";
			BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
		    count = namedParamJdbcTemplate.update(insertQry, paramSource);
			if(count > 0) {
				flag = true;
			}
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
			e.printStackTrace();
			throw new Exception(e);
		}
		return flag;
	}

	public boolean updateRoleMaster(RoleMaster obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String updateQry = "UPDATE [role_master] set incident_code= :incident_code,incident_report= :incident_report,incident_type=:incident_type  "
					+ " where id= :id ";
			BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);		 
		    count = namedParamJdbcTemplate.update(updateQry, paramSource);
			if(count > 0) {
				flag = true;
			}
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
			e.printStackTrace();
			throw new Exception(e);
		}
		return flag;
	}
	
	
}
