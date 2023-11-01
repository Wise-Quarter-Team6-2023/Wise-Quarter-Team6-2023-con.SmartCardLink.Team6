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

public class US_024 {

    AdminDashboard adminDashboard;

    @Test
    public void US024_TC01() {

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

        ReusableMethods.wait(1);

        // Subscribed User Plans butonuna tiklar
        adminDashboard.subscribedUserPlansButonuRS.click();

        ReusableMethods.wait(1);

        // Sayfanin altindaki next butonu, tiklanilmayincaya kadar tiklar ve
        // kayıtlı kullanıcıların kullanıcı isimleri, plan isimleri, üyelik başlangıç ve bitiş tarihi, plan ayrıntıları goruntulendigi dogrulanir
        boolean nextButton = true;
        do {
            List<WebElement> subscribedUserPlansList = Driver.getDriver().findElements(By.xpath("//tr"));
            for (int i = 1; i < subscribedUserPlansList.size(); i++) {
                Assert.assertTrue(subscribedUserPlansList.get(i).isDisplayed());
            }

            try {
                ReusableMethods.clickWithJS("arguments[0].scrollIntoView(true);", adminDashboard.nextButonuRS);
            } catch (Exception e) {

                nextButton = false;
            }
            ReusableMethods.wait(1);

        } while (nextButton == true);

        // Sayfayi kapatir
        Driver.closeDriver();

    }

}
