package com.clock.method;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.TimeZone;

import createdexception.CreatedException;

public class ClockMethod {
	
	public void checkCase(String check) throws CreatedException{
		char checkCase=check.charAt(0);
		if(checkCase>90 || checkCase<65) {
			throw new CreatedException("The given string should start with uppercase");
		}
	}
	

	public void checkZone(String key) throws CreatedException {
		String zones[]=TimeZone.getAvailableIDs();
		if(!Arrays.asList(zones).contains(key)) {
			throw new CreatedException("The given timezone is not a valid timezone");
		}		
	}	
		
	public LocalDateTime getLocalTime() {
		
		return LocalDateTime.now();
	}

	public long getPresentLocalTimeInMilli() {
		
		return System.currentTimeMillis();
	}
	
	public long getCurrentMilli() {
		return Instant.now().toEpochMilli();
	}
	
	public String getTimeZoneString(String continent,String place) {
		return continent+"/"+place;
	}
	
	public ZoneId getZoneId(String timeZone) {
		return ZoneId.of(timeZone);
	}
	
	public String getDifferentTimeZones(String timeZones) {
		
		LocalDateTime date=LocalDateTime.now();
		ZoneId id=ZoneId.of(timeZones);
		return ZonedDateTime.of(date, id).toString();

	}
	
	public ZonedDateTime getDateUsingMilliSeconds(String timeZone,long time) throws CreatedException {
		ZonedDateTime date=Instant.ofEpochMilli(time).atZone(getZoneId(timeZone));
		return date;	
	}
	
	public String getWeekDay(ZonedDateTime inputDate){
	
		return inputDate.getDayOfWeek().toString();
	}
	
	public String getMonthString(ZonedDateTime inputDate) {
		 
		return inputDate.getMonth().toString();
	}
	
	public int getYearString(ZonedDateTime inputDate)  {
		
		return inputDate.getYear();
	}
	
}

