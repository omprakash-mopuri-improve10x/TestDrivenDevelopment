package omprakash.tdd.templerun;

import java.util.Random;

public class TempleRunGame {

    public static void main(String[] args) throws Exception {
        startGame();
    }

    private static void startGame() throws Exception{
        Player player = new Player("Adventurer", 100);
        int[] coinValues = {10, 20, 30 ,40, 50};
        boolean isGameRunning = true;
        Random random = new Random();
        System.out.println("Welcome to Temple Run");
        while (isGameRunning) {
            player.run();
            int obstacleType = random.nextInt(3);
            if (obstacleType == 1) {
                Fireball fireball = new Fireball(random.nextInt(30));
                fireball.roll();
                fireball.collide(player);
            } else if (obstacleType == 2) {
                SpikePit spikePit = new SpikePit(random.nextInt(50));
                spikePit.trap(player);
            } else {
                int randomIndexValue = random.nextInt(coinValues.length);
                Coin coin = new Coin(coinValues[randomIndexValue]);
                System.out.println(player.getName() + " collected " + coinValues[randomIndexValue] + " coins!");
                player.collectCoins(coin);
            }
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " Game is over! your final score is : " + player.getScore());
                isGameRunning = false;
            }
            Thread.sleep(1000);
        }
    }
}
