package omprakash.tdd.templerun;

public class Redundant {

    public static boolean isInvalidValue(int value) {
        return value < 0 || value > 100;
    }

    public static String handleName(String name) {
        return name == null ? "" : name.trim();
    }
}
