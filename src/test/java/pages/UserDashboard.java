package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    ////M.Emin
    @FindBy(xpath = "//input[@name='email']")
    public WebElement logInEMailME;

    @FindBy(xpath="//input[@name='password']")
    public WebElement logInPasswordME;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButtonME;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ps-2 pe-0']")
    public WebElement userMenuME;


    @FindBy(xpath = "(//a[@class='dropdown-item text-gray-900'])[1]")
    public WebElement accountSettingsME;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-pen']")
    public WebElement profilResmiDuzenleIkonuME;


    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement profileDetailsME;

    @FindBy(xpath = "//input[@id='editProfileFirstName']")
    public WebElement userSettingsFirstNameME;

    @FindBy(xpath = "//input[@id='editProfileLastName']")
    public WebElement userSettingsLastNameME;

    @FindBy(xpath = "//input[@id='isEmailEditProfile']")
    public WebElement userSettingsEmailME;

    @FindBy(xpath = "//div[@class='iti__selected-flag']")
    public WebElement userSettingsNumberFlagsME;

    @FindBy(xpath = "//*[@class='iti__country iti__standard']")
    public WebElement bayrak_MenusuME;

    @FindBy(xpath = "(//*[@class='iti__country iti__standard'])[5]")
    public WebElement andorraFlagME;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButtonME;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement userSettingsPhoneME;



    ///// senol

    @FindBy(xpath = "(//*[@class='nav-link d-flex align-items-center py-3'])[2]")
    public WebElement vCardsElementiSM;
    @FindBy(xpath = "//*[@class='d-flex justify-content-end']")
    public WebElement newCardElementiSM;
    @FindBy(xpath = "//*[@class='form-control ms-1 vcard-url-alias']")
    public WebElement urlAliasElementiSM;
    @FindBy(xpath = "//*[@placeholder='Enter VCard Name']")
    public WebElement vCardNameSM;
    @FindBy(xpath = "//*[@placeholder='Enter Occupation']")
    public WebElement occupationElementSM;
    @FindBy(xpath = "//*[@class='ql-editor ql-blank']")
    public WebElement descriptionElementSM;
    @FindBy(xpath = "//input[@id='vcardSaveBtn']")
    public WebElement newVCardSaveButonuSM;
    @FindBy (xpath = "//*[@*='generate-url-alias']")
    public WebElement urlAliasSM;
    @FindBy(xpath = "//*[@placeholder='Enter First Name']")
    public WebElement vCardFirstNameSM;
    @FindBy(xpath = "//*[@placeholder='Enter Last Name']")
    public WebElement vCardLastNameSM;
    @FindBy(xpath = "//*[@placeholder='Enter Email Address']")
    public WebElement vCardEmailSM;
    @FindBy(xpath = "//*[@placeholder='Alternate Email']")
    public WebElement vCardAlternateEmailSM;
    @FindBy(xpath = "//*[@placeholder='Enter Phone Number']")
    public WebElement vCardPhoneSM;
    @FindBy(xpath = "//*[@placeholder='Alternate Phone']")
    public WebElement vCardAlternatePhoneSM;
    @FindBy(xpath = "//*[@placeholder='Enter Your Location']")
    public WebElement vCardLocationSM;
    @FindBy(xpath = "//*[@placeholder='Enter Your Location URL']")
    public WebElement vCardLocationUrlSM;
    @FindBy(xpath = "//*[@placeholder='Enter Date of Birth']")
    public WebElement vCardDateOfBirthSM;
    @FindBy(xpath = "//*[@placeholder='Enter Company Name']")
    public WebElement vCardCompanySM;
    @FindBy(xpath = "//*[@placeholder='Enter Job Title']")
    public WebElement vCardJobTitleSM;
    @FindBy(xpath = "//span[@id='select2-default_language-container']")
    public WebElement vCardJLanguageSM;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement vCardSaveButonuSM;
    @FindBy(xpath = "//*[@id='select2-default_language-result-a2mc-en']")
    public WebElement vCardEnglishSM;
    @FindBy(xpath = "(//*[@class='text-decoration-none fs-6'])[1]")
    public WebElement previewUrlSM;
    @FindBy(xpath = "(//a[@class='btn px-1 text-primary fs-3'])[1]")
    public WebElement vCardEditSM;
    @FindBy (xpath = "//a[@class='btn btn-outline-primary float-end']")
    public WebElement backButtonSM;
    @FindBy(xpath = "//span[text()='Engineer']")
    public WebElement editMeslekElementiSM;
    @FindBy(xpath = "//*[@class='vcard1-sticky-btn bars-btn d-flex justify-content-center text-white me-5 align-items-center rounded-0 px-5 mb-3 text-decoration-none py-1 rounded-pill justify-content-center']")
    public WebElement kartfonksiyonaktifElementiSM;
    @FindBy(xpath = "//*[@data-icon='share-nodes']")
    public WebElement qRKodeSosyalMedyaLinkiSM;
    @FindBy(xpath = "//span[@class='svg-icon svg-icon-1']")
    public WebElement cikisKapatmaSM;


    //Mehmet K.
    @FindBy (xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonuMK;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement kullaniciEmailMK;
    @FindBy (xpath = "//input[@name='password']")
    public WebElement kullaniciPasswordMK;
    @FindBy (xpath = "//button[text()='Login']")
    public WebElement kullaniciLoginButonuMK;
    @FindBy (xpath = "(//span[@class='aside-menu-title'])[2]")
    public WebElement vcardButonuMK;
    @FindBy (xpath = "//a[@type='button']")
    public WebElement newVCardButonuMK;
    @FindBy (xpath = "//*[@*='generate-url-alias']")
    public WebElement urlAliasMK;
    @FindBy (xpath = "//input[@name='name']")
    public WebElement vcardNameMK;
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement saveButtonMK;
    @FindBy (xpath = "//a[@class='btn btn-outline-primary float-end']")
    public WebElement backButtonMK;
    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstNameMK;
    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement lastNameMK;
    @FindBy (xpath = "//*[@*='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement sayininGoruntulenebilirligiMK;
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement save2ButtonMK;
    @FindBy (xpath = "(//a[@title='QR Code'])[1]")
    public WebElement qaKodeAktifButtonMK;
    @FindBy (xpath = "(//*[@*='download'])[1]")
    public WebElement dowloadVCardButtonMK;
    @FindBy (xpath = "(//*[@*='Enquiries'])[1]")
    public WebElement enquiriesButtonMK;
    @FindBy (xpath = "(//*[@data-icon='pen-to-square'])[1]")
    public WebElement editButtonMK;
    @FindBy (xpath = "//a[@title='Delete']")
    public WebElement deleteButtonMK;
    @FindBy (xpath = "//*[text()='Manage Subscription']")
    public WebElement editGorunurluguMK;
    @FindBy (xpath = "(//*[@class='swal-button-container'])[1]")
    public WebElement deleteOnayButtonuMK;
    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-id-card'])[2]")
    public WebElement virtualBackButtonuMK;
    @FindBy (xpath = "//h1[@class='mb-0']")
    public WebElement enquiriesSayfaGorunurluguMK;
    @FindBy (xpath = "//h1[text()='Edit VCard']")
    public WebElement editSayfaGorunurluguMK;
    @FindBy (xpath = "//div[@class='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement vcardSayisiMK;
    @FindBy (xpath = "(//img[@data-id='1'])[2]")
    public WebElement birinciKartButtonuMK;
    //span[@id='select2-e-vcard-id-container']
    @FindBy (xpath = "//span[@id='select2-e-vcard-id-container']")
    public WebElement vcardIsimSelecktMK;
    @FindBy (xpath = "//*[@data-select2-id='select2-data-64-vu3e']")
    public WebElement vcardIsimValueMK;
    @FindBy (xpath = "//input[@id='e-card-first-name']")
    public WebElement firstNameArkaPlanMK;
    @FindBy (xpath = "//input[@id='e-card-last-name']")
    public WebElement lastNameArkaPlanMK;
    @FindBy (xpath = "//input[@id='e-card-email']")
    public WebElement emailArkaPlanMK;
    @FindBy (xpath = "//input[@id='e-card-occupation']")
    public WebElement occupationArkaPlanMK;
    @FindBy (xpath = "//input[@id='e-card-location']")
    public WebElement locationArkaPlanMK;
    @FindBy (xpath = "//*[@*='phoneNumber']")
    public WebElement phoneNummerArkaPlanMK;
    @FindBy (xpath = "//*[@*='e-card-website']")
    public WebElement websiteArkaPlanMK;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveArkaPlanMK;
    @FindBy (xpath = "//*[@id='profileImageIcon']")
    public  WebElement fotoeklemeMK;


    ///Necmettin
    //Dashboard/VCards page link
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[2]")
    public WebElement VCardsPageLinkNK;
    //VCards/PreviewUrl
    @FindBy(id = "vcardUrl125")
    public WebElement previewUrlOfVCardNK;
    //VCards/VCard preview
    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameBoxInVCardPreviewNK;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBoxInVCardPreviewNK;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement telBoxInVCardPreviewNK;
    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement messageBoxInVCardPreviewNK;
    @FindBy(xpath = "//button[@class='contact-btn text-white mt-4 d-block ms-sm-auto']")
    public WebElement sendMessageButtonInVCardPreviewNK;
    //Dashboard/Enquiries page link
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[3]")
    public WebElement EnquiriesPageLinkNK;
    //Enquiries sayfasindaki tablo elementleri
    @FindBy (xpath = "//table[@class='table table-striped']//tr[1]/td[2]")
    public WebElement nameOfFirstElementNK;
    @FindBy (xpath = "//tr[1]/td[3]")
    public WebElement emailOfFirstElementNK;
    @FindBy (xpath = "//tr[1]/td[4]")
    public WebElement PhoneOfFirstElementNK;
    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement viewIconOfFirstElementNK;
    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement deleteIconOfFirstElementNK;
    @FindBy(xpath = "//div[@class='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement showingResultsElementNK;
    //Enquiries ilk elementin view butonuna basildiginda acilan penceredeki elementler
    @FindBy (xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div/div/div[2]/div/div[3]/p")
    public WebElement nameOfEnquiryDetailsNK;
    @FindBy (id = "showEmail")
    public WebElement emailOfEnquiryDetailsNK;
    @FindBy (id = "showPhone")
    public WebElement phoneOfEnquiryDetailsNK;
    @FindBy (id = "showMessage")
    public WebElement messageOfEnquiryDetailsNK;
    @FindBy (xpath = "(//button[@class='btn-close'])[1]")
    public WebElement closeButtonOfEnquiryDetailsNK;
    @FindBy (xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement yesDeleteButtonOfEnquiryDetailsNK;



    //Ramazan K.
    @FindBy(linkText = "Create an Account")
    public WebElement createanAccountrk;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNamerk;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkboxrk;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitrk;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement singInmailrk;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ps-2 pe-0']")
    public WebElement logindropdownrk;

    @FindBy(xpath = "//a[@id='changePassword']")
    public WebElement changePasswordrk;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement currentPasswortrk;

    @FindBy(xpath = "//button[@id='passwordChangeBtn']")
    public WebElement passwordChangeBtnrk;

    @FindBy(xpath = "//div[@id='changePasswordModal']")
    public WebElement passwordChangeSuccesfullyrk;

    @FindBy(xpath = "//a[@id='changeLanguage']")
    public WebElement changeLanguagerk;

    @FindBy(xpath = "//select[@class='form-control form-select select2-hidden-accessible']")
    public WebElement changeLanguageSelectrk;

    @FindBy(xpath = "//button[@id='languageChangeBtn']")
    public WebElement languageChangeBtnrk;

}
