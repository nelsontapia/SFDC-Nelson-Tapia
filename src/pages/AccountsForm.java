package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class AccountsForm {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private static final String name_salutationlea2 = "name_salutationlea2";
    private static final String lead_Status = "lea13";
    //private String name_salutationlea2_option = "Mr.";

    @FindBy(id = "acc2")
    @CacheLookup
    private WebElement accountName;

    public AccountsForm setAccountName(String newAccountName){
        accountName.clear();
        accountName.sendKeys(newAccountName);
        return this;
    }
}
