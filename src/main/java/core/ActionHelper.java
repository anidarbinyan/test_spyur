package core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public final class ActionHelper {

    private final static WebDriver driver = Driver.getDriver();
    private final static Actions actions = new Actions(driver);

    private ActionHelper(){}

    public static void dragAndDrop(final WebElement source, final WebElement target){
        actions
                .dragAndDrop(source, target)
                .build()
                .perform();
    }

    public static void rightClick(final WebElement target){
        actions
                .contextClick(target)
                .build()
                .perform();
    }

    public static void scrollPageDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static String addSlashes(String result){
        return result.replace("'", "\\'").replace('"', '\"');
    }
}
