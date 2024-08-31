package stringsToArrays;

import java.util.regex.Pattern;

// Purpose: Similar to String.split(), but allows for more complex regular expressions and pattern matching.
// How It Works: A Pattern object compiles a regular expression, then splits the string based on it.
// Use Case: When you need to split a string using more complex or precompiled regular expressions.

public class BetaPatternSplitExample {
    public static void main(String[] args) {
        String str = "1|2|3|4";
        String[] array = Pattern.compile("\\|").split(str);
        
        // Printing the array
        for (String s : array) {
            System.out.println(s);
        }
    }
}

// Memory Tip: "Pattern" is about regex, making it easy to remember when dealing with regular expressions.
