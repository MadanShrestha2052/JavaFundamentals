package functionAndMethods;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decNum= 10;
		int binNum =0;
		int pow =0 ;
		
		for (int i = decNum; i>0; i=i/2) {
			int rem = i%2;
			binNum = (int) (binNum + rem*Math.pow(10, pow));
			pow++;
		}
		
		System.out.println("My decNum is " + decNum + " Converted to " + binNum );

	}

}
