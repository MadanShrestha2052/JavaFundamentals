package ArrayList;

//2. add(int index, E element): Inserts the specified element at the specified position.
import java.util.ArrayList;

public class AddAtIndex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Add an element at index 1
        list.add(1, "Java");

        // Display the elements
        System.out.println("List: " + list);  // Output: [Hello, Java, World]
    }
}
