package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.ABTesting;
import pageObjects.HomePage;

import static utils.Variables.*;

public class VerifyTextOnPage {

    HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
    }

    @Test
    public void verifyTextOnPage(){
        homePage.clickOnLink(ABTESTING_LINK);
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver(){
        Browser.closeBrowser();
    }
}
