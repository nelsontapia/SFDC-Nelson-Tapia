package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Carlos Gonzales on 7/27/2015.
 */
public class CreateOportunity {

    public MainApp mainApp;
    private TopBarMenu topBarMenu;
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        LoginHomePage loginHomePage = new LoginHomePage();
        mainApp = loginHomePage.setUserNameTxt("nelsontb@gmail.com")
                .setPasswordTxt("Hercules73")
                .clickLoginBtn();

        topBarMenu = mainApp.goToBarMenu();
        AccountHome accountHomePage = topBarMenu.clickTabAccounts();
        accountHomePage.clickNew();

        CreateNewAccount newAccount = mainApp.goToCreateNewAccounts();
        newAccount.setAccountName("NewAccount");
        newAccount.saveBtnClick();

        mainApp.goToBarMenu();
        //return mainApp;
    }

    @Test
    public void testUntitled() {

        //MainApp mainApp1 = new MainApp(driver);
        //TopBarMenu topBarMenu1 = mainApp1.goToBarMenu();
        //mainApp = new MainApp(driver);
        //topBarMenu.clickTabOpportunities();
        OpportunitiesHome oppHomePage = topBarMenu.clickTabOpportunities();
        oppHomePage.clickNew();

        CreateNewOpportunity newOpp = mainApp.goToCreateNewOpportunity();
        newOpp.setOppName("NewOpportunity");
        newOpp.setCloseDate("10/08/2015");
        newOpp.setOppStage("Prospecting");
        newOpp.saveBtnClick();


        TopBarMenu topBarMenu1 = mainApp.goToBarMenu();
        oppHomePage = topBarMenu1.clickTabOpportunities();
        mainApp.goToOportunitiesHome();

        Assert.assertTrue(oppHomePage.isOpportunityNamePresent("NewOpportunity"), "Opportunity was not created");

        mainApp.goToBarMenu();
    }


    @AfterClass
    public void tearDown() {

        // Delete Account object created
        topBarMenu = mainApp.goToBarMenu();
        AccountHome accountHomePage = topBarMenu.clickTabAccounts();
        PageAccount pageAccount = accountHomePage.clickDeleteAccount();
        pageAccount.clickDelete();

        Boolean alert = pageAccount.isAlertPresent();

        if(alert){
            pageAccount.closeAlertAndGetItsText();
        }

        // Delete Oportunity object created
        topBarMenu = mainApp.goToBarMenu();
        OpportunitiesHome oppHomePage = topBarMenu.clickTabOpportunities();
        PageOportunity pageOportunity = oppHomePage.clickDeleteOportunity();
        pageOportunity.clickDelete();

        Boolean alert1 = pageOportunity.isAlertPresent();

        if(alert1){
            pageOportunity.closeAlertAndGetItsText();
        }


    }


}
