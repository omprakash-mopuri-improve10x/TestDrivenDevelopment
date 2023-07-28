package omprakash.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimorialTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenMinusOne_returnMinusOne() {
        Primorial primorial = new Primorial();
        int negativePrimorial = primorial.findPrimorial(-1);
        assertEquals(-1, negativePrimorial);
    }

    @Test
    public void givenMinusTwo_returnMinusOne() {
        Primorial primorial = new Primorial();
        int negativePrimorial = primorial.findPrimorial(-2);
        assertEquals(-1, negativePrimorial);
    }

    @Test
    public void givenZero_returnMinusOne() {
        Primorial primorial = new Primorial();
        int negativePrimorial = primorial.findPrimorial(0);
        assertEquals(-1, negativePrimorial);
    }
}
