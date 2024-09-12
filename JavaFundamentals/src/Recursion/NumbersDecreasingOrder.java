package Recursion;

import java.util.Scanner;

public class NumbersDecreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please input the number");
		int i = sc.nextInt();
		printDec(i);

	}
	
	public static void printDec(int n) {
	    if (n == 1) {
	        System.out.println(n);  // Base case
	        // No return statement here
	    } else {
	        System.out.print(n + " ");
	        printDec(n - 1);
	    }
	}


}
