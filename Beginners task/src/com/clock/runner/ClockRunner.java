package com.clock.runner;

import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.clock.method.ClockMethod;
import com.util.getvalues.GetString;
import com.util.getvalues.IntegerMethod;

import createdexception.CreatedException;
public class ClockRunner {
	
	public static void main(String[] args) {
		
		GetString inputString=new GetString();
		IntegerMethod getInt=new IntegerMethod();
		ClockMethod method=new ClockMethod();
		Scanner input=new Scanner(System.in);
		Logger logger=Logger.getLogger(ClockMethod.class.getName());

		boolean value=true;
		
		while(value) {
			logger.log(Level.INFO, "Enter the choice");
			int choice=getInt.isInteger(input);

			switch(choice) {
			
				case 1:{
					logger.log(Level.INFO, method.getLocalTime());

					System.out.println();
					break;
				}
				
				case 2:{
					
					logger.log(Level.INFO, Long.toString(method.getPresentLocalTimeInMilli()));

					System.out.println();
					System.out.println();
					break;
				}
				
				case 3:{
						
						logger.info("Enter the number of timezones needed::");
						
						int limit=getInt.isInteger(input);
						
						String[] continents=new String[limit];
						String[] places=new String[limit];
						String[] timeZone=new String[limit];
						
						try {
							for(int i=0;i<limit;i++) {
								logger.log(Level.INFO, "Enter the continent::");

								continents[i]=inputString.getString(input);
								method.checkCase(continents[i]);
								
								logger.log(Level.INFO, "Enter the zone::");

								places[i]=inputString.getString(input);
								method.checkCase(places[i]);
								
								timeZone[i]=method.getCombinedString(continents[i],places[i]);
								method.checkZone(timeZone[i]);

							}
						}
						
						catch(CreatedException e) {
							logger.log(Level.SEVERE,"Exception occured", e);
							break;
						}
						
						
						String [] resultTimes=method.getDifferentTimeZones(limit, timeZone);
						for(int i=0;i<limit;i++) {
							logger.log(Level.INFO, "The time in TimeZone "+timeZone[i]+" is "+resultTimes[i]);
						}
						System.out.println();
						break;
					
				}
				
				case 4:{
					
					logger.log(Level.INFO, "Enter the date in yyyy/mm/dd format ::");

					String date=inputString.getString(input);
					String day="";
					try {
						 day=method.getWeekDay(date);

					}catch(ParseException e) {
						logger.log(Level.SEVERE, "Enter the input with / between date values");

					}
					logger.log(Level.INFO, "The day is :"+day);

					System.out.println();
					break;
				}
				
				case 5:{
					logger.log(Level.INFO, "Enter the date in yyyy/mm/dd format ::");

					String date=inputString.getString(input);
					String month="";
					
					try {
						month=method.getMonthString(date);
					} catch (ParseException e) {
						logger.log(Level.SEVERE, "Enter the input with / between date values");
					}
					logger.log(Level.INFO, "The month is :"+month);

					System.out.println();
					break;

				}
				
				case 6:{
					logger.log(Level.INFO, "Enter the date in yyyy/mm/dd format ::");

					String date=inputString.getString(input);
					String year="";
					
					try {
						year=method.getYearString(date);
					} catch (ParseException e) {
						logger.log(Level.SEVERE, "Enter the input with / between date values");
					}
					logger.log(Level.INFO, "The year is :"+year);

					System.out.println();
					break;

				}
				
				
				
				case 7:{
					value=false;
					logger.log(Level.INFO, "The process is end");

					System.out.println();
					break;
				}
				
				default:{
					logger.log(Level.WARNING, "Enter proper input");

				}
				
			}
		}
		input.close();
	}

}
