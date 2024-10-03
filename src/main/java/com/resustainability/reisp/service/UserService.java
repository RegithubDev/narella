package com.resustainability.reisp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.UserDao;
import com.resustainability.reisp.model.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;
	
	public List<User> getUsersList(User obj) throws Exception {
		return dao.getUsersList(obj);
	}

	public boolean addUser(User user) throws Exception {
		return dao.addUser(user);
	}

	public List<User> getDeptList(User user) throws Exception {
		return dao.getDeptList(user);
	}

	public User validateUser(User user) throws Exception {
		return dao.validateUser(user);
	}

	public int getTotalRecords(User obj, String searchParameter)  throws Exception{
		return dao.getTotalRecords(obj, searchParameter);
	}

	public List<User> getUserList(User obj, int startIndex, int offset, String searchParameter)  throws Exception{
		return dao.getUserList(obj,startIndex, offset, searchParameter);
	}

	public boolean updateUser(User user) throws Exception  {
		return dao.updateUser(user);
	}

	public boolean deleteProject(User obj) throws Exception  {
		return dao.deleteProject(obj);
	}

	public List<User> getDeptFilterList(User obj) throws Exception  {
		return dao.getDeptFilterList(obj);
	}

	public boolean UserLogOutActions(User obj) throws Exception {
		return dao.UserLogOutActions(obj);
		
	}

	public List<User> getMenuList() throws Exception  {
		return dao.getMenuList();
	}

	public List<User> getUserFilterList(User obj) throws Exception {
		return dao.getUserFilterList(obj);
	}

	public List<User> getStatusFilterListFromUser(User obj) throws Exception  {
		return dao.getStatusFilterListFromUser(obj);
	}

	public List<User> getReportingTosList(User obj) throws SQLException {
		return dao.getReportingTosList(obj);
	}

	public int checkUserLoginDetails(User user) throws Exception {
		return dao.checkUserLoginDetails(user);
		
	}

	public User getAllPermissions(String base_role) throws SQLException {
		return dao.getAllPermissions(base_role);
	}

}
