package tests.eyyup;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US_35 extends TestBaseRapor {
    @Test
    public void US_035_TC01() throws AWTException{
        extentTest = extentReports.createTest("Gorusler bolumu tasti", "görüşleri görüntüleyebildiğimi, yeni görüş ekleyebildiğimi ve görüşlerin içeriğini görüntüleyip,düzenleyip,silebildiğimi doğrulayabilmeli");
        HomePage homePage = new HomePage();
        AdminDashboard adminDashboard = new AdminDashboard();

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

        //Sayfanin solunda menuden Front CMS  a basar
        extentTest.info("Gorusler bolumune gider");
        adminDashboard.frontCMSButtonuED.click();

        ReusableMethods.wait(1);

        // Testimonal bolumune gitmek icin Testimonal a basar
        adminDashboard.testimonalsButtonuED.click();
        ReusableMethods.wait(1);

        // gorusleri goruntuleyebildigini test eder
        Assert.assertTrue(adminDashboard.goruslerBolumuED.isDisplayed());
        extentTest.pass("Gorusleri goruntuleyebildigini test eder");
        ReusableMethods.wait(1);

        // Yeni gorus eklemek icin Add Testimonials a tıklar
        adminDashboard.addTestimonialsButtonuED.click();
        adminDashboard.testimonialsIsimEklemeED.sendKeys(ConfigReader.getProperty("eklenecekGorusIsmi"));
        adminDashboard.testimonialsMesajEklemeED.sendKeys(ConfigReader.getProperty("eklenecekMesaj"));
        extentTest.info("Yeni gorus ekler");
        ReusableMethods.wait(2);

        //  kaydi tamamlamak icin resim degisikligini simgesine basar ve resmi degistirir
        adminDashboard.resimDegistirmeButtonuED.click();
        ReusableMethods.wait(2);
        StringSelection resim = new StringSelection("C:\\Users\\ludwi\\IdeaProjects\\Wise-Quarter-Team6-2023-con.SmartCardLink.Team6\\src\\test\\TestFoto\\1698740892521_Java.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resim, null);
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_V);

        ReusableMethods.wait(7);


        robot.keyRelease(KeyEvent.VK_V);

        ReusableMethods.wait(2);

        robot.keyRelease(KeyEvent.VK_CONTROL);


        ReusableMethods.wait(2);


        robot.keyPress(KeyEvent.VK_ENTER);

        ReusableMethods.wait(4);

        // save basarak gorusu tamamlar
        adminDashboard.gorusSaveButtonuED.click();

        ReusableMethods.wait(2);

        // Gorusun eklendigini test etmek icin gorus search butonuna tiklar
        adminDashboard.gorusSorguButtonuED.click();

        //Ekledigimiz gorusteki ismi sorgular
        adminDashboard.gorusSorguButtonuED.sendKeys(ConfigReader.getProperty("eklenecekGorusIsmi"));

        // Gorusun sorgu sonucunun 1 oldugunu dogrulayarak gorusun kaydedildigini test eder
        String gorusSorguUrl = "https://qa.smartcardlink.com/sadmin/frontTestimonials?filters[search]=";
        Driver.getDriver().get(gorusSorguUrl + ConfigReader.getProperty("eklenecekGorusIsmi"));
        String expectedGorusSorguSonucu = "1";
        String actualGorusSorguSonucu = adminDashboard.gorusSorguSonucuED.getText();
        Assert.assertEquals(actualGorusSorguSonucu, expectedGorusSorguSonucu,"Testin basarisiz olmasi durumunda ilk once lutfen resim dosya yolunu kontrol ediniz(satir:69)");
        extentTest.pass("Yeni gorusun eklendigini test eder");
        ReusableMethods.wait(1);

        // görüşun içeriğinin görüntülendigini test etmek icin goruse bakis simgesine basar
        extentTest.info("Gorusun içeriğinin görüntülemek icin goruse bakis simgesine basar");
        adminDashboard.gorusIcerigineBakisED.click();

        //Testimonial Details yazisinin gorundugunu dogrulayrak gorusun iceriginin gorundugunu test eder
        ReusableMethods.wait(3);
        Assert.assertTrue(adminDashboard.testimonalDetailsYazisiED.isDisplayed());
        extentTest.pass("Yeni gorusun iceriginin gorundugunu test eder");

        // Testimonial Details i kapatir
        adminDashboard.testimonalDetailsKapatmaED.click();

        // görüşun içeriğinin degistirilebildigini test etmek icin gorus degisiklik simgesine basar
        extentTest.info("Gorusun içeriğinin degistirmek icin gorus degisiklik simgesine basar");
        adminDashboard.gorusDegistirmeButtonuED.click();

        // icerik kismini degistirir
        ReusableMethods.wait(1);
        String eklenecekYeniMesaj = " Biraz daha calismaliyiz.";
        adminDashboard.gorusYeniIcerikEklemeButtonuED.sendKeys(eklenecekYeniMesaj);

        //  Degisikligi kaydetmek icin save tusuna basar

        ReusableMethods.wait(2);
        adminDashboard.yeniIcerikSaveButtonuED.click();

        // görüşun içeriğinin degistigini kontrol etmek icin gorus degisiklik simgesine  tekrar basar
        ReusableMethods.wait(1);
        adminDashboard.gorusIcerigineBakisED.click();

        // icerigin degistigini ekledigi degisikligin var oldugunu dogrulayarak test eder
        ReusableMethods.wait(3);
        String expectedGorusIcerikYazisi = eklenecekYeniMesaj;
        String actualGorusIcerikYazisi = adminDashboard.gotusIcerigiKotrolED.getText();
        ReusableMethods.wait(2);
        Assert.assertTrue(actualGorusIcerikYazisi.contains(expectedGorusIcerikYazisi));
        extentTest.pass("Yeni gorusun icerigin degistigini ekledigi degisikligin var oldugunu dogrulayarak test eder");
        adminDashboard.testimonalDetailsKapatmaED.click();

        // gorusun silinebildigini dogrulamak icin silme isaretine basar
        adminDashboard.gorusSilmeButtonuED.click();
        extentTest.info("Gorusun içeriğinin silmek icin gorus silme simgesine basar");


        //silmeyi onaylar
        ReusableMethods.wait(2);
        adminDashboard.silmeyiOnaylamaED.click();
        ReusableMethods.wait(2);

        // gorusun silindigini, gorusun sorgu sonucunun "0" oldugunu dogrulayarak gorusun silindigini test eder
        gorusSorguUrl = "https://qa.smartcardlink.com/sadmin/frontTestimonials?filters[search]=";
        Driver.getDriver().get(gorusSorguUrl + ConfigReader.getProperty("eklenecekGorusIsmi"));
        expectedGorusSorguSonucu = "0";
        actualGorusSorguSonucu = adminDashboard.gorusSorguSonucuED.getText();
        Assert.assertEquals(actualGorusSorguSonucu, expectedGorusSorguSonucu);
        extentTest.pass("Yeni gorusun silindigini gorusun sorgu sonucunun '0' oldugunu dogrulayarak gorusun silindigini test eder");
        ReusableMethods.wait(1);





    }
}
