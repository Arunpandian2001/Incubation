package com.clock.runner;

import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.clock.method.ClockMethod;

import createdexception.CreatedException;
import util.getvalues.GetString;
import util.getvalues.IntegerMethod;
import util.getvalues.LongMethod;

public class ClockRunner {

	public static void main(String[] args) {

		GetString inputString = new GetString();
		IntegerMethod getInt = new IntegerMethod();
		ClockMethod method = new ClockMethod();
		Scanner input = new Scanner(System.in);
		LongMethod longInput = new LongMethod();
		Logger logger = Logger.getLogger(ClockMethod.class.getName());

		boolean value = true;

		while (value) {
			logger.log(Level.INFO, "Enter the choice");
			int choice = getInt.isInteger(input);

			switch (choice) {

			case 1: {
				
				logger.log(Level.INFO, method.getLocalTime().toString());

				System.out.println();
				break;
			}

			case 2: {

				logger.log(Level.INFO,
						"The current time in milliseconds - system:: " + Long.toString(method.getPresentLocalTimeInMilli()));
				logger.log(Level.INFO,
						"The current time in milliseconds:: -instant " + Long.toString(method.getCurrentMilli()));

				System.out.println();
				System.out.println();
				break;
			}

			case 3: {

				logger.info("Enter the number of timezones needed::");

				int limit = getInt.isInteger(input);

				String[] continents = new String[limit];
				String[] places = new String[limit];
				String[] timeZone = new String[limit];

				try {
					for (int i = 0; i < limit; i++) {
						logger.log(Level.INFO, "Enter the continent::");

						continents[i] = inputString.getString(input);
						method.checkCase(continents[i]);

						logger.log(Level.INFO, "Enter the zone::");

						places[i] = inputString.getString(input);
						method.checkCase(places[i]);

						timeZone[i] = method.getTimeZoneString(continents[i], places[i]);
						method.checkZone(timeZone[i]);

					}
				}

				catch (CreatedException e) {
					logger.log(Level.SEVERE, "Exception occured", e);
					break;
				}

				
				for(int i=0;i<limit;i++) {
					logger.log(Level.INFO, "The time in TimeZone " + timeZone[i] + " is " +method.getDifferentTimeZones(timeZone[i]));

				}
				
				
				System.out.println();
				break;

			}

			case 4: {
				
				logger.info("Enter the number of timezones needed::");

				int limit = getInt.isInteger(input);

				String[] continents = new String[limit];
				String[] places = new String[limit];
				String[] timeZone = new String[limit];
				
				String day = "";

				for(int i=0;i<timeZone.length;i++) {
					try {
						ZonedDateTime givenDate;
						
						logger.log(Level.INFO, "Enter the continent::");

						continents[i] = inputString.getString(input);
						method.checkCase(continents[i]);

						logger.log(Level.INFO, "Enter the zone::");

						places[i] = inputString.getString(input);
						method.checkCase(places[i]);

						
						timeZone[i] = method.getTimeZoneString(continents[i], places[i]);
						method.checkZone(timeZone[i]);

						logger.log(Level.INFO, "Enter  milliseconds for "+timeZone[i]+" ::");

						long milliSeconds = longInput.isLong(input);
						
					
						
						givenDate = method.getDateUsingMilliSeconds(timeZone[i],milliSeconds);
						logger.log(Level.INFO, "The date and time of given input is" + givenDate);
						
						day = method.getWeekDay(givenDate);

					} catch (CreatedException e) {
						logger.log(Level.SEVERE, "Exception occured", e);
						break;
					}
					logger.log(Level.INFO, "The day in "+timeZone[i]+" is :" + day);

				}
				System.out.println();
				break;
			}

			case 5: {

				logger.info("Enter the number of timezones needed::");

				int limit = getInt.isInteger(input);

				String[] continents = new String[limit];
				String[] places = new String[limit];
				String[] timeZone = new String[limit];
				String month = "";

				for(int i=0;i<timeZone.length;i++) {
					try {
						ZonedDateTime givenDate;
						
						logger.log(Level.INFO, "Enter the continent::");

						continents[i] = inputString.getString(input);
						method.checkCase(continents[i]);

						logger.log(Level.INFO, "Enter the zone::");

						places[i] = inputString.getString(input);
						method.checkCase(places[i]);

						
						timeZone[i] = method.getTimeZoneString(continents[i], places[i]);
						method.checkZone(timeZone[i]);

						logger.log(Level.INFO, "Enter  milliseconds for "+timeZone[i]+" ::");

						long milliSeconds = longInput.isLong(input);
						

						givenDate = method.getDateUsingMilliSeconds(timeZone[i],milliSeconds);
						logger.log(Level.INFO, "The date and time of given input is" + givenDate);
						
						month = method.getMonthString(givenDate);

					} catch (CreatedException e) {
						logger.log(Level.SEVERE, "Exception occured", e);
						break;
					}
					logger.info(month);

				}
				System.out.println();
				break;

			}

			case 6: {

				logger.info("Enter the number of timezones needed::");

				int limit = getInt.isInteger(input);

				String[] continents = new String[limit];
				String[] places = new String[limit];
				String[] timeZone = new String[limit];
				int year = 0;

				for(int i=0;i<timeZone.length;i++) {
					try {
						ZonedDateTime givenDate;
						logger.log(Level.INFO, "Enter the continent::");

						continents[i] = inputString.getString(input);
						method.checkCase(continents[i]);

						logger.log(Level.INFO, "Enter the zone::");

						places[i] = inputString.getString(input);
						method.checkCase(places[i]);

						
						timeZone[i] = method.getTimeZoneString(continents[i], places[i]);
						method.checkZone(timeZone[i]);

						logger.log(Level.INFO, "Enter  milliseconds for "+timeZone[i]+" ::");

						long milliSeconds = longInput.isLong(input);
						

						givenDate = method.getDateUsingMilliSeconds(timeZone[i],milliSeconds);
						logger.log(Level.INFO, "The date and time of given input is" + givenDate);
						
						year = method.getYearString(givenDate);

					} catch (CreatedException e) {
						logger.log(Level.SEVERE, "Exception occured", e);
						break;
					}
					logger.log(Level.INFO, "The year in "+timeZone[i]+" is :" + year);

				}
				
				logger.log(Level.INFO, "The year is :" + year);

				System.out.println();
				break;

			}

			case 7: {
				value = false;
				logger.log(Level.INFO, "The process is end");

				System.out.println();
				break;
			}

			default: {
				logger.log(Level.WARNING, "Enter proper input");

			}

			}
		}
		input.close();
	}

}
