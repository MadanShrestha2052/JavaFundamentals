package functionAndMethods;

public class CallByValue {   //Only copy of the value goes not the original value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 5;
		int  b = 10;
		
		// After swapping the value
		swap(5,10);
		
		//Before Swapping the value
		System.out.println("print a " + a);
		System.out.println("print b " + b);
	}
	
	public static void swap (int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}

}
