package tests.mehmetK;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US_031 {
    @Test
    public void test31(){
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.signInButtonuMK.click();
        adminDashboard.kullaniciEmailMK.sendKeys(ConfigReader.getProperty("adminIsim"));
        adminDashboard.kullaniciPasswordMK.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.kullaniciLoginButonuMK.click();
        adminDashboard.languagesMK.click();
        String actualDilSayi=adminDashboard.languagesSayiGoruntulemeMK.getText();
        Assert.assertTrue(adminDashboard.languagesSayiGoruntulemeMK.isDisplayed());

        Driver.closeDriver();
    }
}
