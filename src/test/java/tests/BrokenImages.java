package tests;

import logic.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.BrokenImagesPO;
import pageObjects.HomePage;

import static utils.Variables.*;

public class BrokenImages {

    HomePage homePage;
    BrokenImagesPO brokenImages;

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        brokenImages = new BrokenImagesPO(Browser.driver, Browser.wait);
    }

    @Test
    public void testBrokenImages(){
        homePage.clickOnLink(BROKENIMAGES_LINK);
        brokenImages.isImageBroken();
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver(){
            Browser.closeBrowser();
    }

}
