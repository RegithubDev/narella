package com.resustainability.reisp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

import com.resustainability.reisp.common.DBConnectionHandler;
import com.resustainability.reisp.common.EncryptDecrypt;
import com.resustainability.reisp.model.Company;
import com.resustainability.reisp.model.Department;
import com.resustainability.reisp.model.User;

@Repository
public class CompanyDao {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate ;
	
	@Autowired
	DataSourceTransactionManager transactionManager;
	
	public List<Company> getCompaniesList(Company obj) throws Exception {
		List<Company> objsList = null;
		try {
			int arrSize = 0;
			String qry =" select ";
					qry = qry +"(select count( company_code) from company where company_code is not null  ";
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
						qry = qry + " and status = ? ";
						arrSize++;
					}
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
						qry = qry + " and company_code = ? ";
						arrSize++;
					}
					qry = qry +  " ) as all_companies ,";
					qry = qry +	"(select count( company_code) from company where company_code is not null and status = 'Active' ";
									if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
										qry = qry + "  and status = ? ";
										arrSize++;
									}
									if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
										qry = qry + " and company_code = ? ";
										arrSize++;
									}
									qry = qry + " ) as active_companies,"
									+ "(select count( company_code) from company where company_code is not null   and status <> 'Active' ";
									if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
										qry = qry + " and status = ? ";
										arrSize++;
									}
									if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
										qry = qry + " and company_code = ? ";
										arrSize++;
									}
									qry = qry + " ) as inActive_companies,"
					+ "c.id	,company_code,	company_name,	status,	FORMAT (c.created_date, 'dd-MMM-yy') as created_date,up.user_name as 	"
					+ " created_by,FORMAT	(c.modified_date, 'dd-MMM-yy') as modified_date,up1.user_name as  modified_by from [company] c "
					+ " left join [user_profile] up on c.created_by = up.user_id "
					+ " left join [user_profile] up1 on c.modified_by = up1.user_id "
					+ " where c.company_code is not null and c.company_code <> '' ";
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				qry = qry + " and c.company_code = ?";
				arrSize++;
			}	
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				qry = qry + " and status = ? ";
				arrSize++;
			}
			qry = qry + " ORDER BY status ASC ";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				pValues[i++] = obj.getStatus();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				pValues[i++] = obj.getStatus();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				pValues[i++] = obj.getStatus();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				pValues[i++] = obj.getStatus();
			}
			objsList = jdbcTemplate.query( qry,pValues, new BeanPropertyRowMapper<Company>(Company.class));
		
		}catch(Exception e){ 
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<Company> getCompanyFilterList(Company obj) throws Exception {
		List<Company> objsList = new ArrayList<Company>();
		try {
			String qry = "SELECT  id,	company_code,	company_name,	status "
					+ " FROM [company] where company_code is not null and company_code <> ''  "; 
			int arrSize = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				qry = qry + "and company_code = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				qry = qry + " and status = ? ";
				arrSize++;
			}
			qry = qry + " group by id,	company_code,	company_name,	status order by company_code asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}	
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				pValues[i++] = obj.getStatus();
			}	
			objsList = jdbcTemplate.query( qry, pValues, new BeanPropertyRowMapper<Company>(Company.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public Company getStacksDetails(Company obj) throws SQLException {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Company companyDetails = null;
		int i = 1;
		try{  
			con = dataSource.getConnection();
			String qry = "SELECT TOP 1 (select count( company_code) from company where company_code is not null  ";
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
						qry = qry + " and status = ? ";
					}
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
						qry = qry + " and company_code = ? ";
					}
					qry = qry +  " ) as all_companies ,"
					+ "(select count( company_code) from company where company_code is not null ";
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
						qry = qry + " and status = ? ";
					}else {
						qry = qry + " and status = 'Active' ";
					}
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
						qry = qry + " and company_code = ? ";
					}
					qry = qry + " ) as active_companies,"
					+ "(select count( company_code) from company where company_code is not null ";
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
						qry = qry + " and status = ? ";
					}else {
						qry = qry + " and status <> 'Active' ";
					}
					if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
						qry = qry + " and company_code = ? ";
					}
					qry = qry + " ) as inActive_companies  FROM company";
			stmt = con.prepareStatement(qry);
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				stmt.setString(i++, obj.getStatus());
				stmt.setString(i++, obj.getStatus());
				stmt.setString(i++, obj.getStatus());
			}	
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				stmt.setString(i++, obj.getCompany_code());
				stmt.setString(i++, obj.getCompany_code());
				stmt.setString(i++, obj.getCompany_code());
			}
			
			rs = stmt.executeQuery();  
			if(rs.next()) {
				companyDetails = new Company();
				companyDetails.setAll_companies(rs.getString("all_companies"));
				companyDetails.setActive_companies(rs.getString("active_companies"));
				companyDetails.setInActive_companies(rs.getString("inActive_companies"));
			}
		}catch(Exception e){ 
			throw new SQLException(e.getMessage());
		}finally {
			DBConnectionHandler.closeJDBCResoucrs(con, stmt, rs);
		}
		return companyDetails;
	}

	public boolean addCompany(Company obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String insertQry = "INSERT INTO [company] (company_name,company_code,status,created_by) VALUES (:company_name,:company_code,:status,:created_by)";
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

	public boolean updateCompany(Company obj) throws Exception {
		int count = 0;
		boolean flag = false;
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			NamedParameterJdbcTemplate namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
			String updateQry = "UPDATE [company] set company_name= :company_name,company_code= :company_code,status=:status,modified_by= :modified_by "
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

	public List<Company> getStatusFilterList(Company obj) throws Exception {
		List<Company> objsList = new ArrayList<Company>();
		try {
			String qry = "SELECT  status "
					+ " FROM [company] where status is not null and status <> ''  "; 
			int arrSize = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				qry = qry + "and status = ? ";
				arrSize++;
			}
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				qry = qry + " and company_code = ? ";
				arrSize++;
			}
			qry = qry + " group by  status order by status asc";
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getStatus())) {
				pValues[i++] = obj.getStatus();
			}	
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}
			objsList = jdbcTemplate.query( qry, pValues, new BeanPropertyRowMapper<Company>(Company.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

	public List<Company> checkUniqueIfForCompany(Company obj) throws Exception {
		List<Company> objsList = new ArrayList<Company>();
		try {
			String qry = "SELECT company_code FROM [company]  "
					+ " where status is not null and status <> ''  "; 
			int arrSize = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				qry = qry + " and company_code = ?";
				arrSize++;
			}	
			Object[] pValues = new Object[arrSize];
			int i = 0;
			if(!StringUtils.isEmpty(obj) && !StringUtils.isEmpty(obj.getCompany_code())) {
				pValues[i++] = obj.getCompany_code();
			}
			
			objsList = jdbcTemplate.query( qry, pValues, new BeanPropertyRowMapper<Company>(Company.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return objsList;
	}

}
