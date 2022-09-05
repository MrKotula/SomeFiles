package com.itProgerMain;

public class MainItProger {

	public static void main(String[] args) {
		
		String str = "Vaiable - ";
		
		byte num1 = 127;
		short num2 = 256;
		int num3 = 1546;
		long num4 = 1520045455;
		System.out.println(str + "byte(8): " + num1);
		System.out.println(str + "shor(16): " + num2);
		System.out.println(str + "int(32): " + num3);
		System.out.println(str + "long(64): " + num4);
		
		float num1f = 12.5f;
		double num2d = 18.235d;
		System.out.println(str + "float: " + num1f + str + " double: " + num2d);
		
		boolean haveCar = true;
		System.out.println(str + haveCar);
		
		char sym = '&';
		System.out.println(str + sym);
	}
}
