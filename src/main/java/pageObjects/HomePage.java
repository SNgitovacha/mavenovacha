package pageObjects;

import logic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

//    @FindBy(how = How.XPATH, using = "//a[@href='/abtest']")
//    private WebElement link_abtesting;
//    @FindBy(how = How.XPATH, using = "//a[@href='/add_remove_elements/']")
//    private WebElement link_addremoveelements;

    @FindAll(@FindBy(how = How.XPATH, using = "//ul/li/a"))
    private List<WebElement> allElements;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//    public ABTesting clickOnAbtesting(){
//        clickOnElement(link_abtesting);
//        return new ABTesting(driver, wait);
//    }

    public void clickOnLink(String href){
        for(WebElement w:allElements){
            String str = w.getAttribute("href");
            str = str.substring(str.lastIndexOf("/"));

            if(str.equals(href)){
                clickOnElement(w);
                return;
            }
        }
    }

    public BasicAuthPO enterText (String text){
        enterText(text);
        return new BasicAuthPO(driver, wait);
    }


}
