package pageObjects;

import logic.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static utils.Variables.*;

public class JavaScriptAlertsPO extends BasePage {

    @FindBy(how = How.XPATH, using = "//button[@onclick='jsAlert()']")
    private WebElement btn_JSAlert;
    @FindBy(how = How.XPATH, using = "//p[@id='result']")
    private WebElement txt_JSAlert;
    @FindBy(how = How.XPATH, using = "//button[@onclick = 'jsConfirm()']")
    private WebElement btn_JSConfirm;
    @FindBy(how = How.XPATH, using = "//button[@onclick = 'jsPrompt()']")
    private WebElement btn_JSPrompt;

    public JavaScriptAlertsPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void verifyJSAlert(){
        clickOnElement(btn_JSAlert);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(JSALERT_TEXT, getText(txt_JSAlert), "result" );
    }
    public void verifyJSConfirm(){
        clickOnElement(btn_JSConfirm);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(JSCONFIRMACCEPT_TEXT, getText(txt_JSAlert), "result" );
        clickOnElement(btn_JSConfirm);
        alert.dismiss();
        Assert.assertEquals(JSCONFIRMCANCEL_TEXT, getText(txt_JSAlert), "result" );
    }
    public void verifyJSPrompt(String test){
        clickOnElement(btn_JSPrompt);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(test);
        alert.accept();
        Assert.assertEquals((JSPROMPTEMPTY_TEXT+""+test).trim(), (getText(txt_JSAlert)).trim(), "result" );
        clickOnElement(btn_JSPrompt);
        alert.dismiss();
        Assert.assertEquals((JSPROMPTDISMISS_TEXT).trim(), (getText(txt_JSAlert)).trim(), "result" );
    }
}
