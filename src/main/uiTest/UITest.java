package uiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class UITest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        /*addButton
        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        */

        WebElement linkCheckbox = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        Actions action = new Actions(driver);
        action.contextClick(linkCheckbox).click().build().perform();

        Thread.sleep(5000);
        driver.quit();

//        WebElement checkbox = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
//        checkbox.click();

    }
}
