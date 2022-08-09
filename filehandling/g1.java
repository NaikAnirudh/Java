package com.java.training.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class g1 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\files\\g2.txt");
		file.createNewFile();
	   System.out.println(file.canExecute());
	   System.out.println(file.canRead());
	   System.out.println(file.getName());
	   
    try (FileReader fr = new FileReader("D:\\files\\g2.txt")) {
		System.out.println(fr.read());
	}
	}

}
