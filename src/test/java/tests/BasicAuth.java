package tests;
import logic.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.BasicAuthPO;
import pageObjects.HomePage;
import static utils.Variables.*;

public class BasicAuth {

    HomePage homePage;
    BasicAuthPO basicAuth;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        Browser.initializeDriver();
        Browser.openURL("http://the-internet.herokuapp.com/");
        homePage = new HomePage(Browser.driver, Browser.wait);
        basicAuth = new BasicAuthPO(Browser.driver, Browser.wait);
    }
    @Test
    public void testBasicAuth(){
       homePage.clickOnLink(BASIC_AUTH);
//       basicAuth.enterTextWithoutElement("tetetete");
    }
    @AfterClass
    public void closeDriver(){
        Browser.closeBrowser();
    }
}
