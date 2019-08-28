package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlertsPO extends BasePage {

    @FindBy(how = How.XPATH, using = "//button[@onclick='jsAlert()']")
    private WebElement btn_JSAlert;

    public JavaScriptAlertsPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void verifyJSAlert(){
        clickOnElement(btn_JSAlert);
    }
    public void verifyJSConfirm(){

    }
    public void verifyJSPrompt(){

    }
}
