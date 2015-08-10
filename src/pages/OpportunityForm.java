package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class OpportunityForm {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private static final String stage_opp = "opp11";
    private static final String lead_Status = "lea13";
    //private String name_salutationlea2_option = "Mr.";

    @FindBy(id = "opp3")
    @CacheLookup
    private WebElement opportunityName;

    @FindBy(id = "opp9")
    @CacheLookup
    private WebElement closeDate;

    @FindBy(id = stage_opp)
    @CacheLookup
    private WebElement oppStage;


    public OpportunityForm setOppName(String newOppName){
        opportunityName.clear();
        opportunityName.sendKeys(newOppName);
        return this;
    }

    public OpportunityForm setCloseDate(String newClosDate){
        closeDate.clear();
        closeDate.sendKeys(newClosDate);
        return this;
    }

    public OpportunityForm setOppStage(String stageOpp) {
        wait.until(ExpectedConditions
                .visibilityOf(oppStage));

        Select select = new Select(driver.findElement(By.id(stage_opp)));
        select.selectByVisibleText(stageOpp);
        return this;
    }

}
