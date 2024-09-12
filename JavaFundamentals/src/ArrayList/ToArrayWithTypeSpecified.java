package ArrayList;
import java.util.ArrayList;
/*
2. toArray(T[] a) (with type specified)
This method allows you to specify the type of the array you want, ensuring type safety.
 */

/*Explanation:
What is happening?: The toArray(T[] a) method returns an array of the specified
 type (String[] in this case), so no casting is needed.
 
Why use it?: This method is preferred when you want the resulting array to be
 of a specific type, which ensures type safety and avoids 
the need for casting.

When to use it: Use this when you know the exact type of elements in the list, 
and you want an array of that specific type (like String[], Integer[], etc.).
 * 
 * 
 */

public class ToArrayWithTypeSpecified {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Convert the ArrayList to a String[] array (type specified)
        String[] stringArray = list.toArray(new String[0]);

        // Display the elements of the String[] array
        System.out.println("Elements in String[] array:");
        for (String str : stringArray) {
            // No need for casting, as it's already a String[]
            System.out.println(str);
        }
    }
}

/**
 * Summary:
toArray() (without arguments):
Returns: Object[]
When to use: When you're working with a collection of mixed types or 
don't need a specific array type.
Disadvantage: Requires casting back to the correct type manually.


toArray(T[] a) (with type specified):
Returns: An array of the specified type (e.g., String[]).
When to use: When you need a specific array type and want type safety.
Advantage: No need for casting, as the array will be of the correct type.
 * 
 * The reason we use new String[0] (or any other type like new Integer[0]) when calling the toArray(T[] a) method is mainly for performance optimization and flexibility.

Explanation:
toArray(T[] a) Method: The method toArray(T[] a) converts the list to an array of the specified type. The argument T[] a is the array where you want the list elements to be stored.

If the provided array is large enough to hold all the elements in the list,
 the list elements are stored in this array.
If the provided array is too small (or has a size of 0), the method internally 
creates a new array of the correct size to hold all elements and returns it.

Why new String[0]? Passing an array of size 0 (new String[0]) has the following benefits:

Efficiency: By passing a zero-sized array, you allow the method to allocate a new array of the exact size needed to hold the elements of the list. 
This avoids potential inefficiency if the array passed has more elements than needed (in which case the extra space would be wasted).
Convenience: You don’t have to worry about calculating the exact size of the array. The method will handle the array size internally and create a correctly sized array automatically.
 * 
 */
