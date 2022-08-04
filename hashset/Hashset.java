package com.java.training.hashset;

import java.util.*;

/**
 * using HashSet to store and perform a few methods on the HashSet.
 */
public class Hashset {

	public static void main(String args[]) {
		//HashSet<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		set.add("Anirudh");
		set.add("Lohith");
		set.add("Jeevan");
		set.add("Gireesh");
		set.add("Johnny");

		// HashSet allows to store duplicate values.
		set.add("Lohith");
		System.out.println("An initial list of Names: " + set);

		// Removing specific element from HashSet.
		set.remove("Johnny");
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Bharath");
		set1.add("Shubra");
		set.addAll(set1);
		System.out.println("Updated List: " + set);

		// Removing all the new elements from HashSet.
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);

		// Removing elements on the basis of specified condition.
		set.removeIf(str -> str.contains("Anirudh"));
		System.out.println("After invoking removeIf() method: " + set);
		
		//
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(set);
		System.out.println("Linked Hash Set: \n" + lhs);


		//Conversion of HashSet to TreeSet to check the Sorting of Elements.
		TreeSet<String> st1r = new TreeSet<String>(set);
		System.out.println("New TreeSet:\n" + st1r);
		
		// Removing all the elements available in the set.
		set.clear();
		System.out.println("After invoking clear() method: " + set);

	}
}



/*
 * OUTPUT:
 * An initial list of Names: [Anirudh, Lohith, Johnny, Gireesh, Jeevan]
After invoking remove(object) method: [Anirudh, Lohith, Gireesh, Jeevan]
Updated List: [Bharath, Shubra, Anirudh, Lohith, Gireesh, Jeevan]
After invoking removeAll() method: [Anirudh, Lohith, Gireesh, Jeevan]
After invoking removeIf() method: [Lohith, Gireesh, Jeevan]
Linked Hash Set: 
[Lohith, Gireesh, Jeevan]
New TreeSet:
[Gireesh, Jeevan, Lohith]
After invoking clear() method: []

 */