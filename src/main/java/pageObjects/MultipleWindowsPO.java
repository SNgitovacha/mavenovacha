package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsPO extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class = 'example']/a")
    private WebElement link_clickHere;

    public MultipleWindowsPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickToOpenNewWindow(){
        clickOnElement(link_clickHere);
    }

    public void verifyThatNewWindowIsOpened(){

    }
}
