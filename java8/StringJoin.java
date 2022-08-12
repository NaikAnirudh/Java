package com.java.training.java8;

import java.util.StringJoiner;

/**
 * Creating a class to implement string joiner's characteristics.
 */
public class StringJoin {

	public static void main(String[] args) {
		StringJoiner str1 = new StringJoiner("->");

		str1.add(" Chairman");
		str1.add(" Vice-President");
		str1.add(" Board Of Directors");
		str1.add(" Chief Executive Officer");

		int len = str1.length();
		System.out.println(str1);
		System.out.println("Length of the string: " + len);
	}
}


/*OUTPUT:
Chairman-> Vice-President-> Board Of Directors-> Chief Executive Officer
Length of the string: 73
*/