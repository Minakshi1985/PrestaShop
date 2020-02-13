package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrestaShopMenu {
    public static WebElement SigninButton(WebDriver driver){
        WebElement element= driver.findElement(By.linkText("Sign in"));
        driver.findElement(By.id("framelive" )).click();
        return element;

    }
}
