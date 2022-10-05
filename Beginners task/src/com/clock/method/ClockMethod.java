package com.clock.method;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class ClockMethod {
	
	public String getLocalTime() {
		
		String pattern="dd/MM/yyyy HH:mm:ss" ;
		SimpleDateFormat time=new SimpleDateFormat(pattern);
		return time.format(new Date());
//		LocalDateTime.now()
	
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
			/*LocalTime time=LocalTime.now(zones[i]);
			resultTimes[i]=time.format(time);*/
			dateFormat.setTimeZone(TimeZone.getTimeZone(timeZones[i]));
			resultTimes[i]=dateFormat.format(now);
			
		}
		return resultTimes;
	}
	
	public String getTime(String time,String date ) {
		return null;
	}
	
}

