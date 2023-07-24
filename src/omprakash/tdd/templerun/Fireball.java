package omprakash.tdd.templerun;

public class Fireball {
    private int speed;

    public Fireball(int speed) throws InvalidFireballSpeedException {
        if (speed < 0 || speed > 100) {
            throw new InvalidFireballSpeedException();
        }
        this.speed = speed;
    }

    public void roll() {
        System.out.println("Fireball is rolling with " + getSpeed() + " speed");
    }

    public int getSpeed() {
        return speed;
    }

    public class InvalidFireballSpeedException extends Exception {
    }
}
