package omprakash.tdd.maximumgap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumGapTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsMinusNumber() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(null);
        assertEquals(-1, result);
    }

    @Test
    public void givenEmpty_returnsMinusNumber() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {});
        assertEquals(-1, result);
    }

    @Test
    public void givenSingleNumber_returnsMinusNumber() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {1});
        assertEquals(-1, result);
    }

    @Test
    public void givenOneTwo_returnsOne() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {1, 2});
        assertEquals(1, result);
    }

    @Test
    public void givenOneTwoFourTen_returnsSix() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {1, 2, 4, 10});
        assertEquals(6, result);
    }

    @Test
    public void givenMinusOneMinusTwo_returnsOne() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {-1, -2});
        assertEquals(1, result);
    }

    @Test
    public void givenMinusOneTwo_returnsThree() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {-1, 2});
        assertEquals(3, result);
    }

    @Test
    public void givenMinusOneMinusTwoTwoFour_returnsFour() {
        MaximumGap maximumGap = new MaximumGap();
        int result = maximumGap.getMaxGap(new int[] {-1, -2, 2, 4});
        assertEquals(4, result);
    }
}
