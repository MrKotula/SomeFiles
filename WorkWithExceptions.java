package com.itProgerMain;

public class WorkWithExceptions {

	public static void main(String[] args) {
		float[] arr = new float[] {15.5f, 19.4f, 17.3f};
		
		try {
			System.out.println(arr[2]);
			int res = 100/0;
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}finally {
			System.out.println("The block worked finnaly");
		}
	}

}
