package com.resustainability.reisp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resustainability.reisp.dao.LocationDao;
import com.resustainability.reisp.model.ProjectLocation;

@Service
public class LocationService {
	@Autowired
	LocationDao dao;

	public List<ProjectLocation> getProjectsList(ProjectLocation obj) throws Exception {
		return dao.getProjectsList(obj);
	}

	public List<ProjectLocation> getLocationsList(ProjectLocation obj)  throws Exception{
		return dao.getLocationsList(obj);
	}

	public List<ProjectLocation> getProjectFilterList(ProjectLocation obj) throws Exception {
		return dao.getProjectFilterList(obj);
	}

	public List<ProjectLocation> getLocationFilterList(ProjectLocation obj) throws Exception {
		return dao.getLocationFilterList(obj);
	}

	public List<ProjectLocation> getStatusFilterListFromLocation(ProjectLocation obj) throws Exception {
		return dao.getStatusFilterListFromLocation(obj);
	}

	public boolean addLocation(ProjectLocation obj) throws Exception {
		return dao.addLocation(obj);
	}

	public boolean updateLocation(ProjectLocation obj) throws Exception {
		return dao.updateLocation(obj);
	}

	public List<ProjectLocation> checkUniqueIfForlocation(ProjectLocation obj) throws Exception {
		return dao.checkUniqueIfForlocation(obj);
	}
}
