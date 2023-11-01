package tests.koray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_027 {

    // Admin bilgileri ile giriş yaptıktan sonra ortaklık işlemleri bölümünü, ortaklık kullanıcılarını,
    // ortaklık tutarlarını, onay durumunu, ortaklık tarihini, ve ortaklık bilgilerini görüntüleyebildiğimi doğrulayabilmeliyim.

    HomePage homePage = new HomePage();
    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void TC_01() {

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

        // 6 - sol menudeki Affiliation Transsactions sayfasi linkine tikla
        adminDashboard.affiliationTransactionsPageLinkNK.click();

        // 7 - Affiliation Transactions sayfasinin acildigini test et
        String expectedUrl = "affiliation-transaction";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

        // 8 - ortaklık kullanıcılarının goruntulendigini test et
        // //table//tr[i]/td[1]
        ReusableMethods.wait(1);
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(1);

        SoftAssert softAssert = new SoftAssert();

        int resultNumber = Integer.parseInt(adminDashboard.resultNumberNK.getText());

        if (resultNumber > 10) {
            Select select = new Select(adminDashboard.numberOfUsersDisplayedNK);
            select.selectByIndex(2);
        }

        for (int i = 1; i <= resultNumber; i++) {
            String dinamikXpath = "//table//tr[" + i + "]/td[1]";
            WebElement webElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            //System.out.println(i + ". " + webElement.getText());
            softAssert.assertTrue(webElement.isDisplayed());
        }


        // 9 - ortaklık tutarlarının goruntulendigini test et
        for (int i = 1; i <= resultNumber; i++) {
            String dinamikXpath = "//table//tr[" + i + "]/td[2]";
            WebElement webElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            //System.out.println(i + ". " + webElement.getText());
            Assert.assertTrue(webElement.isDisplayed(),i+". kullanicinin ortaklik tutari goruntulunemedi");
        }

        // 10 - ortaklarin onay durumununun goruntulendigini test et
        for (int i = 1; i <= resultNumber; i++) {
            String dinamikXpath = "//table//tr[" + i + "]/td[3]";
            WebElement webElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            //System.out.println(i + ". " + webElement.getText());
            Assert.assertTrue(webElement.isDisplayed(),i+". kullanicinin onay durumu goruntulunemedi");
        }

        // 11 - ortaklık tarihinin goruntulendigini test et
        for (int i = 1; i <= resultNumber; i++) {
            String dinamikXpath = "//table//tr[" + i + "]/td[4]";
            WebElement webElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            //System.out.println(i + ". " + webElement.getText());
            Assert.assertTrue(webElement.isDisplayed(),i+". kullanicinin ortaklık tarihi goruntulunemedi");
        }


/*
        // 12 - ortaklık bilgilerinin goruntulendigini test et
        for (int i = 1; i <resultNumber ; i++) {
            String dinamikXpath = "//table//tr[" + i + "]/td[5]//span";
            WebElement webElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            webElement.click();
            Assert.assertTrue(adminDashboard.nameInAffiliationWithdrawDetails.isDisplayed());
            Assert.assertTrue(adminDashboard.amountInAffiliationWithdrawDetails.isDisplayed());
            Assert.assertTrue(adminDashboard.statusInAffiliationWithdrawDetails.isDisplayed());
            Assert.assertTrue(adminDashboard.dateInAffiliationWithdrawDetails.isDisplayed());
            adminDashboard.closeButtonOfAffiliationWithdrawDetails.click();

            System.out.println(i);
        }

 */

        // 13 - pencereyi kapat
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }
}
