package com.java.training.arraylist;

import java.util.*;

/**
 * Performing different methods on ArrayList.
 */
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> Avengers = new ArrayList<String>();
		//adding elements to the ArraList.
		Avengers.add("Captain America");
		Avengers.add("IronMan");
		Avengers.add("Thor");
		Avengers.add("Hulk");
		Avengers.add("HawkEye");
		System.out.println("----Original Avengers----");
		// Iterating through the ArrayList using Advanced for loop.
		for (String str : Avengers)
			System.out.println(str);
        //Adding elements to specific index.
		Avengers.add(0, "Captain Marvel");
		Avengers.add(Avengers.size(), "BlackWidow");
		System.out.println("----New  Avengers----");
		for (String str : Avengers)
			System.out.println(str);
        //Removing elements from specific index.
		Avengers.remove(6);
		System.out.println("----Updated  Avengers----");
		for (String str : Avengers)
			System.out.println(str);
	}
}

/*OUTPUT:
*----Original Avengers----
Captain America
IronMan
Thor
Hulk
HawkEye
----New  Avengers----
Captain Marvel
Captain America
IronMan
Thor
Hulk
HawkEye
BlackWidow
----Updated  Avengers----
Captain Marvel
Captain America
IronMan
Thor
Hulk
HawkEye
*/