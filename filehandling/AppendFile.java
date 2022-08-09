package com.java.training.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		try (FileWriter fw = new FileWriter("D:\\files\\g1.txt", true); BufferedWriter bw = new BufferedWriter(fw))

		{
			bw.write("\n New Text Appended ");

			bw.write("Appending successfull!!!");

		} catch (IOException e) {
			System.out.println("Invalid Input!!");
		}
		BufferedReader bufferr1 = new BufferedReader(new FileReader("D:\\files\\g1.txt"));

		System.out.println(bufferr1.readLine());
		String Details = null;
		while ((Details = bufferr1.readLine()) != null) {
			System.out.println(Details);
		}
		bufferr1.close();
	}
}
