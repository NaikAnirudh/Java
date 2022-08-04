package com.java.training.hastable;

import java.util.*;

public class HashtAble {

	public static void main(String[] args) {

		Hashtable<Integer, String> list1 = new Hashtable<Integer, String>();
		list1.put(01, "Alpha");
		list1.put(02, "Beta");
		list1.put(03, "Delta");

		Hashtable<String, String> list2 = new Hashtable<String, String>();
		list2.put(list1.get(01), "Lion");
		list2.put(list1.get(02), "Wolf");
		list2.put(list1.get(03), "Hyena");

		System.out.println("Hierarchy of list1: " + list1);
		System.out.println("Corresponding animals: " + list2);
	}
}

/*
 * OUTPUT: Hierarchy of list1: {3=Delta, 2=Beta, 1=Alpha} 
 * Corresponding animals:{Alpha=Lion, Delta=Hyena, Beta=Wolf}
 */