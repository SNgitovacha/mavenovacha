package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.JavaScriptAlertsPO;

import static utils.Variables.*;

public class JavaScriptAlerts {

    HomePage homePage;
    JavaScriptAlertsPO javaScriptAlertsPO;

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        javaScriptAlertsPO = new JavaScriptAlertsPO(Browser.driver, Browser.wait);
    }

    @Test
    public void testJavascriptAlert(){
        homePage.clickOnLink(JAVASCRIPTALERT_LINK);
        javaScriptAlertsPO.verifyJSAlert();
    }

//    @AfterClass(alwaysRun = true)
//    public void closeDriver(){
//        Browser.closeBrowser();
//    }

}
