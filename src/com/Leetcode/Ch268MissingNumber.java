//Mash sain oilgson bodlogo algorithmiin oilgoson bolno;

package com.Leetcode;

import java.util.Arrays;

public class Ch268MissingNumber {
    public static void main(String[] args) {
        int [] nums = {1};
        int result = missingNumber(nums);
        System.out.println(result);
    }

    public static int missingNumber(int[] nums) {

        int arrLength = nums.length;
        int sum = 0;
        int nums_sum = 0;

        for(int i = 0; i<= arrLength; i++){
            sum += i;
        }

        for(int i : nums){
            nums_sum += i;
        }

        System.out.println(sum + " " + nums_sum);
        return sum - nums_sum;

    }

    //Solution one
    public static int missingNumber1(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        if (nums.length <= 1 && nums[0] == 0) {
            return nums[0] + 1;
        } else if (nums[0] >= 1) {
            return nums[0] - 1;
        }

        for ( int i = 0; i < nums.length; i++ ) {
            if ( i > 0 && nums[i] - 1 != nums[i - 1]) {
                result = nums[i] - 1;
                break;
            } else {
                result = nums[i] + 1;
            }
        }
        return result;
    }
}
