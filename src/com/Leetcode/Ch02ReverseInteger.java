package com.Leetcode;

public class Ch02ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        long result = reverseInteger(x);
        System.out.println(result);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    public static long reverseInteger(int x) {
        int rem;
        long rev = 0;
        while ( x != 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            if (Integer.MAX_VALUE < rev || Integer.MIN_VALUE > rev)
                return 0;
            x = x/10;
        }

        return rev;
    }
}

