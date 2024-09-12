package ArrayList;

// 11. indexOf(Object o): Returns the index of the first occurrence of the specified element.
import java.util.ArrayList;

public class IndexOfElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("Python");

        // Get the index of "Python"
        int index = list.indexOf("Python");

        // Display the index
        System.out.println("Index of 'Python': " + index);  // Output: 2
    }
}
