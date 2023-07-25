package omprakash.tdd.templerun;

public class SpikePit extends Obstacle {

    private int width;

    public SpikePit(int width) throws InvalidSpikePitWidthException, InvalidObstacleDamageException {
        super("SpikePit", 50);
        if (Redundant.isInvalidValue(width)) {
            throw new InvalidSpikePitWidthException();
        }
        this.width = width;
    }

    public void trap(Player player) {
        System.out.println(name + " trapped " + player.getName() + " inside!. it is " + width + " meters wide");
        player.reduceHealth(damage);
    }

    public class InvalidSpikePitWidthException extends Exception {
    }
}
