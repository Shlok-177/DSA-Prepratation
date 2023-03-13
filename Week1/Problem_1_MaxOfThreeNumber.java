import java.util.Scanner;

// Find the Maximum number among the three numbers

class Problem_1_MaxOfThreeNumber {
    public static void main(String[] args) {
      int num1 , num2 , num3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter three Number");
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      num3 = sc.nextInt();
      int max = num1;

      if(num2 >= max){max = num2;}
      if(num3 >= max){max = num3;}

        System.out.println("Maximum number is " + max);

    }
}

// The program begins by declaring three integer variables num1, num2, and num3, and a Scanner object sc to read input from the user. Then, the program prompts the user to enter three numbers using the println method of the System.out object, and reads the input using the nextInt method of the Scanner object.

// Next, the program initializes a new integer variable max with the value of num1, assuming that num1 is the maximum number. The program then uses a series of conditional statements (using the if keyword) to check whether num2 or num3 are greater than max. If either num2 or num3 is greater than max, the program assigns the value of the larger number to max.

// Finally, the program outputs the maximum number using the println method of the System.out object.