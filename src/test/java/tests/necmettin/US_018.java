package tests.necmettin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

import static org.testng.Assert.*;

public class US_018 {

    // Description : Admin bilgileri ile sisteme giriş yapabildiğimi,
    // toplam aktif ve aktif olmayan kullanıcı sayısını, toplam aktif ve
    // aktif olmayan vcard sayısını, Kullanıcı plan oranları tablosu ve gelir grafiğini,
    // günlük, aylık, haftalık, aylık kullanıcı kayıtlarını görüntüleyebildiğimi doğrulayabilmeliyim

    HomePage homePage = new HomePage();
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void TC_01(){

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

        // 6 - toplam aktif kullanici sayisinin goruntulendigini dogrula
        assertTrue(adminDashboard.totalActiveUsersNumberNK.isDisplayed());
        assertTrue(adminDashboard.totalActiveUsersTextNK.isDisplayed());

        System.out.println(adminDashboard.totalActiveUsersNumberNK.getText()+" "+adminDashboard.totalActiveUsersTextNK.getText());

        // 7 - toplam aktif VCard sayisinin goruntulendigini dogrula
        assertTrue(adminDashboard.totalActiveVCardsNumberNK.isDisplayed());
        assertTrue(adminDashboard.totalActiveVCardsTextNK.isDisplayed());

        System.out.println(adminDashboard.totalActiveVCardsNumberNK.getText()+" "+adminDashboard.totalActiveVCardsTextNK.getText());

        // 8 - toplam deaktif kullanici sayisinin goruntulendigini dogrula
        assertTrue(adminDashboard.totalDectiveUsersNumberNK.isDisplayed());
        assertTrue(adminDashboard.totalDectiveUsersTextNK.isDisplayed());

        System.out.println(adminDashboard.totalDectiveUsersNumberNK.getText()+" "+adminDashboard.totalDectiveUsersTextNK.getText());

        // 9 - toplam deaktif Vcard sayisinin goruntulendigini dogrula
        assertTrue(adminDashboard.totalDeactiveVCardsNumberNK.isDisplayed());
        assertTrue(adminDashboard.totalDeactiveVCardsTextNK.isDisplayed());

        System.out.println(adminDashboard.totalDeactiveVCardsNumberNK.getText()+" "+adminDashboard.totalDeactiveVCardsTextNK.getText());

        // 10 - Kullanıcı plan oranları tablosunun goruntulendigini dogrula
        assertTrue(adminDashboard.plansByUsersChartNK.isDisplayed());

        // 11 - gelir grafiğinin goruntulendigini dogrula
        assertTrue(adminDashboard.incomeChartNK.isDisplayed());



        // 12 - gunluk kullanıcı kayıtlarının görüntülenebildigini dogrula
        adminDashboard.dayButtonNK.click();
        JSUtilities.scrollToBottom(Driver.getDriver());

        System.out.println("========== gunluk kullnaici kayitlari tablo elemanlari ==========");

        for (int i = 0; i <adminDashboard.allElementsOfTableNK.size() ; i++) {
            System.out.println(adminDashboard.allElementsOfTableNK.get(i).getText());
            assertTrue(adminDashboard.allElementsOfTableNK.get(i).isDisplayed());
        }

        // 13 - haftalik kullanıcı kayıtlarının görüntülenebildigini dogrula
        adminDashboard.weekButtonNK.click();
        JSUtilities.scrollToBottom(Driver.getDriver());

        System.out.println("========== haftalik kullnaici kayitlari tablo elemanlari ==========");

        for (int i = 0; i <adminDashboard.allElementsOfTableNK.size() ; i++) {
            System.out.println(adminDashboard.allElementsOfTableNK.get(i).getText());
            assertTrue(adminDashboard.allElementsOfTableNK.get(i).isDisplayed());
        }

        // 14 - aylik kullanıcı kayıtlarının görüntülenebildigini dogrula
        adminDashboard.monthButtonNK.click();
        JSUtilities.scrollToBottom(Driver.getDriver());

        System.out.println("========== aylik kullnaici kayitlari tablo elemanlari ==========");

        for (int i = 0; i <adminDashboard.allElementsOfTableNK.size() ; i++) {
            System.out.println(adminDashboard.allElementsOfTableNK.get(i).getText());
            assertTrue(adminDashboard.allElementsOfTableNK.get(i).isDisplayed());
        }


        // 15 - pencereyi kapat
        Driver.closeDriver();

    }

}
