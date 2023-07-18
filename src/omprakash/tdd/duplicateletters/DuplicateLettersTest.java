package omprakash.tdd.duplicateletters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicateLettersTest {

    private DuplicateLetters duplicateLetters = new DuplicateLetters();

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnsEmpty() {
        String duplicates = duplicateLetters.printDuplicateLetters("");
        assertEquals("", duplicates);
    }

    @Test
    public void givenAabb_returnsB() {
        String duplicates = duplicateLetters.printDuplicateLetters("Aabb");
        assertEquals("b", duplicates);
    }

    @Test
    public void givenNothing_returnsEmpty() {
        String duplicates = duplicateLetters.printDuplicateLetters("Nothing");
        assertEquals("", duplicates);
    }

    @Test
    public void givenMultipleSpaces_returnsProperOutput() {
        String duplicates = duplicateLetters.printDuplicateLetters(" Hi guys");
        assertEquals("", duplicates);
    }

    @Test
    public void givenAABBCCA_returnABC() {
        String duplicates = duplicateLetters.printDuplicateLetters("AABBCCA");
        assertEquals("ABC", duplicates);
    }

    @Test
    public void givenSpecialChara_return() {
        String duplicates = duplicateLetters.printDuplicateLetters("*All complete && the task*");
        assertEquals("*let&", duplicates);
    }

    @Test
    public void given123451_returns1() {
        String duplicates = duplicateLetters.printDuplicateLetters("123451");
        assertEquals("1", duplicates);
    }
}
