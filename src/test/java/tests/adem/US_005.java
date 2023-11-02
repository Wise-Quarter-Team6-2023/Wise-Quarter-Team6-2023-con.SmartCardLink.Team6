package tests.adem;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_005 {
    @Test
    public void signinTest() {
        Driver.getDriver().get(ConfigReader.getProperty("smardCardLinkUrl"));
        AdminDashboard adminDashboard = new AdminDashboard();
        Assert.assertTrue(adminDashboard.signInButtonAB.isDisplayed());
        adminDashboard.signInButtonAB.click();

        Assert.assertTrue(adminDashboard.createAnAccountElementAB.isDisplayed());
        adminDashboard.createAnAccountElementAB.click();
        ReusableMethods.wait(1);
        String expectedUrl="https://qa.smartcardlink.com/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        Faker faker = new Faker();
        ReusableMethods.wait(1);
        adminDashboard.firstNameElementAB.sendKeys(new CharSequence[]{faker.name().firstName()});
        adminDashboard.lastNameElementAB.sendKeys(new CharSequence[]{faker.name().lastName()});
        String email = faker.internet().emailAddress();
        adminDashboard.emailElementAB.sendKeys(email);

        adminDashboard.passwordElementiAB.sendKeys(ConfigReader.getProperty("smardcardLinkPassword"));
        ReusableMethods.wait(1);
        adminDashboard.passwordConfirmationElementAB.sendKeys(ConfigReader.getProperty("smardcardLinkPassword"));
        if (!(adminDashboard.termPolicyCheckBoxElementAB.isSelected())) {
            adminDashboard.termPolicyCheckBoxElementAB.click();
        }
        ReusableMethods.wait(1);
        //String expectedAlertYazisi="You have registered successfully.";
        adminDashboard.submitButtonElementAB.click();
        // String actualAlertYazisi=Driver.getDriver().switchTo().alert().getText();
        //ReusableMethods.getScreenshot("You have registered successfully.");
        //Assert.assertTrue(actualAlertYazisi.contains(expectedAlertYazisi));
        if (!(adminDashboard.rememeberMeCheckBoxAB.isSelected())) {
            adminDashboard.rememeberMeCheckBoxAB.click();
        }

        adminDashboard.signinBoxElementiAB.sendKeys(email);
        ReusableMethods.wait(2);
        adminDashboard.passwordBoxElementAB.sendKeys(ConfigReader.getProperty("smardcardLinkPassword"));
        adminDashboard.loginButtonuAB.click();


        String expextedCreateanAccountUrl = "https://qa.smartcardlink.com/admin/dashboard";
        String actualCreateanAccountUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualCreateanAccountUrl,expextedCreateanAccountUrl );
        ReusableMethods.wait(2);

        Driver.closeDriver();


    }
}
