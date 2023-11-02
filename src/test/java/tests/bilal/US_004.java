package tests.bilal;
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
import java.util.List;
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
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        ReusableMethods.wait(1);
        extentTest.info("ana sayda'da bulunan footer kismina gelinir");
        List<WebElement> footerElemanlari= Driver.getDriver().findElements(By.xpath("//*[@target='_blank']"));
        for (WebElement each : footerElemanlari
        ) {
            Assert.assertTrue(each.isDisplayed());
        }
        extentTest.pass("Home Page footer kisminda'ki fonksiyonlar görüntülendigi test edilir");
    }
    @Test
    public void footerFacebookSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer facebook active","ffooter'da bulunan facebook fonksiyonuna tiklayip istenen sayfaya gidebilmeli");
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerFacebookbd.click();
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
        homePage.facebookCookiesbd.click();
        extentTest.info("Kullanici yeni tab'da acilan Facebook cookies'i kabul eder");
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.facebookLoginSayfasibd.isDisplayed());
        extentTest.pass("Facebook giris sayfasini görüntülenir");
        // ReusableMethods.getScreenshot("facebook.com");
        // extentTest.info("Testin ekran görüntüsü alinir");
        extentTest.info("Test sayfalar kapatilir");
    }
    @Test
    public void footerXSectionActive(){
        extentTest = extentReports.createTest("footer X active","footer'da bulunan X fonksiyonuna tiklayip istenen sayfaya gidebilmeli");
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerXbd.click();
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
        String expectedUrl = "https://twitter.com/";
        String actuealUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(1);
        Assert.assertNotEquals(actuealUrl,expectedUrl,"istenilen tab'a gidilmiyor");
        extentTest.info("Test sayfalar kapatilir");
    }
    @Test
    public void footerInstagramSectionActive() throws IOException {
        extentTest = extentReports.createTest("footer instagram active","footer'da bulunan instagram fonksiyonuna tiklayip istenen sayfaya gidebilmeli");
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici smartKart sayfasina gider");
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerInstagrambd.click();
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
        Driver.getDriver().switchTo().window(ikiciwhd);extentTest.info("Yeni TAB'a gecilir");
        extentTest.info("Yeni TAB'a gecilir");
        homePage.instagramCookiesbd.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.instagramLoginSayfabd.isDisplayed());
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
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerLinkedinbd.click();
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
        Assert.assertTrue(homePage.linkedinbd.isDisplayed());
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
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerPinterestbd.click();
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
        Assert.assertTrue(homePage.pnterestHomePagebd.isDisplayed());
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
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerTermsConditionsbd.click();
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
        Assert.assertTrue(homePage.footerTermsConditionsbd.isDisplayed());
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
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footePprivacyPolicybd.click();
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
        Assert.assertTrue(homePage.privacyPolicybd.isDisplayed());
        extentTest.pass("Yeni TAB'da privacyPolicy'in giris sayfasini görüntülenir");
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
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        extentTest.info("Kullanici home page' de footer kismina gelir");
        homePage.footerFaqbd.click();
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
        Assert.assertTrue(homePage.faqbd.isDisplayed());
        extentTest.pass("Yeni TAB'da termsConditions'in giris sayfasini görüntülenir");
        ReusableMethods.wait(1);
        // ReusableMethods.getScreenshot("faq.com");
        // extentTest.info("Testin ekran görüntüsü alinir");
        extentTest.info("Test sayfalar kapatilir");
    }
}