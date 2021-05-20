package com.Leetcode;

import java.util.Arrays;

public class Ch58LengthofLastWord {
    public static void main(String[] args) {
        String s = "world asd asd asd asd dd";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;
        String[] words = s.split(" ");
        if(words.length > 0) {
            String getLast = words[words.length-1];
            result = getLast.length();
        } else {
            result = 0;
        }

        return result;
    }
}
