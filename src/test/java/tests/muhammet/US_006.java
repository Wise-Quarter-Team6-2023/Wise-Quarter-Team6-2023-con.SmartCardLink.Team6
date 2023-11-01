package tests.muhammet;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.security.Key;

public class US_006 {

    HomePage homePage;

    @Test(priority = 1)
    public void US006_TC01() {
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        homePage = new HomePage();

        ReusableMethods.wait(3);
        // SignIn butonuna tiklar
        homePage.signInButonuRS.click();

        // Email kutusuna gecerli Email girer
        homePage.emailKutusuRS.sendKeys(ConfigReader.getProperty("username"));

        // Password kutusuna gecersiz Password girer
        homePage.passwordKutusuRS.sendKeys(ConfigReader.getProperty("gecersizPassword"));

        ReusableMethods.wait(1);

        // Login butonuna tıklar
        homePage.loginButonuRS.click();

        // Password kutusunun görülebildiği doğrulanır
        Assert.assertTrue(homePage.passwordKutusuRS.isDisplayed());

        // Sayfayi kapatir
        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void US006_TC02(){
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        homePage = new HomePage();

        ReusableMethods.wait(3);

        // SignIn butonuna tiklar
        homePage.signInButonuRS.click();

        // Email kutusuna gecersiz Email girer
        homePage.emailKutusuRS.sendKeys(ConfigReader.getProperty("gecersizUsername"));

        // Password kutusuna gecersiz Password girer
        homePage.passwordKutusuRS.sendKeys(ConfigReader.getProperty("gecersizPassword"));

        ReusableMethods.wait(1);

        // Login butonuna tıklar
        homePage.loginButonuRS.click();

        // Password kutusunun görülebildiği doğrulanır
        Assert.assertTrue(homePage.passwordKutusuRS.isDisplayed());

        // Sayfayi kapatir
        Driver.closeDriver();
    }

    @Test(priority = 3)
    public void US006_TC03(){
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        homePage = new HomePage();

        ReusableMethods.wait(3);

        // SignIn butonuna tiklar
        homePage.signInButonuRS.click();

        // Email kutusuna gecersiz Email girer
        homePage.emailKutusuRS.sendKeys(ConfigReader.getProperty("gecersizUsername"));

        // Password kutusuna gecerli Password girer
        homePage.passwordKutusuRS.sendKeys(ConfigReader.getProperty("password"));

        ReusableMethods.wait(1);

        // Login butonuna tıklar
        homePage.loginButonuRS.click();

        // Password kutusunun görülebildiği doğrulanır
        Assert.assertTrue(homePage.passwordKutusuRS.isDisplayed());

        // Sayfayi kapatir
        Driver.closeDriver();
    }

    @Test(priority = 4)
    public void US006_TC04() {
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        homePage = new HomePage();

        ReusableMethods.wait(2);

        // SignIn butonuna tiklar
        homePage.signInButonuRS.click();

        // Email kutusuna gecerli Email girer
        homePage.emailKutusuRS.sendKeys(ConfigReader.getProperty("username"));

        // Password kutusuna gecerli Password girer
        homePage.passwordKutusuRS.sendKeys(ConfigReader.getProperty("password"));

        ReusableMethods.wait(1);

        // Login butonuna tıklar
        homePage.loginButonuRS.click();

        String expectedUrl = "https://qa.smartcardlink.com/admin/manage-subscription/upgrade";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        // Actual Url'in Expected Url icerdigi dogrulanir
        Assert.assertEquals(actualUrl,expectedUrl);

        // Sayfayi kapatir
        Driver.closeDriver();
    }
}
