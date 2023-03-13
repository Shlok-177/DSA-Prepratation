//1:-  Count that how many times particalar number is accur in whole number
// for example : count 3 in 2356623 then output is: 2

//2:- Reverse the number and store that number in one variable

/* Code 1 */

import java.util.Scanner;

public class Problem_2_CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a digit to count: ");
        int digit = sc.nextInt();
        int count = 0;
        while (number != 0) {
            int remainder = number % 10;
            if (remainder == digit) {
                count++;
            }
            number /= 10;
        }
        System.out.println("The digit " + digit + " occurs " + count + " times in the number.");
    }
}


/*The program prompts the user to enter a number and a digit to count. It then initializes a count variable to zero and uses a while loop to process each digit in the number. The loop extracts the rightmost digit using the modulo operator (%) and checks if it is equal to the specified digit. If it is, the program increments the count variable. The loop then removes the rightmost digit from the number by integer division (/) with 10.

Finally, the program outputs the number of times the digit occurs in the number. */


// code 2 :- Reverse the number



 class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("The reversed number is: " + reversed);
    }
}



