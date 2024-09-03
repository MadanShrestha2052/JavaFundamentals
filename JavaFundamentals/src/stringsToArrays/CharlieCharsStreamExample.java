package stringsToArrays;

// Purpose: Converts a string into an array of strings, with each element representing a single character.
// How It Works: The chars() method returns an IntStream of the characters in the string,
// which can then be mapped and collected into an array.
// Use Case: When you want a functional programming approach using streams.

public class CharlieCharsStreamExample {
    public static void main(String[] args) {
        String str = "abcd";
        String[] array = str.chars()
                            .mapToObj(c -> String.valueOf((char) c))
                            .toArray(String[]::new);
        
        // Printing the array
        for (String s : array) {
            System.out.println(s);
        }
    }
}

// Memory Tip: "chars()" indicates dealing directly with characters, and streams provide a modern 
// approach to processing them.
