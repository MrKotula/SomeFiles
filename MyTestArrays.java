package com.itProgerMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyTestArrays {

	public static void main(String[] args) {
		
		byte[] nums = new byte [5];
		nums[0] = 48;
		nums[1] = 8;
		nums[2] = 89;
		nums[3] = 123;
		nums[4] = 1;
		
		byte[] new_nums = Arrays.copyOf(nums, nums.length);
		Arrays.sort(new_nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(new_nums));
		
		String [] names = new String[] {"Bohdan", "Taras", "Andrey"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		int[][] numbers = new int[][] {
			{15, 22, 33, 55, 6},
			{18, 24, 6, 5},	
			{78, 5, 22, 16}};
			System.out.println(Arrays.deepToString(numbers));
		
			
			ArrayList<Integer> num_arr = new ArrayList<>(0);
			num_arr.add(15);
			num_arr.add(25);
			num_arr.add(3);
			num_arr.add(75);
			num_arr.add(14);
			num_arr.set(3, 65);
			System.out.println(num_arr.get(3) + " " + num_arr.get(4));
			
			
			LinkedList<String> str_arr = new LinkedList<>();
			str_arr.add("Hello");
			str_arr.add("Hi");
			str_arr.add("World!");
			str_arr.add("From");
			System.out.println(str_arr.get(0) + " " + str_arr.get(2));
			System.out.println("Str_arr have size: " + str_arr.size());
			System.out.println("Num_arr have size: " + num_arr.size());
	}

}
