package com.Leetcode;
import java.util.Arrays;
public class Ch35SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 3;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int result;
        int index = Arrays.binarySearch(nums, target);
        if (index < 0)
            return Math.abs(index)-1;

        return index;
    }
}
