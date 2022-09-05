package com.itProgerMain;

import java.util.Scanner;
public class WorkWithMethods {

	public static void main(String[] args) {
	
		String[] names = new String[3];
		String[] surnames = new String[3];	
		int[] ages = new int[3];
		
		makeArr(names);
		makeArr(surnames);
		makeArr(ages);
		printArray(names, "Names");
		System.out.println(" ");
		printArray(surnames, "Surnames");
		System.out.println(" ");
		printArray(ages, "Ages");
		System.out.println(" ");
		printArray("Hello my friends!");
		int suma = suma(5, 9, 4);
		System.out.println(suma);
	}

	
	public static String[] makeArr(String[] arr) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Please, input " + (i + 1) + " element: ");
			arr[i] = in.nextLine();
		}
		return arr;
	}
	
	public static int[] makeArr(int[] arr) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Please, input " + (i + 1) + " element: ");
			arr[i] = in.nextInt();
		}
		return arr;
	}
	
	public static void printArray(String[] arr, String title) {
		System.out.println(title + ":");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Values of arrays: " + arr[i]);
		}
	}
	
	public static void printArray(int[] arr, String title) {
		System.out.println(title + ":");
		for(Integer el : arr) {
			System.out.println("Values of arrays: " + el);
		}
	}
	
	public static void printArray(String word) {
					System.out.println(word);
		}
	
	public static int suma(int a, int b, int c) {
		int res = a + b + c;
		return res;
	}
	
	
	
}
