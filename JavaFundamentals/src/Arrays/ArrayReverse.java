package Arrays;

public class ArrayReverse {

	// First Lets take a sorted Array.
	//For ease, I am taking 2,4,6,8,10,12
	public static void main(String[] args) {
		
		int num[] = {2,4,6,8,10,12};
		
		// Now call the function and pass the original Array
		
		System.out.print("The original Array is: ");
		originalArray(num);
		
		System.out.println(); // Adding line between old and new Array
		
		System.out.print("The reversed Array is: ");
		reverseArray(num);
		//lets check the output now
	}
	
	//lets create a function to print the original and reversed Array
	
	public static void originalArray(int num[]) {
		
		int arrLength =num.length-1;
		//iterating from 0 to last index of array.
		for(int i =0; i <= arrLength; i++) {
			System.out.print(num[i] + " ");  // This will print an original Array
		}
		
	}
	// New function to print the reverse array
	public static void reverseArray ( int num[]) {
		int arrLength = num.length-1;
		
		//iterating from last to the first
		for(int i =arrLength; i>=0; i--) {
			System.out.print(num[i]+ " ");
		}
	}

}
