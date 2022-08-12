package com.java.training.java8;

import java.util.Optional;
/**
 * Creating a class to implement Optional class. 
 */
public class OptionalClass {

	public static void main(String[] args) {

		Integer num1 = null;
		Integer num2 = new Integer(20);
		
        /**
         * Using ofNullable() to return empty Optional if the object has no value.
         */
		Optional<Integer> ref1 = Optional.ofNullable(num1);

		Optional<Integer> ref2 = Optional.of(num2);
		System.out.println(OptionalClass.sum(ref1, ref2));
	}

	public static Integer sum(Optional<Integer> ref1, Optional<Integer> ref2) {

		/**
		 * Using .isPresent() to check if the returned Optional value is empty or non-empty.
		 */
		System.out.println("The first number: " + ref1.isPresent());
		System.out.println("The Second number: " + ref2.isPresent());

		/**
		 * Using .get() to get the value returned by the Optional class.
		 */
		Integer num1 = ref1.orElse(new Integer(10));
		Integer num2 = ref2.get();
		return num1 + num2;
	}
}

/*OUTPUT:
The first number: false
The Second number: true
30
*/