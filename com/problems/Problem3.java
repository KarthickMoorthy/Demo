package com.problems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class Problem3 {
    public static void main(String[] args) {
        int n = 9 ;
        int[] ar = new int[]{10, 20, 20 ,10, 10, 30, 50, 10, 20};
        int result = sockMerchant(n, ar);
        System.out.println("the total pair : "+result);
        System.out.println(Arrays.stream(ar).map(count -> count / 2).sum());
    }

    private static int sockMerchant(int n, int[] ar) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            if(map.containsKey(ar[i])){
                int count =  map.get(ar[i])+1;
                map.put(ar[i], count);
                if(count%2==0){
                    result = result +1;
                    map.put(ar[i], 0);
                }
            }else{
                map.put(ar[i], 1);
            }
        }
        return result;
    }
}
