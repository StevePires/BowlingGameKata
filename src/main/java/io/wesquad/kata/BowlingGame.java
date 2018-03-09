package io.wesquad.kata;

public class BowlingGame {

    private int score = 0;

    private int rollsCounter = 0;

    private boolean spare = false;

    private int previousFallenPins = 0;

    public void rolls(int fallenPins) {
        this.rollsCounter++;
        this.score += isPreviousFrameSpare() && rollsCounter > 2 ? (previousFallenPins + 5) : 0;
        this.score += isSpare(fallenPins) ? 0 : fallenPins;
    }

    private boolean isSpare(int fallenPins) {
        this.spare = this.rollsCounter % 2 == 0 && (this.score + fallenPins) == 10;
        this.previousFallenPins = this.spare ? fallenPins : 0;
        return this.spare;
    }

    private boolean isPreviousFrameSpare() {
        return this.spare;
    }

    public int getScore() {
        return score;
    }
}
