package Strings;

public class IntToStringConversion {

    /**
     * Purpose:
     * Convert an integer to a string.
     * 
     * How It Works:
     * - The String.valueOf() method is used to convert the integer to its string representation.
     * 
     * Use Case:
     * - This method is widely used for formatting, logging, or when string manipulation is needed.
     */
    public static String convertIntToString(int number) {
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        int number = 12345;
        String result = convertIntToString(number);
        System.out.println("String result: " + result); // Output: "12345"
    }
}
