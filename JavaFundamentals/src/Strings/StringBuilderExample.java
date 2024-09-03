package Strings;

public class StringBuilderExample {

    /**
     * Purpose:
     * Demonstrate basic operations using StringBuilder.
     * 
     * How It Works:
     * - StringBuilder is used to efficiently modify a string through append, insert, and delete operations.
     * 
     * Use Case:
     * - Suitable for single-threaded applications where performance is a priority.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb.toString()); // Output: Hello World

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString()); // Output: Hello, World

        // Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString()); // Output: Hello World

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString()); // Output: dlroW olleH
    }
}

