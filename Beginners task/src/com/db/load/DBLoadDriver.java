package com.db.load;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.db.pojo.DependentPojo;
import com.db.pojo.EmployeePOJO;
import java.sql.ResultSetMetaData;
import createdexception.CreatedException;

public class DBLoadDriver {

	
	public Connection makeConnection() throws CreatedException {
		
		String url="jdbc:mysql://localhost/incubationDB";
		String user="root";
		String password="Root@123";
		Connection connection;
		try {
			connection = DriverManager.getConnection(url,user,password);
		}
		catch(SQLException e) {
			throw new CreatedException("Error occured while connection",e);
		}
		return connection;
	}
		
	
	public String getCreateTableQuery(String tableName) {
		return "CREATE TABLE  "+tableName+" ( EMPLOYEE_ID VARCHAR(20),"+" NAME VARCHAR(255),"
				+ ""+" MOBILE VARCHAR(12),"+" EMAIL VARCHAR(100),"+" DEPARTMENT VARCHAR(100), PRIMARY KEY ( EMPLOYEE_ID ))";
	}
	
	public String getCreateDependentQuery(String tableName) {
		return "CREATE TABLE "+tableName+" (EMPLOYEE_ID VARCHAR(20),NAME VARCHAR(100), AGE INT unsigned NOT NULL ,"
				+ " RELATIONSHIP VARCHAR (20) ,FOREIGN KEY(EMPLOYEE_ID) REFERENCES Employee_list(EMPLOYEE_ID))";
	}
	
	public String getInsertQuery(String tableName) {
		return "INSERT INTO "+tableName+" VALUES (?, ?, ?, ?, ?) ";
	}
	
	public String getRecordUsingNameQuery(String tableName) {
		return "SELECT * FROM "+tableName+" WHERE NAME = ? AND EMPLOYEE_ID = ? ";
	}
	
	public String getRecordsInAscendingQuery(String tableName,String columnName) {
		return "SELECT * FROM "+tableName+" ORDER BY "+columnName+"  LIMIT ?";
	}
	public String getModifyQuery(String tableName) {
		return "UPDATE "+tableName+" SET MOBILE= ? , EMAIL= ? , DEPARTMENT= ? WHERE EMPLOYEE_ID= ?";
	}
	
	public String getFirstNNumberQuery(String tableName) {
		return "SELECT * FROM "+tableName+" LIMIT ? ";
	}
		
	public String getFirstNNumberPojoQuery(String tableName) {
		return "SELECT * FROM "+tableName+" LIMIT ? ";
	}
	
	public String getRecordsInDescendingPojoQuery(String columnName,String tableName) {
		return "SELECT * FROM "+tableName+" ORDER BY "+columnName+" DESC LIMIT ?";
	}
	
	public String getDependentRecordsQuery(String tableName) {
		return "SELECT Employee_list.NAME,"+tableName+".* FROM "+tableName+" INNER JOIN Employee_list ON "
				+ "Employee_list.EMPLOYEE_ID="+tableName+".DEPENDENT_ID WHERE "+tableName+".DEPENDENT_ID=?";
	}
	
	public String getNumberOfRecordsPresentQuery(String tableName,String columnName) {
		return "SELECT COUNT("+columnName+") FROM "+tableName+" WHERE "+columnName+"=?";
	}
	
	public String getNNumberOfDependentQuery(String ids) {
		return "SELECT Employee_list.EMPLOYEE_ID,Employee_list.NAME,DEPENDENT_TABLE.* FROM Employee_list LEFT JOIN"
				+ " DEPENDENT_TABLE ON Employee_list.EMPLOYEE_ID=DEPENDENT_TABLE.DEPENDENT_ID"
				+ " WHERE Employee_list.EMPLOYEE_ID IN ("+ids+")";
	}
	
	public String getDeleteQuery(String tableName) {
		return "DELETE FROM "+tableName+" WHERE EMPLOYEE_ID= ?";
	}
	
	public String getSetDependentDetailsQuery(String tableName) {
		return "INSERT INTO "+tableName+" VALUES(?,?,?,?)";
	}
	
	public void createTable(String query) throws CreatedException {
		
		try (Connection connection=makeConnection()){
			try (PreparedStatement prepStatement=connection.prepareStatement(query)){
				prepStatement.execute();
			}
		}
		  catch (SQLException e) {
			throw new CreatedException("Error occured while executing Prepared Statement",e);
		}
	}
	
	
	public void insertRecords(String query,String id,String name,String mobile,
			String email,String department) throws  CreatedException {
		
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){//pratheep
				try {
					prepStatement.setString(1, id);
					prepStatement.setString(2, name);
					prepStatement.setString(3,mobile);
					prepStatement.setString(4, email);
					prepStatement.setString(5, department);
					prepStatement.execute();
				}catch(SQLException e) {
					throw new CreatedException("Error occured while setting Prepared Statement",e);
				}
			}catch (SQLException e1) {
				throw new CreatedException("Error occured while setting Connection ",e1);
			}
		} 

	public EmployeePOJO getRecordsUsingName(String query,String id,String name) throws CreatedException {
		
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				try {
					prepStatement.setString(1, name);
					prepStatement.setString(2, id);
					try (ResultSet result=prepStatement.executeQuery();){
						return getResultUsingName(result);
					}
				}catch(SQLException e) {
					throw new CreatedException("Error occured while setting Prepared Statement ",e);
				}
			}catch (SQLException e1) {
				throw new CreatedException("Error occured while setting Connection ",e1);
			}	 
	}
	
	private EmployeePOJO getResultUsingName(ResultSet result) throws CreatedException {//returns employeePojo
		EmployeePOJO pojo=new EmployeePOJO();
		try {
			while(result.next()) {
				pojo.setEmployeeID(result.getString(1));
				pojo.setName(result.getString(2));
				pojo.setMobile(result.getString(3));
				pojo.setEmail(result.getString(4));
				pojo.setDepartment(result.getString(5));

			}
		}catch(SQLException e) {
			throw new CreatedException("Error occured while setting pojo",e);
		}
		return pojo;		
	}
	
	public void modifyTableFields(String query,String idObtained,
			String mobileNumber,String email,String department) throws CreatedException {
		
		try(Connection connection=makeConnection()) {
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				try {
					prepStatement.setString(1, mobileNumber);
					prepStatement.setString(2, email);
					prepStatement.setString(3, department);
					prepStatement.setString(4, idObtained);
					prepStatement.execute();
				}catch(SQLException e) {
					throw new CreatedException("Error occured while setting prepared Statement",e);
				}
			}
		} catch (SQLException e1) {
			throw new CreatedException("Error occured while setting Connection ",e1);
		}
			
	}

	public List<Map<String,String>> getRecordsFromTop(String query,int limit) throws CreatedException {
		
		try(Connection connection=makeConnection()) {
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				try {
					prepStatement.setInt(1, limit);
					try(ResultSet result=prepStatement.executeQuery()) {
						return getUsersDetails(result);
					}
				}catch(SQLException e) {
					throw new CreatedException("Error occured while setting prepared Statement",e);
				}
			}
		} catch (SQLException e1) {
			throw new CreatedException("Error occured while setting Connection ",e1);
		}
	}
	
	private List<Map<String,String>> getUsersDetails(ResultSet resultSet) throws CreatedException {
		
		List<Map<String,String>> list=new ArrayList<>();
		
		try (ResultSet result=resultSet){
			ResultSetMetaData meta= result.getMetaData();
			
			while(result.next()) {
				Map<String,String> map=new LinkedHashMap<>();
				list.add(map);
				for(int i=1;i<=meta.getColumnCount();i++) {
					map.put(meta.getColumnName(i), result.getString(i));
				}
			}
			return list;
		}catch(SQLException e) {
			throw new CreatedException("Error occured while setting pojo",e);
		}
	}

	
	public List<EmployeePOJO> getRecordsFromTopPojo(String query,int limit) throws CreatedException {
		
		try(Connection connection=makeConnection()) {
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				 try {
						prepStatement.setInt(1, limit);
						try(ResultSet result=prepStatement.executeQuery()) {
							return getUsersDetailsPojo(result);
						}
					}catch(SQLException e) {
						throw new CreatedException("Error occured while setting prepared Statement",e);

					}
			}
		} catch (SQLException e1) {
			throw new CreatedException("Error occured while setting Connection ",e1);
		}
	}
	

	private List<EmployeePOJO> getUsersDetailsPojo(ResultSet resultSet) throws CreatedException {
		List<EmployeePOJO> list=new ArrayList<>();
		try (ResultSet result=resultSet){
			while(result.next()) {
				EmployeePOJO pojo=new EmployeePOJO();
				list.add(pojo);
				pojo.setEmployeeID(result.getString(1));
				pojo.setName(result.getString(2));
				pojo.setMobile(result.getString(3));
				pojo.setEmail(result.getString(4));
				pojo.setDepartment(result.getString(5));
			}
		}catch(SQLException e) {
			throw new CreatedException("Error occured while setting pojo",e);
		}
		return list;
	}
	
	public void deleteRecord(String query,String id) throws CreatedException {

			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				System.out.println(query);

				prepStatement.setString(1, id);
				System.out.println(prepStatement.toString());
				prepStatement.execute();
			}
			catch(SQLException e) {
				throw new CreatedException("Error occured while setting Prepared Statement",e);
			}
		
	}
	
	public void setDependentDetails(String query, DependentPojo depPojo) throws CreatedException {
		
		try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				prepStatement.setString(1, depPojo.getEmp_Id());
				prepStatement.setString(2, depPojo.getName());
				prepStatement.setInt(3, depPojo.getAge());
				prepStatement.setString(4, depPojo.getRelationship());
				prepStatement.execute();
			}catch(SQLException e) {
				throw new CreatedException("Error occured while setting Prepared Statement",e);
			}		
	}

	public List<Map<String,Object>> getDependentRecords(String id,String query) throws CreatedException {
		
		
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				prepStatement.setString(1, id);
				try (ResultSet result=prepStatement.executeQuery()){
					return getDependentDetails(result);
				}
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new CreatedException("Error occured while setting Prepared Statement",e);
		}
	}

	private List<Map<String,Object>> getDependentDetails(ResultSet dependentResult) throws CreatedException {
		
		List<Map<String,Object>> empList = new ArrayList<>();
		try {
			Map<String,Object> map;
			ResultSetMetaData meta=dependentResult.getMetaData();
			while(dependentResult.next()) {
				map=new LinkedHashMap<>();
				for(int i=1;i<=meta.getColumnCount();i++) {
					map.put(meta.getColumnName(i), dependentResult.getString(i));
				}
				empList.add(map);
			}
		}catch(SQLException e) {
			throw new CreatedException("Error occured while setting values from table",e);
		}
		return empList;
	}
	
	public int getNumberOfRecordsPresent(String query, String id) throws CreatedException {
		int count=0;
			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				prepStatement.setString(1, id);
				try (ResultSet result=prepStatement.executeQuery()){
					while(result.next()) {
						count=result.getInt(1);
					}
				}
		}
		catch(SQLException e) {
			throw new CreatedException("Error occured while getting the specific number of records present in the table",e);
		}
		
		return count;
	}

	public List<Map<String,Object>> getNNumberOfDependent(String limit,String query ) throws CreatedException {

			try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
				try (ResultSet result=prepStatement.executeQuery()){
					return getDependentDetails(result);
				}
		}catch(SQLException e) {
			throw new CreatedException("Error occured while setting Prepared Statement",e);
		}
	}
	
	public String getNumberOfDependentRowQuery() {
		return "SELECT EMPLOYEE_ID FROM Employee_list ORDER BY EMPLOYEE_ID LIMIT ?";
	}
	public List<String> getNumberOfDependentRow(int limit,String query) throws CreatedException{
		List<String> list=new ArrayList<>();
		try (PreparedStatement prepStatement=makeConnection().prepareStatement(query)){
			prepStatement.setInt(1, limit);
			prepStatement.execute();
			
			try (ResultSet result=prepStatement.executeQuery()){
				
				while(result.next()) {
					list.add(result.getString(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list; 
	}
}