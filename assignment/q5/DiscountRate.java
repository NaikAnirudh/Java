package com.java.assignment.q5;

public class DiscountRate {

	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			throw new IllegalArgumentException("Incorrect service type");
		}

	}

	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return productDiscountPremium;
		case "Gold":
			return productDiscountGold;
		case "Silver":
			return productDiscountSilver;
		default:
			throw new IllegalArgumentException("Incorrect service type");
		}

	}
}
