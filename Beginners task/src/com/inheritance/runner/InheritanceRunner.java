package com.inheritance.runner;
import java.util.Scanner;

import com.inheritance.methods.SCross;
import com.inheritance.methods.Swift;
import com.inheritance.methods.XUV;
import com.inheritance.methods.Duck;
public class InheritanceRunner {
	static Scanner input=new Scanner(System.in);
	static Swift swift=new Swift();
	static SCross scross=new SCross();
	//static XUV xuv=new XUV();
	
	/*private void swiftFunction() {
		System.out.println("Enter the no.of airbags in Swift car:");
		swift.setAirbags(input.nextInt());
		System.out.println("Enter the no.of seats in Swift car:");
		swift.setSeats(input.nextInt());
		System.out.println("Enter the color of Swift car:");
		swift.setColor(input.next());;
		System.out.println("Enter the Model of Swift car:");
		input.nextLine();
		swift.setModel(input.nextLine());
		System.out.println("The airbags present in Swift car is ::"+swift.getAirbags());
		System.out.println("The color of the Swift car is "+swift.getColor());
		System.out.println("The model of the Swift car is:: "+swift.getModel());
		System.out.println("The no.of seats in Swift car:: "+swift.getSeats());
	}*/
	
	/*private void sCrossFunction() {
		System.out.println("Enter the no.of airbags in SCross car:");
		scross.setAirbags(input.nextInt());
		System.out.println("Enter the no.of seats in scross car:");
		scross.setSeats(input.nextInt());
		System.out.println("Enter the color of scross car:");
		scross.setColor(input.next());;
		System.out.println("Enter the Model of scross car:");
		input.nextLine();
		scross.setModel(input.nextLine());
		System.out.println("Enter the Manufacturing year:");
		scross.setYearOfMake(input.nextInt());
		System.out.println("Enter the type of scross car:");
		scross.setType(input.next());;
		System.out.println("Enter the Engine number of scross car:");
		input.nextLine();
		scross.setEngineNumber(input.nextLine());
		System.out.println("The airbags present in scross car is ::"+scross.getAirbags());
		System.out.println("The color of the scross car is ::"+scross.getColor());
		System.out.println("The model of the scross car is:: "+scross.getModel());
		System.out.println("The no.of seats in scross car:: "+scross.getSeats());
		System.out.println("The Manufacturing area of scross car:: "+scross.getYearOfMake());
		System.out.println("The type of scross car:: "+scross.getType());
		System.out.println("The Engine number in scross car:: "+scross.getEngineNumber());

	}*/
	
	/*private void invokeFunction(Car car) {
		
	
		System.out.println("Enter the Manufacturing year:");
		car.setYearOfMake(input.nextInt());
		System.out.println("Enter the type of car:");
		car.setType(input.next());;
		System.out.println("Enter the Engine number of car:");
		input.nextLine();
		car.setEngineNumber(input.nextLine());
		System.out.println("The Manufacturing area of car:: "+car.getYearOfMake());
		System.out.println("The type of car:: "+car.getType());
		System.out.println("The Engine number in car:: "+car.getEngineNumber());
		if(car.instanceOf(swift)) {
			System.out.println("Hatch");
		}
		else if(car==scross) {
			System.out.println("Sedan");
		}
		else if(car==xuv) {
			System.out.println("SUV");
		}

	}*/
	/*private void invokeSwift(Swift swiftobj) {
		
		
			System.out.println("Enter the no.of airbags in Swift car:");
			swift.setAirbags(input.nextInt());
			System.out.println("Enter the no.of seats in Swift car:");
			swift.setSeats(input.nextInt());
			System.out.println("Enter the color of Swift car:");
			swift.setColor(input.next());;
			System.out.println("Enter the Model of Swift car:");
			input.nextLine();
			swift.setModel(input.nextLine());
			System.out.println("The airbags present in Swift car is ::"+swift.getAirbags());
			System.out.println("The color of the Swift car is "+swift.getColor());
			System.out.println("The model of the Swift car is:: "+swift.getModel());
			System.out.println("The no.of seats in Swift car:: "+swift.getSeats());
		
	}*/
	public static void main(String[] args) {
		
		InheritanceRunner tester=new InheritanceRunner();
		
		//tester.swiftFunction();//2
		//tester.sCrossFunction();//3
		//tester.invokeFunction(scross);//4&5
		//Car obj=new Swift();//6-1
		//tester.invokeSwift(scross);6-2,3
		//scross.maintanence();//7-1
		/*Car obj=new SCross();
		obj.maintanence();*///7-2
		/*Car obj=new Car();
		obj.maintanence();*///7-3
		/*Swift obj=new Swift();
		obj.maintanence();*///7-4
		/*XUV xuv=new XUV();
		XUV xuv1=new XUV("hI ALL");*///8-1,2
		/*BirdAbstract bird=new BirdAbstract();
		ParrotMod parrot=new ParrotMod();
		parrot.fly();
		parrot.speak();*///9-1,2
		Duck duck=new Duck();
		duck.fly();
		//duck.speak();
		System.out.println();
		
	}



}
