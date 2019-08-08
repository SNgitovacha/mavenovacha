package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddRemoveElements extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class='example']/button")
    private WebElement btn_addElement;

    public AddRemoveElements(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public AddRemoveElements clickOnAddElementBtn(){
        if(waitForElement(btn_addElement).isDisplayed()){
            clickOnElement(btn_addElement);
            return new AddRemoveElements(driver, wait);
        }
        Assert.fail("Nije nasao");
        return new AddRemoveElements(driver, wait);
    }
}
