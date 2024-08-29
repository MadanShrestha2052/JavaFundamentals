package functionAndMethods;

public class BinarytoDecimal {

	public static void main(String[] args) {
	
		binToDec(100);
	}

	public static void binToDec(int num) {
		
		int binNum= num;
		int decNum = 0;
		int pow = 0;
		
		for(int i= binNum; i>0; i= i/10) {
			
			int lastdigit= i%10;
			decNum = decNum + (lastdigit* (int)Math.pow(2, pow));
			pow++;
			
		}
		System.out.println("My BinNum is " + num + " Converted to " + decNum );
	}
}
