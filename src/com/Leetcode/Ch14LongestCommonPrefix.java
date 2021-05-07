package com.Leetcode;

public class Ch14LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs  = { "flower","flow","flight" };
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];   //first element arrays
        for (int i=1; i < strs.length; i++) {      //lenght3
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
