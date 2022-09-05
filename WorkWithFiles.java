package com.itProgerMain;

import java.io.*;
import java.util.Scanner;

public class WorkWithFiles {
	
	public static void main(String[] args) {
		
		File file = new File("text.txt");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(readFile());
		String context = readFile();
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(file);
			System.out.print("Please, input some text: ");
			String user_text = in.nextLine();
			context += user_text;
			pw.println(context);
			
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
public static String readFile() {
		BufferedReader br = null;
		String result = "";
		try {
			br = new BufferedReader(new FileReader("text.txt"));
			String line;
			while((line = br.readLine()) != null) {
					result += line + "\n";
			}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return result;
			}
		

}

