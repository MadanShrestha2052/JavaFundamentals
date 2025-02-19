package Queue;

import java.util.Scanner;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of terms in the fibonacci sequence ");
		int n = scanner.nextInt();
		printFibonacci(n);
		scanner.close();

	}
	public static void printFibonacci(int n) {
		int a = 0, b = 1;
		System.out.println("Fibonnaci sequence");
		for(int i = 1; i<= n; i++) {
			System.out.println(a + "");
			int next = a + b;
			a= b;
			b = next;
		
			
		}
	}
	

}
