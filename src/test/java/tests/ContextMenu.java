package tests;

import logic.Browser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.ContextMenuPO;
import pageObjects.HomePage;

import static utils.Variables.*;

public class ContextMenu {

    HomePage homePage;
    ContextMenuPO contextMenuPO;

    @BeforeClass (alwaysRun = true)
    public void setUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        contextMenuPO = new ContextMenuPO(Browser.driver, Browser.wait);
    }

    @Test
    public void testContextMenu() throws InterruptedException {
        homePage.clickOnLink(CONTEXT_MENU);
        contextMenuPO.rightClick();
    }

//    @AfterClass (alwaysRun = true)
//    public void closeDriver(){
//        Browser.closeBrowser();
//    }

}
