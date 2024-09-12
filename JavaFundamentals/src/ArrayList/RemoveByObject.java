package ArrayList;

import java.util.ArrayList;

//6. remove(Object o): Removes the first occurrence of the specified element.

public class RemoveByObject {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");

        // Remove the first occurrence of "Hello"
        list.remove("Hello");

        // Display the elements
        System.out.println("List after removal: " + list);  // Output: [World, Hello]
    }
}
