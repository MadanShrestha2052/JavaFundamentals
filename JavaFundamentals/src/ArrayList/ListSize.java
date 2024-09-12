package ArrayList;

import java.util.ArrayList;
// 8. size(): Returns the number of elements in the list.

public class ListSize {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Get the size of the list
        int size = list.size();

        // Display the size
        System.out.println("List size: " + size);  // Output: 2
    }
}
