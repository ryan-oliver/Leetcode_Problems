/* Given an array, rotate the array to the right by k steps, where k is non-negative. */

public class RotateArray {

    // Test method
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,11};
        int k = 99;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ,");
    }


    public static void rotate(int[] nums, int k) {
        int[] nums2 = new int[nums.length]; // New array to hold transformed array
        int rotationIndex = Math.abs(k % nums.length); // Find index shift
        if (k > 0 && (k % nums.length) != 0) { // Only rotate if necessary
            for (int i = 0, j = rotationIndex; i < (nums.length - rotationIndex); i++, j++)
                nums2[j] = nums[i]; // Move back end of array
            for (int i = 0, j = (nums.length - rotationIndex); i < rotationIndex; i++)
                nums2[i] = nums[i + j]; // Move front end of array
            for (int i = 0; i < nums.length; i++)
                nums[i] = nums2[i]; // Copy new array to nums[]
        }
    }
}
