package ArrayList;

// 3. get(int index): Returns the element at the specified position.
import java.util.ArrayList;

public class GetElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Get the element at index 0
        String element = list.get(0);

        // Display the element
        System.out.println("Element at index 0: " + element);  // Output: Hello
    }
}
