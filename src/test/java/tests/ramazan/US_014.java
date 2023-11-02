package tests.ramazan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_014 extends TestBaseRapor {

    //  Kayıtlı kullanıcı olarak giriş yaptıktan sonra şifre ve
    //  dil değişikliği yapabildiğimi ve kullanıcı çıkışı yapabildiğimi doğrulayabilmeliyim

    @Test
    public void test02() {

        HomePage homePage = new HomePage();
        UserDashboard userDashboard = new UserDashboard();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Sifre ve Dil degisikligi", "Kayıtlı kullanıcı olarak giriş yapabilmeli sonra şifre ve \n" +
                "dil değişikliği yapilabildigini ve kullanıcı çıkışı yapabildiğimi doğrulayabilinmelidir. ");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        ReusableMethods.wait(2);

        homePage.signInrk.click();
        extentTest.info("Kullanici Sing In buttonuna click yapar");

        userDashboard.createanAccountrk.click();
        extentTest.info("User  Create an Account  click ");
        ReusableMethods.wait(2);

        actions.click(userDashboard.firstNamerk)
                .sendKeys(ConfigReader.getProperty("FirstName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("LastName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("Email"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("Password"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("ConfirmPassword"))
                .perform();

        extentTest.info("Kullanici creat accont icin bilgileri girer");
        ReusableMethods.wait(2);

        userDashboard.checkboxrk.click();
        extentTest.info("kullanici singin agre click");

        userDashboard.submitrk.click();
        ReusableMethods.wait(2);

        actions.click(userDashboard.singInmailrk)
                .sendKeys(ConfigReader.getProperty("Email"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("Password"))
                .perform();
        extentTest.info("user Sing In");

        userDashboard.checkboxrk.click();
        extentTest.info("user remeber me click");

        userDashboard.submitrk.click();
        extentTest.info("User Login Click");

        userDashboard.logindropdownrk.click();
        extentTest.info("login dtpbdown clcik");

        userDashboard.changePasswordrk.click();
        extentTest.info("user click change passwort");
        ReusableMethods.wait(2);

        actions.click(userDashboard.currentPasswortrk)
                .sendKeys(ConfigReader.getProperty("Password"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("NewPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("NewPassword"))
                .perform();
        extentTest.info("user passwordChange input ");

        ReusableMethods.wait(2);
        extentTest.info("user input new passwort");

        userDashboard.passwordChangeBtnrk.click();
        extentTest.info("user click passwordChangeBtn");

        Assert.assertTrue(userDashboard.passwordChangeSuccesfullyrk.isDisplayed());
        extentTest.pass("passwordChangeSuccesfully aktif ");
        ReusableMethods.wait(2);
        userDashboard.logindropdownrk.click();
        extentTest.info("login dtpbdown click");

        userDashboard.changeLanguagerk.click();
        extentTest.info("Click changeLanguage ");
        ReusableMethods.wait(2);
        Select select = new Select(userDashboard.changeLanguageSelectrk);
        select.selectByVisibleText("German");
        extentTest.info("Click changeLanguageSelect");

        ReusableMethods.wait(2);
        userDashboard.languageChangeBtnrk.click();
        extentTest.info("Click languageChangeBtn");

        ReusableMethods.wait(2);

        userDashboard.logindropdownrk.click();
        extentTest.info("login dtpbdown click");
        ReusableMethods.wait(2);
        userDashboard.changeLanguagerk.click();
        extentTest.info("Click changeLanguage ");
        ReusableMethods.wait(2);
        String expected = "German";
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected);

        ReusableMethods.wait(2);

        Driver.closeDriver();

    }
}
