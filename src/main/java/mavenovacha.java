import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavenovacha {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", ".src/main/java/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //Closes chrome browser
        driver.quit();
    }
}
