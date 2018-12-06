package framework.actions_apps;

import framework.AppiumWrapper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MobileBasePage {

    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumWrapper.getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to verify if element is displayed
     * @param mobileElement
     * @return
     */
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            mobileElement.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }

        return true;
    }

    protected void getText(MobileElement mobileElement) {
        try {
            mobileElement.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected void compare(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }

    public void textDisplayed(MobileElement mobileElement) {
        try {
            mobileElement.isDisplayed();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    public static void swipeVertical( int xPress, int yPress, int xMoveTo, int yMoveTo) throws Exception {
        Thread.sleep(5000);
        new TouchAction(AppiumWrapper.getAppiumDriver())
                .longPress(xPress,yPress)
                .moveTo(xMoveTo, yMoveTo)
                .release()
                .perform();
    }
}
