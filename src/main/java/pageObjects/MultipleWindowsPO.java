package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class MultipleWindowsPO extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@class = 'example']/a")
    private WebElement link_clickHere;

    public MultipleWindowsPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public MultipleWindowsPO clickToOpenNewWindow(){
        clickOnElement(link_clickHere);
        return new MultipleWindowsPO(driver,wait);
    }

    public void verifyThatNewWindowIsOpened(String expectedTitle){
        for(String curWindow : driver.getWindowHandles()){
            driver.switchTo().window(curWindow);
        }
        String currentTitle = driver.getTitle();
        Assert.assertEquals(currentTitle, expectedTitle, "result");
    }
}
