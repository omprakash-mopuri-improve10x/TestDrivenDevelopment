package omprakash.tdd.maximumgap;

import org.junit.Assert;
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
}
