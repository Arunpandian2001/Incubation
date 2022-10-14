package com.db.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.db.load.DBLoadDriver;
import com.db.pojo.DependentPojo;
import com.db.pojo.EmployeePOJO;

import createdexception.CreatedException;
import util.getvalues.GetString;
import util.getvalues.IntegerMethod;
import util.getvalues.StringLine;

public class DBRunner {

	static final String tableName="Employee_list";
	static final String emp_Id="EMPLOYEE_ID";
	static final String name="NAME";
	static final String mobile="MOBILE";
	static final String email="EMAIL";
	static final String department="DEPARTMENT";
	static final String primaryKey=emp_Id;
	
	static Scanner input=new Scanner(System.in);

	private void printResult(Logger logger, List<EmployeePOJO> employeeList) throws CreatedException {
		
		for(EmployeePOJO pojo:employeeList) {
			logger.info("The employee Id is "+pojo.getEmployeeID());
			logger.info("The employee name is "+pojo.getName());
			logger.info("The employee mobile number is "+pojo.getMobile());
			logger.info("The employee email is "+pojo.getEmail());
			logger.info("The employee department is "+pojo.getDepartment());

		}
	}
	
	
	private void getNNumberofEmployeeRecordPojo(int limit,Logger logger,DBLoadDriver load,String tableNameObtained) throws CreatedException{
		List<EmployeePOJO> employeeList=new ArrayList<>();
		
		for(int i=0;i<limit;i++) {
			employeeList.add(new EmployeePOJO());
		}
		employeeList=load.getRecordsFromTopPojo(load.getFirstNNumberPojoQuery(tableNameObtained),limit);
		
		printResult(logger, employeeList);
		
	}
	
	private void getNNumberofEmployeeRecordList(int limit,Logger logger,DBLoadDriver load,String tableNameObtained) throws CreatedException {
		List<Map<String,String>> list=new ArrayList<>();
			
		list=load.getRecordsFromTop(load.getFirstNNumberQuery(tableNameObtained),limit);
		
		printMapResult(logger, list);
		
	}
	
	private void printMapResult(Logger logger, List<Map<String, String>> list) {

		for(Map<String, String> element:list) {
			logger.info(element+"");
		}
	}

	private void getNNumberOfOrderedEmployeePojo(int limit, DBLoadDriver load, String tableNameObtained,
			String columnNameObtained, Logger logger) throws CreatedException {

		List<EmployeePOJO> employeeList=new ArrayList<>();

		employeeList=load.getRecordsFromTopPojo(load.getRecordsInAscendingQuery(tableNameObtained, columnNameObtained),limit);
		employeeList=load.getRecordsFromTopPojo(load.getRecordsInDescendingPojoQuery(columnNameObtained, tableNameObtained),limit);

		printResult(logger, employeeList);
		
	}
	
	private void getNNumberofOrderedEmployeeList(int limit, DBLoadDriver load, String tableNameObtained,
			String columnNameObtained, Logger logger) throws CreatedException {
		
		List<Map<String,String>> list=new ArrayList<>();
		
		list=load.getRecordsFromTop(load.getRecordsInAscendingQuery(tableNameObtained, columnNameObtained),limit);
			printMapResult(logger, list);
	}
	
	private static void printDependentDetails(List<Map<String,Object>> empList, Logger logger) {
		for(Map<String,Object> element:empList) {
			logger.info(element+"");
		}
	}
	
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger(DBRunner.class.getName());
		boolean value=true;
		IntegerMethod getInt=new IntegerMethod();
		GetString stringInput=new GetString();
		StringLine inputLine=new StringLine();
		DBLoadDriver load=new DBLoadDriver();
		DBRunner runner=new DBRunner();
		while(value) {
			
			logger.log(Level.INFO,"Enter the choice");
			
			int choice=getInt.isInteger(input);
			
			switch(choice) {
			
				case 1:{
					logger.info("Enter the table name");
					
					try {
						load.createTable(load.getCreateTableQuery(stringInput.getString(input)));
					} catch (CreatedException e) {
						logger.warning(""+e);				
					}
					break;
				}
			
				case 2:{
					
					logger.info("Enter the number of employees to be entered");
					
					int limit=getInt.isInteger(input);
					
					logger.info("Enter the Table name::");
					String tableNameObtained=stringInput.getString(input);
					List <EmployeePOJO> list=new ArrayList<>();
					
					for(int i=0;i<limit;i++) {
						list.add(new EmployeePOJO());
					}
									
					for(EmployeePOJO element : list) {

						logger.info("Enter the Employee name");
						element.setName(inputLine.getMultipleString(input));

						logger.info("Enter the Employee id");
						element.setEmployeeID(stringInput.getString(input));
						
						logger.info("Enter the Employee Mobile number");
						element.setMobile(stringInput.getString(input));

						logger.info("Enter the Employee email");
						element.setEmail(stringInput.getString(input));
						
						logger.info("Enter the Employee Department");
						element.setDepartment(inputLine.getMultipleString(input));

						try {
							load.insertRecords(load.getInsertQuery(tableNameObtained), element.getEmployeeID(), element.getName(), element.getMobile(), element.getEmail(), element.getDepartment());
						} catch (CreatedException e) {
							logger.warning(""+e);				
						}
					}
					
					break;
					}
					
					case 3:{
						
						List <String> empName=new ArrayList<>();
						List <String> id=new ArrayList<>();
						List<EmployeePOJO> employeeList=new ArrayList<>();
																					
						logger.info("Enter the number of employees data to retreive::");
						int limit=getInt.isInteger(input);
						
						logger.info("Enter the Table name::");
						String tableNameObtained=stringInput.getString(input);
											
						for(int i=0;i<limit;i++) {
							
							logger.info("Enter the name of employee");
							empName.add(inputLine.getMultipleString(input));
							
							logger.info("Enter the employee id");
							id.add(stringInput.getString(input));
							
							
							try {
								employeeList.add(load.getRecordsUsingName(load.getRecordUsingNameQuery(tableNameObtained), id.get(i), empName.get(i)));
							} catch (CreatedException e) {
								logger.warning(""+e);				
							}
							
						}
						try {
							runner.printResult(logger,employeeList);
						} catch (CreatedException e) {
							logger.warning(""+e);				
						}
						
						break;
					}
					
					case 4:{
						List <String> employeeMobile=new ArrayList<>();
						List <String> employeeEmail=new ArrayList<>();
						List <String> employeeId=new ArrayList<>();
						List <String> employeeDepartment=new ArrayList<>();

																					
						logger.info("Enter the number of employees data to modify::");
						int limit=getInt.isInteger(input);
						
						
						logger.info("Enter the Table name::");
						String tableNameObtained=stringInput.getString(input);
						
						for(int i=0;i<limit;i++) {
							logger.info("Enter the employee id");
							employeeId.add(stringInput.getString(input));
							
							logger.info("Enter the mobile number of employee to modify");
							employeeMobile.add(stringInput.getString(input));
							
							logger.info("Enter the email of employee to modify");
							employeeEmail.add(stringInput.getString(input));
							
							logger.info("Enter the department of employee to modify");
							employeeDepartment.add(inputLine.getMultipleString(input));
							
							try {
								load.modifyTableFields(load.getModifyQuery(tableNameObtained),employeeId.get(i), employeeMobile.get(i), employeeMobile.get(i), employeeDepartment.get(i));
							} catch (CreatedException e) {
								logger.warning(""+e);				
							}

						}
						break;
					}
					
					case 5:{
						
						logger.info("Enter the Table name::");
						String tableNameObtained=stringInput.getString(input);
						
						logger.info("Enter the number of records to be printed from top");
						int limit=getInt.isInteger(input);
						
						try {
							runner.getNNumberofEmployeeRecordPojo(limit, logger, load, tableNameObtained);
							runner.getNNumberofEmployeeRecordList(limit, logger, load, tableNameObtained);
						} catch (CreatedException e) {
							logger.warning(""+e);				
						}
	
						break;
					}
					
					case 6:{
						logger.info("Enter the Table name::");
						String tableNameObtained=stringInput.getString(input);
						
						logger.info("Enter the Column name to ascend::");
						String columnNameObtained=stringInput.getString(input);
						
						logger.info("Enter the number of records to be printed from top");
						int limit=getInt.isInteger(input);

						try {
							runner.getNNumberOfOrderedEmployeePojo(limit,load,tableNameObtained,columnNameObtained,logger);
							runner.getNNumberofOrderedEmployeeList(limit,load,tableNameObtained,columnNameObtained,logger);
						} catch (CreatedException e) {
							logger.warning(""+e);				
						}
						
						break;
					}
						
					
					case 7:{
						logger.info("Enter the Table name::");
						String tableNameObtained=stringInput.getString(input);
						
						logger.info("Enter the number of emloyee id to delete record");
						int id=getInt.isInteger(input);
						
						List<String> employeeIds=new ArrayList<>();
						
						for(int i=0;i<id;i++) {
							logger.info("Enter the employee id to delete");
							employeeIds.add(stringInput.getString(input));
							try {
								load.deleteRecord(load.getDeleteQuery(tableNameObtained), employeeIds.get(i));
							} catch (CreatedException e) {
								logger.warning(""+e);				
							}
						}
						
						logger.info("Enter the number of records to be printed from top");
						int limit=getInt.isInteger(input);
						
						try {
							runner.getNNumberofEmployeeRecordPojo(limit, logger, load, tableNameObtained);
//							runner.getNNumberofEmployeeRecordList(limit, logger, load, tableNameObtained);
						}catch(CreatedException e) {
							logger.warning(""+e);				
						}
						break;
					}
					
					
					case 9:{
						
						logger.info("Enter the Dependent Table name::");
						
						try {
							load.createTable(load.getCreateDependentQuery(stringInput.getString(input)));
						} catch (CreatedException e) {
							logger.warning(""+e);				
						}
						
						break;
					}
					
					case 10:{
						logger.info("Enter the number of employee details to be added");
						int limit=getInt.isInteger(input);
						int numOfDependents=0;
						
						logger.info("Enter the table name");
						String tableName=stringInput.getString(input);
						
						List<String> id=new ArrayList<>();
						
						
						for(int i=0;i<limit;i++) {

							logger.info("Enter the employee id");
							id.add(stringInput.getString(input));
											
							logger.info("Enter the number of dependents");
							numOfDependents=getInt.isInteger(input);
								
							for(int j=0;j<numOfDependents;j++) {
								
								DependentPojo depPojo=new DependentPojo();
								
								depPojo.setEmp_Id(id.get(i));
								input.nextLine();
								
								logger.info("Enter the name of dependent");
								depPojo.setName(inputLine.getMultipleString(input));
								
								logger.info("Enter the relation of dependent to employee");
								depPojo.setRelationship(stringInput.getString(input));
								
								logger.info("Enter the age of dependent");
								depPojo.setAge(getInt.isInteger(input));
																
								try {
									load.setDependentDetails(load.getSetDependentDetailsQuery(tableName),depPojo);
								} catch (CreatedException e) {
									logger.warning(""+e);				
								}
							}
						}
						break;
					}
					
					case 11:{
						
						logger.info("Enter the table name");
						String tableName=stringInput.getString(input);
						
						logger.info("Enter the number of employee records to be fetched");
						int limit=getInt.isInteger(input);

						
						List<Map<String,Object>> empList=new ArrayList<>();			
						for(int j=0;j<limit;j++) {

							logger.info("Enter the Employee Id");
							String id=stringInput.getString(input);
														
							try {
								empList=load.getDependentRecords(id,load.getDependentRecordsQuery(tableName));
							} catch (CreatedException e) {
								logger.warning(""+e);				
							}
							printDependentDetails(empList,logger);

						}
						break;
					}
					
					case 12:{
							
							logger.info("Enter the number of records to be fetched from the dependend table");
							int limit=getInt.isInteger(input);
							
							List<String> orderedId=new ArrayList<>();
							List<Map<String,Object>> empList=new ArrayList<>();			
							StringBuilder builder=new StringBuilder();
							try {
								orderedId=load.getNumberOfDependentRow(limit, load.getNumberOfDependentRowQuery());
								for(int i=0;i<orderedId.size();i++) {
									if(i==orderedId.size()-1) {
										builder.append(orderedId.get(i));
										continue;
									}
									builder.append(orderedId.get(i)+",");
								}
								empList=load.getNNumberOfDependent(null,load.getNNumberOfDependentQuery(builder.toString()));
							} catch (CreatedException e) {
								logger.warning(e+"");
							}
							printDependentDetails(empList,logger);
							break;
					}
					
					case 13:{
						value=false;
						logger.info("The program is closed");
						break;
					}
					
					default:{
						logger.info("Enter valid input");
						break;
					}
			}
		}
	}

}
