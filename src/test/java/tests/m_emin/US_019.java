package tests.m_emin;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Arrays;
import java.util.List;

public class US_019 extends TestBaseRapor {

    //Admin bilgilieri ile giriş yaptıktan sonra kullanıcılar bölümünde  kayıtlı kullanıcıları,
    // toplam kullanıcı sayısını,
    // aktiflik durumlarını,
    // kullanıcı bilgilerini görüntüleyebildiğimi ve değiştirebildiğimi,
    // şifrelerini değiştrebildiğimi,
    // yeni hesap açabildiğimi ve hesabı silebildiğimi doğrulayabilmeyliyim
    @Test
    public void US_019_TC01() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin bilgileri ile giris yapabilme",
                "Admin, admin giris bilgileri ile giris yaptiktan sonra admin sayfasina ulasir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        Assert.assertTrue(adminDashboard.adminMenuUsers.isDisplayed(), "Admin girisi gerceklesmedi.");
        extentTest.pass("Admin sayfasina giris yapabildigini test eder");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC02() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin bilgileri ile giris yapabilme",
                "Admin, admin giris bilgileri ile giris yaptiktan sonra admin sayfasina ulasir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        Assert.assertTrue(adminDashboard.kullanicilarListesi.isDisplayed());
        extentTest.pass("Users sayfasinda kullanicilarin görünür oldugunu test eder");
        extentTest.info("Admin actigi web sitesini kapatir");

    }

    @Test
    public void US_019_TC03() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin bilgileri ile giris yapabilme",
                "Admin, admin giris bilgileri ile giris yaptiktan sonra admin sayfasina ulasir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        String kullaniciSayisiText = adminDashboard.kullaniciSayisiTexti.getText();
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
        extentTest = extentReports.createTest("Kullanicilarin aktiflik durumunu görebilme",
                "Admin, users menusu altinda kullanicilarin aktiflik durumunu görebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
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
        extentTest = extentReports.createTest("Kullanici bilgilerini gorüntüleme",
                "Admin, users menusu altinda ki kullanicilarin bilgilerini görüntüleyebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.usersMenusuIlkKullanici.click();
        extentTest.info("Sonra bir kullanicinin adinin ustune tiklar");

        Assert.assertTrue(adminDashboard.userDetailsPage.isDisplayed(), "Kullanici bilgileri gözükmüyor");
        extentTest.pass("Admin adinin üstüne tikladigi kullanici bilgilerini görüntüleyebilir");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC06() {
        AdminDashboard adminDashboard = new AdminDashboard();
        Faker faker = new Faker();
        extentTest = extentReports.createTest("Kullanici bilgilerini degistirebilme",
                "Admin, users menusu altinda kullanicilarin bilgilerini degistirebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.usersMenusuIlkKullanici.click();
        extentTest.info("Sonra ilk kullanicinin adinin ustune tiklar");

        adminDashboard.kullaniciEditButonu.click();
        extentTest.info("Kullanici bilgilerini degistirmek icin Edit butonuna tiklar");

        adminDashboard.editMenuFirstName.click();
        adminDashboard.editMenuFirstName.clear();
        adminDashboard.editMenuFirstName.sendKeys(faker.name().firstName());
        extentTest.info("Admin, edit sayfasinda ki first name'e tiklar, eski bilgiyi siler ve yeni isim yazar");

        adminDashboard.editMenuLastName.click();
        adminDashboard.editMenuLastName.clear();
        adminDashboard.editMenuLastName.sendKeys(faker.name().lastName());
        extentTest.info("Edit sayfasinda ki last name'e tiklar, eski bilgiyi siler ve yeni soyisim yazar");

        adminDashboard.editMenuEmail.click();
        adminDashboard.editMenuEmail.clear();
        adminDashboard.editMenuEmail.sendKeys(faker.internet().emailAddress());
        extentTest.info("Edit sayfasinda ki email'e tiklar, eski bilgiyi siler ve email yazar");

        adminDashboard.editMenuBayrak.click();
        if (adminDashboard.editMenuUnitedStatesFlag.getText().equals("United States")) {
            adminDashboard.editMenuAndorraFlag.click();
        } else {
            adminDashboard.editMenuUnitedStatesFlag.click();
        }
        extentTest.info("Edit sayfasinda ki bayraga tiklar ve degistirir");

        adminDashboard.editMenuPhone.click();
        adminDashboard.editMenuPhone.clear();
        adminDashboard.editMenuPhone.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Edit sayfasinda ki numaraya tiklar, eski numarayi siler ve yeni numarayi girer");


        if (adminDashboard.editMenuPlan.getText().equals("Select Plan")) {
            adminDashboard.editMenuPlan.click();
            adminDashboard.editMenuPlanSilverSecenegi.click();
        } else {
            adminDashboard.editMenuPlan.click();
            adminDashboard.editMenuPlanStandartSecenegi.click();
        }
        extentTest.info("Admin plan menusunden bir secenegi secer");
        ReusableMethods.wait(2);
        extentTest.info("Edit sayfasinda ki plan menüsünden bir secenek secer");

        adminDashboard.editMenuSaveButton.click();
        extentTest.info("Admin girdigi yeni bilgileri Save butonuna basarak kaydeder.");


        Assert.assertTrue(ReusableMethods.waitForVisibility(adminDashboard.degisikliklerKaydedildiBilgisi, 1).isDisplayed());
        extentTest.pass("Admin yaptigi degisikliklerin yüklendigi uyarisini görür");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC07() {
        Faker faker = new Faker();
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Kullanicilarin sifrelerini degistirebilme",
                "Admin, users menusu altinda kullanicilarin sifrelerini degistirebilir");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.anahtarIkonu.click();
        extentTest.info("Ilk kullanicinin bilgilerinin yazili oldugu satirda Anahtar simgesine tiklar");

        adminDashboard.newPassword.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Yeni sifreyi password kismina yazar");

        adminDashboard.confirmPassword.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Girdigi sifreyi confirm password kismina tekrar yazar");

        adminDashboard.sifreDegismeSaveButonu.click();
        extentTest.info("Save'e tiklayarak girdigi sifreyi kaydeder");

        //////////CIKAN MESAJ 5 sn sonra kayboldugu icin locate edemiyorum


        extentTest.info("Admin actigi web sitesini kapatir");


    }

    @Test
    public void US_019_TC08() {
        AdminDashboard adminDashboard = new AdminDashboard();
        Faker faker = new Faker();

        extentTest = extentReports.createTest("Admin tarafindan yeni bir kullanici hesabi acilabilmesi",
                "Admin, users menusune yeni bir kullanici ekleyebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.addUser.click();
        extentTest.info("Yeni kullanici eklemek icin Add User ikonuna tiklar");

        adminDashboard.editMenuFirstName.sendKeys(faker.name().firstName());
        extentTest.info("Gelen ekrandan isim bilgisini girer");

        adminDashboard.editMenuLastName.sendKeys(faker.name().lastName());
        extentTest.info("Soyisim bilgisini girer");

        adminDashboard.editMenuEmail.sendKeys(faker.internet().emailAddress());
        extentTest.info("E-mail adresi bilgisini girer");

        adminDashboard.editMenuBayrak.click();
        if (adminDashboard.editMenuUnitedStatesFlag.getText().equals("United States")) {
            adminDashboard.editMenuAndorraFlag.click();
        } else {
            adminDashboard.editMenuUnitedStatesFlag.click();
        }
        extentTest.info("Ulke telefon kodu bilgisini girer");

        adminDashboard.editMenuPhone.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Telefon numarasini girer");

        adminDashboard.addUserPassword.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Sifresini girer");

        adminDashboard.addUserConfirmPassword.sendKeys(ConfigReader.getProperty("addUser_password"));
        extentTest.info("Girdigi sifreyi dogrulamak icin tekrar sifresini girer");

        if (adminDashboard.editMenuPlan.getText().equals("Select Plan")) {
            adminDashboard.editMenuPlan.click();
            adminDashboard.editMenuPlanSilverSecenegi.click();
        } else {
            adminDashboard.editMenuPlan.click();
            adminDashboard.editMenuPlanStandartSecenegi.click();
        }
        extentTest.info("Plan menusunden bir secenegi secer");

        adminDashboard.addUserSave.click();
        extentTest.info("Girdigi bilgileri Save butonuna basarak kaydeder");
        ReusableMethods.wait(1);

        Assert.assertTrue(ReusableMethods.waitForVisibility(adminDashboard.kullaniciEklendiUyarisi, 1).isDisplayed());
        extentTest.pass("Admin olusturmus oldugu yeni hesabin sisteme basariyla yüklendigi uyarisini görür");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

    @Test
    public void US_019_TC09() {
        AdminDashboard adminDashboard = new AdminDashboard();

        extentTest = extentReports.createTest("Admin tarafindan yeni bir kullanici hesabi acilabilmesi",
                "Admin, users menusune yeni bir kullanici ekleyebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin, https://qa.smartcardlink.com/ sitesine gider");


        adminDashboard.signInButton.click();
        extentTest.info("Gelen sayfada sign in butonuna tiklar");

        adminDashboard.logInEMail.sendKeys(ConfigReader.getProperty("admin16_username"));
        adminDashboard.logInPassword.sendKeys(ConfigReader.getProperty("admin_password"));
        adminDashboard.loginButton.click();
        extentTest.info("Admin email'i ve sifresi ile sisteme giris yapar.");

        adminDashboard.adminMenuUsers.click();
        extentTest.info("Kullanicilari görmek icin Users menusune tiklar");

        adminDashboard.kullaniciSilIkonu.click();
        extentTest.info("Kullanicilarin oldugu listeden, bir kullaniciyi silmek icin Delete simgesine tiklar");

        //Driver.getDriver().switchTo().frame(adminDashboard.kullaniciSilIframe);
        adminDashboard.kullaniciSilYesDeleteButonu.click();
        extentTest.info("Sil tusuna bastiktan sonra gelen uyariyi kabul ederek silme islemini onaylar");
        //HTML kodlarinda iframe yazmasina ragmen, iframe gecisi olmadan siliniyor.
        ReusableMethods.wait(2);

        Assert.assertTrue(ReusableMethods.waitForVisibility(adminDashboard.silmeIslemiBasariliUyarisi,1).isDisplayed()
        ,"Silem islemi basarili degil");
        extentTest.pass("Silme isleminin basarili bir sekilde gerceklestigi uyarisini gorur");
        extentTest.info("Admin actigi web sitesini kapatir");
    }

}