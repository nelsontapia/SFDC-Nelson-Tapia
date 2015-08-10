package tests;

import org.testng.Assert;
import org.junit.Test;
import pages.*;


/**
 * Created by Carlos Gonzales on 7/27/2015.
 */
public class CreateOportunity {

    private MainApp mainApp;
    private TopBarMenu topBarMenu;

    /*
    @BeforeClass
    public void setUp() {
        LoginHomePage loginHomePage = new LoginHomePage();
        MainApp mainApp = loginHomePage.setUserNameTxt("nelsontb@gmail.com")
                .setPasswordTxt("Hercules73")
                .clickLoginBtn();

        TopBarMenu topBarMenu = mainApp.goToBarMenu();
        AccountHome accountHomePage = topBarMenu.clickTabAccounts();
        accountHomePage.clickNew();

        CreateNewAccount newAccount = mainApp.goToCreateNewAccounts();
        newAccount.setAccountName("NewAccount");
        newAccount.saveBtnClick();
    }
    */


    @Test
    public void testUntitled() {

        LoginHomePage loginHomePage = new LoginHomePage();
        MainApp mainApp = loginHomePage.setUserNameTxt("nelsontb@gmail.com")
                .setPasswordTxt("Hercules73")
                .clickLoginBtn();

        TopBarMenu topBarMenu = mainApp.goToBarMenu();
        AccountHome accountHomePage = topBarMenu.clickTabAccounts();
        accountHomePage.clickNew();

        CreateNewAccount newAccount = mainApp.goToCreateNewAccounts();
        newAccount.setAccountName("NewAccount");
        newAccount.saveBtnClick();
        

        TopBarMenu topBarMenu1 = mainApp.goToBarMenu();
        OpportunitiesHome oppHomePage = topBarMenu1.clickTabOpportunities();
        oppHomePage.clickNew();

        CreateNewOpportunity newOpp = mainApp.goToCreateNewOpportunity();
        newOpp.setOppName("NewOpportunity");
        newOpp.setCloseDate("10/08/2015");
        newOpp.setOppStage("Prospecting");
        newOpp.saveBtnClick();


        TopBarMenu topBarMenu2 = mainApp.goToBarMenu();
        OpportunitiesHome oppHomePage1 = topBarMenu2.clickTabOpportunities();

        Assert.assertTrue(oppHomePage1.isOpportunityNamePresent("NewOpportunity"),"Opportunity was not created");
    }
    /*
    @AfterClass
    public void tearDown() {
        /////
    }

    */


}
