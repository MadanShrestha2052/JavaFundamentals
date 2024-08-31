package Strings;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		
		// Converting a char[] to a String
		//Using the String Constructor:
		//Using String.valueOf(char[]) Method:
		
		//2. When to Use .toString() Method
//		The .toString() method is used to get a string representation of an object.
		
//		3. To remove spaces (or any other specific characters) within a string, including spaces between words, you can use the replace() or replaceAll() methods in Java. Here's how you can do it:
		
//		1. Using replace() Method:
//			2. Using replaceAll() Method:
//				 replace(" ", ""):
//					 2. replaceAll("\\s+", ""):
//						 3. replaceAll("[^a-zA-Z]", "").toLowerCase():
		
		// convert integer to String
		// using String.valueOf(number);
		//using Integer.toString(number);
		//Using String Concatenation
		
		
		//convert String to integer// also try handling Exceptions when converting string to int
//		String str = "abc";
//		try {
//		    int number = Integer.parseInt(str);
//		} catch (NumberFormatException e) {
//		    System.out.println("Invalid number format!");
//		}
		
		
		//1st approach
//		int number = Integer.parseInt(str);
		
		//2nd approach
//		Integer number = Integer.valueOf(str);
//		int intValue = number.intValue();
		
		//compareTo method
							 
		String firstword = "Astronomer";
		String secondword = "Moon Starer";
		
		firstword =firstword.toLowerCase();
		secondword = secondword.toLowerCase();
		
		
		secondword= secondword.replaceAll("\\s+","");
		
		char[] fword = firstword.toCharArray();
		char[] sword= secondword.toCharArray();
		
		Arrays.sort(fword);
		Arrays.sort(sword);
		
		  System.out.println("Sorted Array: " + Arrays.toString(fword));
		
		System.out.println(firstword);
		System.out.println(secondword);

	}

}
