package com.java.assignment.q2;

/**
 * The class "Person" is appointed as Super Class for the Class "Staff" and "Student".  
 * Stores the Name and Address of the person
 */
public class Person {

	protected String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [getName()=" + getName() + "getAddress()=" + getAddress() + "]";
	}
}
