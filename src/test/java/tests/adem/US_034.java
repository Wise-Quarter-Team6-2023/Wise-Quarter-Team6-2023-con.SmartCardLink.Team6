package tests.adem;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_034 {
    @Test
    public void frontCmsTest() {
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
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboard.frontCmsElementAB.isDisplayed());

        adminDashboard.frontCmsElementAB.click();
        Assert.assertTrue(adminDashboard.frontCmsTextElementAB.isDisplayed());
        ReusableMethods.wait(2);

        adminDashboard.subscribersHeaderElemntiAB.click();
        ReusableMethods.wait(2);
        adminDashboard.showingresultsSubscribersElementAB.isDisplayed();

        String resultSayisiMetni = adminDashboard.showingresultsSubscribersElementAB.getText();
        System.out.println(resultSayisiMetni);
        String[] parts = resultSayisiMetni.split(" ");
        String numberText = parts[5];
        int numberilk = Integer.parseInt(numberText);
        System.out.println("Delete islemi öncesi kullanici sayisi  : " + numberilk);
        ReusableMethods.wait(2);

        Assert.assertTrue(numberilk > 0);
        // ReusableMethods.getScreenshot("frontCms");

        ReusableMethods.wait(1);
        Driver.closeDriver();

    }
}
