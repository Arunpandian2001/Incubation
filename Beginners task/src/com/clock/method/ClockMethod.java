package com.clock.method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.stringbuilder.method.BuilderMethod;

import createdexception.CreatedException;

public class ClockMethod {
	
	BuilderMethod method=new BuilderMethod();
	String zones[]=TimeZone.getAvailableIDs();
	
	public void checkCase(String check) throws CreatedException{
		char checkCase=check.charAt(0);
		if(checkCase>90 || checkCase<65) {
			throw new CreatedException("The given string should start with uppercase");
		}
	}
	

	public void checkZone(String key) throws CreatedException {
		
		if(!Arrays.asList(zones).contains(key)) {
			throw new CreatedException("The given timezone is not a valid timezone");

		}
		
	}
	
	public String getLocalTime() {
		
		String pattern="dd/MM/yyyy HH:mm:ss" ;
		SimpleDateFormat time=new SimpleDateFormat(pattern);
		return time.format(new Date());
	
	}

	public long getPresentLocalTimeInMilli() {
		
		return System.currentTimeMillis();
	}
	
	public String getCombinedString(String continent,String place) {
		return continent+"/"+place;
	}
	
	public ZoneId getZoneId(String timeZone)throws Exception {
		return ZoneId.of(timeZone);
	}
	
	public String[] getDifferentTimeZones(int limit,String ... timeZones) {
		
		String [] resultTimes=new String[limit];
		for(int i=0;i<limit;i++) {
			
			Date now=new Date();
			String pattern="dd-MM-yyyy HH:mm:ss" ;
			SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
			dateFormat.setTimeZone(TimeZone.getTimeZone(timeZones[i]));
			resultTimes[i]=dateFormat.format(now);
			
		}
		return resultTimes;
	}
	
	public String getTime(String time,String date ) {
		return date+" "+time;
	}
	
	public String getWeekDay(String date) throws ParseException {
		
		  SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		  Date dt1 = format1.parse(date);
		  DateFormat format2 = new SimpleDateFormat("EEEE"); 
		  String day = format2.format(dt1);
		
		return day;
	}
	
	public String getMonthString(String date) throws ParseException {
		
		  SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		  Date dt1 = format1.parse(date);
		  DateFormat format2 = new SimpleDateFormat("MMMM"); 
		  String month = format2.format(dt1);
		
		return month;
	}
	
	public String getYearString(String date) throws ParseException {
		
		  SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		  Date dt1 = format1.parse(date);
		  DateFormat format2 = new SimpleDateFormat("yyyy"); 
		  String year = format2.format(dt1);
		
		return year;
	}
}

