package omprakash.tdd.warofnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarTest {

    private War war = new War();

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsMinusOne() {
        int result = war.warOfNumbers(null);
        assertEquals(-1, result);
    }

    @Test
    public void givenEmpty_returnsMinusOne() {
        int result = war.warOfNumbers(new int[] {});
        assertEquals(-1, result);
    }
}
