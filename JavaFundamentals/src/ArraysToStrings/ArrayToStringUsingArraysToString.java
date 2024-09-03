package ArraysToStrings;

import java.util.Arrays;

public class ArrayToStringUsingArraysToString {

    /**
     * Purpose:
     * Convert an array to a string using the built-in Arrays.toString() method.
     * 
     * How It Works:
     * - Arrays.toString() takes an array and returns a string representation of the array, with elements separated by commas and enclosed in square brackets.
     * - This method is convenient and easy to use, though it may not be as efficient as StringBuilder for very large arrays or high-performance requirements.
     * 
     * Use Case:
     * - Ideal for quick conversions, especially useful for debugging or logging purposes.
     * - Suitable for arrays where the default string format provided by Arrays.toString() (brackets and commas) is acceptable or desired.
     */
    public static String convertArrayToString(int[] array) {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String result = convertArrayToString(array);
        System.out.println("Result: " + result);
    }
}




