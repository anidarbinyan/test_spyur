package pages;

import core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    protected String pageUrl(){
        return "";
    }

    public void get(){
        driver.get(pageUrl());
    }

    public String getDriverCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
