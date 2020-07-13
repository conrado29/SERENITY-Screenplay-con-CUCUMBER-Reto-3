package co.com.choucair.certificacion.maxtime.stepdefinitions;

import co.com.choucair.certificacion.maxtime.questions.Answer;
import co.com.choucair.certificacion.maxtime.tasks.Close;
import co.com.choucair.certificacion.maxtime.tasks.Login;
import co.com.choucair.certificacion.maxtime.tasks.OpenUp;
import co.com.choucair.certificacion.maxtime.tasks.Record;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class MaxtimeStepDefinitions {
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that pepe needs to record his hours in and close the day in maxtime$")
    public void thatPepeNeedsToRecordHisHoursInAndCloseTheDayInMaxtime()
    {
       OnStage.theActorCalled("pepe").wasAbleTo(OpenUp.thePage(), Login.thePage());
    }


    @When("^you enter your hours and close the day in the application$")
    public void youEnterYourHoursAndCloseTheDayInTheApplication()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Record.theHours(), Close.theDay());
    }

    @Then("^the day closes with its hours in the application$")
    public void theDayClosesWithItsHoursInTheApplication()
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
