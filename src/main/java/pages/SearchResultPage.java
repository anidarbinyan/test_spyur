package pages;

import core.ActionHelper;
import jdbc.manager.DBManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//div[@id='results_list_wrapper']/a[contains(@href,'/am/companies')]")
    private List<WebElement> searchResult;

    @FindBy(xpath = "//div[@id='results_list_wrapper']//span[contains(@class, 'company_name')]")
    private List<WebElement> companyNames;

    @FindBy(xpath = "//div[@class='paging']//li//a[@class='next_page']")
    private WebElement nextPageArrow;

    private final By nextPage = By.xpath("//div[@class='paging']//li//a[@class='next_page']");

    public int numberOfResult(){
        return this.searchResult.size();
    }

    public void getAllSearchResults(){
        DBManager db = new DBManager();
//        db.createTable();
        ActionHelper.scrollPageDown();
        while (isElementExisting(this.nextPage)){
            this.nextPageArrow.click();
            for (WebElement x: this.companyNames){
                System.out.println(x.getText());
                db.insertResult(x.getText());
            }
        }
    }

    private boolean isElementExisting(By element){
        return driver.findElements(element).size() != 0;
    }
}
