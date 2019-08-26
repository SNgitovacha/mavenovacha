package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.MultipleWindowsPO;

import static utils.Variables.*;

public class MultipleWindows {

    HomePage homePage;
    MultipleWindowsPO multipleWindows;

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        multipleWindows = new MultipleWindowsPO(Browser.driver, Browser.wait);
    }
    @Test
    public void testMultipleWindows(){
        homePage.clickOnLink(MULTIPLEWINDOWS_LINK);
        multipleWindows.clickToOpenNewWindow();
    }

//    @AfterClass(alwaysRun = true)
//    public void closeDriver(){
//        Browser.closeBrowser();
//    }

}
