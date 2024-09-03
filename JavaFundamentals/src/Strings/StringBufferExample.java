package Strings;

public class StringBufferExample {

    /**
     * Purpose:
     * Demonstrate basic operations using StringBuffer.
     * 
     * How It Works:
     * - StringBuffer is used to modify a string with thread-safety due to synchronized methods.
     * 
     * Use Case:
     * - Suitable for multi-threaded applications where multiple threads need to safely modify the same sequence.
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

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

