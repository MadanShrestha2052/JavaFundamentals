package ArrayList;

// 10. isEmpty(): Returns true if the list contains no elements.
import java.util.ArrayList;

public class IsEmptyList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Check if the list is empty
        boolean isEmpty = list.isEmpty();

        // Display the result
        System.out.println("Is the list empty? " + isEmpty);  // Output: true
    }
}
