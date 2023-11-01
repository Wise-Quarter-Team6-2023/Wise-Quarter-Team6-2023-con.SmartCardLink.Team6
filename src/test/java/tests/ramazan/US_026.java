package tests.ramazan;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_026 extends TestBaseRapor {
  /*  Admin bilgileri ile giriş yaptıktan sonra ortaklık kullanıcıları bölümünden ortaklığın kim tarafından yapıldığı,
  kayıt edilen kullanıcıyı, ortaklık tutarını ve ortaklık tarihini görüntüleyebildiğimi
  ortaklık onay durumunu onaylayı/reddedebildiğimi doğrulayabilmeliyim
   */

    @Test
    public void TC_01(){

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());
        UserDashboard userDashboard = new UserDashboard();
        AdminDashboard adminDashboard = new AdminDashboard();

        extentTest = extentReports.createTest("Ortaklik Testi", "Admin bilgileri ile giriş " +
                "  yaptıktan sonra ortaklık kullanıcıları bölümünden ortaklığın kim tarafından yapıldığı,\n" +
                "  kayıt edilen kullanıcıyı, ortaklık tutarını ve ortaklık tarihini görüntüleyebildigini\n" +
                "  ortaklık onay durumunu onaylayı/reddedebildiğini doğrulayabilmelidir. ");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        ReusableMethods.bekle(3);

        homePage.signInrk.click();
        extentTest.info("Kullanici Sing In buttonuna click yapar");
        ReusableMethods.bekle(3);

        actions.click(userDashboard.singInmailrk)
                .sendKeys(ConfigReader.getProperty("adminusername"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("adminpassword"))
                .perform();
        extentTest.info("input admin mail, admin password ");

        userDashboard.submitrk.click();
        extentTest.info("Click Login");
        ReusableMethods.bekle(10);

        adminDashboard.affilitedUserrk.click();
        extentTest.info("Afilliate Users Click ");
        ReusableMethods.bekle(10);

        String expectedafilliated = ConfigReader.getProperty("affilitedrkortak");
        String actualafilliated = adminDashboard.affilitedrk.getText();
        Assert.assertTrue(actualafilliated.contains(expectedafilliated));
        extentTest.pass("Ortaklik 'Kacmaz Ramazan' tarafindan yapildigi test edilir.");
        ReusableMethods.bekle(5);

        String expectedUser = ConfigReader.getProperty("affilitedUser");
        String actaulUser = adminDashboard.affilitedUser2rk.getText();
        Assert.assertTrue(actaulUser.contains(expectedUser));
        extentTest.pass("Kayit edilen User 'eyyup Yilmaz' oldugu test edilir ");
        ReusableMethods.bekle(3);

        String expectedamount = ConfigReader.getProperty("affilitedamount");
        String actualamount = adminDashboard.amountrk.getText();
        Assert.assertTrue(actualamount.contains(expectedamount));
        extentTest.pass("amount $10.00 oldugu test edilir");

        ReusableMethods.bekle(3);
        String expectedDate = ConfigReader.getProperty("date");
        String actualDate = adminDashboard.daterk.getText();
        Assert.assertTrue(actualDate.contains(expectedDate));
        extentTest.pass("kayit tarihinin '31st Oct, 2023' oldugu test edilir ");
        ReusableMethods.bekle(3);

        Driver.closeDriver();

    }
}
