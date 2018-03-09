package io.wesquad.kata;

public class BowlingGame {

    private int score = 0;
    private int frameCounter = 1;
    private int frameRollsCounter = 1;

    private boolean previousFrameSpare = false;

    private int previousFallenPins = 0;

    public void rolls(int fallenPins) {
        if (isSecondRoll()) {
            if (isSpare(fallenPins)) {
                this.previousFrameSpare = true;
            } else {
                this.previousFrameSpare = false;
                scoreNormalFrame(fallenPins);
            }
            createNewFrame();

        } else {
            if(this.previousFrameSpare) {
                addSpareBonus(fallenPins);
            }
            storeFallenPins(fallenPins);
            createNextRoll();
        }
    }

    private void scoreNormalFrame(int fallenPins) {
        this.score += this.previousFallenPins + fallenPins;
    }

    private void createNextRoll() {
        this.frameRollsCounter++;
    }

    private void addSpareBonus(int fallenPins) {
        this.addFallenPinsToScore(10 + fallenPins);
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

    private boolean isSecondRoll() {
        return frameRollsCounter == 2;
    }

    private boolean isSpare(int fallenPins) {
        return this.previousFallenPins + fallenPins == 10;
    }

    public int getScore() {
        return score;
    }
}
