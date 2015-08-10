package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class SetupOpportunity {
    private WebDriver driver;
    private WebDriverWait wait;

    public SetupOpportunity(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
}
