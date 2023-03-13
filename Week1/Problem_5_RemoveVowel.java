import java.util.Scanner;

// Write a function that takes in a string and removes all the vowels from it.

public class Problem_5_RemoveVowel{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeVowels(str);
        System.out.println(ans);
    }

    public static String removeVowels(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
            c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result.append(c);
        }
    }
    return result.toString();
}

}

// This function takes in a string str and initializes a StringBuilder object result to store the result. It then iterates through the string character by character and checks if the character is a vowel (either lowercase or uppercase). If the character is not a vowel, it is appended to the result string using the append() method of the StringBuilder object. Finally, the function returns the result string by converting it to a regular string using the toString() method.