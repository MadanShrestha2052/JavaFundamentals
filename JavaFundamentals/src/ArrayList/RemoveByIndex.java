package ArrayList;

import java.util.ArrayList;

// 5. remove(int index): Removes the element at the specified position

public class RemoveByIndex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // Remove the element at index 2
        list.remove(2);

        // Display the elements
        System.out.println("List after removal: " + list);  // Output: [Hello, World]
    }
}
