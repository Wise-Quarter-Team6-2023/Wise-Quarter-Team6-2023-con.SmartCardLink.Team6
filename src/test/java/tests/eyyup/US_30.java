package tests.eyyup;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_30 extends TestBaseRapor {

    @Test
    public void US_030_TC01() {
        extentTest = extentReports.createTest("Ulke butonu goruntuleme ve islevsellik testi", " ülke, eyalet, şehir sayılarını görüntüleyebildiğimi ve yeni ülke, eyalet,şehir ekleyebilmeli");
        HomePage homePage=new HomePage();
        AdminDashboard adminDashboard=new AdminDashboard();

        //  SmartCardLink sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();
        extentTest.info("Kullanici admin bilgileri ile https://qa.smartcardlink.com/ sitesine giris yapar");

        // Sign In butonuna tiklar
        homePage.signInButtonuED.click();

        // Giris yapmak icin acilan sayfada E-Mail bolumune admin icin verilen E-Mail girin
        homePage.signInEmailButtonuED.sendKeys(ConfigReader.getProperty("admin16Email"));

        // Giris yapmak icin acilan sayfada Password bolumune admin icin verilen Password girin
        homePage.signInPasswordButtonuED.sendKeys(ConfigReader.getProperty("admin16Password"));

        // Giris yapmak icin login buttonuna basin
        homePage.signInLoginButtonuED.click();

        //Sayfaya giris yapabildigini test eder
        Assert.assertTrue(adminDashboard.adminOlarakGirisYapildigindaDadhboardYazisiED.isDisplayed());
        extentTest.pass("Siteye giris yapabildigini test eder");

        //Sayfanin solunda menuden Countries a basar
        adminDashboard.countriesButtonuED.click();
        extentTest.info("Kullanici menuden Countries bolumune gider");

        // acilan pencerede; işlemlerde kullanılan ülke sayılarını görüntüleyebildiğini test eder
        System.out.println(adminDashboard.ulkeSayisiED.getText());
        Assert.assertTrue(adminDashboard.ulkeSayisiED.isDisplayed());
        extentTest.pass("Ulke sayılarını görüntüleyebildiğini test eder");


        // Eyalet sayilarini goruntulemek icin sayfadaki eyalet butonuna tiklar
        adminDashboard.eyaletButtonuED.click();
        extentTest.info("Kullanici eyalet sayilarini goruntulemek icin sayfadaki eyalet bolumune gider");

        //Acilan pencerenin Url ini alir
        String eyaletUrl = Driver.getDriver().getCurrentUrl();

        // Driver i alinan Url e yonlendirir
        Driver.getDriver().get(eyaletUrl);

        // acilan pencerede; işlemlerde kullanılan eyalet sayılarını görüntüleyebildiğini test eder
        System.out.println(adminDashboard.eyaletSayisiED.getText());
        Assert.assertTrue(adminDashboard.eyaletSayisiED.isDisplayed());
        extentTest.pass("Eyalet sayılarını görüntüleyebildiğini test eder");

        // Sehir sayilarini goruntulemek icin sayfadaki sehir butonuna tiklar
        adminDashboard.sehirButtonuED.click();
        extentTest.info("Kullanici Sehir sayilarini goruntulemek icin sayfadaki Sehir bolumune gider");


        //Acilan pencerenin Url ini alir
        String sehirUrl = Driver.getDriver().getCurrentUrl();

        // Driver i alinan Url e yonlendirir
        Driver.getDriver().get(sehirUrl);

        // acilan pencerede; işlemlerde kullanılan sehir sayılarını görüntüleyebildiğini test eder
        System.out.println(adminDashboard.sehirSayisiED.getText());
        Assert.assertTrue(adminDashboard.sehirSayisiED.isDisplayed());
        extentTest.pass("Sehir sayılarını görüntüleyebildiğini test eder");

       // yeni ülke eklemek icin menuden Countries a basar
        adminDashboard.countriesButtonuED.click();
        extentTest.info("Kullanici yeni ulke eklemek icin bilgileri doldurur");

        // yeni ülke  eklemek icin "New Country " buttonuna basar
        adminDashboard.yeniUlkeButtonuED.click();

        // Ulke kaydi yapmak icin ulke ismi bolumununu doldurur
        adminDashboard.ulkeIsimEklemeButtonuED.sendKeys(ConfigReader.getProperty("eklenecekUlke"));

        //ulke kodu bolumununu doldurur
        adminDashboard.ulkeKodEklemeButtonuED.sendKeys(ConfigReader.getProperty("eklenecekKisaKod"));

        // Telefon kodu bolumununu doldurur
        adminDashboard.ulkeTelKodEklemeButtonuED.sendKeys(ConfigReader.getProperty("EklenecekTelKodu"));

        // Save basarak yeni ulkeyi kaydeder
        adminDashboard.ulkeSaveButtonuED.click();
        ReusableMethods.wait(6);

        // yenı ulkenun kaydoldugunu test etmek icin ulke sorgu  buttonuna kaydedilen ulkeyi aratir
        adminDashboard.ulkeSorguButtonuED.click();
        adminDashboard.ulkeSorguButtonuED.sendKeys(ConfigReader.getProperty("eklenecekUlke"));

        // Ulke sorgu sonucunun "1" oldugunu dogrulayarak ulkenin kaydedildigini test eder
        String expectedULkeSorguSonucu = "1";
        String actualUlkeSorguSonucu = adminDashboard.ulkeKayitSorguSayisiED.getText();
        Assert.assertEquals(actualUlkeSorguSonucu, expectedULkeSorguSonucu,"Test failed cikarsa lutfen daha once calistirip ayni isimde 'Test Ulkesi Utopya' " +
                "kaydedilen ulkeyi silin ve tekrar calistirin");
        extentTest.pass("yeni Ulkenin kaydedilebildiğini test eder");
        ReusableMethods.wait(2);

        //  Eyalet eklemek icin "States" e basar
        extentTest.info("Kullanici yeni eyalet eklemek icin bilgileri doldurur");
        adminDashboard.eyaletButtonuED.click();

        // yeni eyalet  eklemek icin New State buttonuna basar
        adminDashboard.yeniEyaletButtonuED.click();

        // yeni eyalet ismini girer
        adminDashboard.eyaletIsimEklemeButtonuED.sendKeys(ConfigReader.getProperty("eklenecekEyalet"));

        // yeni eyaletin baglancagi ulkeyi secer
        adminDashboard.eyaletinBahlancagiUlkeButtonuED.click();
        adminDashboard.eyaletinBahlancagiUlkeAramaButtonuED.click();
        adminDashboard.eyaletinBahlancagiUlkeAramaButtonuED.sendKeys(ConfigReader.getProperty("eklenecekUlke") + Keys.ENTER);

        // yeni eyaleti kaydeder
        adminDashboard.eyaletKaydetmeButtonuED.sendKeys(Keys.ENTER);

        // yenı eyaletın kaydoldugunu test etmek icin eyalet sorgu  buttonuna kaydedilen eyaleti yazar
        adminDashboard.eyaletSorguButtonuED.click();
        adminDashboard.eyaletSorguButtonuED.sendKeys(ConfigReader.getProperty("eklenecekEyalet"));

        // Eyalet sorgu sonucunun 1 oldugunu dogrulayarak eyaletin kaydedildigini test eder
        String expectedSorguSonucu = "1";
        String actualSorguSonucu = adminDashboard.eyaletKayitSorguSAyisiED.getText();
        Assert.assertEquals(actualSorguSonucu, expectedSorguSonucu);
        extentTest.pass("yeni eyaletin kaydedilebildiğini test eder");
        ReusableMethods.wait(2);

        // Sehir eklemek icin "Cities" e basar
        extentTest.info("Kullanici yeni sehir eklemek icin bilgileri doldurur");
        adminDashboard.sehirButtonuED.click();
        ReusableMethods.wait(2);

        // yeni sehir  eklemek icin yeni New City e basar
        adminDashboard.yeniSehirButtonuED.click();

        // yeni sehir ismini girer
        adminDashboard.sehirIsimEklemeButtonuED.sendKeys(ConfigReader.getProperty("eklenecekSehir"));
        ReusableMethods.wait(2);

        // yeni sehrin baglancagi eyaleti secer
        adminDashboard.sehrinBaglanacagiEyaletButtonuED.click();
        adminDashboard.sehrinBaglanacagiEyaletAramaButtonuED.sendKeys(ConfigReader.getProperty("eklenecekEyalet") + Keys.ENTER);

        // yeni sehri kaydeder
        adminDashboard.sehirKaydetmeButtonuED.click();

        // yenı sehrin kaydoldugunu test etmek icin sehir sorgu  buttonuna kaydedilen sehri yazar
        adminDashboard.sehirSorguButtonuED.click();
        adminDashboard.sehirSorguButtonuED.sendKeys(ConfigReader.getProperty("eklenecekSehir"));

        // sehir sorgu sonucunun 1 oldugunu dogrulayarak sehrin kaydedildigini test eder
        expectedSorguSonucu = "1";
        actualSorguSonucu = adminDashboard.sehirKayitSorguSAyisiED.getText();
        Assert.assertEquals(actualSorguSonucu, expectedSorguSonucu);
        extentTest.pass("yeni sehrin kaydedilebildiğini test eder");

        //sayfayi kapatir
        Driver.getDriver().quit();




    }
}
