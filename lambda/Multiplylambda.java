package com.java.training.lambda;

/**
 * Using Lambda function to implement Functional interface.
 */
public class Multiplylambda {

	public static void main(String[] args) {
		Multiply product = (num1, num2) -> num1 * num2;
		System.out.println("The Product of the two numbers is: " + product.multi(55, 12));

	}
}



/*OUTPUT:
The Product of the two numbers is: 660
*/