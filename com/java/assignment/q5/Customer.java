package com.java.assignment.q5;
/**
 * The Class "Customer" contains the membership details of the customer 
 */
public class Customer {

	private String name;
	public boolean member = false;
	public String memberType;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public boolean isMember() {
		return member;

	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(boolean member) {
		this.member = member;
	}

	public void setMemberType(String type) {
		this.memberType = type;
	}

	@Override
	public String toString() {
		return "Customer Name=" + name + ", Member=" + member + ", MemberType=" + memberType;
	}
}
