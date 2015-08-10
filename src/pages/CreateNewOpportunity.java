package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class CreateNewOpportunity extends OpportunityForm{
    @FindBy(name = "save_new")
    @CacheLookup
    private WebElement saveBtn;

    public CreateNewOpportunity(WebDriver driver){
        super.driver = driver;
        super.wait = new WebDriverWait(driver,15);
        PageFactory.initElements(driver, this);
    }

    public CreateNewOpportunity saveBtnClick(){
        saveBtn.click();
        return new CreateNewOpportunity(driver);
    }
}
