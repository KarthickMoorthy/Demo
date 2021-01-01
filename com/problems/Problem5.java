package com.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class Problem5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String,Integer> magazineMap = new HashMap<>();
        HashMap<String,Integer> noteMap = new HashMap<>();
        HashMap<String,Integer> commonMap = new HashMap<>();

        if(note.length>magazine.length){
            System.out.println("No");
        }

        fillMap(magazine, magazineMap);
        fillMap(note, noteMap);
        final Boolean result = checkIntersection(magazineMap,noteMap,commonMap);

        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    private static Boolean checkIntersection(HashMap<String, Integer> magazineMap, HashMap<String, Integer> noteMap, HashMap<String, Integer> commonMap) {
        boolean flag = true;
        for (Map.Entry<String,Integer> note : magazineMap.entrySet()){

            if(magazineMap.containsKey(note.getKey())){
                if(note.getValue() > magazineMap.get(note.getKey())){
                    flag = false;
                }
            }else{
                flag = false;
            }
        }


        return flag;
    }

    private static void fillMap(String[] sentence, HashMap<String, Integer> map) {
        for (String s : sentence) {
            int count = 0;
            if (map.containsKey(s)) {
                int counter = map.get(s);
                map.put(s, counter+1);
            } else {
                map.put(s, count+1);
            }
        }
    }
}

