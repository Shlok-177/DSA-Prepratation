// Write a code for wether a number is Palindrome or not.
// for example:- 12321 this number is Palindrom

// Write a function that takes in a string and checks if it is a palindrome (reads the same forwards and backwards).
// for example:- ABCba is a Palindrom String

import java.util.*;

public class Problem_3_Palindrome {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String reverse = "";

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        reverse = ch + reverse ;
    }
    if(str.toLowerCase().equals(reverse.toLowerCase())) System.out.println(str + " is Palindrom String");
    else System.out.println(str + " is not Palindrom String");

  }
}
