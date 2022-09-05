package com.itProgerMain;

import java.util.Scanner;

public class WorkWithScanner {
	
		public static void main(String[] args) {
		
		byte num = 65;
		switch(num) {
		case 1:
			System.out.println("Variable is equals 1");
			break;
		case 12:
			System.out.println("Variable is equals 12");
			break;
		case 6:
			System.out.println("Variable is equals 16");
			break;
		case 13:
			System.out.println("Variable is equals 13");
			break;
		case 18:
			System.out.println("Variable is equals 18");
			break;
			default:
				System.out.println("Variable is not found!");
		}
			
			byte a = 4, b = 5;
			int res = a > b ? (a + b) : (a - b);
			System.out.println(res);
			
			Scanner in = new Scanner(System.in);
				
		System.out.print("Please input your age: ");
		int age = in.nextInt();
		System.out.print("Are you with parents? ");
		boolean isParents = in.nextBoolean();
		if(age < 18) {
			if(age >= 10 && age <= 15)
				System.out.println("Your age from 10 to 15! You need parents!");
			else if((age == 7 || age == 9) && !isParents)
				System.out.println("Your's entrance for free");
		}else if(age == 18)
			System.out.println("You are 18!");
		else if(age == 19)
			System.out.println("You are 19!");
			else {
			if(age >= 50)
				System.out.println("Are are old");
			}
}			
}