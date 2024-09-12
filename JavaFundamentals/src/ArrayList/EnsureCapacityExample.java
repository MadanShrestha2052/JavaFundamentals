package ArrayList;

/**
 * 17. ensureCapacity(int minCapacity): Increases the capacity of the ArrayList to ensure
 *  that it can hold at least the specified number of elements
 * 
 */
import java.util.ArrayList;

public class EnsureCapacityExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Ensure the list can hold at least 100 elements
        list.ensureCapacity(100);

        // Add elements to the list
        list.add("Java");
        list.add("Python");

        // Display the elements
        System.out.println("List: " + list);  // Output: [Java, Python]
    }
}
