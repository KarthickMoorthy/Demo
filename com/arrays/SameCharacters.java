package com.arrays;

import java.util.Arrays;

public final class SameCharacters {

    /**
     * Driver Program for checking same characters in a String.
     *
     * @param args Main Method Args.
     */
    public static void main(final String... args)
    {
        final String str1 = "Loot";
        final String str2 = "Pool";
        final char[] charArray1 = str1.toLowerCase().toCharArray();
        final char[] charArray2 = str2.toLowerCase().toCharArray();

        if(charArray1.length != charArray2.length){
            System.out.println("The words do not have the same characters");
        } else  {
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
           if (Arrays.equals(charArray1, charArray2)){
               System.out.println("The words do have the same characters");
           } else {
               System.out.println("The words do not have the same characters");
           }
        }

    }
}
