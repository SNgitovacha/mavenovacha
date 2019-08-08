package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(.,'LOGIN')]")
    private WebElement btnLogin;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public LoginPage clickLogin(){
        clickOnElement(btnLogin);
        return new LoginPage(driver,wait);
    }
}
