package tests.m_emin;


import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import java.awt.*;
import java.awt.event.KeyEvent;

public class US_013 extends TestBaseRapor {



    @Test
    public void US_013_TC01() {
        HomePage homePage=new HomePage();
        UserDashboard userDashboard= new UserDashboard();
        extentTest = extentReports.createTest("Profil bilgilerini goruntuleyebilme",
                "Kullanici giris yaptiktan sonra profil bilgilerini goruntuler");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanici https://qa.smartcardlink.com/ sitesine gider");

        homePage.signInButton.click();
        extentTest.info("Kullanici ana sayfada bulunan Sign in butonuna tiklar");

        userDashboard.logInEMail.sendKeys(ConfigReader.getProperty("user_username"));
        userDashboard.logInPassword.sendKeys(ConfigReader.getProperty("user_userPassword"));
        userDashboard.loginButton.click();
        extentTest.info("Kullanici siteye kayitli username ve sifre girer");

        userDashboard.userMenu.click();
        extentTest.info("Profil resminin yaninda ki menu simgesine tiklar");

        userDashboard.accountSettings.click();
        extentTest.info("Acilan menuden account setting butonuna tiklar");

        Assert.assertTrue(userDashboard.profileDetails.isDisplayed(), "Kullanici profil bilgilerini goruntuleyemedi");
        extentTest.pass("Profil bilgilerini goruntuledigini test eder");
    }

    @Test
    public void US_013_TC02() throws AWTException {
        HomePage homePage=new HomePage();
        UserDashboard userDashboard= new UserDashboard();
        Faker faker=new Faker();

        extentTest = extentReports.createTest("Profil bilgilerini goruntuleyebilme",
                "Kullanici giris yaptiktan sonra profil bilgilerini goruntuler");

        Driver.getDriver().get("https://qa.smartcardlink.com/");
        extentTest.info("Kullanici https://qa.smartcardlink.com/ sitesine gider");

        homePage.signInButton.click();
        extentTest.info("Profil resminin yaninda ki menu simgesine tiklar");

        userDashboard.logInEMail.sendKeys(ConfigReader.getProperty("user_username"));
        userDashboard.logInPassword.sendKeys(ConfigReader.getProperty("user_userPassword"));
        userDashboard.loginButton.click();
        extentTest.info("Kullanici siteye kayitli username ve sifre girer");

        userDashboard.userMenu.click();
        extentTest.info("Profil resminin yaninda ki menu simgesine tiklar");

        userDashboard.accountSettings.click();
        extentTest.info("Acilan menuden account setting butonuna tiklar");

        userDashboard.userSettingsFirstName.click();
        extentTest.info("Kullanici first name'inin yazili oldugu butona tiklar");

        userDashboard.userSettingsFirstName.clear();
        extentTest.info("Degistirmek istedigi ismi siler");

        userDashboard.userSettingsFirstName.sendKeys(faker.name().firstName());
        extentTest.info("Siteye kaydetmek istedigi yeni ismini yazar");

        userDashboard.userSettingsLastName.click();
        extentTest.info("Kullanici last name'inin yazili oldugu butona tiklar");

        userDashboard.userSettingsLastName.clear();
        extentTest.info("Degistirmek istedigi soyadini siler");

        userDashboard.userSettingsLastName.sendKeys(faker.name().lastName());
        extentTest.info("Siteye kaydetmek istedigi yeni soyadini girer");

        userDashboard.userSettingsEmail.click();
        extentTest.info("Kullanici e-mail'inin yazili oldugu butona tiklar");

        userDashboard.userSettingsEmail.clear();
        extentTest.info("Degistirmek istedigi e-mail adresini siler");

        userDashboard.userSettingsEmail.sendKeys(faker.internet().emailAddress());
        extentTest.info("Siteye kaydetmek istedigi yeni e-mail adresini yazar");

        userDashboard.userSettingsNumberFlags.click();
        extentTest.info("Kullanici telefon numarasinin bagli oldugu ülke kodlarinin bulundugu bayrak butonuna tikla");

        userDashboard.andorraFlag.click();
        extentTest.info("Yeni ulke kodu girmek icin bir bayrak ikonunu secer");

        userDashboard.userSettingsPhone.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Kullanici yeni numarasini phone butonuna yazar");

        Assert.assertTrue(userDashboard.saveButton.isEnabled(),"Kullanici bilgilerini SAVE butonunu aktif bir button olmadigi icin kayit edemez.");
        extentTest.pass("Kullanici Save butonuna tiklar ve bilgilerini kayit eder");

       // Driver.closeDriver();
        extentTest.info("Kullanici actigi web sitesini kapatir");

        

    }
}
