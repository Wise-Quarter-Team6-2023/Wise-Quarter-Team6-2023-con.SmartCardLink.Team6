package tests.m_emin;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_013 extends TestBaseRapor {
    @Test
    public void US_013_TC01(){
        extentTest = extentReports.createTest("Kullanici giris testi","Kullanici username ve sifre" +
        "ile siteye giris yapabilmeli");

        Driver.getDriver().get("https://qa.smartcardlink.com/");

        HomePage homePage=new HomePage();
        homePage.signInButton.click();

        UserDashboard userDashboard=new UserDashboard();
        userDashboard.email.sendKeys(ConfigReader.getProperty("user_username"));
        ReusableMethods.wait(3);





    }
}
