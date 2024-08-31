package Strings;

public class StringFeatures {

    public static void main(String[] args) {
        
        // Initializing a String
        String str = new String("tryjava2024");

        // 1. Length of the String: Returns the number of characters in the string
        System.out.println("Length of the string: " + str.length()); // 11

        // 2. Convert to Upper Case: Converts the string to upper case
        System.out.println("Uppercase: " + str.toUpperCase()); // TRYJAVA2024

        // 3. Concatenation: Concatenates "groupstudy" to the original string
        System.out.println("Concatenated String: " + str.concat("groupstudy")); // tryjava2024groupstudy

        // 4. The original string remains unchanged due to immutability
        System.out.println("Original String: " + str); // tryjava2024

        // 5. Convert to Lower Case: Converts the string to lower case
        System.out.println("Lowercase: " + str.toLowerCase()); // tryjava2024

        // 6. Substring: Extracts part of the string from index 3 to the end
        System.out.println("Substring from index 3: " + str.substring(3)); // java2024

        // 7. Substring with end index: Extracts part of the string from index 0 to 3 (exclusive)
        System.out.println("Substring from index 0 to 3: " + str.substring(0, 3)); // try

        // 8. Character at a Specific Index: Returns the character at index 3
        System.out.println("Character at index 3: " + str.charAt(3)); // j

        // 9. Index of a Character: Finds the index of the first occurrence of 'j'
        System.out.println("Index of 'j': " + str.indexOf('j')); // 3

        // 10. Last Index of a Character: Finds the index of the last occurrence of 'a'
        System.out.println("Last index of 'a': " + str.lastIndexOf('a')); // 5

        // 11. Contains: Checks if the string contains "java"
        System.out.println("Contains 'java': " + str.contains("java")); // true

        // 12. Starts With: Checks if the string starts with "try"
        System.out.println("Starts with 'try': " + str.startsWith("try")); // true

        // 13. Ends With: Checks if the string ends with "2024"
        System.out.println("Ends with '2024': " + str.endsWith("2024")); // true

        // 14. Replace Characters: Replaces all 'a' characters with 'o'
        System.out.println("Replaced 'a' with 'o': " + str.replace('a', 'o')); // tryjovo2024

        // 15. Trim: Trims any leading or trailing whitespace (not visible in this example)
        String strWithSpaces = "   tryjava2024   ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'"); // 'tryjava2024'

        // 16. Split the String: Splits the string into an array of substrings around 'a'
        String[] parts = str.split("a");
        System.out.println("Split around 'a': ");
        for (String part : parts) {
            System.out.println(part); // "tryj", "v", "2024"
        }

        // 17. Equality Check: Checks if two strings are equal
        System.out.println("Equals 'tryjava2024': " + str.equals("tryjava2024")); // true

        // 18. Equals Ignore Case: Checks if two strings are equal, ignoring case
        System.out.println("EqualsIgnoreCase 'TRYJAVA2024': " + str.equalsIgnoreCase("TRYJAVA2024")); // true

        // 19. String Comparison: Compares two strings lexicographically
        System.out.println("CompareTo 'tryjava2025': " + str.compareTo("tryjava2025")); // Negative value

        // 20. Is Empty: Checks if the string is empty
        System.out.println("Is empty: " + str.isEmpty()); // false

        // 21. Convert String to Character Array: Converts the string to a character array
        char[] charArray = str.toCharArray();
        System.out.println("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " "); // t r y j a v a 2 0 2 4 
        }
        System.out.println();

        // 22. Value of Other Types to String: Converts an integer to a string
        String intToString = String.valueOf(1234);
        System.out.println("Integer to String: " + intToString); // "1234"

        // 23. String Interning: Returns the string from the string pool
        String internedString = str.intern();
        System.out.println("Interned String: " + internedString); // tryjava2024

        // 24. Format a String: Formats the string using placeholders
        String formattedString = String.format("Welcome to %s", str);
        System.out.println("Formatted String: " + formattedString); // "Welcome to tryjava2024"
    }
}
