package com.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ch13RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInteger(s);
        System.out.println(result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> convertedNumbers = new HashMap<>();
        convertedNumbers.put('I', 1);
        convertedNumbers.put('V', 5);
        convertedNumbers.put('X', 10);
        convertedNumbers.put('L', 50);
        convertedNumbers.put('C', 100);
        convertedNumbers.put('D', 500);
        convertedNumbers.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && convertedNumbers.get(s.charAt(i)) > convertedNumbers.get(s.charAt(i - 1))) {
                result += convertedNumbers.get(s.charAt(i)) - 2 * convertedNumbers.get(s.charAt(i - 1));
            } else {
                result += convertedNumbers.get(s.charAt(i));
            }
        }
        return result;
    }
}
