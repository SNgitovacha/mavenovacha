package logic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import utils.Utils;

public enum Driver {

    EDGE, FIREFOX, GOOGLE_CHROME, INTERNET_EXPLORER, PROPERTY;

    private static final String DEFAULT_BROWSER = "GC";

    static{
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, Utils.CHROME_PATH);
        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, Utils.FIREFOX_PATH);
        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, Utils.EDGE_PATH);
    }

    public WebDriver initializeDriver(){
        WebDriver driver = null;
        switch (this){
            case GOOGLE_CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            case PROPERTY:
                switch (System.getProperty("ui_browser", DEFAULT_BROWSER)) {
                case "GC":
                    driver = new ChromeDriver();
                    break;
                case "FF":
                    driver = new FirefoxDriver();
                    break;
                case "EG":
                    driver = new EdgeDriver();
                    break;
            }
        }
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);;
        driver.manage().window().maximize();
        return driver;
    }
}
