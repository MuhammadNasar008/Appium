package webelements;

import org.openqa.selenium.By;

public interface HomeScreenELements {
	By Dashboard = By.xpath("//span[text()='Dashboard']//parent::a");
	By HelpButton = By.xpath("//a[contains(@class,'nav-link ')]//span[text()='Help']");
	By MoreButton = By.xpath("//span[text()='More']//parent::a");
	By PayBillOrRechargeLineText = By.xpath("//h3[text()='Pay Bill or Recharge Line']");
	By VoiceButton = By.xpath("//label[text()='Voice']");
	By DataButton = By.xpath("//label[text()='Data']");
	By FiberButton = By.xpath("//label[text()='Fiber']");
	By phoneNoField = By.id("txtSubscriber");
	By QuickPaySubmitButton = By.xpath("//button[@type='submit']");

	// Direct Access
	By DirectAccessText = By.xpath("//h3[text()='Direct Access']");
	By DirectAccessButton = By.xpath("//h3[text()='Direct Access']");

	// Plan And Service
	By PlansAndServicesText = By.xpath("//h2[text()='Plans & Services']");

	// Zain World
	By ZainWorldText = By.xpath("//h2[text()='Zain World']");
	By nextButton = By.xpath("//img[@alt='Go']");
	By inputLineNumber = By.xpath("//input[@id='txtSubscriber']");
	By erorMessage = By.xpath("//div[@class='input-text__error-message']");
	By payBillScreen = By.xpath("//h1[contains(text(),'Pay Bill')]");
	By customAmountTab = By.xpath("//input[@id='custom-amount']");
	By billAmountTab = By.xpath("//input[@id='bill-amount']");
	By billAmountLabel = By.xpath("//label[text()='Bill amount']");
	By balanceTab = By.xpath("//input[@id='balance']");
	By SAR50_Balance = By.xpath("//label[contains(text(),'50 SAR')]");
	By Custom_Balance = By.xpath("//label[contains(text(),'Custom')]");
	By balanceTabLabel = By.xpath("//input[@id='balance']//..//label");
	By dataTab = By.xpath("//input[@id='data']");
	By dataTabLabel = By.xpath("//input[@id='data']//..//label");
	By voucherTab = By.xpath("//input[@id='voucher']");
	By rechargeScreen = By.xpath("//h1[contains(text(),'Recharge')]");
	By payWithCardButton = By.xpath("//button[@id='btnPayBillSubmit']");
	By enterAmount = By.xpath("//input[@id='amount']");

	By CardDetailsModalAmount = By.xpath("//div[@class='modal-total-payment']//p");
	By CardDetailsModalSubTitle = By
			.xpath("//h3[contains(text(),'Card Details')]//..//..//..//*[contains(@class,'modal-subtitle')]");
	By CardDetailsModalTitle = By
			.xpath("//h3[contains(text(),'Card Details')]//..//..//..//*[contains(@class,'modal-title')]");
	By CardDetailsDataChargeAmount = By.xpath("//h4[text()='Data Recharge']//..//span");
	By CardDetailsBalanceChargeAmount = By.xpath("//h4[text()='Balance Recharge']//..//span");
	By CardDetailsVATAmount = By.xpath("//h4[contains(text(),'VAT')]//..//span");
	By CardDetailsTotalPaymentAmount = By.xpath("//h4[text()='Total payment Required']//..//span");
	By entercustomAmount = By.xpath("//input[@id='customAmount']");
	By customAmountTabLabel = By.xpath("//input[@id='custom-amount']//../label");
	By voucherTabLabel = By.xpath("//input[@id='voucher']//../label");
	By BalanceTabLabel = By.xpath("//input[@id='balance']//../label");
	By payWithCardButtonOnCardDetailsScreen = By.xpath("//button[@id='btnPayWithCard']");
	By submitButtonOnCardDetailsPage = By.xpath("//div[@class='modal-footer']//button[@type='submit']");
	By submitButtonOnCardDetailsPage_1 = By.xpath("(//div[@class='modal-footer']//button[@type='submit'])[1]");
	By PredefinedDatapackage = By
			.xpath("//h2[text()='Select how much data you need']//..//label[contains(text(),'Unlimited')]");
	By cardNumberField = By.xpath("//input[@id='card-number']");
	By expiryDateField = By.xpath("//input[@id='exp-date']");
	By cvvField = By.xpath("//input[@id='cvv']");
	By cardHolderNameField = By.xpath("//input[@id='cardholder-name']");
	By transactionFailedErrorMessage = By.xpath("//h6[contains(text(),'Transaction Failed')]");
	By MinimunAmountErrorMessage = By.xpath("//div[contains(text(),'The minimum amount to pay is 15 SAR.')]");
	By voucherTabInput = By.xpath("//input[@id='voucher-number']");
	By submitVoucherTabButton = By.xpath("//button[@id='btnVoucherSubmit']");
	By invalidVoucherNumberErrorMessage = By
			.xpath("//h2[text()='Type voucher number here']//../div[@class='input-text__error-message']");
	By successfulVoucherRecharge = By.xpath("//div[@class='page-desc__subtitle mb-3']/h6");
	By amountText = By.xpath("//input[@id='amount']//preceding-sibling::span");

	By loginButton = By.xpath("//a[@class='nav-link' and @data-v-337a76b0 and @href='/login/']");
	By singinButton1 = By.xpath("//button[@class='btn btn-primary' and @type='submit' and @data-v-6768473c ]");
	By email = By.xpath(
			"//input[@data-v-6768473c and @class='email-input form-control' and @class='email-input form-control' and @placeholder='Email']");
	By password = By.xpath(
			"//input[@data-v-6768473c and @class='email-input form-control' and @class='email-input form-control' and @placeholder='Password']");
	By singinButton = By.xpath("//button[@class='btn btn-primary' and @data-v-6768473c ]");
	By createAccount = By.xpath("//a[text()='Create account']");
	By signupEmail = By.xpath("//input[@data-v-8398d4a0 and @class='email-input form-control' and @type='email']");
	By signupPassword = By
			.xpath("//input[@data-v-8398d4a0 and @class='email-input form-control' and @type='password']");
	By signupFirstName = By.xpath(
			"//input[@data-v-8398d4a0 and @class='email-input form-control' and @class='email-input form-control' and @placeholder='First name']");
	By signupLastName = By.xpath(
			"//input[@data-v-8398d4a0 and @class='email-input form-control' and @class='email-input form-control' and @placeholder='Last name']");
	By signupVIN = By.xpath(
			"//input[@data-v-8398d4a0 and @class='email-input form-control' and @class='email-input form-control' and @placeholder='VIN']");
	By signupZipCode = By.xpath(
			"//input[@data-v-8398d4a0 and @class='email-input form-control' and @class='email-input form-control' and @placeholder='ZIP']");
	By signupCarMakeYear = By.xpath("//label[text()='Year']//..//input");
	By signupPhoneNo = By.xpath("//input[@class='vti__input form-control']");
	By signupCarMake = By.xpath("//label[text()='Make']//..//input");
	By signupCarModel = By.xpath("//label[text()='Model']//..//input");
	By signupCreateAccountButton = By.xpath("//a[@data-v-6768473c and text()='Create account']");
	By signupSubmitButton = By.xpath("//button[@data-v-8398d4a0 and @type='submit']");
	By Pleasefilloutthisfield = By.xpath("//*[contains(text(), 'Please fill')]");
	By EmailLable = By.xpath("//div[@slot='sign-in']//label[@class='label-text' and text()='Email Address *']");
	By loginPageShowLable = By.xpath("//h3[text()='My Garage']");
	By signupCarMakeValue = By.xpath("//ul//li[contains(text(),'Audi')]");
	By signupCarModelValue = By.xpath("//ul//li[contains(text(),'R8')]");
	By clickOnSignOutButtonShow = By.xpath("//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By clickOnSignOutButton = By.xpath("//a[contains(text(),'Sign')]");
	By errorMessageSignupAccountExist = By.xpath("//div[contains(text(),'Request failed with status code 400')]");

	By locateDealerButton = By.xpath("//a[contains(text(),'Locate Dealer')]");
	By recallNewsPageButton = By.xpath("//a[contains(text(),'Recall News')]");

	// Recent Recalls
	By recentRecallsMercedesBenz = By.xpath("//a[@class='recall-list-item-url']//h5[contains(text(),'Mercedes-Benz')]");
	By recentRecallsVolvo = By.xpath("//a[@class='recall-list-item-url']//h5[contains(text(),'Volvo')]");
	By recentRecallsDaimler1 = By.xpath(
			"//a[@class='recall-list-item-url']//h5[contains(text(),'Daimler (DTNA)')]//span[contains(text(),' 5 days ago')]");
	By recentRecallsDaimler2 = By.xpath(
			"//a[@class='recall-list-item-url']//h5[contains(text(),'Daimler (DTNA)')]//span[contains(text(),' 24 days ago')]");
	By recentRecallsTesla1 = By.xpath(
			"//a[@class='recall-list-item-url']//h5[contains(text(),'Tesla')]//span[contains(text(),' 12 days ago')]");
	By recentRecallsTesla2 = By.xpath(
			"//a[@class='recall-list-item-url']//h5[contains(text(),'Tesla')]//span[contains(text(),' 19 days ago')]");
	By recentRecallsGM = By.xpath("//a[@class='recall-list-item-url']//h5[contains(text(),'GM')]");
	By recentRecallsPorsche = By.xpath("//a[@class='recall-list-item-url']//h5[contains(text(),'Porsche')]");
	By recentRecallsBMW = By.xpath("//a[@class='recall-list-item-url']//h5[contains(text(),'BMW')]");
	By recentRecallsBuick = By.xpath("//a[@class='recall-list-item-url']//h5[contains(text(),'Buick')]");

	// Recalls By Brand
	By recallsByBrandAcura = By.xpath("//a[@class]//h5[contains(text(),' Acura ')]");
	By recallsByBrandDaimler = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Daimler (DTNA)')]");
	By recallsByBrandAlfaRomeo = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Alfa Romeo ')]");
	By recallsByBrandAstonMartin = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Aston Martin ')]");
	By recallsByBrandAstonAudi = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Audi ')]");
	By recallsByBrandAstonBentley = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Bentley ')]");
	By recallsByBrandAstonBMW = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' BMW ')]");
	By recallsByBrandAstonBuick = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Buick ')]");
	By recallsByBrandAstonCadillac = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Cadillac ')]");
	By recallsByBrandAstonChevrolet = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Chevrolet ')]");
	By recallsByBrandAstonDodge = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Dodge ')]");
	By recallsByBrandAstonFerrari = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Ferrari ')]");
	By recallsByBrandAstonFiatChrysler = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),'Fiat Chrysler')]");
	By recallsByBrandAstonFord = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),'Ford')]");
	By recallsByBrandAstonGM = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' GM ')]");
	By recallsByBrandAstonGMC = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' GMC ')]");
	By recallsByBrandAstonHonda = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),'Honda ')]");
	By recallsByBrandAstonHummer = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),'Hummer ')]");
	By recallsByBrandAstonHyundai = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Hyundai ')]");
	By recallsByBrandAstonInfiniti = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Infiniti ')]");
	By recallsByBrandAstonIsuzu = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Isuzu ')]");
	By recallsByBrandAstonJaguar = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Jaguar')]");
	By recallsByBrandJeep = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Jeep')]");
	By recallsByBrandKia = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Kia')]");
	By recallsByBrandLamborghini = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Lamborghini ')]");
	By recallsByBrandLandRover = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Land Rover ')]");
	By recallsByBrandLexus = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Lexus ')]");
	By recallsByBrandLincoln = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Lincoln ')]");
	By recallsByBrandMaserati = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Maserati ')]");
	By recallsByBrandMazda = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Mazda')]");
	By recallsByBrandMcLaren = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' McLaren')]");
	By recallsByBrandMercedesBenz = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Mercedes-Benz')]");
	By recallsByBrandMercury = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Mercury ')]");
	By recallsByBrandMini = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Mini')]");
	By recallsByBrandNissan = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Nissan')]");
	By recallsByBrandPontiac = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Pontiac')]");
	By recallsByBrandRAM = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' RAM')]");
	By recallsByBrandSaab = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Saab ')]");
	By recallsByBrandSaturn = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Saturn ')]");
	By recallsByBrandScion = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Scion ')]");
	By recallsByBrandSmart = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Smart')]");
	By recallsByBrandSubaru = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Subaru')]");
	By recallsByBrandSuzuki = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Suzuki')]");
	By recallsByBrandTesla = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Tesla')]");
	By recallsByBrandToyota = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Toyota')]");
	By recallsByBrandVolkswagen = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Volkswagen')]");
	By recallsByBrandVolvo = By
			.xpath("//h2[contains(text(),'Recalls by Brand')]/..//a[@class]//h5[contains(text(),' Volvo')]");

	By ShowAllBrandsButton = By.xpath("//span[text()='Show all Brands ']");

	// verify element on home page
	By MercedesBenz = By.xpath("//a[contains(text(),'Mercedes-Benz ')]");
	By HowdoICheckForARecallOnMyCar = By.xpath(
			"//a[contains(text(),'How do I check for a recall on my car?')]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By HowdoICheckForARecallOnMyCarLink = By.xpath(
			"//a[contains(text(),'How do I check for a recall on my car?')]/../..//a[contains(text(),'Read More')]");

	By WheresMyVINVehicleIdentificationNumber = By.xpath(
			"//a[contains(text(),\"Where's my VIN (Vehicle Identification Number)?\")]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By WheresMyVINVehicleIdentificationNumberLink = By.xpath(
			"//a[contains(text(),\"Where's my VIN (Vehicle Identification Number)?\")]/../..//a[contains(text(),'Read More')]");

	By HowAmINotifiedWhenANewRecallAffectsMyVehicle = By.xpath(
			"//a[contains(text(),\"How am I notified when a new recall affects my vehicle?\")]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By HowAmINotifiedWhenANewRecallAffectsMyVehicleLink = By.xpath(
			"//a[contains(text(),\"How am I notified when a new recall affects my vehicle?\")]/../..//a[contains(text(),'Read More')]");

	By WhyIsAVehicleRecalled = By.xpath(
			"//a[contains(text(),\"Why is a vehicle recalled?\")]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By WhyIsAVehicleRecalledLink = By
			.xpath("//a[contains(text(),\"Why is a vehicle recalled?\")]/../..//a[contains(text(),'Read More')]");

	By HowMuchDoRecallRepairsCost = By.xpath(
			"//a[contains(text(),\"How much do recall repairs cost?\")]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By HowMuchDoRecallRepairsCostLink = By
			.xpath("//a[contains(text(),\"How much do recall repairs cost?\")]/../..//a[contains(text(),'Read More')]");

	By WhatShouldIDoIfIGetASafetyRecallNotice = By.xpath(
			"//a[contains(text(),\"What should I do if I get a �safety recall notice�?\")]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By WhatShouldIDoIfIGetASafetyRecallNoticeLink = By.xpath(
			"//a[contains(text(),\"What should I do if I get a �safety recall notice�?\")]/../..//a[contains(text(),'Read More')]");

	By HowLongDoRecallRepairsTake = By.xpath(
			"//a[contains(text(),\"How long do recall repairs take?\")]//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By HowLongDoRecallRepairsTakeLinks = By
			.xpath("//a[contains(text(),\"How long do recall repairs take?\")]/../..//a[contains(text(),'Read More')]");

	// social links
	By socialFaceBookLinks = By.xpath("//*[@class='svg-inline--fa fa-facebook-f fa-w-10']");
	By socialTwitterLinks = By.xpath("//*[@class='svg-inline--fa fa-twitter fa-w-16']");

	// contact
	By contactEmailLinks = By.xpath("//*[contains(text(),'support@motorsafety.org')]");

	// site information
	By siteInformationRecallMattersBlogLinks = By.xpath("//*[contains(text(),'Recall Matters Blog')]");
	By siteInformationCheckMyRecallStatusLinks = By.xpath("//*[contains(text(),'Check My Recall Status')]");
	By siteInformationFAQLinks = By.xpath("//*[contains(text(),'FAQ')]");
	By siteInformationAboutUsLinks = By.xpath("//*[contains(text(),'About Us')]");
	By siteInformationContactUsLinks = By.xpath("//*[contains(text(),'Contact Us')]");
	By siteInformationLoginLinks = By.xpath("//*[contains(text(),'Contact Us')]/../..//*[contains(text(),'Login')]");

	// terms and privacy
	By TermsLinks = By.xpath("//*[contains(text(),'Terms')]");
	By PrivacyLinks = By.xpath("//*[contains(text(),'Privacy')]");

	// logo motorsafty
	By logoMotorsafetyLinks = By.xpath("//a[contains(@class,'navbar-brand nuxt-link-exact-active nuxt-link-active')]");
	By logoMotorsafetyLinksInRecentRecall = By.xpath("//a[contains(@class,'navbar-brand nuxt-link-active')]");

	// click on recent recall links, title of page open
//	By titleOfMercedesBenz = By.xpath("//h1[text()='Mercedes-Benz recalls SUVs for water leak']");
	By titleOfLatestNews = By.xpath("//h2[contains(text(),'Latest News')]");
	By titleOfVolvo = By.xpath("//h1[text()='Volvo recalls vehicles due to risk of engine shutoff while driving']");
	By titleOfDaimler1 = By.xpath("//h1[text()='Daimler recalls Freightliner Cascadia trucks over risk of fire']");
	By titleOfGM = By.xpath("//h1[text()='General Motors recalls vehicles over collapsing emergency jacks']");
	By titleOfPorsche = By
			.xpath("//h1[text()='Porsche recalls over 10,000 Taycans following government investigation']");
	By titleOfTesla1 = By.xpath("//h1[text()='Tesla recalls almost 6,000 vehicles over increased accident risk']");
	By titleOfBMW = By.xpath("//h1[text()='BMW recalls cars over Takata airbag malfunction']");
	By titleOfBuick = By.xpath("//h1[text()='GM recalls multiple models for faulty airbag warning light']");
	By titleOfTesla2 = By.xpath("//h1[text()='Tesla recalls 285,000 cars in China over cruise control problem']");
	By titleOfDaimler2 = By
			.xpath("//h1[text()='Daimler recalls more than 8,000 trucks for possible loss of steering']");
	// after clicking on frequently asked questions links, title page open
	By titleOfFrequentlyAskedQuestions = By.xpath("//h1[text()='Frequently Asked Questions']");
	// title of locate Dealer page, after clicking
	By titleLocateDealerpage = By.xpath("//h1[contains(text(),'Locate your dealer')]");
	// title of login page, after clicking
	By titleLoginpage = By.xpath("//h3[contains(text(),'Sign In')]");
	// about us page title
	By titleAboutUsPage = By.xpath("//h1");
	// contact Us
	By titleContactUsPage = By.xpath("//h1[text()='Contact Us']");
	// Terms link and after open link page
	By termsPageLink = By.xpath("//a[contains(text(),'Terms')]");
	By titleOftermsPage = By.xpath("//h1");
	// Privacy link and after open link page
	By PrivacyPageLink = By.xpath("//a[contains(text(),'Privacy')]");
	By titleOfPrivacyPage = By.xpath("//h1[text()='MOTORSAFETY.ORG']");
//My garage page title
	By titleOfMyGarage = By.xpath("//h3[contains(text(),'My Garage')]");
//My garage page Account Drop Down Arrow Button
	By accountDropDownArrowButton = By.xpath("//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10']");
	By accountDropDownLogoutButton = By.xpath("(//*[@class='dropdown-item'])[2]");

}
