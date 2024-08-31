package Strings;

public class StringCompression {



	    public static void main(String[] args) {
	        String str = "abbcccdd";
	        String newStr = "";  // This will store the compressed string

	        for (int i = 0; i < str.length(); i++) {
	            Integer count = 1;  // Initialize count for each character

	            // Count the occurrences of the current character
	            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	                i++;  // Move to the next character
	            }

	            // Append the current character and its count to the new string
	            newStr += str.charAt(i) + String.valueOf(count);
	          
	        }

	        System.out.println("Compressed String: " + newStr);
	    }
	}
