package framework.page_object_model_mobile_pages;

import framework.actions_apps.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class ISA_App extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='options ']")
    private MobileElement filter;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    private MobileElement skip;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View[@content-desc='Angular']//following-sibling::android.widget.CheckBox")
    private MobileElement angular;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Reset All Filters ']")
    private MobileElement resetAll;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View[@content-desc='Angular']//following-sibling::android.widget.CheckBox")
    private List<MobileElement> allButtons;
    public void swipe() throws Exception {
        for (int i = 0; i < 3; i++) {
            swipeHorizontal(0.4, 0.1, 0.7);
        }
    }

    public void verifyContinueText() { isElementDisplayed(continueButton); }

    public void tapOnSkip() { tapOn(skip); }

    public void tapOnContinue() { tapOn(continueButton); }

    public void tapOnFilter() { tapOn(filter); }

    public void tapOnAngular() { tapOn(angular); }

    public void verifyAngularIsDisabled() { if (isEnabled(angular) == true){ } }

    public void tapOnResetAllFiler() { tapOn(resetAll);}

    public void verifyAllOptionsEnabled() { listTest(allButtons); }

    public void enterTextIntoSearchField() { }
}

