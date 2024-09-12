package ArrayListExercises;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int size = list.size(); //5
		System.out.println("The size of the arrayList is: "  + size);
		
		for (int i = size-1; i >= 0; i-- ) {
			System.out.println(list.get(i));
		}
	}

}
