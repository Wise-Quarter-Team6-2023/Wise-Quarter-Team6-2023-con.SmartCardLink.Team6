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
import java.util.Set;

public class US_21 extends TestBaseRapor {

    @Test
    public void US_035_TC01() throws AWTException {
        extentTest = extentReports.createTest("Gorusler bolumu tasti", "görüşleri görüntüleyebildiğimi, yeni görüş ekleyebildiğimi ve görüşlerin içeriğini görüntüleyip,düzenleyip,silebildiğimi doğrulayabilmeli");
        HomePage homePage = new HomePage();
        AdminDashboard adminDashboard = new AdminDashboard();

        //  SmartCardLink sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();
        extentTest.info("Kullanici admin bilgileri ile https://qa.smartcardlink.com/ sitesine giris yapar");

        // Sign In butonuna tiklar
        ReusableMethods.wait(2);
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

        //Sayfanin solunda menuden VCards a basar
        adminDashboard.vcardsButtonuED.click();
        extentTest.info("Kullanici VCard sayfasinda kisilerin gorundugunu VCard a basar");

        //VCard sayfasinda kisilerin gorundugunu test eder
        Assert.assertTrue(adminDashboard.VCardKartlarED.isDisplayed());
        extentTest.pass("VCard sayfasinda kisilerin gorundugunu test eder");

        // kullanıcıların oluşturduğu kartları görüntüleyebildlğimi,kartların sayfalarına ulaşabildiğini
       //  VCard sayfasindaki kisinin gorunen url i ile  ilgili sayfaya gittigimizdeki url in ayni olmasini dogrulayarak test eder
        String expectedVCardUrl = adminDashboard.VCardSayfasindakiKisiUrlED.getText();
        extentTest.info("Kullanici kartları görüntüleyebildlğini ve sayfaya ulasabildigini dogrulamak icin VCard kisisine a basar");

        // Cardi goruntulemek icin kisi url ne tiklar
        adminDashboard.VCardSayfasindakiKisiUrlED.click();

        // Driveri yeni siteye WHD kullanrak goturur
        Set<String> handleSet = Driver.getDriver().getWindowHandles();

        String ikinciSayfaWHD;

        for (String each:handleSet
        ) {
            if (!each.equals(ilkSayfaWHD)) {
                Driver.getDriver().switchTo().window(each);
                ikinciSayfaWHD = each;
                System.out.println(ikinciSayfaWHD);
                String actualVCardUrl = Driver.getDriver().getCurrentUrl();
                Assert.assertEquals(actualVCardUrl, expectedVCardUrl);
                extentTest.pass("Kisinin goruldugunu ve sayfasina ulasildigini test eder");


            }
            }
        // Kartlarin istatistiginin goruntulenebilgigini test etmek icin  VCard sayfasina geri doner
        Driver.getDriver().switchTo().window(ilkSayfaWHD);
        extentTest.info("Kartlarin istatistiginin goruntulenebilgigini test etmek icin  VCard sayfasina geri doner");

        // Istatistik grafik isaretine tiklar
        adminDashboard.istatistikGrafikIsaretiED.click();

        // Acilan sayfada kartlarin istatistik grafinin goruntulenebilgigini test eder
        Assert.assertTrue(adminDashboard.istatistikGrafigiED.isDisplayed());
        extentTest.pass("Kartlarin istatistik grafinin goruntulenebilgigini test eder");

        // Sayfalari kapatir
          Driver.quitDriver();


















    }
}
