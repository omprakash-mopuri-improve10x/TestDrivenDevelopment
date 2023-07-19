package omprakash.tdd.runningsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RunningSumTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnsEmpty(){
        RunningSum runningSum = new RunningSum();
        int[] result = runningSum.getRunningSum(null);
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void givenEmpty_returnsEmpty(){
        RunningSum runningSum = new RunningSum();
        int[] result = runningSum.getRunningSum(new int[] {});
        assertArrayEquals(new int[] {}, result);
    }
}
