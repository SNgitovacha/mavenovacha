package pageObjects;

import logic.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;
import java.util.logging.Level;

public class OnLoadErrorPO extends BasePage {

    public OnLoadErrorPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
//    public void catchJavascriptError(){
//        ((JavascriptExecutor) driver).executeScript("return window.javascript_errors");
//    }

    public void ExtractJSLogs() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        LoggingPreferences loggingprefs = new LoggingPreferences();
        loggingprefs.enable(LogType.BROWSER,Level.ALL);
        capabilities.setCapability(CapabilityType.LOGGING_PREFS,loggingprefs);

        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
    }
}
