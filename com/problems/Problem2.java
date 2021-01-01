package com.problems;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Problem2 {
    int resultStart;
    int resultLength;
    public String longestPalindrome(String s) {
        for(int start = 0; start < s.length()-1; start ++){
            expandRange(s, start, start);
            expandRange(s, start, start+1);
        }
        return  s.substring(resultStart, resultStart+resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }

    }


}
