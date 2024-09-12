package ArrayList;

import java.util.ArrayList;

public class ToArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Convert the list into an array
        Object[] array = list.toArray();

        // Display the elements of the array
        for (Object obj : array) {
            System.out.println(obj);  // Output: Java, Python, C++
        }
    }
}
