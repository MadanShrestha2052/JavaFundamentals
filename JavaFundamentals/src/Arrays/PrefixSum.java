package Arrays;

public class PrefixSum {

	public static void main(String[] args) {

		int arr[] = {1,-2,6,-1,3};
		int arrlength = arr.length;
		
		int prefix[]= new int[arrlength];
		
		System.out.println("Value of arr[0] / prefix[0] is: " + arr[0]);
		prefix[0]= arr[0];
		
		for(int i =1; i<= arr.length-1; i++) {
			prefix[i]= prefix[i-1]+ arr[i];
			System.out.print(prefix[i-1]+ arr[i] + " ");
		}
		System.out.println();
		System.out.println("Value of prefix[1] : " + prefix[1]);
		
		for(int i=0; i <=prefix.length-1; i++)
		System.out.print(prefix[i] + " ");
	
		int currSum=0;
		int maxSum= Integer.MIN_VALUE;
//		
		for(int i =0; i <= arrlength-1; i++) {
			int start= i;
//			
			for(int j = i; j <= arrlength-1; j++) {
				int end =j;
				currSum= start==0 ? prefix[end] : prefix[end]- prefix[start-1];
				if(currSum > maxSum) {
					maxSum= currSum;
				}
				
			}
		}
		System.out.println();
		System.out.println("The maxSum is: " + maxSum);
	}

}
