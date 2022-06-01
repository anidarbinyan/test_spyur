package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WaitHelper {

    private WaitHelper(){}

    private static WebDriver driver = Driver.getDriver();
    private static Wait<WebDriver> wait = new WebDriverWait(driver, 15);

    public static void waitElementToBeClickable(final WebElement target){
        wait.until(ExpectedConditions.elementToBeClickable(target));
    }

    public static void waitElementToBeVisible(final WebElement target){
        wait.until(ExpectedConditions.visibilityOf(target));
    }
}
