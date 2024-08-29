package Flowcharts;

import java.util.*;
 public class GeneralPractice {
	
	public static void main (String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input the First Number");
//		int a = sc.nextInt();
//		System.out.println("Input the Second Number");
//		int b = sc.nextInt();
//		int result = a + b;
//		System.out.println("The final result is: " + result);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the principal");
		int p = sc.nextInt();
		System.out.println("Input the time");
		int t = sc.nextInt();
		System.out.println("Input the rate");
		int r = sc.nextInt();
		
		int result = (p*t*r)/100;
		System.out.println("The simple interest is: " + result);
		
	}

}

 class simpleInterest{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the principal");
		int p = sc.nextInt();
		System.out.println("Input the time");
		int t = sc.nextInt();
		System.out.println("Input the rate");
		int r = sc.nextInt();
		
		int result = (p*t*r)/100;
		System.out.println("The simple interest is: " + result);
		
	}
}


