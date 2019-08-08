package tests;

import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class LoginTest extends Browser {

    HomePage homePage;

    @BeforeClass
    public void beforeClass(){
        Browser.initializeDriver();
        Browser.openURL("http://limocloud.dev.newtec-solutions.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
    }

    @Test
    public void test01(){
        homePage.clickLogin().enterEmail("test@mail.com").enterPassword("test").submitLogin();
    }

    @AfterClass
    public void afterClass(){
        Browser.closeBrowser();
    }
}
