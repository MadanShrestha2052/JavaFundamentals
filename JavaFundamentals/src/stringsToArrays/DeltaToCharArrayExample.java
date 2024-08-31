package stringsToArrays;

// Purpose: Converts a string into an array of characters.
// How It Works: The toCharArray() method turns each character in the string into an element of a char[] array.
// Use Case: When you need to manipulate or analyze individual characters in the string.

public class DeltaToCharArrayExample {
    public static void main(String[] args) {
        String str = "hello";
        char[] array = str.toCharArray();
        
        // Printing the array
        for (char c : array) {
            System.out.println(c);
        }
    }
}

// Memory Tip: "toCharArray" directly indicates converting a string into an array of characters.
