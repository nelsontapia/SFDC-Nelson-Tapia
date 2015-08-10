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
public class AccountHome {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@name='new']")
    @CacheLookup
    private WebElement newLeadLink;

    @FindBy(linkText = "NewAccount")
    @CacheLookup
    private WebElement accountLink;

    public AccountHome(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }


    public SetupAccount clickNew(){
        newLeadLink.click();
        return new SetupAccount(driver);
    }

    public DeleteAccount clickDeleteAccount() {
        accountLink.click();
        return new DeleteAccount(driver);
    }

}
