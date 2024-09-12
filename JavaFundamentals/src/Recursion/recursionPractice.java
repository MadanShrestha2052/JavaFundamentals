package Recursion;

import java.util.*;
public class recursionPractice {
	
	/*
	 * Recursion is a method of solving a computational problem where the solution depends on solutions
	 * solutions to smaller instances of the same problem.
	 * We should know the base case (final case).
	 * 
	 */

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Please input the number");
		int input =  sc.nextInt();
		int result = factorial(input);
		System.out.println("The factorial of given number is: " + input);

	}

	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			
			n = n* factorial(n-1);
			return n;
		}
			
	}
	
	
}


