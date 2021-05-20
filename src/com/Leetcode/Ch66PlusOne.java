package com.Leetcode;    //best solution

import java.util.ArrayList;
import java.util.Arrays;

public class Ch66PlusOne {
    public static void main(String[] args) {
        int [] digits = {1, 2, 3};
        int [] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int [] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
