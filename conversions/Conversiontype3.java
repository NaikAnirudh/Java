package com.java.training.conversions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversiontype3 {

	public static void main(String[] args) {
		System.out.println("-----ASCII to String-----");
		int array[] = { 105, 98, 56, 65, 80 };
		String str = null;
		for (int i : array) {
			str = Character.toString((char) i);
			System.out.println(str);
		}

		System.out.println("-----Writer to String-----");
		StringWriter ref = new StringWriter();
		ref.append("Anirudh");
		ref.append(" Naik");
		String str1 = ref.toString();
		System.out.println("Appended String:" + str1);

		System.out.println("-----StackTrace to String-----");

		try {
			int division = 0 / 0;
		} catch (ArithmeticException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			System.out.println(exceptionAsString);
		}
		
		System.out.println("-----String to Array List-----");
		
		String num = "56,87,35,45,62,15,87";
		String array1[] = num.split(",");
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(str);
		for(String s: list){
		   System.out.println(s);
	}
		
		System.out.println("-----String Buffer to String-----");
		  StringBuffer sb = new StringBuffer("Josh Softwares");
	      String str3 = sb.toString();
	      System.out.println("String object: "+str3);
		
		System.out.println("-----Input Stream to String------");
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter the file path: ");
	        String filename = s.nextLine();
	        
	        File file = new File(filename);
	        try {
	            
	            InputStream is = new FileInputStream(file);	            
	            InputStreamReader isr = new InputStreamReader(is);	            	          
				char charArray[] = new char[(int) file.length()];          	         
	            isr.read(charArray);	            
	            String contents = new String(charArray);
	            System.out.println(contents);
	        }
	        catch (IOException e) {
	            System.out.println(e);
	        }
		
		
		
		
}
}

/*
 * OUTPUT:
-----ASCII to String-----
i
b
8
A
P
-----Writer to String-----
Appended String:Anirudh Naik

-----StackTrace to String-----
java.lang.ArithmeticException: / by zero
	at com.java.training.conversions.Conversiontype3.main(Conversiontype3.java:36)

-----String to Array List-----
56
87
35
45
62
15
87
-----String Buffer to String-----
String object: Josh Softwares

-----Input Stream to String------
Enter the file path: 
D:\files\g2.txt
Anirudh 
Lohith
Jeevan
Gireesh
*/





