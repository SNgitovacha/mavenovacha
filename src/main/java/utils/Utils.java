package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    /*
    * Driver paths
    * */

    public static final String CHROME_PATH = "./src/main/resources/driver/chromedriver.exe";
    public static final String FIREFOX_PATH = "./src/main/resources/driver/geckodriver.exe";
    public static final String EDGE_PATH = "./src/main/resources/driver/MicrosoftWebDriver.exe";

    public static WebDriverWait initWaits (WebDriver driver, int iWait, int eWait, int pollingTime){
        driver.manage().timeouts().implicitlyWait(iWait, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, eWait);
        wait.pollingEvery(pollingTime, TimeUnit.SECONDS);
        return wait;
    }
}
