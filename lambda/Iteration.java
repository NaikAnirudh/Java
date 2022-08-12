package com.java.training.lambda;

import java.util.*;

/**
 * Using Lambda function to iterate through the list.
 */
public class Iteration {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Anirudh");
		list.add("Lohith");
		list.add("Jeevan");
		list.add("Gireesh");
		list.forEach((names) -> System.out.println(names));
	}

}

/*OUTPUT:
Anirudh
Lohith
Jeevan
Gireesh
*/