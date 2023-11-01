package tests.m_emin;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Arrays;
import java.util.List;

public class US_019 extends TestBaseRapor {
    @Test
    public void US_019_TC01() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin bilgileri ile sisteme giris yapilabilmesi.",
                "Admin, admin giris bilgileri ile giris yaptiktan sonra admin sayfasina ulasir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        Assert.assertTrue(adminDashboard.adminMenuUsersME.isDisplayed(), "Admin girisi gerceklesmedi.");
        extentTest.pass("Admin sayfasina giris yapabildigini test eder");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC02() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin tarafindan sisteme kayitli tüm kullanicilarin görüntülenebilmesi.",
                "Admin, kendi username ve sifresiyle sisteme giris yaptiktan sonra, siteye kayitli kullanicilari Users menüsünde görüntüleyebilir.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        Assert.assertTrue(adminDashboard.kullanicilarListesiME.isDisplayed());
        extentTest.pass("Users sayfasinda kullanicilarin görünür oldugunu test eder");
        extentTest.info("Admin actigi web sitesini kapatir");

    }

    @Test
    public void US_019_TC03() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin tarafindan sisteme kayitli toplam kullanici sayisinin görülebilir olmasi.",
                "Admin, admin giris bilgileri ile giris yaptiktan sonra toplam kullanici sayisini görüntüleyebilir.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        String kullaniciSayisiText = adminDashboard.kullaniciSayisiTextiME.getText();
        String[] kullaniciSayisiTextOgeleri = kullaniciSayisiText.split(" ");
        System.out.println(Arrays.toString(kullaniciSayisiTextOgeleri));
        String toplamKullaniciSayisi = kullaniciSayisiTextOgeleri[5];
        System.out.println(toplamKullaniciSayisi);
        Assert.assertFalse(toplamKullaniciSayisi.isEmpty(), "Toplam kullanici sayisi gözükmüyor.");

        extentTest.pass("Toplam kullanici sayisini görür.");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC04() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin tarafindan sisteme kayitli Kullanicilarin aktiflik durumunun görüntülenebilmesi.",
                "Admin, users menusu altinda kullanicilarin aktiflik durumunu görebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");


        List<WebElement> aktiflikListesi = Driver.getDriver().findElements(By.xpath("//input[@name='is_active']"));

        for (WebElement each : aktiflikListesi
        ) {
            Assert.assertTrue(each.isDisplayed());
            extentTest.pass("Sayfada görünen kullanicilarin aktif olup olmadigi bilgisini görür");

        }

        extentTest.info("Admin actigi web sitesini kapatir");


    }

    @Test
    public void US_019_TC05() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin tarafindan sisteme kayitli Kullanici bilgilerinin gorüntülenmesi.",
                "Admin, users menusu altinda ki kullanicilarin bilgilerini görüntüleyebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.usersMenusuIlkKullaniciME.click();
        extentTest.info("Sonra bir kullanicinin adinin ustune tiklar");

        Assert.assertTrue(adminDashboard.userDetailsPageME.isDisplayed(), "Kullanici bilgileri gözükmüyor");
        extentTest.pass("Admin adinin üstüne tikladigi kullanici bilgilerini görüntüleyebilir");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC06() {
        AdminDashboard adminDashboard = new AdminDashboard();
        Faker faker = new Faker();
        extentTest = extentReports.createTest("Admin tarafindan kullanici bilgilerinin degistirilebilmesi.",
                "Admin, users menusu altinda kullanicilarin bilgilerini degistirebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.usersMenusuIlkKullaniciME.click();
        extentTest.info("Sonra ilk kullanicinin adinin ustune tiklar");

        adminDashboard.kullaniciEditButonuME.click();
        extentTest.info("Kullanici bilgilerini degistirmek icin Edit butonuna tiklar");

        adminDashboard.editMenuFirstNameME.click();
        adminDashboard.editMenuFirstNameME.clear();
        adminDashboard.editMenuFirstNameME.sendKeys(faker.name().firstName());
        extentTest.info("Admin, edit sayfasinda ki first name'e tiklar, eski bilgiyi siler ve yeni isim yazar");

        adminDashboard.editMenuLastNameME.click();
        adminDashboard.editMenuLastNameME.clear();
        adminDashboard.editMenuLastNameME.sendKeys(faker.name().lastName());
        extentTest.info("Edit sayfasinda ki last name'e tiklar, eski bilgiyi siler ve yeni soyisim yazar");

        adminDashboard.editMenuEmailME.click();
        adminDashboard.editMenuEmailME.clear();
        adminDashboard.editMenuEmailME.sendKeys(faker.internet().emailAddress());
        extentTest.info("Edit sayfasinda ki email'e tiklar, eski bilgiyi siler ve yeni email yazar");

        adminDashboard.editMenuBayrakME.click();
        if (adminDashboard.editMenuUnitedStatesFlagME.getText().equals("United States")) {
            adminDashboard.editMenuAndorraFlagME.click();
        } else {
            adminDashboard.editMenuUnitedStatesFlagME.click();
        }
        extentTest.info("Edit sayfasinda ki ülke telefon kodunu temsil eden bayraga tiklar ve degistirir");

        adminDashboard.editMenuPhoneME.click();
        adminDashboard.editMenuPhoneME.clear();
        adminDashboard.editMenuPhoneME.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Edit sayfasinda ki numaraya tiklar, eski numarayi siler ve yeni numarayi girer");


        if (adminDashboard.editMenuPlanME.getText().equals("Select Plan")) {
            adminDashboard.editMenuPlanME.click();
            adminDashboard.editMenuPlanSilverSecenegiME.click();
        } else {
            adminDashboard.editMenuPlanME.click();
            adminDashboard.editMenuPlanStandartSecenegiME.click();
        }
        extentTest.info("Admin plan menusunden bir secenegi secer");

        ReusableMethods.wait(2);
        extentTest.info("Edit sayfasinda ki plan menüsünden bir secenek secer");

        adminDashboard.editMenuSaveButtonME.click();
        extentTest.info("Admin girdigi yeni bilgileri Save butonuna basarak kaydeder.");


        Assert.assertTrue(ReusableMethods.waitForVisibility(adminDashboard.degisikliklerKaydedildiBilgisiME, 1).isDisplayed());
        extentTest.pass("Admin yaptigi degisikliklerin yüklendigi uyarisini görür");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC07() {
        Faker faker = new Faker();
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin tarafindan kullanicilarin sifrelerinin degistirilebilmesi.",
                "Admin, users menusu altinda kullanicilarin sifrelerini degistirebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.anahtarIkonuME.click();
        extentTest.info("Ilk kullanicinin bilgilerinin yazili oldugu satirda Anahtar simgesine tiklar");

        adminDashboard.newPasswordME.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Yeni sifreyi password kismina yazar");

        adminDashboard.confirmPasswordME.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Girdigi sifreyi confirm password kismina tekrar yazar");

        adminDashboard.sifreDegismeSaveButonuME.click();
        extentTest.info("Save'e tiklayarak girdigi sifreyi kaydeder");

        ReusableMethods.wait(2);

        ReusableMethods.hover(adminDashboard.passwordDegistiUyarisiME);
        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.passwordDegistiUyarisiME.isDisplayed(),"Yapilan sifre degisikliginin onay uyarisi gözükmedi.");

        extentTest.info("Admin actigi web sitesini kapatir");


    }

    @Test
    public void US_019_TC08() {
        AdminDashboard adminDashboard = new AdminDashboard();
        Faker faker = new Faker();

        extentTest = extentReports.createTest("Admin tarafindan yeni bir kullanici hesabinin acilabilmesi.",
                "Admin, users menusune yeni bir kullanici ekleyebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.addUserME.click();
        extentTest.info("Yeni kullanici eklemek icin Add User ikonuna tiklar");

        adminDashboard.editMenuFirstNameME.sendKeys(faker.name().firstName());
        extentTest.info("Gelen ekrandan isim bilgisini girer");

        adminDashboard.editMenuLastNameME.sendKeys(faker.name().lastName());
        extentTest.info("Soyisim bilgisini girer");

        adminDashboard.editMenuEmailME.sendKeys(faker.internet().emailAddress());
        extentTest.info("E-mail adresi bilgisini girer");

        adminDashboard.editMenuBayrakME.click();
        if (adminDashboard.editMenuUnitedStatesFlagME.getText().equals("United States")) {
            adminDashboard.editMenuAndorraFlagME.click();
        } else {
            adminDashboard.editMenuUnitedStatesFlagME.click();
        }
        extentTest.info("Ulke telefon kodu bayrak simgesi secilerek girilir");

        adminDashboard.editMenuPhoneME.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Telefon numarasini girer");

        adminDashboard.addUserPasswordME.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Sifresini girer");

        adminDashboard.addUserConfirmPasswordME.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Girdigi sifreyi dogrulamak icin tekrar sifresini girer");

        if (adminDashboard.editMenuPlanME.getText().equals("Select Plan")) {
            adminDashboard.editMenuPlanME.click();
            adminDashboard.editMenuPlanSilverSecenegiME.click();
        } else {
            adminDashboard.editMenuPlanME.click();
            adminDashboard.editMenuPlanStandartSecenegiME.click();
        }
        extentTest.info("Plan menusunden bir secenegi secer");

        adminDashboard.addUserSaveME.click();
        extentTest.info("Girdigi bilgileri Save butonuna basarak kaydeder");
        ReusableMethods.wait(1);

        Assert.assertTrue(ReusableMethods.waitForVisibility(adminDashboard.kullaniciEklendiUyarisiME, 1).isDisplayed());
        extentTest.pass("Admin olusturmus oldugu yeni hesabin sisteme basariyla yüklendigi uyarisini görür");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC09() {
        AdminDashboard adminDashboard = new AdminDashboard();

        extentTest = extentReports.createTest("Admin tarafindan sisteme kayitli kullanicinin silinebilmesi.",
                "Admin, users menusune kayitli olan bir kullaniciyi silebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButtonME.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMailME.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPasswordME.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButtonME.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsersME.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.kullaniciSilIkonuME.click();
        extentTest.info("Kullanicilarin oldugu listeden, bir kullaniciyi silmek icin Delete simgesine tiklar");

        //Driver.getDriver().switchTo().frame(adminDashboard.kullaniciSilIframe);
        adminDashboard.kullaniciSilYesDeleteButonuME.click();
        extentTest.info("Sil tusuna bastiktan sonra gelen uyariyi kabul ederek silme islemini onaylar");
        //HTML kodlarinda iframe yazmasina ragmen, iframe gecisi olmadan siliniyor.
        ReusableMethods.wait(2);

        Assert.assertTrue(ReusableMethods.waitForVisibility(adminDashboard.silmeIslemiBasariliUyarisiME,1).isDisplayed()
        ,"Silem islemi basarili degil");
        extentTest.pass("Silme isleminin basarili bir sekilde gerceklestigi uyarisini gorur");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

}