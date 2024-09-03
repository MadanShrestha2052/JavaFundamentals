package ArraysToInt;

//Using StringBuilder (Moderate Efficiency)
//This method is slightly less efficient but very straightforward, especially when the array contains characters or digits.
//
//How It Works:
//
//Convert the array to a string using StringBuilder.
//Parse the resulting string as an integer using Integer.parseInt().

public class ArrayToIntUsingStringBuilder {

    /**
     * Purpose:
     * Convert an array of digits or characters to a single integer by first converting to a string.
     * 
     * How It Works:
     * - Append each element of the array to a StringBuilder.
     * - Convert the resulting string to an integer using Integer.parseInt().
     * 
     * Use Case:
     * - Useful when dealing with character arrays or when code simplicity is more important than raw efficiency.
     */
    public static int convertArrayToInt(char[] array) {
        StringBuilder sb = new StringBuilder();
        for (char digit : array) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        char[] array = {'1', '2', '3', '4', '5'};
        int result = convertArrayToInt(array);
        System.out.println("Result: " + result); // Output: 12345
    }
}

