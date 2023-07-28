package omprakash.tdd.speciealarray;

public class SpecialArray {

    public boolean isSpecialArray(int[] array) throws InvalidArrayException {
        if (array == null || array.length < 1) {
            throw new InvalidArrayException();
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != array[i] % 2) {
                return false;
            }
        }
        return true;
    }

    public class InvalidArrayException extends Exception {
    }
}

