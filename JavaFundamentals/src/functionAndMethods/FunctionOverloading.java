package functionAndMethods;

public class FunctionOverloading {  // return type does not affect, the formal parameters should be different 
									// Or the number of parameters should be different if the parameter type is same

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(2,2));
		System.out.println(sum(2f,2f));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}

}
