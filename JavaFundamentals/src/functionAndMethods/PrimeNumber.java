package functionAndMethods;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		boolean isPrime = true;
		if(n ==0 || n == 1) {
			System.out.println("Its not prime");
		}
		else {
			
			for(int i =2; i <= Math.sqrt(9); i++) {
				if(n%i==0) {
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println("Its prime");
		}else {
			System.out.println("Its not prime");
		}
		

	}

}
