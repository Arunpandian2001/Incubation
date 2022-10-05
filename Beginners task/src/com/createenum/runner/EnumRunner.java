package com.createenum.runner;
import com.createenum.RainBowEnum.RainBowColor;
import java.util.Scanner;
public class EnumRunner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		RainBowColor[] colors=RainBowColor.values();
//		
		
		System.out.println("Enter the color ::");
		String find=input.next();
		for(RainBowColor color:colors ) {
			if(color.toString().equalsIgnoreCase(find)) {
				System.out.println(color.getValue());
			}
		}
		input.close();
	}

}
