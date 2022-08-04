package com.java.training.arraylist;

import java.util.*;

/**
 * Creating a vector to understand Capacity Increment.
 */
public class Animals {

	public static void main(String[] args) {
		// creating a vector with initial capacity of 3.
		Vector<String> animals = new Vector<String>(3);
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Fox");
		animals.add("Cheetah");

		// Checking the size and capacity of the vector.
		System.out.println("Size of the Vector:" + animals.size());
		System.out.println("Default capacity of the Vector:" + animals.capacity());
		System.out.println("Animals in the vector are:" + animals);

		animals.add("Elephant");
		animals.addElement("Brown Bear");
		animals.addElement("Deer");
		animals.addElement("Black Panther");

		// Checking the size and capacity of the vector.
		System.out.println("Size of the Vector:" + animals.size());
		System.out.println("Updated capacity of the Vector:" + animals.capacity());
		System.out.println("Animals in the vector are:" + animals);

		// to check if an element is present in the Vector
		if (animals.contains("Cheetah")) {
			System.out.println("Cheetah is present in the index :" + animals.indexOf("Cheetah"));
		} else {
			System.out.println("Animals not present!!");
		}

		// To get the first element of the vector.
		System.out.println("The first animal in the Vector is :  " + animals.firstElement());
		// to get the last element of the vector.
		System.out.println("The last animal in the Vector is : " + animals.lastElement());

	}
}

/* OUTPUT:
*Size of the Vector:4
Default capacity of the Vector:6
Animals in the vector are:[Lion, Tiger, Fox, Cheetah]
Size of the Vector:8
Updated capacity of the Vector:12
Animals in the vector are:[Lion, Tiger, Fox, Cheetah, Elephant, Brown Bear, Deer, Black Panther]
Cheetah is present in the index :3
The first animal in the Vector is :  Lion
The last animal in the Vector is : Black Panther
*/