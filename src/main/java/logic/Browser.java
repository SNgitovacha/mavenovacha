package logic;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {

    private WebDriver driver;
    private WebDriverWait wait;
    public static Logger logger = LogManager.getLogger(Browser.class);

    public WebDriver getInstance(){

        if(driver == null){
            driver = Driver.PROPERTY.initializeDriver();
            wait = Utils.initWaits(driver, 5, 10, 1);
            Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
            String browserName = cap.getBrowserName().toUpperCase();
            logger.info(browserName + " browser initialized.");
        }
        return driver;
    }

    public void closeBrowser(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
        logger.info("Browser instance closed!");
    }

    public void openBrowser() {
        String url = Environment.PROPERTY.getURL();
        getInstance().get(url);
        logger.info("Opened " + url);
    }
    public void goToUrl(String url){
        getInstance().navigate().to(url);
        logger.info("Navigated to " + url);
    }

    public WebDriverWait getWait() { return wait; }

    public void setWait(WebDriverWait wait) { this.wait = wait; }
}
