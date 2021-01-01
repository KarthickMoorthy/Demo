package com.problems;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class Problem4 {
    public static void main(String[] args) {
        int n = 8;
        String s = "UDDDUDUU";

        int result = countingValleys(n, s);
    }

    private static int countingValleys(int n, String s) {
        int level = 0; //Start at sea level
        int valleys = 0;
        boolean belowSea = false;

        for(int i = 0; i < n; i++)
        {
            char slope = s.charAt(i);
            if(slope == 'U')//Uphill
                level++;
            else//Downhill
                level--;

            //Handle transitions
            if(!belowSea && level < 0)
            {
                valleys++;
                belowSea = true;
            }

            if(level >= 0)//We are back above sea level
                belowSea = false;
        }
        System.out.println(valleys);
        return valleys;
    }
}
