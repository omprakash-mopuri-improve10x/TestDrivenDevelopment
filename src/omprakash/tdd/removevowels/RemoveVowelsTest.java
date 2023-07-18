package omprakash.tdd.removevowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {

    private RemoveVowels removeVowels = new RemoveVowels();

    @Test
    public void nothing() {
    }

    @Test
    public void  givenEmpty_returnsOm() {
        String result = RemoveVowels.removeVowels("");
        assertEquals("", result);
    }

    @Test
    public void  givenOm_returnsOm() {
        String result = RemoveVowels.removeVowels("Om");
        assertEquals("m", result);
    }

    @Test
    public void  givenRemove_returnsRmv() {
        String result = RemoveVowels.removeVowels("Remove");
        assertEquals("Rmv", result);
    }

    @Test
    public void  givenAeiOu_returnsEmpty() {
        String result = RemoveVowels.removeVowels("AeiOu");
        assertEquals("", result);
    }

    @Test
    public void  givenR_returnsR() {
        String result = RemoveVowels.removeVowels("R");
        assertEquals("R", result);
    }
}