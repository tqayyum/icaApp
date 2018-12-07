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

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='options ']")
    private MobileElement filter;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    private MobileElement skip;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,525][1386,598]']")
    private MobileElement angular;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Reset All Filters ']")
    private MobileElement resetAll;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,686][1386,759]']")
    private MobileElement communication;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,847][1386,920]']")
    private MobileElement design;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1008][1386,1081]']")
    private MobileElement documentation;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1169][1386,1242]']")
    private MobileElement food;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1330][1386,1403]']")
    private MobileElement ionic;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1491][1386,1564]']")
    private MobileElement navigation;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1652][1386,1725]']")
    private MobileElement services;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1813][1386,1886]']")
    private MobileElement tooling;

    @AndroidFindBy(xpath = "//android.view.View[@bounds='[1316,1974][1386,2047]']")
    private MobileElement workshop;

    public void swipe() throws Exception {
        swipeVertical(1000, 1000, 200, 400);
        swipeVertical(1000, 1000, 200, 400);
        swipeVertical(1000, 1000, 200, 400);}

    public void verifyContinueText() { textDisplayed(continueButton); }

    public void tapOnSkip() { tapOn(skip); }

    public void tapOnFilter() { tapOn(filter); }

    public void tapOnAngular() { tapOn(angular); }

    public void verifyAngularIsDisabled() { enabled(angular); }

    public void tapOnResetAllFiler() { tapOn(resetAll);}

    public void verifyAllOptionsEnabled() {
        enabled(angular);
        enabled(communication);
        enabled(design);
        enabled(documentation);
        enabled(food);
        enabled(ionic);
        enabled(navigation);
        enabled(services);
        enabled(tooling);
        enabled(workshop);
    }

}

