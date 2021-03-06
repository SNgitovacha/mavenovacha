package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.DropdownPO;
import pageObjects.HomePage;

import static utils.Variables.*;

public class Dropdown {

    //page object
    HomePage homePage;
    DropdownPO dropdownPage;

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        dropdownPage = new DropdownPO(Browser.driver, Browser.wait);
    }
    @Test
    public void testDropdown(){
        homePage.clickOnLink(DROPDOWN_LINK);
        dropdownPage.selectDropdownOption("dropdown", 2);
    }
//
//    @AfterClass(alwaysRun = true)
//    public void closeDriver(){
//        Browser.closeBrowser();
//    }

}
