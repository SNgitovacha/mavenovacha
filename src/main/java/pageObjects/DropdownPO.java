package pageObjects;

import logic.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPO extends BasePage {
    public DropdownPO(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void selectDropdownOption(String idName, int index){
        Select dropdown = new Select(driver.findElement(By.id(idName)));
        dropdown.selectByIndex(index);
    }
}
