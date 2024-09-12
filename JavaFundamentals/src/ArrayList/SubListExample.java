package ArrayList;

// 15. subList(int fromIndex, int toIndex): Returns a view of the portion of the list between 
//the specified fromIndex, inclusive, and toIndex, exclusive.
import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("Python");
        list.add("C++");

        // Get a subList from index 0 to 2 (inclusive fromIndex, exclusive toIndex)
        List<String> subList = list.subList(0, 2);

        // Display the subList
        System.out.println("Sublist: " + subList);  // Output: [Java, JavaScript]
    }
}

