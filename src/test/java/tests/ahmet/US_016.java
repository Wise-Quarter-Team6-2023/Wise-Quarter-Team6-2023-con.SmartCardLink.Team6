package tests.ahmet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ReusableMethods;
import java.time.Duration;
public class US_016 extends ReusableMethods {
    WebDriver driver = new ChromeDriver();
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void AppoinmentsTesti(){
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
        Actions actions = new Actions(driver);
        WebElement appoinments = driver.findElement(By.xpath(
                " (//a[@class='nav-link d-flex align-items-center py-3'])[4]"));
        actions.moveToElement(appoinments).perform();
        driver.findElement(By.xpath(
                " (//a[@class='nav-link d-flex align-items-center py-3'])[4]")).click();
        wait(6);
        WebElement appoinmentsDisplayed = driver.findElement(By.xpath(
                "(//td[@class='text-center'])[1]"));
        if (appoinmentsDisplayed.isDisplayed()){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
        driver.close();
    }
}
