import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class mavenovacha {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement google = driver.findElement(By.className("gLFyf"));

        google.sendKeys("testing");
        google.sendKeys(Keys.RETURN);
        //Closes chrome browser
        //Saveta
        //driver.quit();
    }
}
