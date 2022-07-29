package com.java.training.program08;

import lombok.Data;
/**
 * Implementing "java.io.Serializable"
 * All the fields of the class "Employee" can be written to file after being converted to stream of bytes.
 */
@Data
public class Employee implements java.io.Serializable {

	  private int empId;
	  private int empexp;
	  private String empName;
	  private transient String empStatus;
	  private transient double empslry;
	  
	public Employee(int empId, int empexp, String empName, String empStatus, double empslry) {
		super();
		this.empId = empId;
		this.empexp = empexp;
		this.empName = empName;
		this.empStatus = empStatus;
		this.empslry = empslry;
	}
	  
	 
}
