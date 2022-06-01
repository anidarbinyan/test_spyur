package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class UIHelper {

    private UIHelper(){}

    public static void clickOnWebElement(final WebElement target){
        WaitHelper.waitElementToBeVisible(target);
        WaitHelper.waitElementToBeClickable(target);
        target.click();
    }
}
