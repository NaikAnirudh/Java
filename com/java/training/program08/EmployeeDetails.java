package com.java.training.program08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * using FileOutputStream and ObjectOutputStream to write the object to File.
 * writing the fields to the file "Employee.ser"
 */
public class EmployeeDetails {

	public static void main(String args[]) {
		Employee obj = new Employee(646, 4, "Lohith", "Full-Time", 7.5);
		try {
			FileOutputStream fos = new FileOutputStream("Employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("Serialization Done!!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}
