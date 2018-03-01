package io.wesquad.kata;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.assertEquals;

public class GameStepdefs {

    private BowlingGame game;
    
    @Given("^a new bowling game$")
    public void aNewBowlingGame() throws Throwable {
        game = new BowlingGame();
    }

    @When("^i roll the ball and hit (\\d+) pins$")
    public void iRollTheBallAndHitPins(int fallenPins) throws Throwable {
        game.rolls(fallenPins);
    }

    @Then("^my score should be (\\d+)$")
    public void myScoreShouldBe(int arg0) throws Throwable {
        assertEquals(0, game.getScore());
    }
}
