package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement elementText = driver.findElement(By.name("hotel_location"));
        elementText.clear();
        elementText.sendKeys("Warsaw");
        WebElement searchButton = driver.findElement(By.name("search_room_submit"));
        searchButton.click();
        WebElement elementMail = driver.findElement(By.name("email"));
        elementMail.clear();
        elementMail.sendKeys("test@test.com");
        WebElement submitButton = driver.findElement(By.name("submitNewsletter"));
        submitButton.click();

        driver.quit();
    }
}
