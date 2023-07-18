package omprakash.scoring.strechedword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StretchedWordTest {

    private StretchedWord stretchedWord = new StretchedWord();

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnsEmpty() {
        String result = stretchedWord.getStretchedWord("");
        assertEquals("", result);
    }

    @Test
    public void givenNull_returnsEmpty() {
        String result = stretchedWord.getStretchedWord(null);
        assertEquals("", result);
    }

    @Test
    public void givenHi_returnsHi() {
        StretchedWord stretchedWord = new StretchedWord();
        String result = stretchedWord.getStretchedWord("Hi");
        assertEquals("Hi", result);
    }

    @Test
    public void givenHii_returnsHi() {
        String result = stretchedWord.getStretchedWord("Hii");
        assertEquals("Hi", result);
    }

    @Test
    public void givenHIi_returnsHI() {
        String result = stretchedWord.getStretchedWord("HIi");
        assertEquals("HI", result);
    }
    @Test
    public void givenH_returnsH() {
        String result = stretchedWord.getStretchedWord("H");
        assertEquals("H", result);
    }

    @Test
    public void givenPpoeemm_returnsPoem() {
        String result = stretchedWord.getStretchedWord("Ppoeemm");
        assertEquals("Poem", result);
    }

    @Test
    public void givenHiHellloo_returnsHiHelo() {
        String result = stretchedWord.getStretchedWord("Hii Hellloo");
        assertEquals("Hi Helo", result);
    }
}