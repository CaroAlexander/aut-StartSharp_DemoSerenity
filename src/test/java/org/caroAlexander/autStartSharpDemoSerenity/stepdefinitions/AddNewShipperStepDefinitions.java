package org.caroAlexander.autStartSharpDemoSerenity.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.caroAlexander.autStartSharpDemoSerenity.tasks.AddNewShipper;
import org.caroAlexander.autStartSharpDemoSerenity.tasks.LogIn;
import org.caroAlexander.autStartSharpDemoSerenity.tasks.OpenUp;

public class AddNewShipperStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Alex, a registered admin of the StartSharp application, wants to add a new Shipper$")
    public void thanAlexARegisteredAdminOfTheStartSharpApplicationWantsToAddANewShipper() {
        OnStage.theActorCalled("Alex").wasAbleTo((OpenUp.StartSharpHomePage()),(LogIn.theSingInPage()));
        //throw new PendingException();
    }


    @When("^he navigates to Shippers section and fills out the form to add a new Shipper$")
    public void heNavigatesToShippersSectionAndFillsOutTheFormToAddANewShipper() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddNewShipper.newShipper());
        //throw new PendingException();
    }

    @Then("^he should see the new Shipper added to the list of shippers$")
    public void heShouldSeeTheNewShipperAddedToTheListOfShippers() {
        //throw new PendingException();
    }

}
