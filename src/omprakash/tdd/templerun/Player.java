package omprakash.tdd.templerun;

public class Player {

    private String name;
    private int health;
    private int score;

    public Player(String name) throws InvalidHealthException {
        this(name, 100);
    }

    public Player(String name, int health) throws InvalidHealthException {
        this.name = (name == null) ? "" : name.trim();
        if (health < 0 || health > 100) {
            throw new InvalidHealthException();
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void run() {
        System.out.println("Running...!");
    }

    public int getScore() {
        return score;
    }

    public void collectCoin(Coin coin) {
        this.score += coin.getValue();
    }

    public void jump() {
        System.out.println("Name jumped to avoid obstacles!");
    }

    public class InvalidHealthException extends Exception {
    }
}
