package com.itProgerMain;

public abstract class Car {
	
	protected String model;
	private float weight;
	private String color;
	private int speed;
	private boolean isWork;
	
		class Driving {
			boolean isDrive;
			public Driving(boolean isDrive) {
				this.isDrive = isDrive;
			}
			
			public Driving() {
				
			}
			
			public void isDriveCar() {
				String isDrive = this.isDrive ? "Car is move" : "Car is stop";
				System.out.println(isDrive);
			}
			
			
		}
	
		Driving drive = new Driving(true);
		
	Car(){
		System.out.println("Object is created!");
	}
	
	Car(String model, float weight, String color, int speed, boolean isWork){
		this.model = model;
		this.weight = weight;
		this.color = color;
		this.speed = speed;
		this.isWork = isWork;
		printAll();
	}
	
	public void setAll(String model, float weight, String color, int speed, boolean isWork) {
		this.model = model;
		this.weight = weight;
		this.color = color;
		this.speed = speed;
		this.isWork = isWork;
	}
	
	public void printAll() {
		String isWork = this.isWork ? "working" : "doesn't work";
		System.out.println("Car model: " + this.model + " has weight " + this.weight + ", color - " + this.color + " and speed " + this.speed + " km and this time " + isWork);
	}

	public static void printTest() {
		System.out.println("Print test!");
	}
	
	public abstract void startEngine();
	
	
}
