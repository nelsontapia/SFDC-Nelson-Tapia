package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/9/2015.
 */
public class CampaignHome {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@name='new']")
    @CacheLookup
    private WebElement newCampLink;

    public CampaignHome(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public SetupCampaign clickNew(){
        newCampLink.click();
        return new SetupCampaign(driver);
    }
}
