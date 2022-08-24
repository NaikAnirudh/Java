package com.java.assessment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class A1 to Operate on the given Data.
 */
public class A1 {
	public static void main(String[] args) {
		/*
		 * Using add method to add the elements to the list.
		 */
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(4);
		list1.add(8);
		list1.add(10);
		list1.add(19);
		list1.add(20);

		/*
		 * Using for loop to iterate through the list to find the length of the list.
		 */
		int count = 0;
		for (int i : list1) {
			count++;
		}
		System.out.println("Length of the list using iteration: " + count);
		/*
		 * Using stream to count the length of the list.
		 */
		long length = list1.stream().count();
		System.out.println("Length of the list: " + length);
		/*
		 * Using Stream to find the sum of elements in the list.
		 */
		int sum = list1.stream().mapToInt(x -> x).sum();
		System.out.println("Sum of the list: " + sum);
		/*
		 * Using removeLast() to remove the last element on the list.
		 */
		list1.removeLast();
		List<Integer> list2 = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("List After removing last element: " + list1);
		System.out.println("List containing the even elements: " + list2);
		String str = list2.toString();
		/*
		 * Creating a new file to store the given list.
		 */
		try {
			BufferedWriter file1 = new BufferedWriter(new FileWriter("D:\\Assessment\\linkedList.txt"));
			file1.write("The list of Even elements");
			file1.write("\n" + str);
			file1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

/*
 * OUTPUT:
 * Length of the list using iteration: 6
Length of the list: 6
Sum of the list: 62
List After removing last element: [1, 4, 8, 10, 19]
List containing the even elements: [4, 8, 10]
*/