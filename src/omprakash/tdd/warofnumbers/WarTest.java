package omprakash.tdd.warofnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsMinusOne() {
        War war = new War();
        int result = war.warOfNumbers(null);
        assertEquals(-1, result);
    }
}
