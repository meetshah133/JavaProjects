package com.service;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class AddFile {
	
	//Method to check if add new file
	public void addFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of file to be created: ");
		String fileName = sc.nextLine();
		File filePath = new File("./src/com/files");
		File myFile = new File(filePath,fileName);
		if(myFile.exists()) {
			System.out.println(fileName + " already exist.");
			System.out.println("Press 1 to overwrite file or press any other key to return to sub menu.");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice==1) {
				createFile(myFile,fileName);
			}
		}
		else {
			createFile(myFile,fileName);
		}
		
	}
	//Method to create a new file using FileWriter
	public void createFile(File myFile,String fileName) throws IOException {
		FileWriter newFile = new FileWriter(myFile);
		System.out.println("Enter the content of file: ");
		Scanner sc = new Scanner(System.in);
		String fileContent = sc.nextLine();
		newFile.write(fileContent);
		newFile.close();
		System.out.println(fileName + " created successfully");
	}
		
			
}
