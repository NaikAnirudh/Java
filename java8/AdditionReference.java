package com.java.training.java8;

import java.util.function.BiFunction;
/**
 *Using class "AdditionReference" 
 */
public class AdditionReference {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> addition = Operation::add;
		int result = addition.apply(50, 10);
		System.out.println("Sum of the numbers is : " + result);
	}
}


/*OUTPUT:
*Sum of the numbers is : 60
*/
