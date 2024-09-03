package ArraysToStrings;

// StringBuilder Method (Most Efficient)
public class ArrayToStringUsingStringBuilder {

    /**
     * Purpose:
     * Convert an array to a string efficiently using StringBuilder.
     * 
     * How It Works:
     * - A StringBuilder is created and each element of the array is appended to it.
     * - Finally, the toString() method of StringBuilder is called to obtain the concatenated string.
     * - This method is efficient because StringBuilder is mutable, meaning it doesn’t create multiple objects during concatenation.
     * 
     * Use Case:
     * - Best for performance-critical applications, especially when dealing with large arrays or performing repetitive operations.
     * - Suitable for any type of array (e.g., int[], char[], String[], etc.).
     */
    public static String convertArrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String result = convertArrayToString(array);
        System.out.println("Result: " + result);
    }
}

