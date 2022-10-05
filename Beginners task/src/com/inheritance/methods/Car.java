package com.inheritance.methods;

public class Car {
	int yearOfMake=0;
	String engineNumber="";
	String type="";
	
	public int getYearOfMake() {
		return yearOfMake;
	}
	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void maintanence() {
		System.out.println("Car under maintanence");
	}
	Car(){}
	 Car(String message) {
		System.out.println(message);
	}
}
