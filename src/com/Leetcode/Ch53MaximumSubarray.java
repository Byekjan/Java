package com.Leetcode;

public class Ch53MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {1,2,3, 7};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {
        int [] table = new int[nums.length];
        int max = nums[0];
        table[0] = nums[0];
        for (int i=1; i < nums.length; i++)
        {
            table[i] = Math.max(nums[i], nums[i] + table[i-1]);
            max = Math.max(max, table[i]);
        }
        return max;
    }
}
