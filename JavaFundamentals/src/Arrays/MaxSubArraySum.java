package Arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int arr[] = {1,-2,6,-1,3};
		int arrlength = arr.length;
		int ts =0;
		
	
		int maxSum= Integer.MIN_VALUE;
		
		for(int i =0; i <= arrlength-1; i++) {
			int start= i;
			for(int j = i; j <= arrlength-1; j++) {
				int end =j;
				int subSum= 0;
				for(int k = start; k <=end; k++) {
					
					System.out.print(arr[k] + " ");
					 subSum += arr[k];
				}
				System.out.println();
				
				ts++;
				if(subSum > maxSum) {
					maxSum= subSum;
				}
				System.out.println("The sum is " + subSum);
				System.out.println("The max sum is " + maxSum);
				
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("The total number of subarrays are: " + ts);
		System.out.println("The maxSum is: " + maxSum);
	}

}
