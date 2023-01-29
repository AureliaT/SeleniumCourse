package taskCheckConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Task01 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); //znajdowanie przycisku akceptacji na stronie google
        acceptCookiesButton.click();
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Itaka");
        element.submit();
        driver.quit();
    }

}
