package ArrayList;

// 4. set(int index, E element): Replaces the element at the specified position.
import java.util.ArrayList;

public class SetElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Replace the element at index 1
        list.set(1, "Programming");

        // Display the elements
        System.out.println("Updated List: " + list);  // Output: [Hello, Programming]
    }
}
