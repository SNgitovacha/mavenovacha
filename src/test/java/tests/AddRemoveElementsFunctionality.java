package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AddRemoveElements;
import pageObjects.HomePage;

import static utils.Variables.*;

public class AddRemoveElementsFunctionality {

    HomePage homePage;
    AddRemoveElements addRemoveElements;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        addRemoveElements = new AddRemoveElements(Browser.driver, Browser.wait);
    }

    @Test
    public void clickOnAddElements(){
        homePage.clickOnLink(ADDREMOVEELEMENTS_LINK);
        addRemoveElements.clickOnAddRundomNumberOfElementsbtn(2);
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver(){
        Browser.closeBrowser();
    }
}
