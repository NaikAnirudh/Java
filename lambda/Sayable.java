package com.java.training.lambda;

interface Sayable {

	public String say(String name);
}


/**
 * Using lambda function instead of Overriding the say() method and creating the reference variable to pass the value.
 */
class LambdaExample {
	public static void main(String[] args) {
		
		Sayable name1 = name-> {
			return "HI  " + name;
		};
		System.out.println(name1.say("Anirudh"));
		
		Sayable name2 =name -> {
			return "Hello  " + name;
		};
		System.out.println(name2.say("Lohith"));
	}
}


/*OUTPUT:
*HI  Anirudh
Hello  Lohith
*/