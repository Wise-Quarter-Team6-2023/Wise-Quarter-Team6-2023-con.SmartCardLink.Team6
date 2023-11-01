package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name='email']")
    public WebElement logInEMailME;

    @FindBy(xpath="//input[@name='password']")
    public WebElement logInPasswordME;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButtonME;
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonME;

    @FindBy(linkText = "Users")
    public WebElement adminMenuUsersME;

    @FindBy(xpath = "//a[@class='mb-1 text-decoration-none fs-6']")
    public WebElement kullanicilarListesiME;

    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement kullaniciSayisiTextiME;

    @FindBy(xpath = "//input[@name='is_active']")
    public WebElement usersMenuKullaniciAktiflikleri;

    @FindBy(xpath = "(//a[@class='mb-1 text-decoration-none fs-6'])[1]")
    public WebElement usersMenusuIlkKullaniciME;
    @FindBy(xpath = "//h1[@class='mb-0']")
    public WebElement userDetailsPageME;

    @FindBy(xpath = "//button[@class='btn btn-primary me-4']")
    public WebElement kullaniciEditButonuME;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement editMenuFirstNameME;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement editMenuLastNameME;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement editMenuEmailME;

    @FindBy(xpath = "//div[@class='iti__selected-flag']")
    public WebElement editMenuBayrakME;

    @FindBy(xpath = "//*[text()='United States']")
    public WebElement editMenuUnitedStatesFlagME;

    @FindBy(xpath = "//*[text()='Andorra']")
    public WebElement editMenuAndorraFlagME;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement editMenuPhoneME;

    @FindBy(xpath = "//span[@aria-labelledby='select2-plan-container']")
    public WebElement editMenuPlanME;

    @FindBy(xpath = "//li[text()='Standard']")
    public WebElement editMenuPlanStandartSecenegiME;

    @FindBy(xpath = "//li[text()='Silver']")
    public WebElement editMenuPlanSilverSecenegiME;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement editMenuSaveButtonME;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement degisikliklerKaydedildiBilgisiME;

    @FindBy(xpath = "(//*[@title='Change Password'])[1]")
    public WebElement anahtarIkonuME;

    @FindBy(xpath = "(//input[@placeholder='New Password'])[2]")
    public WebElement newPasswordME;

    @FindBy(xpath = "(//input[@placeholder='Confirm Password'])[2]")
    public WebElement confirmPasswordME;

    @FindBy(xpath = "//button[@id='UserPasswordChangeBtn']")
    public WebElement sifreDegismeSaveButonuME;

    @FindBy(xpath = "//*[@class='btn btn-primary ms-auto']")
    public WebElement addUserME;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement addUserPasswordME;

    @FindBy(xpath = "//*[@id='cPassword']")
    public WebElement addUserConfirmPasswordME;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement addUserSaveME;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement kullaniciEklendiUyarisiME;

    @FindBy(xpath = "(//*[@title='Delete'])[1]")
    public WebElement kullaniciSilIkonuME;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement kullaniciSilYesDeleteButonuME;

    @FindBy(xpath = "//div[@class='swal-text']")
    public WebElement silmeIslemiBasariliUyarisiME;

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-info user-impersonate'])[1]")
    public WebElement usersMenusuIlkKullaniciHesabinaGecisButonuME;

    @FindBy(xpath = "//span[text()='Appointments']")
    public WebElement usersMenusuAppointmentSecenegiME;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user-check fs-2']")
    public WebElement adminHesabinaGeriDonIkonuME;

    @FindBy(xpath = "//*[@class='toast-title']")
    public WebElement passwordDegistiUyarisiME;


    //////// Senol
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement adminOlarakGirisYapildigindaDadhboardYazisiSM;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-dollar-sign']")
    public WebElement currenciesButonuSM;
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement paraBirimleriSayisiSM;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-tags']")
    public WebElement kuponKoduElementiSM;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement kuponKoduEklemeSM;
    @FindBy(id = "couponName")
    public WebElement couponNameSM;
    @FindBy(xpath = "//input[@id='fixedType']")
    public WebElement couponTypeFixSM;
    @FindBy(xpath = "//input[@id='percentageType']")
    public WebElement couponTypePercentageSM;
    @FindBy(xpath = "//input[@id='couponDiscount']")
    public WebElement couponDiscountSM;
    @FindBy(xpath = "//input[@id='couponExpireAt']")
    public WebElement couponExpireSM;
    @FindBy(xpath = "(//span[@class='flatpickr-next-month'])[1]")
    public WebElement ayDegistirmeTusuSM;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/span[28]")
    public WebElement dayDegistirmeTusuSM;
    @FindBy(xpath = "//button[@id='couponCodeSaveBtn']")
    public WebElement couponSaveButonuSM;
    @FindBy(xpath = "(//input[@id='changeCouponStatus'])[1]")
    public WebElement statusDurumElementiSM;
    @FindBy(xpath = "(//*[@class='btn px-1 text-info fs-3 edit-coupon-code'])[1]")
    public WebElement duzenlemeEditElementiSM;
    @FindBy(xpath = "(//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'])[1]")
    public WebElement CouponNameYaziElementiSM;
    @FindBy(xpath = "(//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'])[2]")
    public WebElement CouponTypeYaziElementiSM;
    @FindBy(xpath = "(//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'])[3]")
    public WebElement CouponDiscountYaziElementiSM;
    @FindBy(id = "editCouponDiscount")
    public WebElement editCouponDiscountElementiSM;
    @FindBy(id = "editCouponCodeSaveBtn")
    public WebElement editSaveButonuSM;
    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement silmeElementiSM;
    @FindBy(xpath = "//*[@class='swal-button swal-button--confirm']")
    public WebElement deleteElementiSM;


    //Mehmet K.
    @FindBy (xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonuMK;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement kullaniciEmailMK;
    @FindBy (xpath = "//input[@name='password']")
    public WebElement kullaniciPasswordMK;
    @FindBy (xpath = "//button[text()='Login']")
    public WebElement kullaniciLoginButonuMK;
    @FindBy (xpath = "(//span[@class='aside-menu-title'])[14]")
    public WebElement languagesMK;
    @FindBy (xpath = "//div[@class='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement languagesSayiGoruntulemeMK;

    // Eyyüp D
    @FindBy(xpath = "//span[text()='VCards']")
    public WebElement vcardsButtonuED;
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement adminOlarakGirisYapildigindaDadhboardYazisiED;
    @FindBy(xpath = "(//*[@target='_blank'])[2]")
    public WebElement VCardKartlarED;
    @FindBy(xpath = "(//*[@target='_blank'])[2]")
    public WebElement VCardSayfasindakiKisiUrlED;
    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-chart-line fs-2'])[1]")
    public WebElement istatistikGrafikIsaretiED;
    @FindBy(id = "weeklyUserBarChartContainer")
    public WebElement istatistikGrafigiED;
    @FindBy(xpath = "//span[text()='Countries']")
    public WebElement countriesButtonuED;
    @FindBy(xpath = "(//strong)[3]")
    public WebElement ulkeSayisiED;
    @FindBy(xpath = "//a[text()='States']")
    public WebElement eyaletButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[6]/div[2]/div[1]/strong[3]")
    public WebElement eyaletSayisiED;
    @FindBy(xpath = "//a[text()='Cities']")
    public WebElement sehirButtonuED;
    @FindBy(xpath = "(//strong)[3]")
    public WebElement sehirSayisiED;
    @FindBy(xpath = "//a[text()='New Country']")
    public WebElement yeniUlkeButtonuED;
    @FindBy(xpath = "//input[@id='countryName']")
    public WebElement ulkeIsimEklemeButtonuED;
    @FindBy(xpath = "//*[@id=\"short_code\"]")
    public WebElement ulkeKodEklemeButtonuED;
    @FindBy(xpath = "//*[@id=\"phone_code\"]")
    public WebElement ulkeTelKodEklemeButtonuED;
    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement ulkeSaveButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[4]/div[1]/div[1]/form/div/input")
    public WebElement ulkeSorguButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[6]/div[2]/div/strong")
    public WebElement ulkeKayitSorguSayisiED;
    @FindBy(xpath = "//a[text()='New State']")
    public WebElement yeniEyaletButtonuED;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement eyaletIsimEklemeButtonuED;
    @FindBy(xpath = "(//*[@title='Select Country'])[1]")
    public WebElement eyaletinBahlancagiUlkeButtonuED;
    @FindBy(xpath = "//*[@role='searchbox']")
    public WebElement eyaletinBahlancagiUlkeAramaButtonuED;
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement eyaletKaydetmeButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[4]/div[1]/div[1]/form/div/input")
    public WebElement eyaletSorguButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[6]/div[2]/div/strong")
    public WebElement eyaletKayitSorguSAyisiED;
    @FindBy(xpath = "//*[@id='newCityBtn']")
    public WebElement yeniSehirButtonuED;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement sehirIsimEklemeButtonuED;
    @FindBy(xpath = "//*[@id='select2-StateCity-container']")
    public WebElement sehrinBaglanacagiEyaletButtonuED;
    @FindBy(xpath = "//*[@id='addCityModal']/span/span/span[1]/input")
    public WebElement sehrinBaglanacagiEyaletAramaButtonuED;
    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement sehirKaydetmeButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[4]/div[1]/div[1]/form/div/input")
    public WebElement sehirSorguButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[6]/div[2]/div/strong")
    public WebElement sehirKayitSorguSAyisiED;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div[2]/ul/li[16]/a/span[2]")
    public WebElement frontCMSButtonuED;
    @FindBy(xpath = "//a[text()='Testimonials']")
    public WebElement testimonalsButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[5]/table/tbody")
    public WebElement goruslerBolumuED;
    @FindBy(xpath = "//*[@id='addTestimonialBtn']")
    public WebElement addTestimonialsButtonuED;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement testimonialsIsimEklemeED;
    @FindBy(xpath = "//*[@id='description']")
    public WebElement testimonialsMesajEklemeED;
    @FindBy(xpath = "//*[@id=\"profileImageIcon\"]")
    public WebElement resimDegistirmeButtonuED;
    @FindBy(xpath = "//*[@id=\"testimonialSave\"]")
    public WebElement gorusSaveButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[4]/div[1]/div[1]/form/div/input")
    public WebElement gorusSorguButtonuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[6]/div[2]/div/strong")
    public WebElement gorusSorguSonucuED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[5]/table/tbody/tr[1]/td[2]/div/a[1]")
    public WebElement gorusIcerigineBakisED;
    @FindBy(xpath = "//*[@id='showTestimonialModal']/div/div/div[1]/h2")
    public WebElement testimonalDetailsYazisiED;
    @FindBy(xpath = "(//*[@*='Close'])[3]")
    public WebElement testimonalDetailsKapatmaED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[5]/table/tbody/tr/td[2]/div/a[2]")
    public WebElement gorusDegistirmeButtonuED;
    @FindBy(xpath = "//*[@id='editDescription']")
    public WebElement gorusYeniIcerikEklemeButtonuED;
    @FindBy(xpath = "//*[@id='testimonialUpdate']")
    public WebElement yeniIcerikSaveButtonuED;
    @FindBy(xpath = "//*[@id='showDesc']")
    public WebElement gotusIcerigiKotrolED;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div/div/div[5]/table/tbody/tr/td[2]/div/a[3]")
    public WebElement gorusSilmeButtonuED;
    @FindBy(xpath = "/html/body/div[5]/div/div[4]/div[1]/button")
    public WebElement silmeyiOnaylamaED;










}
