package com.itProgerMain;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycles {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		int user_input;;
		do{
			System.out.print("Input number 5!");
			user_input = in.nextInt();
		}while(user_input != 5);
		System.out.println("Yes!!!You are right!");*/
		
		int x = 0;
		while(x < 10) {
			if(x == 5)
				break;
			if(x % 2 == 0) {
			x++;
			continue;
			}
			System.out.println("Element: " + x);
			x++;
		}
		
		ArrayList<String> names = new ArrayList<>(0);
		names.add("Tomas");
		names.add("Roman");
		names.add("Will");
		names.add("Conan");
		names.add("BlackBird");
			for(String el : names) {
				System.out.println("Name: " + el);
			}
		
		
		int[][] arr = new int[][] {
			{12, 3, 55, 78, 32},
			{22, 36, 18, 55}, 
			{55, 78, 56, 22}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
			System.out.println(" ");
		}
		
		float j = 1;
		while(j < 130) {
			System.out.println("Variable j: " + j);
			j *= 5;
		}
		
		
		
		
	}
}

