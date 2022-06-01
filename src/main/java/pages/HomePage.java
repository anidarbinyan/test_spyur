package pages;

import core.UIHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@name='company_name']")
    private WebElement whatToLookFor;

    @FindBy(xpath = "//input[@name='addres']")
    private WebElement location;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    protected String pageUrl(){
        return "https://www.spyur.am/am/home";
    }

    public void doASearch(final String whatToLookFor, final String location){
        this.location.sendKeys(location);
        doASearchInternal(whatToLookFor);
    }

    public void doASearch(final String whatToLookFor){
        doASearchInternal(whatToLookFor);
    }

    private void doASearchInternal(final String whatToLookFor){
        this.whatToLookFor.sendKeys(whatToLookFor);
        UIHelper.clickOnWebElement(this.submitButton);
    }


}
