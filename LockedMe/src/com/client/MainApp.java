package com.client;
import java.io.IOException;
import java.util.Scanner;
import com.service.*;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Meet Shah");
		Scanner sc = new Scanner(System.in);
		boolean continueIteration = true;
		
		while(continueIteration) {
			System.out.println("_____________________________________");
			System.out.println("Main Menu");
			System.out.println("1. View all available files");
			System.out.println("2. Perform operations on files");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice=0;
			try {
				choice = Integer.parseInt(sc.nextLine());
			   }
			catch(Exception e) {
			System.out.println("Please enter a correct choice");
			}
			System.out.println("_____________________________________");
			switch(choice) {
			case 1:
				//viewFile
				ListAvailableFiles lfObj = new ListAvailableFiles();
				lfObj.listFile();
				break;
			
			case 2:
				boolean continueLoop = true;
				while(continueLoop) {
					System.out.println("Menu");
					System.out.println("1. Add a new file");
					System.out.println("2. Delete an existing file");
					System.out.println("3. Search for file");
					System.out.println("4. Go back to main menu");
					System.out.print("Enter your choice: ");
					
					int subChoice=0;
					try {
						subChoice = Integer.parseInt(sc.nextLine());
						}
					catch(Exception e) {
						System.out.println("Please enter a proper choice");
					}
					switch(subChoice){
					case 1: 
						AddFile afObj = new AddFile();
						try {
								afObj.addFile();
							}
						catch(IOException e) {
							System.out.println("Failed to create new file");
						}
						break;
					case 2: 
						DeleteFile dfObj = new DeleteFile();
						dfObj.fileDeletion();
						break;
					case 3: 
						SearchFile sfObj = new SearchFile();
						sfObj.search();
						break;
					case 4:
						continueLoop = false;
						break;
					default:
						System.out.println("Wrong choice entered!!");
						
						}
					}
				break;
			case 3:
				System.out.println("Good Bye");
				continueIteration = false;
				break;
			default:
				System.out.println("Wrong choice entered!!");
			
			
		}
		
		
		
	}

}
}
