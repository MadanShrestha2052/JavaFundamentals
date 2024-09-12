package ArrayList;

//1. add(E e): Adds the specified element to the end of the list.
import java.util.ArrayList;

public class AddElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the end of the list
        list.add("Hello");
        list.add("World");

        // Display the elements
        System.out.println("List: " + list);  // Output: [Hello, World]
    }
}
