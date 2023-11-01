package tests.mehmetK;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US_008 {
    public static void clickWithJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    @Test
    public void us_008(){
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.signInButtonuMK.click();
        userDashboard.kullaniciEmailMK.sendKeys(ConfigReader.getProperty("kullaniciEmail2"));
        userDashboard.kullaniciPasswordMK.sendKeys(ConfigReader.getProperty("kullaniciPassword2"));
        userDashboard.kullaniciLoginButonuMK.click();
        userDashboard.vcardButonuMK.click();
        ReusableMethods.wait(2);
        userDashboard.newVCardButonuMK.click();
        ReusableMethods.wait(2);
        userDashboard.urlAliasMK.click();
        userDashboard.vcardNameMK.sendKeys(ConfigReader.getProperty("vcardName"));
        ReusableMethods.wait(2);

        WebElement saveButton=userDashboard.saveButtonMK;
        clickWithJS(Driver.getDriver(),saveButton);

        userDashboard.backButtonMK.click();
        userDashboard.qaKodeAktifButtonMK.click();
        ReusableMethods.wait(2);
        String dosyaYoluQrCode = "C:\\Users\\mkoru\\Downloads\\qr_code.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYoluQrCode)));

        userDashboard.dowloadVCardButtonMK.click();
        ReusableMethods.wait(2);
        String dosyaYoluDownloadsVcard = "C:\\Users\\mkoru\\Downloads\\unknown.vcf";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYoluDownloadsVcard)));

        userDashboard.enquiriesButtonMK.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userDashboard.enquiriesSayfaGorunurluguMK.isDisplayed());

        userDashboard.vcardButonuMK.click();
        userDashboard.editButtonMK.click();
        //WebElement editButton=userDashboard.editButton;
        //clickWithJS(Driver.getDriver(),editButton);
        ReusableMethods.wait(2);
        Assert.assertTrue(userDashboard.editSayfaGorunurluguMK.isDisplayed());

        userDashboard.vcardButonuMK.click();
        String expectedVcardSayisi= userDashboard.vcardSayisiMK.getText();
        userDashboard.deleteButtonMK.click();
        ReusableMethods.wait(2);
        String actualVcardSayisi= userDashboard.vcardSayisiMK.getText();
        ReusableMethods.wait(2);
        Assert.assertFalse(equals(actualVcardSayisi),expectedVcardSayisi);

        Driver.closeDriver();



    }
}
