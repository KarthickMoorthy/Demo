package com.wordBreak;

import java.util.*;

public class WordBreak {

    Set<String> dictionary = new HashSet<>();
    public WordBreak() {
        dictionary.add("mobile");
        dictionary.add("samsung");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("man");
        dictionary.add("go");
        dictionary.add("mango");
        dictionary.add("icecream");
        dictionary.add("and");
        dictionary.add("i");
        dictionary.add("love");
    }

    public static void main(String[] args) {
       new WordBreak().breakWordNow("ilovesamsungandmango");
    }

    private void breakWordNow(String word){
        Queue<Option> q = new LinkedList<>();

        q.add(new Option(0, new ArrayList<>()));

        while(!q.isEmpty()){
            Option option = q.poll();
            if(option.nextIndex >= word.length()){
                System.out.println(option.listOfWords);
            }

          for(int i=option.nextIndex; i<=word.length(); i++){
              String oneWord = word.substring(option.nextIndex, i);
              if(dictionary.contains(oneWord)){
                 Option newOption =  new Option(i, option.listOfWords);
                 newOption.listOfWords.add(oneWord);
                 q.add(newOption);
              }
          }
        }
    }


}
