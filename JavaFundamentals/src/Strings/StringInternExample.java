package Strings;

public class StringInternExample {

    /**
     * Purpose:
     * Demonstrate the use of the String.intern() method to manage memory efficiently.
     * 
     * How It Works:
     * - Interning a string ensures that identical strings share the same reference from the string pool.
     * - This reduces memory usage by avoiding duplicate string objects.
     * 
     * Use Case:
     * - Useful in scenarios where many identical strings are created, such as in large-scale applications, to optimize memory usage.
     */
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Before interning
        System.out.println("Before interning:");
        System.out.println("str1 == str2: " + (str1 == str2)); // Output: false

        // Intern the strings
        str1 = str1.intern();
        str2 = str2.intern();

        // After interning
        System.out.println("After interning:");
        System.out.println("str1 == str2: " + (str1 == str2)); // Output: true
    }
}

/**
 * Purpose:

The intern() method ensures that all identical String objects share the same memory reference from the string pool.
This method can help save memory by avoiding duplicate String objects.
How It Works:

When you call intern() on a String object, it checks whether an identical string is already present in the string pool.
If the string is present, it returns the reference from the string pool.
If the string is not present, it adds the string to the pool and returns its reference.

Output Explanation:

Before Interning: str1 and str2 are different objects in memory, so str1 == str2 is false.
After Interning: Both str1 and str2 now refer to the same object in the string pool, so str1 == str2 is true

Explanation:

The intern() method is not available in StringBuffer or StringBuilder because these classes are mutable.
The purpose of intern() is to optimize memory usage for immutable strings by placing them in a shared pool.
 Since StringBuffer and StringBuilder are designed for mutable strings, they do not have an intern() method.
 
If you want to optimize memory for strings created using StringBuffer or StringBuilder,
 you would need to convert them to a String and then call intern() on the resulting String.
 * 
 * 
 * 
 * 
*/

