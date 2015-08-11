package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class CampaignsForm {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private static final String name_salutationlea2 = "name_salutationlea2";
    private static final String lead_Status = "lea13";

    @FindBy(id = "cpn1")
    @CacheLookup
    private WebElement campaignName;

    @FindBy(id = "cpn16")
    @CacheLookup
    private WebElement enableCampLnk;

    public CampaignsForm setCampaignName(String campName){
        campaignName.clear();
        campaignName.sendKeys(campName);
        return this;
    }

    public CampaignsForm enableCamp(){
        if (!enableCampLnk.isSelected()) {
            enableCampLnk.click();
        }
        return this;
    }
}
