package com.java.training.enumm;

/**
 * Using "enum" keyword to create enum constants.
 */
public class Enum {
	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}
}

/*
 * OUTPUT: Medium level
 */
