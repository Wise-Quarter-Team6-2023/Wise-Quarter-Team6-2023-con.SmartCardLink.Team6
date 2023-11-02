package tests.adem;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_022 {
    @Test
    public void signinTest() {
        Driver.getDriver().get(ConfigReader.getProperty("smardCardLinkUrl"));
        AdminDashboard adminDashboard = new AdminDashboard();
        Assert.assertTrue(adminDashboard.signInButtonAB.isDisplayed());
        adminDashboard.signInButtonAB.click();


        String expectedUrl = "https://qa.smartcardlink.com/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

        adminDashboard.signinBoxElementiAB.sendKeys(ConfigReader.getProperty("adminEmail"));
        ReusableMethods.wait(2);
        adminDashboard.passwordBoxElementAB.sendKeys(ConfigReader.getProperty("admin16Password"));
        adminDashboard.loginButtonuAB.click();

        Assert.assertTrue(adminDashboard.adminDropDownElementAB.isDisplayed());
        Assert.assertTrue(adminDashboard.vcardTemplatesLinkElementAB.isDisplayed());
        ReusableMethods.wait(1);
        adminDashboard.vcardTemplatesLinkElementAB.click();

        String expectedText = "Vcard Templates";
        String actualText = adminDashboard.vcardElementAB.getText();
        Assert.assertEquals(actualText, expectedText);

        // ReusableMethods.tumSayfaFotografCek("Vcard Templates (Bug)");
        ReusableMethods.wait(2);

        Driver.closeDriver();

    }
}
