package com.resustainability.reisp.common;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class CommonMethods {
	public static Logger logger = Logger.getLogger(CommonMethods.class);
	
	public static String[] replaceEmptyByNullInSringArray(String[] _array) {
		for (int i = 0; i < _array.length; i++){
		    if (StringUtils.isEmpty(_array[i])) {
		        _array[i] = null;
		    }else if(!StringUtils.isEmpty(_array[i]) && _array[i].contains("~$~")) {
		    	String temp = _array[i].replaceAll("[~$~]+" , ",");
		    	_array[i] = temp;
		    }
		}
		return _array;
	}
	
	
	public static String[] replaceEmptyByNullInSringArraySecond(String[] _array) {
		for (int i = 0; i < _array.length; i++){
		    if (StringUtils.isEmpty(_array[i])) {
		        _array[i] = null;
		    }
		}
		return _array;
	}
	
}
