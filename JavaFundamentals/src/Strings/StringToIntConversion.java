package Strings;

public class StringToIntConversion {

    /**
     * Purpose:
     * Convert a string to an integer.
     * 
     * How It Works:
     * - The Integer.parseInt() method is used to parse the string and convert it to an integer.
     * - It throws a NumberFormatException if the string is not a valid representation of an integer.
     * 
     * Use Case:
     * - Commonly used when reading numerical data from user input, files, or other external sources.
     */
    public static int convertStringToInt(String numberStr) {
        return Integer.parseInt(numberStr);
    }

    public static void main(String[] args) {
        String numberStr = "12345";
        int result = convertStringToInt(numberStr);
        System.out.println("Integer result: " + result); // Output: 12345
    }
}
