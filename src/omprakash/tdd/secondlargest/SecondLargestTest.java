package omprakash.tdd.secondlargest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    private SecondLargest secondLargest = new SecondLargest();

    @Test
    public void nothing() {
    }

    @Test
    public void givenOneTwo_returnsZero() throws InvalidInputException {
        int secondMax = secondLargest.getSecondLargest(new int[] {1, 2});
        assertEquals(1, secondMax);
    }

    @Test
    public void given715364_returns6() throws InvalidInputException {
        assertEquals(6, secondLargest.getSecondLargest(new int[] {7,1,5,3,6,4}));
    }

    @Test
    public void givenNegativeNumbers_returnsSecondLargest() throws InvalidInputException {
        assertEquals(4, secondLargest.getSecondLargest(new int[] {-1,6,4,4}));
        assertEquals(-1, secondLargest.getSecondLargest(new int[] {-1,-2, -5, 9}));
    }

    @Test
    public void givenSameNumbers_returns1() throws InvalidInputException {
        assertEquals(Integer.MIN_VALUE, secondLargest.getSecondLargest(new int[] {3, 3}));
    }

    @Test
    public void givenMultipleSameNumbers_returns1() throws InvalidInputException {
        assertEquals(2, secondLargest.getSecondLargest(new int[] {3, 3, 2, 2}));
    }
}