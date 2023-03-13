import java.util.Arrays;

// Write a function that takes in an array of integers and returns a new array with all the even numbers from the original array.

public class Problem_9_EvenNumofOrignal {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = {1, 3, 5};

        int[] evenNumbers1 = getEvenNumbers(arr1);
        int[] evenNumbers2 = getEvenNumbers(arr2);
        int[] evenNumbers3 = getEvenNumbers(arr3);

        System.out.println("Even numbers from array 1: " + Arrays.toString(evenNumbers1));
        System.out.println("Even numbers from array 2: " + Arrays.toString(evenNumbers2));
        System.out.println("Even numbers from array 3: " + Arrays.toString(evenNumbers3));
    }
    public static int[] getEvenNumbers(int[] arr) {

        // Count the number of even numbers in the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

}