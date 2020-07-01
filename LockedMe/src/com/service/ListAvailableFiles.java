package com.service;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//This class is used to view all the available files in the src/com/files directory
public class ListAvailableFiles {
	
	public void listFile() {
	
		File filePath = new File("./src/com/files");
		List<String> files = Arrays.asList(filePath.list());
		//Sorting files in ascending order
		System.out.println("Files Names (in ascending order)");
		Collections.sort(files);
		if(files.size()>0) {
			for(String file: files) {
				System.out.println(file);
		}
		}
		else {
			System.out.println("No files are available");
		}
		
	}

}
