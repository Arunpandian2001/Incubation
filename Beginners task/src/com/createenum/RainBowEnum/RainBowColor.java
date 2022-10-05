package com.createenum.RainBowEnum;

public enum RainBowColor {

	VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
	
	public int value;
	
	RainBowColor(int value){
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	
}
