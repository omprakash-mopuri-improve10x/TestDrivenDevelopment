package omprakash.tdd.speciealarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayTest {

    private SpecialArray specialArray = new SpecialArray();

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnFalse() {
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(null), "Invalid input");
    }

    @Test
    public void givenEmpty_returnFalse() {
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(new int[] {}), "Invalid input");
    }

    @Test
    public void givenFalseInput_returnFalse() throws SpecialArray.InvalidArrayException {
        boolean givenFalse = specialArray.isSpecialArray(new int[] {1,2,1,1});
        assertFalse(givenFalse);
    }

    @Test
    public void givenArray_returnTrue() throws SpecialArray.InvalidArrayException {
        boolean givenArray = specialArray.isSpecialArray(new int[] {2, 7, 4, 9, 6, 1, 6, 3});
        assertTrue(givenArray);
    }

    @Test
    public void givenFalseInput_returnTrue() throws SpecialArray.InvalidArrayException {
        boolean given1234 = specialArray.isSpecialArray(new int[] {2, 7, 8, 8, 6, 1, 6, 3});
        assertFalse(given1234);
    }

    @Test
    public void givenTrue_returnTrue() throws SpecialArray.InvalidArrayException {
        boolean given1234 = specialArray.isSpecialArray(new int[] {2, 7, 8, 8, 6, 1, 6, 3});
        assertFalse(given1234);
    }
}