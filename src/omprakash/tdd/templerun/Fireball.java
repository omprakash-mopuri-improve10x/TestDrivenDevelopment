package omprakash.tdd.templerun;

public class Fireball extends Obstacle {
    private int speed;

    public Fireball(int speed) throws InvalidFireballSpeedException, InvalidObstacleDamageException {
        super("Fireball", 30);
        if (Redundant.isInvalid(speed)) {
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
