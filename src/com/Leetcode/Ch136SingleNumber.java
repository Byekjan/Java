// Solved  but  ergej harah daraan algorithmiin sain  oilgoh
package com.Leetcode;

import java.util.Arrays;

public class Ch136SingleNumber {
    public static void main(String[] args) {
        int [] nums = {4 ,4,2,5,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
