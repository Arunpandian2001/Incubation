package com.inheritance.methods;

public class SCross extends Car{
	
	int seats=0;
	int airbags=0;
	String model="";
	String color="";
	
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getAirbags() {
		return airbags;
	}
	public void setAirbags(int airbags) {
		this.airbags = airbags;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void maintanence () {
		System.out.println("Maruti SCross under maintenance");
	}
}

