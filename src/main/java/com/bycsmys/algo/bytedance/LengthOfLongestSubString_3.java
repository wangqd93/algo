package com.bycsmys.algo.bytedance;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 3
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubString_3 {

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("abba");
        System.out.println(i);
    }


    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            left = map.get(c) == null ? left : Math.max(map.get(c) + 1, left);
            map.put(c, i);
            max = Math.max(i - left + 1, max);
        }

        return max;
    }
}
