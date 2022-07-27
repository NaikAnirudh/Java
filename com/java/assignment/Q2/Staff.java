package com.java.assignment.Q2;

/**
 * The class "Staff" Stores the Name, Address and salary details of the staff.
 */
public class Staff extends Person {

	String school;
	double pay;

	public Staff(String school, String address, String name, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff: school=" + school + ", pay=" + pay + "Rupee";
	}
}
