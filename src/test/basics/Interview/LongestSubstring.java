package test.basics.Interview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    /**
     * Finds and prints the longest substring without repeating characters.
     *
     * @param s The input string.
     */
    public static void printLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        // Map to store the last seen index of each character
        Map<Character, Integer> charToIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Starting index of the current window
        int bestStart = 0; // Starting index of the longest substring found so far

        // Iterate through the string with the end pointer
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map and within the current window
            if (charToIndexMap.containsKey(currentChar) && charToIndexMap.get(currentChar) >= start) {
                // Move the start pointer to the position after the last occurrence
                start = charToIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the current character
            charToIndexMap.put(currentChar, end);

            // Calculate current window length
            int currentLength = end - start + 1;

            // Update max length and best start index if necessary
            if (currentLength > maxLength) {
                maxLength = currentLength;
                bestStart = start;
            }
        }

        // Extract the longest substring using the recorded start index and length
        String longestSubstring = s.substring(bestStart, bestStart + maxLength);

        System.out.println("Original String: \"" + s + "\"");
        System.out.println("Longest Substring Without Repeating Characters: \"" + longestSubstring + "\"");
        System.out.println("Length: " + maxLength);
    }

    public static void main(String[] args) {
        // Test cases
        printLongestSubstring("abcabcbb");
        printLongestSubstring("bbbbb");
        printLongestSubstring("pwwkew");
        printLongestSubstring("geeksforgeeks");
    }
}
