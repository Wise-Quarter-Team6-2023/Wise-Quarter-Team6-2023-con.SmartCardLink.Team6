package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    ////M.Emin
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

    @FindBy(xpath = "//button[@aria-label='Next »']")
    public WebElement usersSonrakiSayfa;


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


    //M.Rasit
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButonuRS;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusuRS;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusuRS;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonuRS;
    @FindBy(xpath = "//span[text()='Cash Payments']")
    public WebElement paymentsButonuRS;
    @FindBy(xpath = "//span[text()='Front CMS']")
    public WebElement frontCMSButonuRS;
    @FindBy(xpath = "//span[text()='Subscribed User Plans']")
    public WebElement subscribedUserPlansButonuRS;
    @FindBy(xpath = "//label[text()='Title:']")
    public WebElement titleTextRS;
    @FindBy(xpath = "//label[text()='Sub Text:']")
    public WebElement subTextYazisiRS;
    @FindBy(xpath = "//a[text()='Features']")
    public WebElement featuresTextRS;
    @FindBy(xpath = "//a[text()='About Us']")
    public WebElement aboutUsTextRS;
    @FindBy(xpath = "//button[@rel='next']")
    public WebElement nextButonuRS;
    @FindBy(xpath = "//select[@id='perPage']")
    public WebElement dropdownMenuRS;
    @FindBy(xpath = "//tr")
    public WebElement tumSatirRS;
    @FindBy(xpath = "//tr/td[1]")
    public WebElement userNameRS;
    @FindBy(xpath = "//tr/td[2]")
    public WebElement planNameRS;
    @FindBy(xpath = "//tr/td[3]")
    public WebElement startDateRS;
    @FindBy(xpath = "//tr/td[4]")
    public WebElement endDateRS;
    @FindBy(xpath = "//a[@class='btn px-1 text-info fs-3 subscribed-user-plan-view-btn'][1]")
    public WebElement detailButonuRS;
    @FindBy(xpath = "//h5[text()='Subscribed Plan Details']")
    public WebElement subscribedPlanDetailsYazisiRS;
    @FindBy(xpath = "//a[@class='btn px-1 text-primary fs-3 subscribed-user-plan-edit-btn'][1]")
    public WebElement editDateRS;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonuRS;
    @FindBy(xpath = "//input[@id='EndDate']")
    public WebElement endDateTextRS;
    @FindBy(xpath = "//select[@aria-label='Month']")
    public WebElement monthRS;
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement sonucYaziElementiRS;
    @FindBy(xpath = "//span[@aria-label='December 27, 2023']")
    public WebElement tarihSecRS;
    @FindBy(xpath = "//div[text()='v7.7.0-patch5']")
    public WebElement sayfaSonuTextYazisiRS;




    ///Necmettin
    //Dasshboard Elementleri
    @FindBy (xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[1]")
    public WebElement totalActiveUsersNumberNK;
    @FindBy (xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[2]")
    public WebElement totalActiveVCardsNumberNK;
    @FindBy (xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[3]")
    public WebElement totalDectiveUsersNumberNK;
    @FindBy (xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[4]")
    public WebElement totalDeactiveVCardsNumberNK;
    @FindBy (xpath = "(//h3[@class='mb-0 fs-4 fw-light'])[1]")
    public WebElement totalActiveUsersTextNK;
    @FindBy (xpath = "(//h3[@class='mb-0 fs-4 fw-light'])[2]")
    public WebElement totalActiveVCardsTextNK;
    @FindBy (xpath = "(//h3[@class='mb-0 fs-4 fw-light'])[3]")
    public WebElement totalDectiveUsersTextNK;
    @FindBy (xpath = "(//h3[@class='mb-0 fs-4 fw-light'])[4]")
    public WebElement totalDeactiveVCardsTextNK;
    @FindBy (id = "dashboardPlanPieChart")
    public WebElement plansByUsersChartNK;
    @FindBy (id = "dashboardIncomeChart")
    public WebElement incomeChartNK;
    @FindBy (xpath = "//button[@class='nav-link active p-0']")
    public WebElement dayButtonNK;
    @FindBy (xpath = "(//button[@class='nav-link p-0'])[1]")
    public WebElement weekButtonNK;
    @FindBy (xpath = "(//button[@class='nav-link p-0'])[2]")
    public WebElement monthButtonNK;
    @FindBy (xpath = "(//table[@class='table table-striped'])[3]//td")
    public List<WebElement> allElementsOfTableNK;
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[11]")
    public WebElement withdrawTranssactionsPageLinkNK;
    @FindBy (xpath = "//table[@class='table table-striped']//td")
    public List<WebElement> allElementsOfWithdrawTransactionsTableNK;
    @FindBy (xpath = "(//li[@class='nav-item '])[8]")
    public WebElement affiliationTransactionsPageLinkNK;
    @FindBy (xpath = "//div[@class='text-muted ms-sm-3 pagination-record']//strong[3]")
    public WebElement resultNumberNK;
    @FindBy (xpath ="//select[@class='form-select w-auto data-sorting pl-1 pr-5 py-2']")
    public WebElement numberOfUsersDisplayedNK;
    @FindBy (xpath = "(//div[@class='col-8'])[1]//span")
    public WebElement nameInAffiliationWithdrawDetailsNK;
    @FindBy (xpath = "(//div[@class='col-8'])[2]//span")
    public WebElement amountInAffiliationWithdrawDetailsNK;
    @FindBy (xpath = "(//div[@class='col-8'])[3]//span")
    public WebElement statusInAffiliationWithdrawDetailsNK;
    @FindBy (xpath = "(//div[@class='col-8'])[4]//span")
    public WebElement dateInAffiliationWithdrawDetailsNK;
    @FindBy (xpath = "(//button[@class='btn-close'])[5]")
    public WebElement closeButtonOfAffiliationWithdrawDetailsNK;


    ///Ramazan K
    @FindBy(linkText = "Kacmaz Ramazan")
    public WebElement affilitedrk;

    @FindBy(linkText = "eyyup Yilmaz")
    public WebElement affilitedUser2rk;

    @FindBy(xpath = "(//span[@class='aside-menu-title'])[9]")
    public WebElement  affilitedUserrk;

    @FindBy(xpath = "(//span[@class='badge bg-success me-2'])[1]")
    public WebElement amountrk;

    @FindBy(xpath = "(//span[@class='badge bg-secondary me-2'])[1]")
    public WebElement daterk;


    //AdemB
    @FindBy(
            xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']"
    )
    public WebElement signInButtonAB;
    @FindBy(xpath = "(//a[@class='link-info fs-6 text-decoration-none'])[2] ")
    public WebElement createAnAccountElementAB;
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameElementAB;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameElementAB;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailElementAB;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordElementiAB;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement passwordConfirmationElementAB;
    @FindBy(xpath = "//input[@name='term_policy_check']")
    public WebElement termPolicyCheckBoxElementAB;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButtonElementAB;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButtonuAB;

    @FindBy (id="remember_me")
    public WebElement rememeberMeCheckBoxAB;
    @FindBy (xpath ="//input[@name='email']")
    public WebElement signinBoxElementiAB;
    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordBoxElementAB;

    @FindBy (xpath = "//button[@class='btn dropdown-toggle ps-2 pe-0']")
    public WebElement adminDropDownElementAB;

    @FindBy (xpath = "(//*[text()='VCard Templates'])[1]")
    public  WebElement vcardTemplatesLinkElementAB;

    @FindBy (xpath = "//a[@class='nav-link p-0 active']")
    public WebElement vcardElementAB;
    @FindBy (xpath = "(//span[@class='aside-menu-title'])[3]")
    public WebElement usersLinkElementAB;
    @FindBy (xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement showingResultElementiAB;
    @FindBy (xpath = "(//a[@title='Delete'])[1]")
    public WebElement deleteButtonuAB;

    @FindBy (xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement yesDeleteElementAB;
    @FindBy (xpath = "//table[@class='table table-striped']")
    public WebElement usersTabloElementAB;
    @FindBy (xpath = "//div[@class='swal-text']")
    public WebElement deletedYaziElementAB;
    @FindBy (xpath = "(//a[@class='mb-1 text-decoration-none fs-6'])[1]")
    public WebElement ilkisimElementiAB;

    @FindBy (xpath = "//div[@class='swal-title']")
    public WebElement deletedElementAB;










}
