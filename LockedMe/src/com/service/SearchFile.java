package com.service;
import java.io.File;
import java.util.Scanner;


public class SearchFile {
	
	//Method to search for a user specified file
		public void search() {
			System.out.println("Enter the name of file to be searched: ");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.nextLine();
			File filePath = new File("./src/com/files");
			File myFile = new File(filePath, fileName);
			if(myFile.exists()) {
				System.out.println(fileName + " is available.");
			}
			else {
				System.out.println(fileName + " is not available.");
			}
		}
}
