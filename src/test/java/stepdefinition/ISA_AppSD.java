package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import framework.page_object_model_mobile_pages.ISA_App;
import org.testng.Assert;


public class ISA_AppSD {

    ISA_App isa = new ISA_App();

    @Given("^I am on a home page of the app$")
    public void homePage() { }

    //@mobile-1-tutorial-swipe
    @When("^I swipe right 3 times on tutorials slides$")
    public void iSwipeRightTimesOnTutorialsSlides() throws Exception { isa.swipe(); }

    @Then("^I verify Continue button is displayed$")
    public void iVerifyContinueButtonIsDisplayed() { isa.verifyContinueText();}

    //@mobile-2-filter-options
    //************************************************
    @When("^I click on filter button$")
    public void clickOnFilterButton() {
        isa.tapOnSkip();
        isa.tapOnFilter();
    }

    @And("^I disable \"Angular\" option$")
    public void iDisableOption() {
        isa.tapOnAngular();
        isa.verifyAngularIsDisabled();
    }

    @And("^I click on All Reset Filer button$")
    public void iClickOnAllResetFilerButton() { isa.tapOnResetAllFiler(); }


    @Then("^I verify all options are enabled$")
    public void iVerifyAllOptionsAreEnabled() { isa.verifyAllOptionsEnabled(); }
}
