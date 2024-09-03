package IntToArray;

public class IntToArrayStringConversion {

    /**
     * Purpose: Convert an integer to an array of its digits by first converting the integer to a string.
     * 
     * How It Works:
     * 1. Convert the integer to a string.
     * 2. Convert each character to its corresponding digit by subtracting '0'.
     * 3. Store the digits in an array.
     * 
     * Use Case: 
     * - Useful for general-purpose applications where code readability and simplicity are more important than raw efficiency.
     */
    public static int[] convertIntToArray(int number) {
        // Convert integer to string
        String numberStr = String.valueOf(number);

        // Handle negative numbers by skipping the '-' sign
        if (number < 0) {
            numberStr = numberStr.substring(1);
        }

        // Initialize the array
        int[] digits = new int[numberStr.length()];

        // Convert each character to a digit
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }

        return digits;
    }

    public static void main(String[] args) {
        int number = 67890;
        int[] digits = convertIntToArray(number);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
    }
}

