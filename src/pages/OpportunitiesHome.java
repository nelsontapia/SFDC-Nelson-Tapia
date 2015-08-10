package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class OpportunitiesHome {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@name='new']")
    @CacheLookup
    private WebElement newOppLink;

    @FindBy(css = "th..dataCell   > a")
    @CacheLookup
    private WebElement oppLink;



    public OpportunitiesHome(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }


    public SetupOpportunity clickNew(){
        newOppLink.click();
        return new SetupOpportunity(driver);
    }


    public boolean isOpportunityNamePresent(String nameOpp) {
        return isElementPresent(driver.findElement(By.linkText(nameOpp)));
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            webElement.getTagName();
            return true;
        } catch (WebDriverException e) {
            return false;
        }
    }
}
