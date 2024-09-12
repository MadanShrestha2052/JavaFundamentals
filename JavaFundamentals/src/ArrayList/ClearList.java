package ArrayList;

import java.util.ArrayList;

//7. clear(): Removes all elements from the list.

public class ClearList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Clear the list
        list.clear();

        // Display the elements
        System.out.println("List after clear: " + list);  // Output: []
    }
}
