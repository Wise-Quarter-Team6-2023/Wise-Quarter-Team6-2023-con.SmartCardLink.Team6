package tests.Bilal;

import com.beust.ah.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.*;

import java.io.IOException;
import java.util.Set;

public class US_004 extends TestBaseRapor {


    // Bir ziyaretci olarak Home Page sayfasinin footer bölümündeki fonksiyonlarin
    // görünür ve aktif oldugunu görüntüleyebildigimi dogrulayabilmeliyim

    @Test
    public void footerBolumugoruntuleme() {
        extentTest = extentReports.createTest("footer görüntüleme", "Kullanici Home Page footer kismindakileri görebilmeli");

        HomePage homePage =new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        ReusableMethods.wait(1);

        Assert.assertTrue(homePage.footer.isDisplayed());
        extentTest.pass("Home Page footer kisminda'ki fomksiyonlar görüntülenir");

    }

    @Test
    public void footerFacebookSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer facebook active","ffooter'da bulunan facebook fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerFacebook.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da Facebook'a tiklar");

       String ilkwhd = Driver.getDriver().getWindowHandle();
       String ikiciwhd = "";
       Set<String> whdSeti = Driver.getDriver().getWindowHandles();
       for (String each : whdSeti
       ) {
           if (!each.equals(ilkwhd)){
               ikiciwhd = each;
           }
       }
       Driver.getDriver().switchTo().window(ikiciwhd);
       extentTest.info("Yeni TAB'a gecilir");
       homePage.facebookCookies.click();
       extentTest.info("Kullanici yeni tab'da acilan Facebook cookies'i kabul eder");
       ReusableMethods.wait(1);
       Assert.assertTrue(homePage.facebookLoginSayfasi.isDisplayed());
       extentTest.pass("Facebook giris sayfasini görüntülenir");
      // ReusableMethods.getScreenshot("facebook.com");
      // extentTest.info("Testin ekran görüntüsü alinir");

       extentTest.info("Test sayfalar kapatilir");





    }
    @Test
    public void footerXSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer X active","footer'da bulunan X fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerX.click();
        ReusableMethods.wait(1);

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        ReusableMethods.wait(1);


        String expected = ConfigReader.getProperty("x");
        String actual = ConfigReader.getProperty("pinterest");
        Assert.assertNotEquals(expected,actual);
        extentTest.fail("footer'da X'e tiklayinca istenen linke gidilmiyor");
      //  ReusableMethods.getScreenshot("pinterst.com");
      //  extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalari kapatilir");



    }
    @Test
    public void footerInstagramSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer instagram active","footer'da bulunan instagram fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerInstagram.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da Instagram'a tiklar");

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        homePage.instagramCookies.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.instagramLoginSayfa.isDisplayed());
        extentTest.pass("Yeni TAB'da Instagrm giris sayfasini görüntülenir");
      //  ReusableMethods.getScreenshot("instagram.com");
      //  extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalar kapatilir");


    }
    @Test
    public void footerLinkedinSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer Linkedin active","footer'da bulunan Linkedin fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerLinkedin.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da Linkedin'e tiklar");

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        Assert.assertTrue(homePage.linkedin.isDisplayed());
        extentTest.pass("Yeni TAB'da Linked'in giris sayfasini görüntülenir");
      //  ReusableMethods.getScreenshot("linked.com");
      //  extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalar kapatilir");

    }
    @Test
    public void footerPinterestSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer Pinterest active","footer'da bulunan Pinterest fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerPinterest.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da Pinterest'e tiklar");

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        Assert.assertTrue(homePage.pnterestHomePage.isDisplayed());
        extentTest.pass("Yeni TAB'da Pinterest'in giris sayfasini görüntülenir");
        ReusableMethods.wait(1);
      //  ReusableMethods.getScreenshot("pinterest.com");
      //  extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalar kapatilir");
    }
    @Test
    public void footerTermsConditions() throws IOException {
        extentTest = extentReports.createTest("footer termsConditions active","footer'da bulunan termsConditions fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerTermsConditions.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da termsConditions'a tiklar");

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        Assert.assertTrue(homePage.footerTermsConditions.isDisplayed());
        extentTest.pass("Yeni TAB'da termsConditions'in giris sayfasini görüntülenir");
        ReusableMethods.wait(1);
      // ReusableMethods.getScreenshot("TermsCondition.com");
      // extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalar kapatilir");
    }
    @Test
    public void privacyPolicy() throws IOException {
        extentTest = extentReports.createTest("footer privacyPolicy active","footer'da bulunan privacyPolicy fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footePprivacyPolicy.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da termsConditions'a tiklar");

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        Assert.assertTrue(homePage.privacyPolicy.isDisplayed());
        extentTest.pass("Yeni TAB'da termsConditions'in giris sayfasini görüntülenir");
        ReusableMethods.wait(1);
       //ReusableMethods.getScreenshot("privacyPolicy.com");
       //extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalar kapatilir");
    }
    @Test
    public void footerfaq() throws IOException {

        extentTest = extentReports.createTest("footer FAQ active","footer'da bulunan FAQ fonksiyonuna tiklayip istenen sayfaya gidebilmeli");

        HomePage homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footer);
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");

        homePage.footerFaq.click();
        ReusableMethods.wait(1);
        extentTest.info("Kullanici footer kismin'da FAQ'a tiklar");

        String ilkwhd = Driver.getDriver().getWindowHandle();
        String ikiciwhd = "";
        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkwhd)){
                ikiciwhd = each;
            }
        }
        Driver.getDriver().switchTo().window(ikiciwhd);
        extentTest.info("Yeni TAB'a gecilir");
        Assert.assertTrue(homePage.faq.isDisplayed());
        extentTest.pass("Yeni TAB'da termsConditions'in giris sayfasini görüntülenir");
        ReusableMethods.wait(1);
      // ReusableMethods.getScreenshot("faq.com");
      // extentTest.info("Testin ekran görüntüsü alinir");

        extentTest.info("Test sayfalar kapatilir");
    }
        }
