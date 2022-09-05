package com.itProgerMain;

public class Main {

	public static void main(String[] args) {
				
		Mercedes mer = new Mercedes(true, "S500", 3458.47f, "Blue", 325, true);
		mer.printAll();
		mer.startEngine();
		Car.printTest();
		
		Audi obj = new Audi() {
			private boolean isDrive;
			public void setIsDrive() {
				this.isDrive = true;
				}
			public void printAll() {
				System.out.println(isDrive);
			}
		};
		obj.printAll();
		obj.setIsDrive();
		obj.printAll();
		
	}
	public static class Audi {
		public void setIsDrive() {}
		public void printAll() {}
		}
}
