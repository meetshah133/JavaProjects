package com.service;
import java.io.File;
import java.util.Scanner;
public class DeleteFile {
	//Method to delete existing file.
	public void fileDeletion() {
		System.out.print("Enter the name of file to be deleted: ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		String filePath = "./src/com/files"; 
		File myFile = new File(filePath, fileName); 
	    if (myFile.delete()) { 
	      System.out.println("Deleted the file: " + fileName);	      
	    } else {
	      System.out.println("File doesnot exist");
	    } 
	}

	
}
