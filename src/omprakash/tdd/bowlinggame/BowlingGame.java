package omprakash.tdd.bowlinggame;

public class BowlingGame {

    private int[] rolls = new int[21];
    private int currentRollIndex = 0;

    public void roll(int pins) {
        rolls[currentRollIndex] = pins;
        currentRollIndex++;
    }

    /*
    If you knock down all 10 pins in the first shot of a frame, you get a strike(*).
        How to score: A strike earns 10 points plus the sum of your next two shots.
    If you knock down all 10 pins using both shots of a frame, you get a spare(/).
        How to score: A spare earns 10 points plus the sum of your next one shot.
     */

    public int getScore() {
        int totalScore = 0;
        int firstInFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rolls[firstInFrame])) {
                totalScore += 10 + rolls[firstInFrame + 1] + rolls[firstInFrame + 2];
                firstInFrame++;
            } else if (isSpare(firstInFrame)) {
               totalScore += 10 + rolls[firstInFrame + 2];
               firstInFrame += 2;
            } else {
                totalScore += rolls[firstInFrame] + rolls[firstInFrame + 1];
                firstInFrame += 2;
            }
        }
        return totalScore;
    }

    private boolean isStrike(int rolls) {
        return rolls == 10;
    }

    private boolean isSpare(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1] == 10;
    }
}
