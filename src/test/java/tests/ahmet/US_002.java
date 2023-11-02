package tests.ahmet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.time.Duration;
public class US_002 extends ReusableMethods {
    WebDriver driver = new ChromeDriver();
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void dropdownTesti() {
        setup();
        driver.get("https://qa.smartcardlink.com/");
        WebElement homeButton = driver.findElement(By.xpath(
                "//*[@class='nav-item'] "));
        if (homeButton.isDisplayed() || homeButton.isSelected()) {
            System.out.println("Home Button is Visible and Active");
        } else {
            System.out.println("Home Button is not Visible and Active");
        }
        WebElement featuresButton = driver.findElement(By.xpath(
                "(//a[@class='nav-link mt-1']) [1]"));
        if (featuresButton.isDisplayed() || featuresButton.isSelected()) {
            System.out.println("Features Button is Visible and Active");
        } else {
            System.out.println("Features Button is not Visible and Active");
        }
        WebElement aboutButton = driver.findElement(By.xpath(
                "(//a[@class='nav-link mt-1']) [2]"));
        if (aboutButton.isDisplayed() || aboutButton.isSelected()) {
            System.out.println("About Button is Visible and Active");
        } else {
            System.out.println("About Button is not Visible and Active");
        }
        WebElement pricingButton = driver.findElement(By.xpath(
                "(//a[@class='nav-link mt-1']) [2]"));
        if (pricingButton.isDisplayed() || pricingButton.isSelected()) {
            System.out.println("Pricing Button is Visible and Active");
        } else {
            System.out.println("Pricing Button is not Visible and Active");
        }
        WebElement contactButton = driver.findElement(By.xpath(
                "(//a[@class='nav-link mt-1']) [2]"));
        if (contactButton.isDisplayed() || contactButton.isSelected()) {
            System.out.println("Pricing Button is Visible and Active");
        } else {
            System.out.println("Pricing Button is not Visible and Active");
        }
        driver.close();
    }

}
