package com.Leetcode;

public class Ch27RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 1; i < nums.length+1; i++)
            if (nums[i-1] != val)
                nums[length++] = nums[i-1];

        return length;
    }
}
