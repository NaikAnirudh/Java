package com.java.training.treemap;

import java.util.*;

/**
 * Using TreeMap to show the Automatic sorting of elements in ascending order.
 */
public class Employee {

	public static void main(String[] args) {
		TreeMap<Integer, String> emp = new TreeMap<Integer, String>();
		// Elements added in random order.
		emp.put(109, "Lohith");
		emp.put(102, "Gireesh");
		emp.put(110, "Jeevan");
		emp.put(107, "Anirudh");

		//retrieving the data using iterator.
		Set set = emp.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry details = (Map.Entry) iterator.next();
			System.out
					.println("The Employee ID is: " + details.getKey() + "   The Employee Name is: " + details.getValue());
		}
	}
}




/**
 * This output shows the sorted data!!
 */
/*
 The Employee ID is: 102   The Employee Name is: Gireesh
The Employee ID is: 107   The Employee Name is: Anirudh
The Employee ID is: 109   The Employee Name is: Lohith
The Employee ID is: 110   The Employee Name is: Jeevan
 */