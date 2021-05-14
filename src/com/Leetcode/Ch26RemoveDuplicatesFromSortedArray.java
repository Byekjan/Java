package com.Leetcode;

public class Ch26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int length = 1;
        for (int i = 1; i < nums.length; i++)
            if (nums[i-1]!=nums[i])
                nums[length++] = nums[i];
                System.out.println(nums[length++]);

        return length;
    }
}
