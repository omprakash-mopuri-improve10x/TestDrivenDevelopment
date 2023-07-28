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
        int zeroPrimorial = primorial.findPrimorial(0);
        assertEquals(-1, zeroPrimorial);
    }

    @Test
    public void givenOne_returnTwo() {
        Primorial primorial = new Primorial();
        int onePrimorial = primorial.findPrimorial(1);
        assertEquals(2, onePrimorial);
    }

    @Test
    public void givenTwo_returnSix() {
        Primorial primorial = new Primorial();
        int onePrimorial = primorial.findPrimorial(2);
        assertEquals(6, onePrimorial);
    }

    @Test
    public void givenEight_return9699690() {
        Primorial primorial = new Primorial();
        int onePrimorial = primorial.findPrimorial(8);
        assertEquals(9699690, onePrimorial);
    }
}
