package com.java.training.hashmap;

import java.util.*;
import java.util.Map.Entry;

/**
 * Using LinkedHashMap to implement insertion order.
 */
public class McD {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> orderList = new LinkedHashMap<Integer, String>();
		orderList.put(128, "PeriPeri Fries");
		orderList.put(209, "American Cheese Lava Burger");
		orderList.put(589, "Coke(Without ice)");

		Set<Entry<Integer, String>> set = orderList.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry details = (Map.Entry) iterator.next();
			System.out.println("Order Number :" + details.getKey() + "  Dish Name: " + details.getValue());

		}
	}
}



/**
 * Here the insertion order is preserved!!
 */
/*OUTPUT:
*Order Number :128  Dish Name: PeriPeri Fries
Order Number :209  Dish Name: American Cheese Lava Burger
Order Number :589  Dish Name: Coke(Without ice)
*/