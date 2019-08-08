package logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = wait;
    }

    protected void clickOnElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected  void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }

    protected String getText(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element.getText();
    }

    protected WebElement waitForElement(WebElement element){
        wait.until(
                ExpectedConditions.and(ExpectedConditions.visibilityOf(element),
                ExpectedConditions.elementToBeClickable(element))
        );
        return element;

    }

}
