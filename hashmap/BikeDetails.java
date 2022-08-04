package com.java.training.hashmap;

import java.util.*;

/**
 * Creating a HashMap to store the details of bikeList and perform different Methods.
 */
public class BikeDetails {

	public static void main(String[] args) {
		HashMap<Integer, String> bikeList = new HashMap<Integer, String>();
		System.out.println("****High performance bikeLists****" + bikeList);
		// using put(); method to add elements to the HashMap.
		bikeList.put(1340, "Suzuki Hayabusa");
		bikeList.put(1198, "Ducati Diavel");
		bikeList.put(998, "Kawasaki Ninja H2");

		//Generating a set of entries.
		Set set = bikeList.entrySet();
		// Displaying the content of the HashMap using iterator.
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry details = (Map.Entry) iterator.next();
			System.out.println("CC of the Bike: " + details.getKey() + "Bike Name: " + details.getValue());
		}
		// getting a specific detail in the Hashmap using get(Key) method.
		String str = bikeList.get(998);
		System.out.println("bikeList with 998 CC :" + str);

		// Checking if the the element is present in the HashMap before Adding,
		// putIfAbsent() adds the element if it is not already present.
		bikeList.putIfAbsent(1000, "Suzuki GSX-R 1000");
		System.out.println("****Updated list of bikeLists****");
		Set set1 = bikeList.entrySet();
		Iterator iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			Map.Entry details = (Map.Entry) iterator1.next();
			System.out.println("CC of the Bike: " + details.getKey() + "Bike Name: " + details.getValue());
		}

		// creating another HashMap to add all the values of another HashMap.
		HashMap<Integer, String> bikeList1 = new HashMap<Integer, String>();
		System.out.println("****New bikeList List****");
		bikeList1.put(1285, "Ducati Superleggera");
		// putAll() method to add all the elements present in bikeList to bikeList1;
		bikeList1.putAll(bikeList);
		Set set2 = bikeList1.entrySet();
		Iterator<Object> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry details1 = (Map.Entry) iterator2.next();
			System.out.println("CC of the Bike: " + details1.getKey() + "  Bike Name: " + details1.getValue());
		}

	}
}

/*
 * OUTPUT:
 *  ****High performance bikeLists****{}
CC of the Bike: 998Bike Name: Kawasaki Ninja H2
CC of the Bike: 1340Bike Name: Suzuki Hayabusa
CC of the Bike: 1198Bike Name: Ducati Diavel
bikeList with 998 CC :Kawasaki Ninja H2
****Updated list of bikeLists****
CC of the Bike: 998Bike Name: Kawasaki Ninja H2
CC of the Bike: 1000Bike Name: Suzuki GSX-R 1000
CC of the Bike: 1340Bike Name: Suzuki Hayabusa
CC of the Bike: 1198Bike Name: Ducati Diavel
****New bikeList List****
CC of the Bike: 1285  Bike Name: Ducati Superleggera
CC of the Bike: 998  Bike Name: Kawasaki Ninja H2
CC of the Bike: 1000  Bike Name: Suzuki GSX-R 1000
CC of the Bike: 1340  Bike Name: Suzuki Hayabusa
CC of the Bike: 1198  Bike Name: Ducati Diavel

 */
