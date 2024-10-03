package com.resustainability.reisp.model;

import java.util.List;

import com.resustainability.reisp.model.User;

public class UserPaginationObject {
	private int iTotalDisplayRecords; 
	private int iTotalRecords;
	private List<User> aaData;
	
	public int getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public List<User> getAaData() {
		return aaData;
	}
	public void setAaData(List<User> aaData) {
		this.aaData = aaData;
	}
	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
}
