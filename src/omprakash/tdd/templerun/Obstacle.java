package omprakash.tdd.templerun;

public class Obstacle {
    protected String name;
    protected int damage;

    public Obstacle(String name, int damage) throws InvalidObstacleDamageException {
        this.name = Redundant.handleName(name);
        if (Redundant.isInvalidValue(damage)) {
            throw new InvalidObstacleDamageException();
        }
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void collide(Player player) {
        System.out.println(name + " has collided with " + player.getName() + " and caused " + damage + " damage.");
        player.reduceHealth(damage);
    }

    public class InvalidObstacleDamageException extends Exception {
    }
}
