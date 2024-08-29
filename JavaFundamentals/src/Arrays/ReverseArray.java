package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int num[] = {2,4,6,8,10};
		originalArray(num);  //original Array
		
		System.out.println();
		
		reverseArray(num);
		
	}
	public static void originalArray(int num[]) {
		for(int i =0; i < num.length; i++) {
			System.out.print(num[i]+ " ");
		}
	}
	
	public static void reverseArray(int num[]) {
		
		int arrLength = num.length-1;
		
		//After Reversing the Array
		System.out.print("The Reverse array is ");
		for (int i = arrLength; i >=0 ; i--) {
			
			System.out.print(num[i] + " ");
		}
	}

}
