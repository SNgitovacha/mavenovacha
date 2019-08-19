package pageObjects;

import logic.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasicAuthPO extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public BasicAuthPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public BasicAuthPO enterTextWithoutElement(String text){
//        js.executeScript("window.scrollBy(0,600)");
//        driver.switchTo().alert().sendKeys(text);
        return new BasicAuthPO(driver, wait);
    }
}
