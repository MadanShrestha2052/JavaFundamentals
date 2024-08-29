package Arrays;

import java.util.Scanner;

public class MenuList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("what do you want to eat?");
		String order= sc.next();
		
		String menu[]= {"momo", "chowmein", "samayebaji", "milktea", "icetea", "selroti"};
		int j = findItem(menu, order);
		
		if(j == -1) {
			System.out.println("Sorry Not found in the menu");
		}else {
			System.out.println("Item found- Please place the order");

		}
	}
	
	public static int findItem(String food[], String order) {
		
		String key = order;
		
		for(int i=0; i<food.length; i++) {
			if(key.equals(food[i])) {
			 return i;
			}
		}
		return -1;
	}

}
