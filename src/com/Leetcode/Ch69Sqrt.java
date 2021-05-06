package com.Leetcode;

public class Ch69Sqrt {
    public static void main(String[] args) {
        int x = 25;
        long result = sqrt(x);
        System.out.println(result);
    }

    public static int sqrt(int x) {
        int sqrt = 0;
        sqrt = (int) Math.sqrt(x);
        if (0 <= sqrt || sqrt <= Integer.MAX_VALUE)
            return sqrt;
        else
            return 0;
    }

}
