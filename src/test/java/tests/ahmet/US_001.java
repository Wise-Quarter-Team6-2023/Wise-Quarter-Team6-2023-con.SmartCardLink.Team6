package tests.ahmet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.ReusableMethods;
import java.time.Duration;
public class US_001 extends ReusableMethods {
    WebDriver driver = new ChromeDriver();
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public  void urlTest(){
        setup();
        driver.get("https://qa.smartcardlink.com/");
        String expectedUrlIcerik = "smartcardlink";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println(" test PASSED");
        }else{
            System.out.println(" test FAILED");
        }
        ReusableMethods.wait(3);
        driver.close();
    }
}