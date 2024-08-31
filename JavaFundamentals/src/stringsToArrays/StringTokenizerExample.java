package stringsToArrays;

import java.util.StringTokenizer;

// Purpose: Splits a string into tokens based on a delimiter (legacy approach).
// How It Works: The StringTokenizer class divides the string into tokens based on specified delimiters.
// Use Case: When working with older code or specific requirements that split() may not meet.

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "apple-banana-orange";
        StringTokenizer tokenizer = new StringTokenizer(str, "-");
        String[] array = new String[tokenizer.countTokens()];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            array[index++] = tokenizer.nextToken();
        }
        
        // Printing the array
        for (String s : array) {
            System.out.println(s);
        }
    }
}

// Memory Tip: Think of "Token" as small pieces, making it easier to remember that StringTokenizer breaks strings into tokens.
