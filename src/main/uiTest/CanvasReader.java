package uiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasReader {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[@href='/challenging_dom']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("alert(document.getElementById('canvas').getContext('2d'))");
        Thread.sleep(5000);
        js.executeScript("alert('aaaaaaaaaaaa')");

        Thread.sleep(5000);
        driver.quit();
    }
}
