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
        extentTest = extentReports.createTest("Kullanici tarafindan, Profil bilgilerinin goruntulenebilmesi.",
                "Kullanici giris yaptiktan sonra profil bilgilerini goruntuleyebilir.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanici https://qa.smartcardlink.com/ sitesine gider");

        homePage.signInButtonME.click();
        extentTest.info("Ana sayfada bulunan Sign in butonuna tiklar");

        userDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("user_username"));
        userDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("user_userPassword"));
        userDashboard.loginButtonME.click();
        extentTest.info("Kullanici siteye kayitli username ve sifre girer");

        userDashboard.userMenuME.click();
        extentTest.info("Profil resminin yaninda ki menu simgesine tiklar");

        userDashboard.accountSettingsME.click();
        extentTest.info("Acilan menuden account setting butonuna tiklar");

        Assert.assertTrue(userDashboard.profileDetailsME.isDisplayed(), "Kullanici profil bilgilerini goruntuleyemedi");
        extentTest.pass("Profil bilgilerini goruntuledigini test eder");

        extentTest.info("Kullanici actigi web sitesini kapatir");
    }

    @Test
    public void US_013_TC02() throws AWTException {
        HomePage homePage=new HomePage();
        UserDashboard userDashboard= new UserDashboard();
        Faker faker=new Faker();

        extentTest = extentReports.createTest("Kullanici tarafindan Profil bilgilerinin degistirelerek sisteme kaydedilmesi.",
                "Kullanici siteye username ve sifresiyle giris yaptiktan sonra profil bilgilerini degistirebilir.");

        Driver.getDriver().get("https://qa.smartcardlink.com/");
        extentTest.info("Kullanici https://qa.smartcardlink.com/ sitesine gider");

        homePage.signInButtonME.click();
        extentTest.info("Profil resminin yaninda ki menu simgesine tiklar");

        userDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("user_username"));
        userDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("user_userPassword"));
        userDashboard.loginButtonME.click();
        extentTest.info("Kullanici siteye kayitli username ve sifre girer");

        userDashboard.userMenuME.click();
        extentTest.info("Profil resminin yaninda ki menu simgesine tiklar");

        userDashboard.accountSettingsME.click();
        extentTest.info("Acilan menuden account setting butonuna tiklar");

        userDashboard.userSettingsFirstNameME.click();
        extentTest.info("Kullanici first name'inin yazili oldugu butona tiklar");

        userDashboard.userSettingsFirstNameME.clear();
        extentTest.info("Degistirmek istedigi ismi siler");

        userDashboard.userSettingsFirstNameME.sendKeys(faker.name().firstName());
        extentTest.info("Siteye kaydetmek istedigi yeni ismini yazar");

        userDashboard.userSettingsLastNameME.click();
        extentTest.info("Kullanici last name'inin yazili oldugu butona tiklar");

        userDashboard.userSettingsLastNameME.clear();
        extentTest.info("Degistirmek istedigi soyadini siler");

        userDashboard.userSettingsLastNameME.sendKeys(faker.name().lastName());
        extentTest.info("Siteye kaydetmek istedigi yeni soyadini girer");

        userDashboard.userSettingsEmailME.click();
        extentTest.info("Kullanici e-mail'inin yazili oldugu butona tiklar");

        userDashboard.userSettingsEmailME.clear();
        extentTest.info("Degistirmek istedigi e-mail adresini siler");

        userDashboard.userSettingsEmailME.sendKeys(faker.internet().emailAddress());
        extentTest.info("Siteye kaydetmek istedigi yeni e-mail adresini yazar");

        userDashboard.userSettingsNumberFlagsME.click();
        extentTest.info("Kullanici telefon numarasinin bagli oldugu ülke kodlarinin bulundugu bayrak butonuna tikla");

        userDashboard.andorraFlagME.click();
        extentTest.info("Yeni ulke kodu girmek icin bir bayrak ikonunu secer");

        userDashboard.userSettingsPhoneME.clear();
        extentTest.info("Phone butonu temizlenir");

        userDashboard.userSettingsPhoneME.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Kullanici yeni numarasini phone butonuna yazar");

        //BURADA BUG VAR !!!
        Assert.assertTrue(userDashboard.saveButtonME.isEnabled(),"Kullanici degistirmek istedigi bilgileri, SAVE butonu aktif olmadigi icin kayit edemez.");
        extentTest.pass("Kullanici Save butonuna tiklar ve bilgilerini sisteme kayit eder");

       // Driver.closeDriver();
        extentTest.info("Kullanici actigi web sitesini kapatir");
    }
}
