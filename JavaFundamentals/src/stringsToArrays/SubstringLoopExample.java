package stringsToArrays;

// Purpose: Manually breaks down a string into smaller substrings and stores them in an array.
// How It Works: Extract each character or substring in a loop and store it in an array.
// Use Case: When you need finer control over the substring extraction or prefer not to use toCharArray().

public class SubstringLoopExample {
    public static void main(String[] args) {
        String str = "abcd";
        String[] array = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.substring(i, i + 1);
        }
        
        // Printing the array
        for (String s : array) {
            System.out.print(s);
        }
    }
}

// Memory Tip: "substring" is all about extracting smaller parts from a string.
