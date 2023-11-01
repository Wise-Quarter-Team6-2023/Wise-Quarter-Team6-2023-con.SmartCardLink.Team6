package tests.necmettin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.*;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class US_010 {

    // Description : Kayıtlı kullanıcı olarak giriş yapıp Vcard üzerinden gönderilen mesajların,
    // gönderen bilgilerinin ve soru içeriğinin görüntülenebildiğini ve sorunun silinebildiğini doğrulayabilmeliyim

    HomePage homePage = new HomePage();
    UserDashboard userDashboard = new UserDashboard();
    @Test
    public void TC_01(){
        // 1 - anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));

        ReusableMethods.wait(1);
        // 2 - Sign in butonuna bas
        homePage.signInButtonNK.click();

        // 3- email kutusuna gecerli email gir
        homePage.emailBoxNK.sendKeys(ConfigReader.getProperty("userEmail"));

        // 4- password kutusuna gecerli password gir
        homePage.passwordBoxNK.sendKeys(ConfigReader.getProperty("userPassword"));

        // 5 - login butonuna tikla
        homePage.loginButtonNK.click();

        // 6 - Sol menudeki VCards linkine tikla
        userDashboard.VCardsPageLinkNK.click();

        // 7 - olusturulan bir VCard'in preview url'ine tikla
        userDashboard.previewUrlOfVCardNK.click();

        // 8 - yeni acilan pencereye gec
        ReusableMethods.wait(1);
        ReusableMethods.switchToWindow("artstation | Smart Card Link");

        // 9 - Inquiries elementinin altindaki formu doldur
        JSUtilities.scrollToBottom(Driver.getDriver());

        String senderName = "John Doe";
        String senderEmail = "qwe@gmail.com";
        String senderPhone = "12085686048";
        String senderMessage = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                               "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                               "when an unknown printer took a galley of type and scrambled it to make a type specimen book.";

        // yukaridaki degiskenleri daha sonra karsilastirma yapmak icin kaydettim

        userDashboard.nameBoxInVCardPreviewNK.sendKeys(senderName);
        userDashboard.emailBoxInVCardPreviewNK.sendKeys(senderEmail);
        userDashboard.telBoxInVCardPreviewNK.sendKeys(senderPhone);
        userDashboard.messageBoxInVCardPreviewNK.sendKeys(senderMessage);
        JSUtilities.scrollToBottom(Driver.getDriver());
        ReusableMethods.wait(2);
        userDashboard.sendMessageButtonInVCardPreviewNK.click();

        // 10 - eski pencereye don
        ReusableMethods.wait(1);
        ReusableMethods.switchToWindow("VCards | Smart Card Link");

        // 11  - Sol menudeki Enquiries linkine tikla
        userDashboard.EnquiriesPageLinkNK.click();

        // 12 - gelen son enquirie'nin bilgilerini gonderilen bilgilerle karsilastir

        List<WebElement> tabloElementleri = Driver.getDriver().findElements(By.xpath("(//table[@class='table table-striped'])//tr[1]/td"));
        for (int i = 0; i < tabloElementleri.size() ; i++) {
            System.out.println("==============" + tabloElementleri.get(i).getText()+"===========");
        }


/*
        String actualSenderName = userDashboard.nameOfFirstElement.getText();
        Assert.assertEquals(senderName,actualSenderName);

        String actualSenderEmail = userDashboard.emailOfFirstElement.getText();
        Assert.assertEquals(senderEmail,actualSenderEmail);

        String actualSenderPhone = userDashboard.phoneOfEnquiryDetails.getText();
        Assert.assertEquals(senderPhone,actualSenderPhone);
*/
        userDashboard.viewIconOfFirstElementNK.click();

       /*
        String javascript = "document.getElementById('showName')";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        WebElement element = (WebElement) jsExecutor.executeScript(javascript);
        System.out.println(element);

        Assert.assertTrue(element.isDisplayed());
        */

       //String actualSenderName = userDashboard.nameOfEnquiryDetails.getText();
       //Assert.assertEquals(senderName,actualSenderName);

       //System.out.println(actualSenderName);

       //String actualSenderEmail = userDashboard.emailOfEnquiryDetails.getText();
       //Assert.assertEquals(senderEmail,actualSenderEmail);

       //String actualSenderPhone = userDashboard.phoneOfEnquiryDetails.getText();
       //Assert.assertEquals(senderPhone,actualSenderPhone);

       //String actualSenderMessage = userDashboard.messageOfEnquiryDetails.getText();
       //Assert.assertEquals(senderMessage,actualSenderMessage);

        // 13 - Enquiry Details penceresini kapat
        ReusableMethods.wait(1);
        userDashboard.closeButtonOfEnquiryDetailsNK.click();


        String showingResultsTextBefore = userDashboard.showingResultsElementNK.getText();
        char resultNumberBefore = showingResultsTextBefore.charAt(8);
        System.out.println("number of results before : "+resultNumberBefore);

        // 13 - gelen son enquiry'yi sil
        ReusableMethods.wait(1);
        userDashboard.deleteIconOfFirstElementNK.click();
        ReusableMethods.wait(1);
        userDashboard.yesDeleteButtonOfEnquiryDetailsNK.click();

        // 14 - silinen enquiry'nin silindigini dogrula
        ReusableMethods.wait(1);
        String showingResultsTextAfter = userDashboard.showingResultsElementNK.getText();

        char resultNumberAfter = showingResultsTextAfter.charAt(8);
        System.out.println("number of results after : "+resultNumberAfter);



        int rnai = resultNumberAfter;
        int rnbi = resultNumberBefore;


        Assert.assertEquals(((rnai + 1)), rnbi);

        // 15 - pencereleri kapat
        //Driver.quitDriver();
    }
}

