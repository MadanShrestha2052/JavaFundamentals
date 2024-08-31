package Strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String firstWord = "listen";
        String secondWord = "silent";

        boolean isAnagram = areAnagrams(firstWord, secondWord);
        
        if (isAnagram) {
            System.out.println("The words are anagrams.");
        } else {
            System.out.println("The words are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Normalize the strings by converting to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
