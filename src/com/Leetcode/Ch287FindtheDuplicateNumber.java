package com.Leetcode;

import java.util.Arrays;

public class Ch287FindtheDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {1, 3, 4, 2, 2};
        int result = findDuplicate(nums);
        System.out.println(result);
    }

    public static int findDuplicate(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for ( int i = 0; i < nums.length; i++) {
            if ( i > 0 && nums[i] == nums[i - 1]) {
                result = nums[i];
                break;
            } else {
                result = nums[i];
            }
        }
        return result;
    }
}
