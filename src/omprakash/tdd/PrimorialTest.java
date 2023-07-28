package omprakash.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimorialTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNegativeNumber_returnMinusOne() {
        Primorial primorial = new Primorial();
        int negativePrimorial = primorial.findPrimorial(-1);
        assertEquals(-1, negativePrimorial);
    }
}
