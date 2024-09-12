package ArrayList;
import java.util.ArrayList;

/*1. toArray() (without arguments)
This method returns an Object[] because it doesn't know the specific type of elements
in the list at compile-time.

Explanation:
What is happening?: The toArray() method without arguments returns an Object[], 
so every element in the list is stored as an Object.

Why use it?: You use this when you don't need a specific array type, or when 
you're working with mixed types in your ArrayList.

When to avoid it: You need to avoid this if you know the specific type of elements in your list and want better type safety (you'll need to cast elements 
back to their original types manually).
 
 */
public class ToArrayWithoutArgumentsUsingObject {

	public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Convert the ArrayList to an Object[] array (because no specific type is provided)
        Object[] array = list.toArray();

        // Display the elements of the Object[] array
        System.out.println("Elements in Object[] array:");
        for (Object obj : array) {
            // Since it's an Object array, we need to cast each element to String if needed
            String str = (String) obj;
            System.out.println(str);
        }
    }
}

/*Elements in Object[] array:
Java
Python
C++

 * 
 * 
 */

