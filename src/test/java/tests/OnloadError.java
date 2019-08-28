package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.OnLoadErrorPO;

import static utils.Variables.*;

public class OnloadError {

    HomePage homePage;
    OnLoadErrorPO onloadError;

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        onloadError = new OnLoadErrorPO(Browser.driver, Browser.wait);
    }

    @Test
    public void testOnloadError(){
        homePage.clickOnLink(ONLOADERROR_LINK);
        onloadError.ExtractJSLogs();
    }

//    @AfterClass(alwaysRun = true)
//    public void closeDriver(){
//        Browser.closeBrowser();
//    }
}
