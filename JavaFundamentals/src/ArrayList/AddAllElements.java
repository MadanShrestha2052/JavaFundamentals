package ArrayList;

// 13. addAll(Collection<? extends E> c): 
// Adds all elements from the specified collection to the end of the list.
import java.util.ArrayList;

public class AddAllElements {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");

        // Create another ArrayList
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Python");
        anotherList.add("C++");

        // Add all elements from anotherList to list
        list.addAll(anotherList);

        // Display the updated list
        System.out.println("Updated list: " + list);  
        // Output: [Java, JavaScript, Python, C++]
    }
}
