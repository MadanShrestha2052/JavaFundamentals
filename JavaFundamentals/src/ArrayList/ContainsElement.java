package ArrayList;

// 9. contains(Object o): Returns true if the list contains the specified element.
import java.util.ArrayList;

public class ContainsElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Check if the list contains "Hello"
        boolean hasHello = list.contains("Hello");

        // Display the result
        System.out.println("List contains 'Hello': " + hasHello);  // Output: true
    }
}
