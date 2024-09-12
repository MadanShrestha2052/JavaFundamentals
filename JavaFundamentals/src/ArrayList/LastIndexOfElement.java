package ArrayList;

// 12. lastIndexOf(Object o): Returns the index of the last occurrence of the specified element.
import java.util.ArrayList;

public class LastIndexOfElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("Java");

        // Get the last index of "Java"
        int lastIndex = list.lastIndexOf("Java");

        // Display the last index
        System.out.println("Last index of 'Java': " + lastIndex);  // Output: 2
    }
}
