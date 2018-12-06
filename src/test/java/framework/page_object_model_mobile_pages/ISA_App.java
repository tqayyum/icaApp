package framework.page_object_model_mobile_pages;

import framework.actions_apps.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ISA_App extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")
    private MobileElement continueButton;

    public void swipe() throws Exception {
        swipeVertical(1000, 1000, 200, 400);
        swipeVertical(1000, 1000, 200, 400);
        swipeVertical(1000, 1000, 200, 400);}

    public void verifyContinueText() { textDisplayed(continueButton); }
}

