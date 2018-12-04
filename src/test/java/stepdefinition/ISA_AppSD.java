package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import framework.page_object_model_mobile_pages.ISA_App;
import org.testng.Assert;


public class ISA_AppSD {

    ISA_App landingPage = new ISA_App();

    @When("^I click on skip button")
    public void clickOnSkipButton() {
        landingPage.tapOnSkipButton();
    }

    @And("^I click on favorites button$")
    public void clickOnFavorites() { landingPage.tapOnFavorites(); }

    @When("^I click on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        landingPage.tapOnMainMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(landingPage.isSideMenuBarDisplayed());
    }

    @Then("^I verify \"No Sessions Found\" text displayed$")
    public void veriyNoSessionsFound() {Assert.assertTrue(landingPage.isNoSessionsFoundDisplayed());}
}
