package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import framework.page_object_model_mobile_pages.ISA_App;
import org.testng.Assert;


public class ISA_AppSD {

    ISA_App isa = new ISA_App();

    //@mobile-3-tutorial-swipe
    @When("^I swipe right 3 times on tutorials slides$")
    public void iSwipeRightTimesOnTutorialsSlides() throws Exception { isa.swipe(); }

    @Then("^I verify Continue button is displayed$")
    public void iVerifyContinueButtonIsDisplayed() { isa.verifyContinueText();}
}
