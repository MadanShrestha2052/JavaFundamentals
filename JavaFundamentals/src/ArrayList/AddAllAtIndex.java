package ArrayList;

import java.util.ArrayList;

//14. addAll(int index, Collection<? extends E> c): 
//Inserts all elements from the specified collection starting at the specified position.

public class AddAllAtIndex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");

        // Create another ArrayList
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("Python");
        anotherList.add("C++");

        // Insert all elements from anotherList at index 1
        list.addAll(1, anotherList);

        // Display the updated list
        System.out.println("Updated list: " + list);  // Output: [Java, Python, C++, JavaScript]
    }
}
