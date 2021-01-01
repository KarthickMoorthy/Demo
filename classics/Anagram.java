package classics;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String text1= "state";
        String text2 = "taste";

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> mappy = new HashMap<>();

        char[] M = text1.toCharArray();
        char[] V = text2.toCharArray();

        for(char c: M ){
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count ++);
            } else {
                map.put(c,1);
            }
        }

        for(char s: V ){
            if(map.containsKey(s)){
                int count = map.get(s);
                mappy.put(s, count ++);
            } else {
                map.put(s,1);
            }
        }

        if(map.equals(mappy)){
            System.out.println("They are Anagram");
        } else {
            System.out.println("they are not Anagram");
        }
    }
}
