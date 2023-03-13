import java.util.Arrays;

//  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example:-
// Input: nums = [2,2,1]
// Output: 1.

// Input: nums = [4,1,2,1,2]
// Output: 4

// Input: nums = [1]
// Output: 1

public class Problem_14_SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        int singleNumber1 = findSingleNumber(nums1);
        int singleNumber2 = findSingleNumber(nums2);
        int singleNumber3 = findSingleNumber(nums3);

        System.out.println("The single number in " + Arrays.toString(nums1) + " is " + singleNumber1);
        System.out.println("The single number in " + Arrays.toString(nums2) + " is " + singleNumber2);
        System.out.println("The single number in " + Arrays.toString(nums3) + " is " + singleNumber3);
    }

    public static int findSingleNumber(int[] nums) {
        int singleNumber = 0;

        for (int num : nums) {
            singleNumber ^= num; // XOR operation between each number and singleNumber
        }
        return singleNumber;
        // This function uses the bitwise XOR operator (^) to compare each element in the input array nums with a variable singleNumber. The XOR operator returns 1 if the two bits being compared are different, and 0 if they are the same. Therefore, if the same number appears twice in the array, the XOR operation will result in 0 (since 0 ^ 0 = 0 and 1 ^ 1 = 0). However, if a number appears only once in the array, the XOR operation will result in that number (since 0 ^ num = num).

    }

}