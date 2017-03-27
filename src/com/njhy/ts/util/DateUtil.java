package com.njhy.ts.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	private static  String pattern = "yyyy-MM-dd"; 
	private static SimpleDateFormat sf = new SimpleDateFormat(pattern);
	
	public static Date String2Date(String str) throws ParseException{
		return sf.parse(str);
	}
	
	public static String getCurrentTimeMillions(){
		String dateStr =  new Date().getTime()+"";
		return dateStr;
	}
	
	public static  Date getNextDate(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		return  calendar.getTime();
	}
	
	public static String Date2String(Date date){
		return sf.format(date);
	}
	
}
