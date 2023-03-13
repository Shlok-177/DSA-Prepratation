import java.util.regex.Pattern;

// Write a function that takes in a string and checks if it is a valid email address  !

public class Problem_11_validEmail {
    public static void main(String[] args) {
        String email1 = "shlok.jadeja@example.com";
        String email2 = "shlok.jadeja@subdomain.example.co.in";
        String email3 = "notanemailaddress";

        boolean valid1 = isValidEmail(email1);
        boolean valid2 = isValidEmail(email2);
        boolean valid3 = isValidEmail(email3);

        System.out.println("Is email 1 valid? " + valid1);
        System.out.println("Is email 2 valid? " + valid2);
        System.out.println("Is email 3 valid? " + valid3);
    }
    public static boolean isValidEmail(String email) {
        // Regular expression to match email format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                             "[a-zA-Z0-9_+&*-]+)*@" +
                             "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email matches the regex pattern
        return pattern.matcher(email).matches();


//         This function uses regular expressions to check if the input string matches the format of a valid email address. It first defines a regular expression emailRegex that matches the format of an email address. The regular expression matches one or more alphanumeric characters, underscores, plus signs, asterisks, or hyphens, followed by an @ symbol, followed by one or more groups of alphanumeric characters or hyphens separated by dots, and ending with a group of two to seven alphabetic characters.

// The function then compiles the regular expression pattern using the Pattern.compile() method and uses it to match the input string using the Matcher.matches() method. If the input string matches the regular expression pattern, the function returns true, indicating that the input string is a valid email address. Otherwise, the function returns false

    }

}