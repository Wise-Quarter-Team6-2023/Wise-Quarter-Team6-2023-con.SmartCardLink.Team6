package tests.muhammet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_023 {

    AdminDashboard adminDashboard;

    @Test
    public void US23_TC01(){
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));

        adminDashboard = new AdminDashboard();

        ReusableMethods.wait(1);

        // SignIn butonuna tiklar
        adminDashboard.signInButonuRS.click();

        // Email kutusuna admin Email girer
        adminDashboard.emailKutusuRS.sendKeys(ConfigReader.getProperty("adminUsername"));

        // Password kutusuna admin Password girer
        adminDashboard.passwordKutusuRS.sendKeys(ConfigReader.getProperty("adminPassword"));

        // Login butonuna tıklar
        adminDashboard.loginButonuRS.click();

        ReusableMethods.wait(2);

        // Payments butonuna tiklar
        adminDashboard.paymentsButonuRS.click();
        ReusableMethods.wait(1);

        // Sayfanin altindaki next butonu, tiklanilmayincaya kadar tiklar ve manuel odeme yapanlarin listesi görüldügü dogrulanir
        boolean nextButton= true;
        do {
            List<WebElement> manuelPayment = Driver.getDriver().findElements(By.xpath("//tr"));
            for (int i = 1; i < manuelPayment.size() ; i++) {
                Assert.assertTrue(manuelPayment.get(i).isDisplayed());
            }

            try {
                ReusableMethods.clickWithJS("arguments[0].scrollIntoView(true);", adminDashboard.nextButonuRS);
            } catch (Exception e) {

                nextButton = false;
            }
            ReusableMethods.wait(1);

        }while (nextButton==true);

        // Sayfayi kapatir
        Driver.closeDriver();


    }
    @Test
    public void US23_TC02(){
        // Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));

        adminDashboard = new AdminDashboard();
        ReusableMethods.wait(1);

        // SignIn butonuna tiklar
        adminDashboard.signInButonuRS.click();

        // Email kutusuna admin Email girer
        adminDashboard.emailKutusuRS.sendKeys("admin18@smartcardlink.com");

        // Password kutusuna admin Password girer
        adminDashboard.passwordKutusuRS.sendKeys("123123123");

        // Login butonuna tıklar
        adminDashboard.loginButonuRS.click();

        ReusableMethods.wait(2);

        // Payments butonuna tiklar
        adminDashboard.paymentsButonuRS.click();
        ReusableMethods.wait(1);

        // Kac kisinin manuel odeme yaptigi yazdirilir
        System.out.println(adminDashboard.sonucYaziElementiRS.getText());

        // Yapilan manuel odeme sayisinin goruntulendigi dogrulanir
        Assert.assertTrue(adminDashboard.sonucYaziElementiRS.isDisplayed());

        // Sayfayi kapatir
        Driver.closeDriver();

    }


}
