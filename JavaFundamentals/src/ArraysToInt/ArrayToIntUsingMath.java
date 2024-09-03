package ArraysToInt;

//1. Mathematical Approach (Most Efficient)
//This method is the most efficient and works for arrays of digits (e.g., int[] or char[] where each element represents a single digit).
//
//How It Works:
//
//Traverse the array from left to right.
//For each digit, multiply the current result by 10 and add the current digit to it.

public class ArrayToIntUsingMath {

    /**
     * Purpose:
     * Convert an array of digits to a single integer using mathematical operations.
     * 
     * How It Works:
     * - Traverse the array, multiplying the current result by 10 and adding the current digit.
     * - This method works efficiently for arrays of digits (e.g., int[] or char[]).
     * 
     * Use Case:
     * - Ideal for performance-critical applications, especially when dealing with large arrays of digits.
     */
    public static int convertArrayToInt(int[] array) {
        int result = 0;
        for (int digit : array) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = convertArrayToInt(array);
        System.out.println("Result: " + result); // Output: 12345
    }
}
