package tests.mehmetK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Files;
import java.nio.file.Paths;

import static tests.mehmetK.US_008.clickWithJS;

public class US_011 {
    @Test
    public void test2() throws AWTException {
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.signInButtonuMK.click();
        userDashboard.kullaniciEmailMK.sendKeys(ConfigReader.getProperty("kullaniciEmail2"));
        userDashboard.kullaniciPasswordMK.sendKeys(ConfigReader.getProperty("kullaniciPassword2"));
        userDashboard.kullaniciLoginButonuMK.click();
        userDashboard.virtualBackButtonuMK.click();
        userDashboard.birinciKartButtonuMK.click();
        WebElement dropDownElementi = Driver.getDriver().findElement(By.xpath("//select[@id='e-vcard-id']"));
        Select select = new Select(dropDownElementi);
        select.selectByValue("683");
        System.out.println(select.getFirstSelectedOption().getText());


        ReusableMethods.wait(2);
        userDashboard.fotoeklemeMK.click();

        StringSelection resim=new StringSelection("C:\\Users\\mkoru\\IdeaProjects\\TestNG\\pexels-matt-weissinger-14438397.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resim,null);
        ReusableMethods.wait(2);

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_V);
        ReusableMethods.wait(2);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        ReusableMethods.wait(2);
        robot.keyPress(KeyEvent.VK_ENTER);

        ReusableMethods.wait(2);

        userDashboard.firstNameArkaPlanMK.sendKeys(ConfigReader.getProperty("firstName"));
        userDashboard.lastNameArkaPlanMK.sendKeys(ConfigReader.getProperty("lastName"));
        userDashboard.emailArkaPlanMK.sendKeys(ConfigReader.getProperty("kullaniciEmail2"));
        userDashboard.occupationArkaPlanMK.sendKeys(ConfigReader.getProperty("occupation"));
        userDashboard.phoneNummerArkaPlanMK.sendKeys(ConfigReader.getProperty("phone"));
        userDashboard.locationArkaPlanMK.sendKeys(ConfigReader.getProperty("location"));
        userDashboard.websiteArkaPlanMK.sendKeys(ConfigReader.getProperty("urlAlias"));

        WebElement saveButton=userDashboard.saveArkaPlanMK;
        clickWithJS(Driver.getDriver(),saveButton);
        String dosyaYoluVirtualBackgrounds = "C:\\Users\\mkoru\\Downloads\\virtual-backgrounds.zip";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYoluVirtualBackgrounds)));

        Driver.closeDriver();

    }
}
