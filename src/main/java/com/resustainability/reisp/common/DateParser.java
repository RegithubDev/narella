package com.resustainability.reisp.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class DateParser {

	public static Logger logger = Logger.getLogger(DateParser.class);
	public static SimpleDateFormat indianDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	public static SimpleDateFormat indianDateFormatWithDot = new SimpleDateFormat("dd.MM.yyyy");
	public static SimpleDateFormat mySQLDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat mySQLDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public static SimpleDateFormat ddmmmyyyyFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
	private static final Map<String, String> DATE_FORMAT_REGEXPS = new HashMap<String, String>() {        
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
            put("^\\d{8}$", "yyyyMMdd");
            put("^\\d{12}$", "yyyyMMddHHmm");
            put("^\\d{8}\\s\\d{4}$", "yyyyMMdd HHmm");
            put("^\\d{14}$", "yyyyMMddHHmmss"); 
            put("^\\d{8}\\s\\d{6}$", "yyyyMMdd HHmmss");
            put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy"); 
            put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
            //put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
            put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "dd/MM/yyyy");
            put("^\\d{1,2}/\\d{1,2}/\\d{2,4}$", "d/M/yy");
            put("^\\d{1,2}-[a-z]{3}-\\d{4}$", "dd-MMM-yyyy");
            put("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
            put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
            put("^\\d{1,2}-\\s[a-z]{3}-\\s\\d{4}$", "dd-MMM-yyyy");
            put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
            put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}$", "dd-MM-yyyy HH:mm");
            put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy-MM-dd HH:mm");
            //put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "MM/dd/yyyy HH:mm");
            put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "dd/MM/yyyy HH:mm");
            put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy/MM/dd HH:mm");
            put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMM yyyy HH:mm");
            put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMMM yyyy HH:mm");
            put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd-MM-yyyy HH:mm:ss");
            put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd HH:mm:ss");
            //put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "MM/dd/yyyy HH:mm:ss");
            put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd/MM/yyyy HH:mm:ss");
            put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy/MM/dd HH:mm:ss");
            put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMM yyyy HH:mm:ss");
            put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMMM yyyy HH:mm:ss");
            put("^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{2}:\\d{2}\\.\\d{2}[-+]\\d{2}:\\d{2}$", "yyyy-MM-dd'T'HH:mm:ss.SSS");
        }
    };

    /**
     * To Determine the pattern by the string date value
     * 
     * @param dateString
     * @return The matching SimpleDateFormat pattern, or null if format is unknown.
     */
    public static String determineDateFormat(String dateString) {
        for (String regexp : DATE_FORMAT_REGEXPS.keySet()) {
            if (dateString.matches(regexp) || dateString.toLowerCase().matches(regexp)) {
                return DATE_FORMAT_REGEXPS.get(regexp);
            }
        }
        return null;
    }

    public static String parse(String value) {
    	String parsedDate = null;
        if (value != null) {
            String format = determineDateFormat(value);
            if (format != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                try {
                    Date date = sdf.parse(value);
                    //System.out.println(String.format("Format : %s | Value : %s | Parsed Date : %s", value, date, format));
                    parsedDate = mySQLDateFormat.format(date);
                } catch (ParseException e) {
                    // Failed the execution
                }
            }
        }
        return parsedDate;
    }

    public static String parseTrickyDate(String value) throws ParseException {
    	String parsedDate = null;
        if (value != null) {
			DateFormat inputFormatter = new SimpleDateFormat("dd MMMM, yyyy");
		    Date da = (Date)inputFormatter.parse(value);
		    System.out.println("Date     " + da);

		    DateFormat outputFormatter = new SimpleDateFormat("yyyy-MM-dd");
		    parsedDate = outputFormatter.format(da);
		    System.out.println("String date is :     " + parsedDate);
        }
        return parsedDate;
    }
    
    public static String parseDateTime(String value) {
    	String parseDateTime = null;
        if (value != null) {
            String format = determineDateFormat(value);
            if (format != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                try {
                    Date date = sdf.parse(value);
                    //System.out.println(String.format("Format : %s | Value : %s | Parsed Date : %s", value, date, format));
                    parseDateTime = mySQLDateTimeFormat.format(date);
                } catch (ParseException e) {
                    // Failed the execution
                }
            }
        }
        return parseDateTime;
    }
    
    public static String parseToIndianDateFormat(String value) {
    	String parsedDate = null;
        if (value != null) {
            String format = determineDateFormat(value);
            if (format != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                try {
                    Date date = sdf.parse(value);
                    //System.out.println(String.format("Format : %s | Value : %s | Parsed Date : %s", value, date, format));
                    parsedDate = indianDateFormat.format(date);
                } catch (ParseException e) {
                    // Failed the execution
                }
            }
        }
        return parsedDate;
    }
    
    public static String parseToIndianDateFormatWithDot(String value) {
    	String parsedDate = null;
        if (value != null) {
            String format = determineDateFormat(value);
            if (format != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                try {
                    Date date = sdf.parse(value);
                    //System.out.println(String.format("Format : %s | Value : %s | Parsed Date : %s", value, date, format));
                    parsedDate = indianDateFormatWithDot.format(date);
                } catch (ParseException e) {
                    // Failed the execution
                }
            }
        }
        return parsedDate;
    }
    
    public static String parseToDDMMMYYYYFormat(String value) {
    	String parsedDate = null;
        if (value != null) {
            String format = determineDateFormat(value);
            if (format != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                try {
                    Date date = sdf.parse(value);
                    //System.out.println(String.format("Format : %s | Value : %s | Parsed Date : %s", value, date, format));
                    parsedDate = ddmmmyyyyFormat.format(date);
                } catch (ParseException e) {
                    // Failed the execution
                }
            }
        }
        return parsedDate;
    }
    
	/*public static void main(String[] args) {
	    parse("2011-09-27T07:04:21.97-05:00"); //here is your value
	    parse("20110917");
	    parse("01/02/2018");
	    parse("02-01-2018 06:07:59");
	    parse("02 January 2018");
	}

    public static void parse(String value) {
        if (value != null) {
            String format = determineDateFormat(value);
            if (format != null) {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                try {
                    Date date = sdf.parse(value);
                    System.out.println(String.format("Format : %s | Value : %s | Parsed Date : %s", value, date, format));
                } catch (ParseException e) {
                    // Failed the execution
                }
            }
        }
    }*/
    
    
    
}
