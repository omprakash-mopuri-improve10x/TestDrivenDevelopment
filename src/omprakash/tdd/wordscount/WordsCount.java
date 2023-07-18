package omprakash.tdd.wordscount;

public class WordsCount {

    public int getWordsCount(String text) {
        if (text.equals("")) {
            return 0;
        } else {
            String[] words = text.trim().split("\\s+");
            return words.length;
        }
    }
}
