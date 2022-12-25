package org.caroAlexander.autStartSharpDemoSerenity.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.caroAlexander.autStartSharpDemoSerenity.tasks.OpenUp;

public class LoginStartSharpStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Alex, a registered user of the StartSharp application, wants to log in to the StartSharp main page to view the Dashboard$")
    public void thanAlexARegisteredUserOfTheStartSharpApplicationWantsToLogInToTheStartSharpMainPageToViewTheDashboard() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.StartSharpHomePage ());
        //throw new PendingException();
    }


    @When("^he navigates to the login page and provides this correct login credentials in the login form and clicks the Sign button$")
    public void heNavigatesToTheLoginPageAndProvidesThisCorrectLoginCredentialsInTheLoginFormAndClicksTheSignButton() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^he should be redirected to the dashboard main page$")
    public void heShouldBeRedirectedToTheDashboardMainPage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
