package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signIn = driver.findElement(By.className("user_login"));
        signIn.click();

        WebElement signInMail = driver.findElement(By.className("is_required"));
        signInMail.sendKeys("katebishop@gmail.com");
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        driver.quit();
    }
}
