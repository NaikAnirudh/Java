package com.java.training.lambda;

/**
 * Accessing Default method in the implementation class.
 */
public class DefaultMain implements Default {

	public void method2(String str) {
		System.out.println("The string in method 2 is : " + str);
	}

	public static void main(String[] args) {
		DefaultMain obj = new DefaultMain();

		obj.method1();

		obj.method2("This is abstract method");
	}

}

/*
 * OUTPUT: This is Default method!!! The string in method 2 is : This is
 * abstract method
 */