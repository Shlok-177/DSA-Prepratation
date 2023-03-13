import java.util.LinkedHashMap;
import java.util.Map;

// Write a function that takes in a string and returns the first non-repeated character in that string.

public class Problem_12_NonRepetedChar {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "aabbcdeeff";
        String str3 = "abcdabcd";

        char firstChar1 = firstNonRepeatedChar(str1);
        char firstChar2 = firstNonRepeatedChar(str2);
        char firstChar3 = firstNonRepeatedChar(str3);

        System.out.println("The first non-repeated character in '" + str1 + "' is " + firstChar1);
        System.out.println("The first non-repeated character in '" + str2 + "' is " + firstChar2);
        System.out.println("The first non-repeated character in '" + str3 + "' is " + firstChar3);
    }

    public static char firstNonRepeatedChar(String str) {
        // Create a hash map to store the count of each character in the string
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        // Loop through the characters in the string and update the count in the hash map
        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        // Loop through the characters in the string again and return the first character
        // with a count of 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        // If no non-repeated character is found, return the null character
        return '\0';
    }


}