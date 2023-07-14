package omprakash.scoring.wordscount;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordsCountTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenSingleWord_returnsOne() {
        WordsCount wordsCount = new WordsCount();
        int count = wordsCount.getWordsCount("Om");
        assertEquals(1, count);
    }

    @Test
    public void givenEmpty_returnsZero() {
        WordsCount wordsCount = new WordsCount();
        int count = wordsCount.getWordsCount("");
        assertEquals(0, count);
    }

    @Test
    public void givenTwoWords_returnsTwo() {
        WordsCount wordsCount = new WordsCount();
        int count = wordsCount.getWordsCount("Om prakash");
        assertEquals(2, count);
    }

    @Test
    public void givenTwoWordsWithMultipleSpaces_returnsTwo() {
        WordsCount wordsCount = new WordsCount();
        int count = wordsCount.getWordsCount("Om        prakash");
        assertEquals(2, count);
    }

    @Test
    public void givenOneWordWithSpacesInFrontAndBack_returnsTwo() {
        WordsCount wordsCount = new WordsCount();
        int count = wordsCount.getWordsCount(" Om ");
        assertEquals(1, count);
    }

    @Test
    public void givenThreeWords_returnsThree() {
        WordsCount wordsCount = new WordsCount();
        int count = wordsCount.getWordsCount("Java, Android, Kotlin");
        assertEquals(3, count);
    }
}
