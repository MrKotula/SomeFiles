package com.itProgerMain;

public class Mercedes extends Car {

	boolean isMaibach;
	
	Mercedes(boolean isMaibach, String model, float weight, String color, int speed, boolean isWork){
		super(model, weight, color, speed, isWork);
		this.isMaibach = isMaibach;
	}

	@Override
	public void printAll() {
		super.printAll();
		String isMaibach = this.isMaibach ? "is" : "is not";
		System.out.println("Car " + super.model + " " + isMaibach + " Maibach");
		super.drive.isDriveCar();
			}

	
	@Override
	public void startEngine() {
		System.out.println("Engine is starting by button");
		
	}
		
}
