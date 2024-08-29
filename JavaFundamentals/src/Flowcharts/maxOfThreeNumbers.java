package Flowcharts;

public class maxOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		int c =30;
		
		int max = (a>b)? ((a>c)?a:c) : ((b>c)?b:c);
		System.out.println("max is: " + max);
		

		
		
//		int max = a; //lets assume
//		
//		if (b > max) {
//			max =b;
//		}
//		if(c > max) {
//			max =c;
//		}
//		System.out.println("The maximum of three numbers is: " + max);
	}

}
