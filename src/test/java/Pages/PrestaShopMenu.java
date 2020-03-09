package Pages;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Wait;
import sun.java2d.opengl.WGLVolatileSurfaceManager;

import java.util.concurrent.TimeUnit;

public class PrestaShopMenu {

    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void startBrowser() {
        System.out.println(("BeforeClass---startBrowser"));
        driver.get("http://demo.prestashop.com");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='framelive']")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void goHome() {
        System.out.println("Before---goHome");

    }

    //1. As a user i want to signup in the website so that i can do shopping.
    @Test
    public void TestCase1() {
        System.out.println(("Test-----TestCase1"));

        String title = "Log in to your customer account";
        driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'No account? Create one here')]")).click();
        driver.findElement(By.cssSelector(".radio-inline:nth-child(2) input")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Minakshi");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Verma");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("csminakshi.verma@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gamepoker007");
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("04/30/1985");
        driver.findElement(By.xpath("//input[@name='psgdpr']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a")).click();


    }

    // 2. As a user i want to Signin in the website to add products to MyCart
    @Test

    public void TestCase2() {
        System.out.println(("Test........TestCase2"));
        String title = "Log in to your customer account";
        driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("csminakshi.verma@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gamepoker007");
        driver.findElement(By.xpath("//button[@id='submit-login']")).click();

    }

    // 3. As a user i want to choose a t-shirt from clothes section and add to cart so that i can purchase it later.
    @Test
    public void TestCase3() {
        System.out.println("Test......TestCase3");

        driver.findElement(By.cssSelector("#category-3 > .dropdown-item")).click();
        driver.findElement(By.xpath("//li[2]/label/span/span")).click();
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".thumbnail > img")).click();
        driver.findElement(By.cssSelector(".btn-primary > .material-icons")).click();
        driver.findElement(By.cssSelector(".cart-content-btn > .btn-primary")).click();
        driver.findElements(By.linkText("chevron_leftContinue shopping")).size();

    }


    // 4. As a user i want to use Search option to search Accessories so that i can choose and add to cart
    @Test
    public void TestCase4() {
        System.out.println(("Test........TestCase4"));

       String text = "Search";
        driver.findElement(By.xpath("//input[@name='s']")).sendKeys("Accessories");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='Mug Today is a good day']")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        driver.findElement(By.cssSelector(".btn-secondary")).click();

    }
    // 5. As a user i want to use Contact us option so that i can get answers of my question regarding the product.
    @ Test
    public void TestCase5(){
        System.out.println(("Test........TestCase5"));

        String title="Contact us";
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(.,'Contact us')]")).click();
        driver.findElement(By.xpath("//input[@name='from']")).sendKeys("csminakshi.verma@gmail.com");
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello i have some questions.");
        driver.findElement(By.xpath("//input[@name='submitMessage']")).click();

    }

    @AfterClass
    public static void closeBrowser() {
        System.out.println(("AfterClass---  closeBrowser"));
        driver.quit();

    }
}