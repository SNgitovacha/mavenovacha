package pageObjects;

import logic.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPO extends BasePage {

    Actions actions = new Actions(driver);
    
    @FindBy(how = How.XPATH, using = "//div[@id='hot-spot']")
    private WebElement element;

    public ContextMenuPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void rightClick() throws InterruptedException {
        actions.contextClick(element).perform();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
