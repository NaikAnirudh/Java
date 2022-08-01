package com.java.training.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A program to demonstrate various methods to manipulate String with the
 * implementation of regex.
 */
public class StringMethods {

	public static void main(String[] args) {
		String[] str1 = { "ani", "lohith", "jeevan" };
		String[] str2 = { "ANI", "LOHITH", "JEEVAN" };
		String str3 = "ANirUdH";
		String str4 = "aNiRuDh";
		// str1.equals(str2) to compare the 2 Strings.
		boolean res1 = str1.equals(str2);
		// equalsIgnoreCase() to compare 2 strings by ignoring case.
		boolean res2 = str3.equalsIgnoreCase(str4);
		// .substring() to print a specific substring of a string.
		System.out.println("Sub String Of str3: " + str3.substring(2, 6));
		System.out.println(res1);
		System.out.println(res2);

		String[] sports = { "Cricket", "Basketball", "Football", "Badminton", "Tennis" };
		// Arrays.sort(); to sort the array elements alphabetically.
		Arrays.sort(sports);
		// Arrays.toString() returns the string representation of the object "sports".
		System.out.println("Sorted Sports" + Arrays.toString(sports));

		// Pattern Class - Defines a pattern (to be used in a search),
		// Matcher Class - Used to search for the pattern.
		Pattern pattern = Pattern.compile("ESCAPE", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Fire Escape plan???");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}

	}
}



/*OUTPUT:
 * Sub String Of str3: irUd
false
true
Sorted Sports[Badminton, Basketball, Cricket, Football, Tennis]
Match found
 */
 
