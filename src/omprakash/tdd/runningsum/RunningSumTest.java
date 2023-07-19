package omprakash.tdd.runningsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RunningSumTest {

    private RunningSum runningSum = new RunningSum();

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsEmpty() {
        int[] result = runningSum.getRunningSum(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnsEmpty() {
        int[] result = runningSum.getRunningSum(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenOneTwo_returnsOneThree() {
        int[] result = runningSum.getRunningSum(new int[] {1, 2});
        assertArrayEquals(new int[] {1, 3}, result);
    }

    @Test
    public void given1234_returns13610() {
        int[] result = runningSum.getRunningSum(new int[] {1, 2, 3, 4});
        assertArrayEquals(new int[] {1, 3, 6, 10}, result);
    }

    @Test
    public void givenSingleNumber_returnsSingleNumber() {
        int[] result = runningSum.getRunningSum(new int[] {11});
        assertArrayEquals(new int[] {11}, result);
    }

    @Test
    public void givenAllOnes_returnsProperResult() {
        int[] result = runningSum.getRunningSum(new int[] {1, 1, 1, 1});
        assertArrayEquals(new int[] {1, 2, 3, 4}, result);
    }

    @Test
    public void givenMinusOneMinusTwo_returnsMinusOneMinusThree() {
        int[] result = runningSum.getRunningSum(new int[] {-1, -2});
        assertArrayEquals(new int[] {-1, -3}, result);
    }

    @Test
    public void givenPositiveAndNegativeNums_returnProperResult() {
        int[] result = runningSum.getRunningSum(new int[] {1, -2, 4, -1});
        assertArrayEquals(new int[] {1, -1, 3, 2}, result);
    }
}