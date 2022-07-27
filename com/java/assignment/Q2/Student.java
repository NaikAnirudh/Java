package com.java.assignment.Q2;

/**
 * CLass "Student" stores the Name, Program, Address, Year and Fee details of
 * the Student
 */
public class Student extends Person {

	String program;
	int year;

	public Student(String name, String program, String address, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	double fee;

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

	/**
	 * Using the main method for passing the Student and Staff details
	 */
	public static void main(String[] args) {
		Student std_details = new Student("Mahesh", "Java Full Stack", "Bengaluru", 2022, 25000);
		Staff staff_details = new Staff("Unacademy", "bang", "Shidhar", 60000.00);
		System.out.println("\n"+std_details+ "\n");
		System.out.println(staff_details);
	}

}
