package Pattern;

import java.util.Scanner;

public class rightAngleStar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the number of lines");
		int n = sc.nextInt();
		
		int totalLine= n;
		
		for(int row =0; row < n-1; row++) {
			for (int column = 0 ; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
