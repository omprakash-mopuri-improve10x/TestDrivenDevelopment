package omprakash.tdd.bowlinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    private BowlingGame bowlingGame = new BowlingGame();

    private void rollMany(int noOfRolls, int pins) {
        for (int i = 0; i < noOfRolls; i++) {
            bowlingGame.roll(pins);
        }
    }

    @Test
    public void nothing() {
    }

    @Test
    public void canRoll() {
        bowlingGame.roll(1);
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        assertEquals(0, bowlingGame.getScore());
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);
        assertEquals(20, bowlingGame.getScore());
    }

    @Test
    public void oneSpare() {
        // 5, 5, 4 = 18
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(4);
        assertEquals(18, bowlingGame.getScore());
    }

    @Test
    public void oneStrike() {
        // 10, 4, 2 = 16 + 6 = 22
        bowlingGame.roll(10);
        bowlingGame.roll(4);
        bowlingGame.roll(2);
        rollMany(16, 0);
        assertEquals(22, bowlingGame.getScore());
    }

    @Test
    public void scoreCard() {
        bowlingGame.roll(7);
        bowlingGame.roll(2);
        bowlingGame.roll(10);
        bowlingGame.roll(6);
        bowlingGame.roll(4);
        bowlingGame.roll(2);
        bowlingGame.roll(5);
        bowlingGame.roll(8);
        bowlingGame.roll(1);
        bowlingGame.roll(2);
        bowlingGame.roll(2);
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        bowlingGame.roll(2);
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(2);
        assertEquals(98, bowlingGame.getScore());
    }
}
