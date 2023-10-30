package tests.m_emin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class US_020 extends TestBaseRapor {
    @Test
    public void US_020_TC01() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Kayitli kullanicilarin abonelik planlarinin görülebilir olmasi",
                "Admin, sisteme kayitli kullanicilarin abonelik planlarini görebilir.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("https://qa.smartcardlink.com/ sitesine gidilir");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklanir");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapilir.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklanir");

        List<WebElement> abonelikPlanlariListesi = Driver.getDriver().findElements(By.xpath("//span[@class='badge bg-light-success']"));

        for (WebElement each : abonelikPlanlariListesi
        ) {
            Assert.assertTrue(each.isDisplayed(), "Abonelik planlari görülmedi.");
            extentTest.pass("Sayfada görünen kullanicilarin abonelik planlari görülür.");

        }

        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_020_TC02() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Kayitli kullanicinin hesabina girildikten sonra admin hesabina dönülebilmesi",
                "Admin, sisteme kayitli kullanicilarin hesabina gecis yaptiktan sonra admin hesabina geri dörebilir.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("https://qa.smartcardlink.com/ sitesine gidilir");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklanir");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapilir.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklanir");

        adminDashboard.usersMenusuIlkKullaniciHesabinaGecisButonu.click();
        extentTest.info("Admin hesabindan, Users menüsünden ilk kullanicinin hesabina gecis yapmak icin, kullanicinin impersonete'e tiklanir");

        Assert.assertTrue(adminDashboard.usersMenusuAppointmentSecenegi.isDisplayed(),"Kullanici hesabina gecis yapilamadi");
        extentTest.pass("Admin hesabindan kullanicinin hesabina gecis yapildigi test edilir");

        extentTest.info("Sayfa kapatilir");

    }
    @Test
    public void US_020_TC03() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Kayitli kullanicinin hesabina girildikten sonra admin hesabina dönülebilmesi",
                "Admin, sisteme kayitli kullanicilarin hesabina gecis yaptiktan sonra admin hesabina geri dörebilir.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("https://qa.smartcardlink.com/ sitesine gidilir");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklanir");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapilir.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklanir");

        adminDashboard.usersMenusuIlkKullaniciHesabinaGecisButonu.click();
        extentTest.info("Admin hesabindan, Users menüsünden ilk kullanicinin hesabina gecis yapmak icin, impersonet'e tiklanir ve kullanici hesabina gecilir.");

        adminDashboard.adminHesabinaGeriDonIkonu.click();
        extentTest.info("Kullanici hesabindan, admin hesabina gecis yapmak icin profil resminin yaninda ki admin hesabina gecis butonuna tiklanir");

        Assert.assertTrue(adminDashboard.adminMenuUsers.isDisplayed(),"Admin hesabina gecis yapilamadi");
        extentTest.pass("Kullanicinin hesabindan admin hesabina gecis yapilabildigi test edilir");

        extentTest.info("Sayfa kapatilir");

    }
}
