package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='logInEmail']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@id='passwort']")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[@class='caption profile']")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public LoginPage enterEmail(String email){
        enterText(txtEmail, email);
        return this;
    }

    public LoginPage enterPassword(String password) {
        enterText(txtPassword, password);
        return this;
    }

    public HomePage submitLogin(){
        clickOnElement(btnLogin);
        return new HomePage(driver, wait);
    }
}
