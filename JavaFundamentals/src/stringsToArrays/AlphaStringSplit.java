package stringsToArrays;

// Purpose: Splits a string into an array of substrings based on a delimiter.
// How It Works: The split() method splits the string wherever the regular expression matches and returns an array.
// Use Case: When you want to split a string into parts using a known delimiter.

public class AlphaStringSplit {
    public static void main(String[] args) {
        String str = "apple,banana,orange";
        String[] array = str.split(",");
        
        // Printing the array
        for (String s : array) {
            System.out.println(s);
        }
    }
}

// Memory Tip: Remember "split" as breaking something into parts, ideal for breaking strings into smaller substrings.
