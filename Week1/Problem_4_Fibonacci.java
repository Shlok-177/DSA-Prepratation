// Write A code for the Print first n number of Fibonacci series

import java.util.Scanner;

public class Problem_4_Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int a = 0;
        int b = 1;
        int c;
        System.out.print("Enter the number:- ");
        num = sc.nextInt();

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c= a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
