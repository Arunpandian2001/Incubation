package com.clock.runner;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.clock.method.ClockMethod;
import com.util.getvalues.GetString;
import com.util.getvalues.IntegerMethod;
public class ClockRunner {
	
	public static void main(String[] args) {
		
		GetString inputString=new GetString();
		IntegerMethod getInt=new IntegerMethod();
		ClockMethod method=new ClockMethod();
		Scanner input=new Scanner(System.in);
;
		boolean value=true;
		
		while(value) {
			System.out.println("Enter the choice");
			int choice=getInt.isInteger(input);

			switch(choice) {
			
				case 1:{
					
					System.out.println(method.getLocalTime());
					System.out.println();
					break;
				}
				
				case 2:{
					System.out.println(method.getPresentLocalTimeInMilli());
					System.out.println();
					break;
				}
				
				case 3:{
						
						System.out.println("Enter the number of timezones needed::");
						//Logger logger=new Logger.getLogger(ClockMethod.class.getName());
						
						int limit=getInt.isInteger(input);
						
						String[] continents=new String[limit];
						String[] places=new String[limit];
						String [] timeZone=new String[limit];
						//ZoneId [] zones=new ZoneId[limit];
						
						for(int i=0;i<limit;i++) {
							System.out.println("Enter the continent::");
							continents[i]=inputString.getString(input);
							
							System.out.println("Enter the zone::");					
							places[i]=inputString.getString(input);
							
							timeZone[i]=method.getCombinedString(continents[i],places[i]);
							
							/*try {
								zones[i]=method.getZoneId(timeZone[i]);

							}catch(Exception e) {
								System.out.println(e);
							}*/
						}
						String [] resultTimes=method.getDifferentTimeZones(limit, timeZone);
						for(int i=0;i<limit;i++) {
							System.out.println("The time in TimeZone "+timeZone[i]+" is "+resultTimes[i]);
						}
						System.out.println();
						break;
					
				}
				
				case 4:{
					System.out.println("Enter the time in hh:mm:ss format::");
					String time=inputString.getString(input);
					System.out.println("Enter the date in dd/mm/yyyy format ::");
					String date=inputString.getString(input);
					String abc=method.getTime(time,date);
					break;
				}
				
				case 7:{
					value=false;
					//System.out.println("The process is end");
					break;
				}
			}
		}
		input.close();
	}

}
