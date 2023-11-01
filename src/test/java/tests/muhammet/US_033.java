package tests.muhammet;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_033 {

    AdminDashboard adminDashboard;

    @Test
    public void US33_TC01(){
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        adminDashboard = new AdminDashboard();

        ReusableMethods.wait(2);

        // SignIn butonuna tiklar
        adminDashboard.signInButonuRS.click();

        ReusableMethods.wait(1);

        // Email kutusuna admin Email girer
        adminDashboard.emailKutusuRS.sendKeys(ConfigReader.getProperty("adminUsername"));

        // Password kutusuna admin Password girer
        adminDashboard.passwordKutusuRS.sendKeys(ConfigReader.getProperty("adminPassword"));

        ReusableMethods.wait(1);

        // Login butonuna tıklar
        adminDashboard.loginButonuRS.click();

        ReusableMethods.wait(1);

        // Front CMS butonuna tiklar
        adminDashboard.frontCMSButonuRS.click();

        // Baslik yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(adminDashboard.titleTextRS.isDisplayed());

        // Sub Text yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(adminDashboard.subTextYazisiRS.isDisplayed());

        // Features yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(adminDashboard.featuresTextRS.isDisplayed());

        // About Us yazisinin goruntulendigi dogrulanir
        Assert.assertTrue(adminDashboard.aboutUsTextRS.isDisplayed());

        ReusableMethods.wait(2);

        //Sayfayi kapatir
        Driver.closeDriver();
    }
}
