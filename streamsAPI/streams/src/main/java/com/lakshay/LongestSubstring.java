package com.lakshay;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "abcabcdbb";
        System.out.println(lengthOfLongestSubstring(input)); // Output: 3
    }

    private static int lengthOfLongestSubstring(String str) {

        Set<Character> set = new HashSet<>();

        int i=0;
        int maxi = 0;

        for(int j=0; j<str.length(); j++) {
            while(set.contains(str.charAt(j))) {
                set.remove(str.charAt(i));
                i++;
            }

            set.add(str.charAt(j));
            maxi = Math.max(maxi, set.size());
        }

        return maxi;
    }
}
