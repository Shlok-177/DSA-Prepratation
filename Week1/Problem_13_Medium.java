import java.util.Arrays;

// Write a function that takes in an array of integers and returns the median of that array.

public class Problem_13_Medium {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 6};

        double median1 = findMedian(nums1);
        double median2 = findMedian(nums2);

        System.out.println("The median of " + Arrays.toString(nums1) + " is " + median1);
        System.out.println("The median of " + Arrays.toString(nums2) + " is " + median2);
    }
    public static double findMedian(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order

        int n = nums.length;
        if (n % 2 == 0) {
            // If the length of the array is even, return the average of the two middle elements
            int midIndex1 = n / 2 - 1;
            int midIndex2 = n / 2;
            return (double) (nums[midIndex1] + nums[midIndex2]) / 2;
        } else {
            // If the length of the array is odd, return the middle element
            int midIndex = n / 2;
            return (double) nums[midIndex];
        }
    }

}