package pageObjects;

import logic.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasicAuthPO extends BasePage {

    public BasicAuthPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public BasicAuthPO enterTextWithoutElement() throws InterruptedException {
        System.out.println("tu sam");
        Alert alert = driver.switchTo().alert();

        Thread.sleep(3000);
        alert.sendKeys("test");
        alert.accept();
        driver.switchTo().defaultContent();

        return new BasicAuthPO(driver, wait);
    }
}
