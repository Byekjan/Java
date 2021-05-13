package com.Leetcode;

public class Ch50Pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        double result = myPow(x, n);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        double total = 0;
        if (-100 >= x || x >= 100 || Integer.MAX_VALUE < n || Integer.MIN_VALUE > n ) {
            return 0;
        }

        total = Math.pow(x, n);
        if (total > 10000 || -10000 > total  ) {
            return 0;
        }

        return total;
    }
}
