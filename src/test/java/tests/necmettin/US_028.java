package tests.necmettin;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class US_028 {

    // Description : Admin bilgileri ile giriş yaptıktan sonra para çekme işlemleri bölümünde ödeme yapılan kullanıcıyı,
    // ödeme tutarını, ödeme tipini ve ödeme tarihini görüntüleyebildiğimi doğrulayabilmeliyim

    HomePage homePage = new HomePage();
    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void TC01(){

        // 1 - anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));

        ReusableMethods.wait(1);
        // 2 - Sign in butonuna bas
        homePage.signInButtonNK.click();

        // 3- email kutusuna gecerli email gir
        homePage.emailBoxNK.sendKeys(ConfigReader.getProperty("admin17Email"));

        // 4- password kutusuna gecerli password gir
        homePage.passwordBoxNK.sendKeys(ConfigReader.getProperty("adminPassword"));

        // 5 - login butonuna tikla
        homePage.loginButtonNK.click();

        // 6 - sol menudeki Withdraw Transsactions sayfasi linkine tikla
        adminDashboard.withdrawTranssactionsPageLinkNK.click();

        // 7 - ödeme yapılan kullanıcılarin, ödeme tutarınlarinin,
        // ödeme tiplerinin ve ödeme tarihlerinin görüntülendigini test et
        for (int i = 0; i <adminDashboard.allElementsOfWithdrawTransactionsTableNK.size() ; i++) {
            System.out.println(adminDashboard.allElementsOfWithdrawTransactionsTableNK.get(i).getText());
            assertTrue(adminDashboard.allElementsOfWithdrawTransactionsTableNK.get(i).isDisplayed());
        }

        // 8 - pencereyi kapat
        Driver.closeDriver();

    }
}
