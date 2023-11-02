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
public class US025_AdminPlan extends ReusableMethods {
    WebDriver driver = new ChromeDriver();

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void AppoinmentsTesti() {
        setup();
        driver.get("https://qa.smartcardlink.com/");
        WebElement singIn = driver.findElement(By.xpath(
                "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']"));
        singIn.click();
        WebElement email = driver.findElement(By.xpath("//*[@id='email'] "));
        wait(2);
        email.sendKeys("admin18@smartcardlink.com");
        wait(2);
        WebElement password = driver.findElement(By.xpath("//*[@id='password'] "));
        password.sendKeys("123123123");
        WebElement logIn = driver.findElement(By.xpath("//*[@type='submit']"));
        logIn.sendKeys(Keys.ENTER);
        Actions actions = new Actions(driver);
        WebElement usersPlan = driver.findElement(By.xpath(
                "(//a[@class='nav-link d-flex align-items-center py-3'])[8]"));
        actions.moveToElement(usersPlan).perform();
        wait(2);
        driver.findElement(By.xpath(
                "(//a[@class='nav-link d-flex align-items-center py-3'])[8]")).click();
        WebElement editPlan = driver.findElement(By.xpath(
                "(//*[@class='btn px-1 text-primary fs-3'])[1]"));
        if (editPlan.isEnabled() & editPlan.isDisplayed()) {
            System.out.println("editPlan is Passed");
        } else {
            System.out.println("editPlan is Failed");
        }
        wait(3);
        WebElement deletePlan = driver.findElement(By.xpath(
                "(//*[@class='btn px-1 text-danger fs-3 plan-delete-btn'])[1]"));
        if (deletePlan.isEnabled() & deletePlan.isDisplayed()) {
            System.out.println("deletePlan is Passed");
        } else {
            System.out.println("deletePlan is Failed");
        }
        driver.close();
    }
}










