package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("http://demo.prestashop.com");
       // Thread.sleep(10000);
        PrestaShopMenu.SigninButton(driver).click();
    }
}

