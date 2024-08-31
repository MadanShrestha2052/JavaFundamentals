package stringsToArrays;

import java.util.regex.Pattern;

// Purpose: Converts a string into an array of strings, processed as a stream.
// How It Works: The Pattern.splitAsStream() method splits the string and processes each part as a stream, allowing further operations before collecting it into an array.
// Use Case: When you want to leverage the power of streams to process and convert a string into an array.

public class PatternSplitAsStreamExample {
    public static void main(String[] args) {
        String str = "1,2,3";
        String[] array = Pattern.compile(",")
                                 .splitAsStream(str)
                                 .toArray(String[]::new);
        
        // Printing the array
        for (String s : array) {
            System.out.println(s);
        }
    }
}

// Memory Tip: "Stream" indicates sequential processing of elements, ideal for more complex or functional programming needs.
