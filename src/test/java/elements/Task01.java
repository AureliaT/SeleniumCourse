package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement elementText = driver.findElement(By.id("hotel_location"));
        elementText.clear();
        elementText.sendKeys("Warsaw");
        WebElement searchButton = driver.findElement(By.id("search_room_submit"));
        searchButton.click();
        WebElement elementMail = driver.findElement(By.id("newsletter-input"));
        elementMail.clear();
        elementMail.sendKeys("test@test.com");
        //WebElement submitButton = driver.findElement(By.name("submitNewsletter"));
        //submitButton.click();
        elementMail.submit();
        driver.quit();

    }
}
