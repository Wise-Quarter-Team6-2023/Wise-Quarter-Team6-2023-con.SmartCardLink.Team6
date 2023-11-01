package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.sql.SQLOutput;

public class HomePage {
    public HomePage(){PageFactory.initElements(Driver.getDriver(),this);}

   // M.Emin
    @FindBy(xpath="//a[text()='Features']")
    public WebElement FeaturesTextLinkME;

    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonME;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement logInEMailME;

    @FindBy(xpath="//input[@name='password']")
    public WebElement logInPasswordME;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButtonME;



    ///////Bilal
 @FindBy(xpath="//a[text()='Features']")
 public WebElement FeaturesTextLink;
 //Homepage SignIn Button
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInButton;
 // funcktions footer
 @FindBy(xpath = "//*[@target='_blank']")
 public WebElement footerbd;
 @FindBy(xpath = "//a[@title='Facebook']")
 public WebElement footerFacebookbd;
 @FindBy(xpath = "(//button[@type=\"submit\"])[3]")
 public WebElement facebookCookiesbd;
 @FindBy(xpath = "//div[@class=\"_8esk\"]")
 public WebElement facebookLoginSayfasibd;
 @FindBy(xpath = "//a[@title='Twitter']")
 public WebElement footerXbd;
 @FindBy(xpath = "//div[@id=\"react-root\"]")
 public WebElement xLoginSayfasibd;
 @FindBy(xpath = "//a[@title='Instagram']")
 public WebElement footerInstagrambd;
 @FindBy(xpath = "//main[@class=\"_a993 _a994\"]")
 public WebElement instagramLoginSayfabd;
 @FindBy(xpath = "//button[text()='Allow all cookies']")
 public WebElement instagramCookiesbd;
 @FindBy(xpath = "//a[@title='Linkedin']")
 public WebElement footerLinkedinbd;
 @FindBy(xpath = "(//button[@type=\"submit\"])[4]")
 public WebElement linkedinbd;
 @FindBy(xpath = "//a[@title='Pinterest']")
 public WebElement footerPinterestbd;
 @FindBy(xpath = "//div[@id='__PWS_ROOT__']")
 public WebElement pnterestHomePagebd;
 @FindBy(xpath = "(//a[@target=\"_blank\"])[6]")
 public WebElement footerTermsConditionsbd;
 @FindBy(xpath = "(//a[@target=\"_blank\"])[7]")
 public WebElement footePprivacyPolicybd;
 @FindBy(xpath = "//section[@class=\"hero-section\"]")
 public WebElement privacyPolicybd;
 @FindBy(xpath = "(//a[@target=\"_blank\"])[8]")
 public WebElement footerFaqbd;
 @FindBy(xpath = "(//div[@class=\"container\"])[1]")
 public WebElement faqbd;
 @FindBy(xpath = "(//a[@data-turbo=\"false\"])[1]")
 public  WebElement homePageSignInButonubd;
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement getSignInButtonbd;
 @FindBy(id = "email")
 public WebElement emailbd;
 @FindBy(id = "password")
 public WebElement passwordbd;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement loginbd;
 @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
 public WebElement testTeambd;
 @FindBy(xpath = "(//a[@class='dropdown-item text-gray-900'])[1]")
 public WebElement accountSettingsbd;


 //// senol

 @FindBy(id = "email")
 public WebElement signInEmailElementiSM;
 @FindBy(id = "password")
 public WebElement signInPasswordElementiSM;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement LoginButtonuSM;

 ////Eyyüp D
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInButtonED;
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInButtonuED;
 @FindBy(id = "email")
 public WebElement signInEmailButtonuED;
 @FindBy(id = "password")
 public WebElement signInPasswordButtonuED;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement signInLoginButtonuED;


 /////M.Rasit
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInButonuRS;
 @FindBy(xpath = "//input[@name='email']")
 public WebElement emailKutusuRS;
 @FindBy(xpath = "//input[@name='password']")
 public WebElement passwordKutusuRS;
 @FindBy(xpath = "//button[text()='Login']")
 public WebElement loginButonuRS;
 @FindBy(xpath = "//a[@class='nav-link p-0 active']")
 public WebElement basariliGirisRS;


//Necmettin
// Header/Features Link
@FindBy(xpath="//a[text()='Features']")
public WebElement FeaturesTextLinkNK;
 //Homepage SignIn Button
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInButtonNK;
 //SignIn/emailBox
 @FindBy(xpath = "//input[@name='email']")
 public WebElement emailBoxNK;
 //SignIn/passwordBox
 @FindBy(xpath = "//input[@name='password']")
 public WebElement passwordBoxNK;
 //SignIn/LoginButton
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement loginButtonNK;

 //Ramazan k.
 // Header/Features Link
 @FindBy(xpath = "//a[text()='Features']")
 public WebElement FeaturesTextLinkrk;

 //Homepage SignIn Button
 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInButtonrk;

 @FindBy(xpath = "//a[@class='btn btn-orange ']")
 public WebElement getStartedbuttonurk;

 @FindBy(xpath = "//img[@class='img-fluid logo-fix-size']")
 public WebElement smartCardLinkrk;

 @FindBy(xpath = "//button[@class='slick-prev slick-arrow']")
 public WebElement solButtonrk;
 @FindBy(xpath = "(//button[@type='button'])[2]")
 public WebElement sagButtonrk;

 @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[12]")
 public WebElement silverChooseplanrk;

 @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[11]")
 public WebElement standardChooseplanrk;

 @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[10]")
 public WebElement gulsahChooseplanrk;
 @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[9]")
 public WebElement VipChooseplanrk;

 @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[14]")
 public WebElement unlimitedChooseplanrk;
 @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[13]")
 public WebElement GoldChooseplanrk;


 @FindBy(xpath = "//*[text()='info@smartcardlink.com']")
 public WebElement bodyMailrk;

 @FindBy(xpath = "//*[text()='+1 987-654-3210']")
 public WebElement bodyTelrk;


 @FindBy(xpath = "//input[@placeholder='Enter Your Name*']")
 public WebElement bodyNamerk;

 @FindBy(xpath = "//input[@id='submit']")
 public WebElement sendMessagerk;

 @FindBy(xpath = "//div[text()='Message send successfully.']")
 public WebElement messageSendsuccessrk;

 @FindBy(xpath = "//input[@placeholder='Enter Your Email*']")
 public WebElement enterEmailrk;

 @FindBy(xpath = "//input[@placeholder='Subject*']")
 public WebElement subjectrk;


 @FindBy(xpath = "//input[@placeholder='Enter Your Email']")
 public WebElement entermailrk;

 @FindBy(xpath = "//button[@type='submit']")
 public WebElement subsriciberk;

 @FindBy(xpath = "//div[@class='toast-message']")
 public  WebElement  Successfullyrk;

 @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
 public WebElement signInrk;












}
