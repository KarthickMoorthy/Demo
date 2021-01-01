package com.problems;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysProblem {
    public static void main(String[] args) {
        uniqueCharacterDetector("abx");
        permutationDetector("abc", "cca");
        secondLargestNumber(new int[]{3, 6, 1, 9, 4});

        final String[] words  = {"Karthick", "Vidhya"};

        long count = Arrays.stream(words).filter(x-> x.equals("Karthick")).count();

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(" name Flat Stream "+ namesFlatStream);

        System.out.println("The long count "+ count);

        String result = compressString("aaabbbcc");
        String actualResult = actualcompress("aaabbbcc");
        System.out.println("The actual Compressed result : " + actualResult);
        final LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(7);
        list.add(9);
        removeDuplicatesinList(list);

        final Stack<Integer> first = new Stack<>();
        first.push(5);
        first.push(2);
        first.push(8);

        final Stack<Integer> second = new Stack<>();
        second.push(2);
        second.push(9);
        second.push(4);

        adder(first,second);

    }

    private static void adder(Stack<Integer> first, Stack<Integer> second) {
        int carry = 0;
        int result = 0;
        final Stack<Integer> third = new Stack<>();
        while(!first.empty()){
                int sum = first.pop()+second.pop()+carry;
                carry = sum/10;
                result = sum%10;
                third.push(result);
        }

        System.out.println("The result stack is  :"+ third);
    }

    private static void removeDuplicatesinList(LinkedList<Integer> list) {
        LinkedList<Integer> cleanList = new LinkedList<>();
        for(Integer a : list){
            if(!cleanList.contains(a)){
                cleanList.add(a);
            }
        }

        System.out.println("The cleaned list  "+ cleanList);
    }

    // actual solution to compress string
    private static String actualcompress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            // If next char different, append this result
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    // My Attempt
    private static String compressString(String text) {
        StringBuilder result = new StringBuilder();
        char[] charArray = text.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        char previous = charArray[0];
        int count = 0;
        for(int i=0; i<charArray.length;i++){
            if(charArray[i] != previous){
                int counter = map.get(previous);
                if(counter >1){
                    result.append(previous).append(counter);
                }
                else{
                    result.append(previous);
                }
                count = 0;
            }
                previous = charArray[i];
                count = count + 1;
                map.put(previous,count);

        }

        // Build the result
        System.out.println("The map is " + map);
        System.out.println("The result is  " + result);
        return result.toString();
    }

    private static void secondLargestNumber(int[] numbers) {
        int max = 0 ;
        int secondMax = 0;

        // find the Largest Number
        for (int number : numbers) {
            if (number >= max) {
                max = number;
            }
        }

        //find the second Largest number
        for (int number : numbers) {
            if (number!=max && number>secondMax) {
                secondMax = number;
            }
        }


        System.out.println("The max number is " + max);
        System.out.println("The Second max number is " + secondMax);
    }

    private static void permutationDetector(String text, String perm) {
        if(text.length()!= perm.length()) {
            System.out.println("Not a permutation");
        }
            char[] charArray = text.toCharArray();
            char[] permArray = perm.toCharArray();
            Set<Character> set = new HashSet<>();
            Set<Character> permset = new HashSet<>();


            for (char c : charArray) { set.add(c);}
            for (char c : permArray) {
                if (!set.contains(c)) {
                    System.out.println("Not a Permutation");
                }else{
                    permset.add(c);
                }
            }

            if(!set.equals(permset)){
                System.out.println("Not a Permutation");
            }
    }

    private static void uniqueCharacterDetector(String text) {
         char[] charArray = text.toCharArray();
         Set<Character> set = new HashSet<>();
        for (char c : charArray) {
            if (set.contains(c)) {
                System.out.println("Contains Duplicate");
            } else {
                set.add(c);
            }
        }
    }
}
