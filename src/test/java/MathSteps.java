package bdd.example.feature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class MathSteps
{
    private int initial = 0;

    @Given ("^I have number (-?\\d+)$")
    public void initialNumber(int initial)
    {
        this.initial = initial;
    }

    @When ("^I subtract (-?\\d+)$")
    public void subtract(int number)
    {
        this.initial -= number;
    }

    @Then ("^I get (-?\\d+)$")
    public void operationResult(int expected)
    {
        assertThat(initial, equalTo(expected));
    }
}