package ArrayList;

import java.util.ArrayList;

public class ArrayListIntroduction {
/*
 * Array is fixed size and primitive data types can be stored like (char, boolean, int etc)
 * ArrayList is dynamic size and it cannot store the primitive data types directly.
 * So, if it wants to store int, we have to use Wrapper classes like: Integer | String | Boolean
 * ArrayList is a class.
 * ArrayList is a part of Java Collection Framework.
 * 
 * DEFINATION:
 * 
 * ArrayList is a resizable array implementation of the List interface in Java. Unlike standard arrays, ArrayList can grow and shrink dynamically as elements are added or removed. It provides more flexibility compared to arrays, as its size doesn't need to be specified upfront. The ArrayList stores elements in a dynamic array and maintains the order of insertion, allowing for easy random access of elements via their index.

Key Features:

Resizable: Automatically adjusts its size when new elements are added or removed.
Ordered: Maintains the order of elements as they were inserted.
Allows duplicates: Can contain duplicate elements.
Random access: Elements can be accessed directly by their index in constant time (O(1)).
 */
	
	public static void main(String[] args) {

			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<String>  list2= new ArrayList<>();
			ArrayList<Boolean> list3 = new ArrayList<>();
			
			list1.add(0);
			list1.add(1);
			list1.add(3);
			
			for (Integer num : list1) {
				System.out.println(num);
			}
			
			System.out.println(list1.get(0));
			
	}

}
