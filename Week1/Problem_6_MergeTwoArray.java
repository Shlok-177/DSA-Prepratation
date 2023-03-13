// Write a function that takes in two arrays and merges them into a single sorted array.

public class Problem_6_MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}

// This code takes in two arrays arr1 and arr2 and initializes a new array result of size n1 + n2 to store the merged array. It then uses three indices i, j, and k to iterate through arr1, arr2, and result, respectively. The while loop compares the elements of arr1 and arr2 and inserts the smaller element into result at index k. The loop continues until either arr1 or arr2 has been fully traversed.

// The remaining elements of the array that has not been fully traversed yet are then appended to the end of result. Finally, the merged and sorted result array is returne