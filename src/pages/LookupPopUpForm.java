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
public class LookupPopUpForm {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(linkText = "MyCamp")
    @CacheLookup
    private WebElement addCampLnk;

    public LookupPopUpForm(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public LookupPopUpForm clickAddCampLnk() {
        addCampLnk.click();
        return new LookupPopUpForm(driver);
    }



}
