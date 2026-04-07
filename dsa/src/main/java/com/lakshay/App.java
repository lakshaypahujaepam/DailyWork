package com.lakshay;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mirrorFrequency(String s) {

        Map<Character, Integer> mp = new HashMap<>();
        // mp to store freq;
        Map<Character, Boolean> mark = new HashMap<>();

        for(char ch = 'a'; ch <= 'z'; ch++) {
            mark.put(ch, false);
        }

        for(char ch = '0'; ch <= '9'; ch++) {
            mark.put(ch, false);
        }

//        System.out.println(mark);

        for(char ch:s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            // if there adds 1, else put 0 + 1
        }

//        System.out.println(mp);

        int count = 0;

        for(char ch : s.toCharArray()) {

            char mirrorChar = '-';

            if(ch >= 'a' && ch <= 'z') {
                System.out.println((int) ch);
                mirrorChar = (char) (65 + (90 - (int) ch));
            } else if (ch >= '0' && ch <= '9') {
                System.out.println((int) ch);
                mirrorChar = (char) (48 + (57 - (int) ch));
            } else if(mark.get(ch) == true){
                continue;
            }else {
                continue;
            }

//            System.out.println(mirrorChar);

            mark.put(ch, true);
            mark.put(mirrorChar, true);

            int finalFreq = Math.abs(mp.getOrDefault(ch, 0) - mp.getOrDefault(mirrorChar, 0));
            count += finalFreq;

        }

        return count;
    }
}
public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mirrorFrequency("ab1z9"));
    }
}
