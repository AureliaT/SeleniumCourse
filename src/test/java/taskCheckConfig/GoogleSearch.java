package taskCheckConfig;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class GoogleSearch {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe"); //ustawienie property systemowego


        WebDriver driver = new ChromeDriver(); //wybranie drivera
        driver.manage().window().maximize(); //maksymalizacja okna
        driver.get("http://www.google.com"); //nawigujemy do strony google
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); //znajdowanie przycisku akceptacji cookies na stronie google (by - wybieramy po czym lokalizaujemy element
        acceptCookiesButton.click(); //kliknięcie w przycisk akceptacji
        WebElement element = driver.findElement(By.name("q")); //lokalizujemy element search bar - q (po nazwie)
        element.clear(); //usuwanie tekstu z wyszukiwarki
        element.sendKeys("Coderslab"); //przesyłamy tekst do wyszukiwarki
        element.submit(); //zatwierdzanie formularza
        driver.quit(); //zamykamy okno
    }

}
