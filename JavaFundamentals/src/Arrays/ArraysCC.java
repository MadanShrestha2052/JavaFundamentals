package Arrays;

public class ArraysCC {  //Arrays is always Pass by reference., when you create an array inside main function and you pass that array to 
	//function then, the original array also gets changed. That means actual array gets changed.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {97,98,99};
		update(marks);
		
		//print our marks
		for (int i =0; i <marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}
	public static void update(int marks[]) {
		
		for(int i =0; i<marks.length;i++) {
			marks[i] = marks[i] +1;
		}
	}

}
