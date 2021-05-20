package com.Leetcode;

public class Ch28ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "aaaad";
        String needle = "d";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        int result = haystack.indexOf(needle);
        return result;
    }
}
