package com.wordBreak;

import java.util.ArrayList;

public class Option {
    int nextIndex;
    ArrayList<String> listOfWords = new ArrayList<>();

    public Option(int nextIndex, ArrayList<String> listOfWords) {
        this.nextIndex = nextIndex;
        this.listOfWords.addAll(listOfWords);
    }
}
