package io.wesquad.kata;

public class BowlingGame {

    private int score;

    public BowlingGame() {
        this.score = 0;
    }

    public void rolls(int fallenPins) {
        this.score += fallenPins;
    }

    public int getScore() {
        return score;
    }
}
