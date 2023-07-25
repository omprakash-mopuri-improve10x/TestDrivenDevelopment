package omprakash.tdd.templerun;

public class Coin extends Obstacle {

    private int value;

    public Coin(int value) throws InvalidCoinValueException, InvalidObstacleDamageException {
        super("Coin", 0);
        if (Redundant.isInvalidValue(value)) {
            throw new InvalidCoinValueException();
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public class InvalidCoinValueException extends Exception {
    }
}
