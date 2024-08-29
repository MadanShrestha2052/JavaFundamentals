package Pattern;

public class halfPyramidPattern {

	public static void main(String[] args) {
		
		int Totalline =4;
		
		for(int line =0; line < Totalline; line++ ) {
			
			for(int number=0; number <= line; number++) {
				System.out.print(number+1);
			}
			System.out.println();
		}

	}

}
