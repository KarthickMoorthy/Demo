package com.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem1 {


    public static void main(String[] args) {
        int length = lengthOfLongestSubstring( "abcabcbb");
        String longestSubString = getUniqueCharacterSubstringBruteForce("abcabcbb");
        String optimizedLongestSubString = getUniqueCharacterSubstring("abcabcbb");
        System.out.println("The length of the longest substring : "+ length);
        System.out.println("The longest substring using Brute Force: "+ longestSubString);
        System.out.println("The longest substring using Optimized approach: "+ optimizedLongestSubString);

        int[] nums = {1,1,2};
        Set<Integer> numSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            numSet.add(nums[i]);
        }

        int[] myIntArray = new int[numSet.size()];

        nums = numSet.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(nums);
        System.out.println(numSet.size());
    }

    private  static int lengthOfLongestSubstring(String s) {

        int globalCount = 0;
        int count = 0;
        char[] c= s.toCharArray();
        char prev = c[0];
        for(int i = 1; i<s.length()-1; i++){
            if(count > globalCount){
                globalCount = count;
            }
           if(prev == c[i]){
               count = count +1;
           }else{
               count = 0;
           }
           prev = c[i];
        }

        return globalCount;
    }

    private static String getUniqueCharacterSubstringBruteForce(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
        return output;
    }


    private static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }

        System.out.println("Map of the visited  "+ visited );
        return output;
    }
}
