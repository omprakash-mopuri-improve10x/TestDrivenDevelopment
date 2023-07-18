package omprakash.tdd.scoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoringTest {

    private Scoring scoring;

    @BeforeEach
    public void setup() {
        scoring = new Scoring();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsZeroZeroZero() {
        int[] nullScores = scoring.calculateScores(null);
        assertArrayEquals(new int[3], nullScores);
    }

    @Test
    public void givenEmpty_returnsZeroZeroZero() {
        int[] emptyScore = scoring.calculateScores("");
        assertArrayEquals(new int[] {0, 0, 0}, emptyScore);
    }

    @Test
    public void givenA_returnsOneZeroZero() {
        int[] aScore = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1, 0, 0}, aScore);
    }

    @Test
    public void givenB_returnsZeroOneZero() {
        int[] bScore = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0, 1, 0}, bScore);
    }

    @Test
    public void givenC_returnsZeroZeroOne() {
        int[] cScore = scoring.calculateScores("C");
        assertArrayEquals(new int[] {0, 0, 1}, cScore);
    }

    @Test
    public void givenAB_returnsOneOneZero() {
        int[] abScore = scoring.calculateScores("AB");
        assertArrayEquals(new int[] {1, 1, 0}, abScore);
    }

    @Test
    public void givenABC_returnsOneOneOne() {
        int[] abcScore = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, abcScore);
    }

    @Test
    public void givenABCAB_returnsTwoTwoOne() {
        int[] abcabScore = scoring.calculateScores("ABCAB");
        assertArrayEquals(new int[] {2, 2, 1}, abcabScore);
    }

    @Test
    public void givenABCABabc_returnsTwoTwoOne() {
        int[] abcababcScore = scoring.calculateScores("ABCABabc");
        assertArrayEquals(new int[] {2, 2, 1}, abcababcScore);
    }

    @Test
    public void givenabc_returnsZeroZeroZero() {
        int[] abcScore = scoring.calculateScores("abc");
        assertArrayEquals(new int[] {0, 0, 0}, abcScore);
    }

    @Test
    public void givenAnyTypeOfCases_returnsResult() {
        assertArrayEquals(new int[] {1, 0, 0}, scoring.calculateScores("Hi Arya"));
        assertArrayEquals(new int[] {1, 1, 1}, scoring.calculateScores("Aa Bb Cc"));
        assertArrayEquals(new int[] {2, 1, 1}, scoring.calculateScores("BCAcbAb"));
    }
}