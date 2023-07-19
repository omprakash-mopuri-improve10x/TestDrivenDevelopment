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

    @Test
    public void givenOneTwo_returnsOne() {
        int result = war.warOfNumbers(new int[] {1, 2});
        assertEquals(1, result);
    }

    @Test
    public void givenOne_returnsOne() {
        int result = war.warOfNumbers(new int[] {1});
        assertEquals(1, result);
    }

    @Test
    public void givenOneThreeFour_returnsZero() {
        int result = war.warOfNumbers(new int[] {1, 3, 4});
        assertEquals(0, result);
    }

    @Test
    public void givenLongInput_returnsProperResult() {
        int result = war.warOfNumbers(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
        assertEquals(168, result);
    }

    @Test
    public void givenMinusOneThree_returnsTwo() {
        int result = war.warOfNumbers(new int[] {-1, 3});
        assertEquals(2, result);
    }

    @Test
    public void givenWithNegativeNumbers_returnsProperResult() {
        int result = war.warOfNumbers(new int[] {-1, 3, -2 , -4, 4});
        assertEquals(4, result);
    }
}
