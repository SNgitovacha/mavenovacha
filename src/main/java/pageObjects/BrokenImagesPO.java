package pageObjects;

import logic.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BrokenImagesPO extends BasePage {

    @FindAll(@FindBy(how = How.XPATH, using = "//div/img"))
            private List<WebElement> allImages;

    public BrokenImagesPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void isImageBroken(){
        for  (WebElement image : allImages){
            if (image.getAttribute("naturalWidth").equals("0")) {
                System.out.println(image.getAttribute("outerHTML") + "is broken.");
            }
        }
    }
}
