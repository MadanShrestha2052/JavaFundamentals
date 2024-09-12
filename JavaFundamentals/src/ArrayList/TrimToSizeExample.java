package ArrayList;


// 18. trimToSize(): Trims the capacity of the ArrayList to its current size, reducing memory usage.
import java.util.ArrayList;

public class TrimToSizeExample {
    public static void main(String[] args) {
        // Create an ArrayList with extra capacity
        ArrayList<String> list = new ArrayList<>(100);

        // Add elements to the list
        list.add("Java");
        list.add("Python");

        // Trim the list capacity to its current size
        list.trimToSize();

        // Display the elements
        System.out.println("List after trimToSize: " + list);  // Output: [Java, Python]
    }
}
