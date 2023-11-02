package tests.ahmet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.ReusableMethods;
import java.time.Duration;
public class US_007 extends ReusableMethods {
    WebDriver driver = new ChromeDriver();
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void DashboardTesti () {
        setup();
        driver.get("https://qa.smartcardlink.com/");
        WebElement singIn = driver.findElement(By.xpath(
                "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']"));
        singIn.click();
        WebElement email = driver.findElement(By.xpath("//*[@id='email'] "));
        wait(2);
        email.sendKeys("users1@gmail.com");
        wait(2);
        WebElement password = driver.findElement(By.xpath("//*[@id='password'] "));
        password.sendKeys("12345678A*");
        WebElement logIn = driver.findElement(By.xpath("//*[@type='submit']"));
        logIn.sendKeys(Keys.ENTER);
        WebElement h3 = driver.findElement(By.xpath("//h3[@class='mb-0 fs-4 fw-light']"));
        if (h3.isDisplayed()){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
        driver.close();
    }
}
