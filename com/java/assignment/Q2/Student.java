package com.java.assignment.q2;

/**
 * CLass "Student" stores the Name, Program, Address, Year and Fee details of
 * the Student
 */
public class Student extends Person {

	private String program;
	private int year;
	private double fee;

	public Student(String name, String program, String address, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}


	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student :Name= " + name + ", Program= " + program + ", Year= " + year + ", Fee= " + fee + "Rupee";
	}

}
