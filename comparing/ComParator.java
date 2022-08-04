package com.java.training.comparing;
import java.util.*;

public class ComParator {

	public static void main(String[] args) {
		Comparator<String> comparing = new Comparator<String>() {
			@Override
			public int compare(String str1,String str2) {
				return str1.length() - str2.length();
			}
		};
		PriorityQueue<String> names = new PriorityQueue<>(comparing);
		
		//adding the elements to the Priority Queue
		names.add("Lohith");
		names.add("Karthik");
		names.add("Jeevan");
		names.add("Gireesh");
		names.add("Sahil");
		names.add("Bharath");
		names.add("Ani");
		
		while(!names.isEmpty()) {
			System.out.println(names.remove());
		}
	}
}

/*OUTPUT: According to String length. 
Ani
Sahil
Lohith
Jeevan
Gireesh
Karthik
Bharath
*/