package com.java.assignment.q5;

import java.util.Date;
import java.util.Scanner;

import com.java.assignment.q2.*;

/**
 *Using Driver class to invoke multiple classes 
 */
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to run the program" + "\n");
		System.out.println("Enter 1 for School details question ");
		System.out.println("Enter 2 for Discount System question");
		// Enter number to run the program
		int chooseQuestion = sc.nextInt();
		switch (chooseQuestion) {
		case 1:
			Student stdDetails = new Student("Anirudh", "Java Full Stack", "Bengaluru", 2022, 25000);
			Staff staffDetails = new Staff("Unacademy", "Bangalore", "Lohith", 60000.00);
			System.out.println(stdDetails);
			System.out.println(staffDetails);
			break;
		case 2:
			Customer cust = new Customer("Gireesh");
			cust.member = true;
			cust.memberType = "Gold";

			Visit visit = new Visit(cust, new Date());
			System.out.println(cust.toString());
			visit.setServiceExpense(90.0);
			visit.setProductExpense(50.0);
			System.out.println(visit.toString());
			System.out.println("Total Expense of " + visit.Customer.getName() + "=" + visit.getTotalExpense() + "$");
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
