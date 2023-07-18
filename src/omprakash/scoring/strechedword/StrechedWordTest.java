package omprakash.scoring.strechedword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrechedWordTest {

    private StrechedWord strechedWord = new StrechedWord();

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnsEmpty() {
        String result = strechedWord.getStrechedWord("");
        assertEquals("", result);
    }

    @Test
    public void givenNull_returnsEmpty() {
        String result = strechedWord.getStrechedWord(null);
        assertEquals("", result);
    }

    @Test
    public void givenHi_returnsHi() {
        StrechedWord strechedWord = new StrechedWord();
        String result = strechedWord.getStrechedWord("Hi");
        assertEquals("Hi", result);
    }

    @Test
    public void givenHii_returnsHi() {
        String result = strechedWord.getStrechedWord("Hii");
        assertEquals("Hi", result);
    }

    @Test
    public void givenHIi_returnsHI() {
        String result = strechedWord.getStrechedWord("HIi");
        assertEquals("HI", result);
    }
    @Test
    public void givenH_returnsH() {
        String result = strechedWord.getStrechedWord("H");
        assertEquals("H", result);
    }

    @Test
    public void givenPpoeemm_returnsPoem() {
        String result = strechedWord.getStrechedWord("Ppoeemm");
        assertEquals("Poem", result);
    }

    @Test
    public void givenHiHellloo_returnsHiHelo() {
        String result = strechedWord.getStrechedWord("Hii Hellloo");
        assertEquals("Hi Helo", result);
    }
}