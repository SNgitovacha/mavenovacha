package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static utils.Variables.*;

public class ABTesting extends BasePage {

    @FindBy(how = How.XPATH, using = "//p")
    private WebElement textOnAbtestingPage;

    public ABTesting(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public ABTesting verifyTextOnPage(){
        Assert.assertEquals(getText(textOnAbtestingPage), ABTESTING_STRING, "result");
        return new ABTesting(driver,wait);
    }
}
