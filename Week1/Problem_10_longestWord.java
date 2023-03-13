// Write a function that takes in a string and returns the length of the longest word in that string.

public class Problem_10_longestWord {
    public static void main(String[] args) {

        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "This is a test string";
        String str3 = "Hello world!";

        int maxLength1 = getLengthOfLongestWord(str1);
        int maxLength2 = getLengthOfLongestWord(str2);
        int maxLength3 = getLengthOfLongestWord(str3);

        System.out.println("Max length of longest word in string 1: " + maxLength1);
        System.out.println("Max length of longest word in string 2: " + maxLength2);
        System.out.println("Max length of longest word in string 3: " + maxLength3);


    }

    public static int getLengthOfLongestWord(String str) {
        String[] words = str.split(" ");
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        return maxLength;
    }
}