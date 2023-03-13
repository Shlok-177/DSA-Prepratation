// Write a function that takes in a string and capitalizes the first letter of each word.

public class Problem_8_Capitalize {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "this is a test";
        String str3 = " a b c ";

        System.out.println("Original string 1: " + str1);
        System.out.println("Capitalized string 1: " + capitalizeFirstLetter(str1));
        System.out.println("Original string 2: " + str2);
        System.out.println("Capitalized string 2: " + capitalizeFirstLetter(str2));
        System.out.println("Original string 3: " + str3);
        System.out.println("Capitalized string 3: " + capitalizeFirstLetter(str3));
    }

    public static String capitalizeFirstLetter(String str) {
        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");

        for (String word : words) {
            char firstLetter = word.charAt(0);
            char capitalizedFirstLetter = Character.toUpperCase(firstLetter);

            String capitalizedWord = capitalizedFirstLetter + word.substring(1);
            result.append(capitalizedWord).append(" ");
        }

        return result.toString().trim();
    }

}