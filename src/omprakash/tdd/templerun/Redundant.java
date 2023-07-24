package omprakash.tdd.templerun;

public class Redundant {

    public static boolean isInvalid(int value) {
        return value < 0 || value > 100;
    }

    public static boolean isInvalidName(String name) {
        return name == null;
    }
}
