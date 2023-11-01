package tests.ramazan;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.awt.*;

public class US_003 extends TestBaseRapor {


    @Test
    public void TC_01() {

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("SmartCardlink Testi", " Home page sayfasında Get Started  " +
                " fonksiyonun görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        ReusableMethods.bekle(2);

        Assert.assertTrue(homePage.getStartedbuttonu.isDisplayed());
        extentTest.pass("Home page sayfasindaki Get Started buttonu göründügünü test eder. ");

        ReusableMethods.bekle(2);
        homePage.getStartedbuttonu.click();
        extentTest.info("Kulllanici Get Started buttonu tiklar");

        Assert.assertTrue(homePage.smartCardLink.isDisplayed());
        extentTest.pass("Kullanici SmartCardLinkinin aktif oldugunu test eder.");
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        Driver.closeDriver();
    }

    @Test
    public void TC_02() {
        HomePage homePage = new HomePage();


        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında 'Choose a plan that's right for you' " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(homePage.solButtonrk.isDisplayed());
        extentTest.pass("Sol Click Button görüldügü test edilir");


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.bekle(2);
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.solButtonrk);
        ReusableMethods.bekle(2);
        jse.executeScript("arguments[0].click();", homePage.solButtonrk);
        ReusableMethods.bekle(2);
        extentTest.info("sol button tiklanir");
        ReusableMethods.bekle(5);

        Assert.assertTrue(homePage.sagButtonrk.isDisplayed());
        extentTest.pass("sag Button görüldügü test edilir");
        homePage.sagButtonrk.click();
        extentTest.info("sag button tiklanir");
        ReusableMethods.bekle(3);

        Assert.assertTrue(homePage.silverChooseplanrk.isEnabled());
        extentTest.pass("silver choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.gulsahChooseplanrk.isEnabled());
        extentTest.pass("gulsah choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.VipChooseplanrk.isEnabled());
        extentTest.pass("vip choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.unlimitedChooseplanrk.isEnabled());
        extentTest.pass("unlimited choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.GoldChooseplanrk.isEnabled());
        extentTest.pass("gold choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.standardChooseplanrk.isEnabled());
        extentTest.pass("standard choose plan erisilebilir oldugu test edilir ");
        ReusableMethods.bekle(5);

      while (!homePage.standardChooseplanrk.isDisplayed()){
          homePage.solButtonrk.click();
          if (homePage.standardChooseplanrk.isDisplayed()) {
              Assert.assertTrue(homePage.standardChooseplanrk.isDisplayed());
              ReusableMethods.bekle(5);
          }
      }
      extentTest.info("Standard Choose Plan  secilir.");
        ReusableMethods.bekle(3);
        homePage.standardChooseplanrk.click();
        extentTest.info("Standard Choose Plan click yapilir");

        Assert.assertTrue(homePage.smartCardLinkrk.isDisplayed());
        extentTest.pass("tandard Choose Plan tiklandiginda SmartCardLink sayfasina gidildigi dogrulanir.");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Home Page geri dönülür.");

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

    @Test
    public void TC_03() {

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("SmartCardlink testi", " Home page sayfasında 'Contact Us' " +
                "bölümündeki fonksiyonun görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();

        homePage.bodyNamerk.sendKeys("Ramazan");
        homePage.enterEmailrk.sendKeys("ramokacmaz6@gmail.com");
        homePage.subjectrk.sendKeys("Shop");
        homePage.sendMessagerk.sendKeys("Shop end...");

        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        homePage.sendMessagerk.click();
        ReusableMethods.bekle(3);
        extentTest.info("Send Message fonksiyonuna mesajlar gonderilip tiklanir.");
        Assert.assertTrue(homePage.messageSendsuccessrk.isDisplayed());
        extentTest.info("send message buttonun aktif oldugu test edilir.");
        Assert.assertTrue(homePage.sendMessagerk.isDisplayed());
        extentTest.pass("send message button görülebilir oldugu test edilir");
        ReusableMethods.bekle(3);

        Driver.closeDriver();
    }

    @Test
    public void TC_04() {

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında 'Subscribe here' " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();

        Faker faker = new Faker();

        homePage.entermailrk.sendKeys(faker.internet().emailAddress());
        extentTest.info("Kullanici email girer");
        ReusableMethods.bekle(3);
        homePage.subsriciberk.click();
        extentTest.info("Kullanici Subscribe button click");

        Assert.assertTrue(homePage.Successfullyrk.isDisplayed());
        extentTest.pass("Subscribe button aktif");


        ReusableMethods.bekle(3);
        Driver.closeDriver();


    }

    @Test
    public void TC_05() {
        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında mail ve tel  " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(3);

        Assert.assertTrue(homePage.bodyMailrk.isDisplayed());
        extentTest.info("mail görülebilir oldugu test edilir");

        Assert.assertTrue(homePage.bodyTelrk.isDisplayed());
        extentTest.pass("Tel numarasinin görülebilir oldugu test edilir");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.bodyTelrk);
        jse.executeScript("arguments[0].click();", homePage.bodyTelrk);
        extentTest.info("Tel numarasina click yapilir.");


        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

}
