package IntToArray;

public class IntToArrayMath {

    /**
     * Purpose: Efficiently convert an integer to an array of its digits using mathematical operations.
     * 
     * How It Works:
     * 1. Calculate the number of digits using logarithms.
     * 2. Extract each digit by repeatedly taking the remainder and dividing by 10.
     * 3. Store the digits in an array.
     * 
     * Use Case: 
     * - Best for performance-critical applications where speed and minimal memory usage are important.
     */
    public static int[] convertIntToArray(int number) {
        // Handle zero explicitly
        if (number == 0) {
            return new int[]{0};
        }

        // Handle negative numbers if necessary
        number = Math.abs(number);

        // Step 1: Determine the number of digits
        int length = (int) Math.log10(number) + 1;

        // Step 2: Initialize the array
        int[] digits = new int[length];

        // Step 3: Extract digits
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10; // Get the last digit
            number /= 10;            // Remove the last digit
        }

        return digits;
    }

    public static void main(String[] args) {
        int number = 12345;
        int[] digits = convertIntToArray(number);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
    }
}
