package omprakash.scoring.wordscount;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordsCountTest {

    private WordsCount wordsCount = new WordsCount();


    @Test
    public void nothing() {
    }

    @Test
    public void givenSingleWord_returnsOne() {
        int count = wordsCount.getWordsCount("Om");
        assertEquals(1, count);
    }

    @Test
    public void givenEmpty_returnsZero() {
        int count = wordsCount.getWordsCount("");
        assertEquals(0, count);
    }

    @Test
    public void givenTwoWords_returnsTwo() {
        int count = wordsCount.getWordsCount("Om prakash");
        assertEquals(2, count);
    }

    @Test
    public void givenTwoWordsWithMultipleSpaces_returnsTwo() {
        int count = wordsCount.getWordsCount("Om        prakash");
        assertEquals(2, count);
    }

    @Test
    public void givenOneWordWithSpacesInFrontAndBack_returnsTwo() {
        int count = wordsCount.getWordsCount(" Om ");
        assertEquals(1, count);
    }

    @Test
    public void givenThreeWords_returnsThree() {
        int count = wordsCount.getWordsCount("Java, Android, Kotlin");
        assertEquals(3, count);
    }
}
