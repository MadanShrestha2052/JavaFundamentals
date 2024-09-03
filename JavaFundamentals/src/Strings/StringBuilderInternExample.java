package Strings;

public class StringBuilderInternExample {

    /**
     * Purpose:
     * Demonstrate how to use String.intern() with StringBuilder by converting it to a String.
     * 
     * How It Works:
     * - Convert the StringBuilder/StringBuffer content to a String and then intern the String.
     * 
     * Use Case:
     * - Useful when you need to intern strings created by StringBuilder or StringBuffer.
     * 
     * If you want to optimize memory for strings created using StringBuffer or StringBuilder,
     *  you would need to convert them to a String and then call intern() on the resulting String.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        StringBuffer sbf = new StringBuffer("world");

        // Convert to String and intern
        String str1 = sb.toString().intern();
        String str2 = sbf.toString().intern();

        System.out.println("Interned String 1: " + str1); // Output: hello
        System.out.println("Interned String 2: " + str2); // Output: world
    }
}

