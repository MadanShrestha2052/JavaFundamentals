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
        System.out.println("Char array: " + java.util.Arrays.toString(array)); // Output: [h, e, l, l, o]

    }
}

// Memory Tip: "toCharArray" directly indicates converting a string into an array of characters.

//Single-Dimensional Arrays Only: Arrays.toString() works only with single-dimensional arrays. For multi-dimensional arrays, 
//you would use Arrays.deepToString().
//In summary, java.util.Arrays.toString(charArray) is a handy method for converting an array into a string representation that shows the contents of the array
//in a readable format, making it easier to print and debug arrays in Java.
