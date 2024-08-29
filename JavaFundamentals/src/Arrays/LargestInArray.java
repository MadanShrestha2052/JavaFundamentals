package Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenArr[] = {1,2,3,4,5,6,100,7,8,9};
		findMax(givenArr);
		

	}
	
	public static void findMax(int num[]) {
		
		int max =num[0]; // or put max as Intger.MIN_VALUE;
		int index =0;
		
		for(int i =0; i <num.length; i++) {
			
			if (max<num[i]) {
				max=num[i];
				index =i;
			}
		}
		System.out.println("The largest value is: " + max + " at index " + index);
		
	}

}
