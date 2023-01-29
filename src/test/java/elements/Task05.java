package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("Clintbarton@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("TestTest");
        WebElement submitButton = driver.findElement(By.id("SubmitLogin"));
        submitButton.click();
        WebElement personalInformation = driver.findElement(By.cssSelector("a[title='Information'] span"));
        personalInformation.click();
        driver.navigate().back();
        WebElement myAdress = driver.findElement(By.cssSelector("a[title='Addresses'] span"));
        driver.navigate().back();
        driver.quit();
    }
}
