


package Strings;

public class StringCompressionUsingStringBuilder {

    public static void main(String[] args) {
        String str = "abbcccdd";
        StringBuilder newStr = new StringBuilder();  // Use StringBuilder for efficient string manipulation

        for (int i = 0; i < str.length(); i++) {
            int count = 1;  // Initialize count for each character

            // Count the occurrences of the current character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;  // Move to the next character
            }

            // Append the current character and its count to the StringBuilder
            newStr.append(str.charAt(i)).append(count);
            
//            char currentChar = str.charAt(i);  // Get the current character, e.g., 'b'
//            newStr.append(currentChar);        // Append the character, so now newStr = "a1b"
//            newStr.append(count);              // Append the count, so now newStr = "a1b2"

        }

        // Convert StringBuilder to String and print the compressed string
        System.out.println("Compressed String: " + newStr.toString());
    }
}

