package com.java.training.queue;

import java.util.*;

/**
 * Using Queue to implement different methods on the elements.
 */
public class QuEue {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<String>();
		// Using add() method to add elements to the queue.
		q1.add("Goku");
		q1.add("Vegeta");
		q1.add("Picolo");
		q1.add("Gohan");
		q1.add("Trunks");
		// using for-each loop to get the
		for (String str : q1) {
			System.out.println("List of Players:" + str);
		}
		System.out.println("The head element using element method:  " + q1.element());
		System.out.println("The head element using peek method:  " + q1.peek());
		System.out.println("Removing the head element:  " + q1.poll());

		for (String str1 : q1) {
			System.out.println("List of Players:" + str1);
		}

	}
}



/*OUTPUT:
*List of Players:Goku
List of Players:Vegeta
List of Players:Picolo
List of Players:Gohan
List of Players:Trunks
The head element using element method:  Goku
The head element using peek method:  Goku
Removing the head element:  Goku
List of Players:Vegeta
List of Players:Picolo
List of Players:Gohan
List of Players:Trunks
*/