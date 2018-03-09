package io.wesquad.kata;

public class BowlingGame {

    private int score = 0;

    private int frameCounter = 1;

    private int frameRollsCounter = 1;

    private boolean spare = false;

    private int previousFallenPins = 0;

    public void rolls(int fallenPins) {

        if (isFrameSecondRoll()) {

            if (isSpare(fallenPins)) {
                storeFallenPins(fallenPins);
            } else {
                addFallenPinsToScore(fallenPins);
            }

            createNewFrame();

        } else {

            addPreviousFrameScoreBonus();

            addFallenPinsToScore(fallenPins);

            createNextRoll();
        }
    }

    private void createNextRoll() {
        this.frameRollsCounter++;
    }

    private void addPreviousFrameScoreBonus() {
        this.addFallenPinsToScore(this.previousFallenPins);
        this.storeFallenPins(0);
    }

    private void createNewFrame() {
        this.frameRollsCounter = 1;
        this.frameCounter++;
    }

    private void storeFallenPins(int fallenPins) {
        this.previousFallenPins = fallenPins;
    }

    private void addFallenPinsToScore(int fallenPins) {
        this.score += fallenPins;
    }

    private boolean isFrameSecondRoll() {
        return frameRollsCounter == 2;
    }

    private boolean isSpare(int fallenPins) {
        this.spare = this.frameRollsCounter % 2 == 0 && (this.score + fallenPins) == 10;
        return this.spare;
    }

    public int getScore() {
        return score;
    }
}
