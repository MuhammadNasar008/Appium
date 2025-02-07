package webelements;

import org.openqa.selenium.By;

public interface LocateDealerPageElements {

	// search through location
	By enterLocation = By.xpath("//input[@class='form-control pac-target-input']");
	By enterZip = By.xpath("//input[@class='form-control dealer-input']");
	By searchLocation = By.xpath("//span[text()='London']/../..//span[text()='KY, USA']");
	By searchLocation2 = By.xpath("//span[contains(text(),'London')]//following::span[contains(text(),'KY')]");
	By findLocationPage = By.xpath("//h1");
	By enterZipButton = By
			.xpath("//h4[contains(text(),'or Zip Code')]/../..//*[@class='svg-inline--fa fa-arrow-right fa-w-14']");
	By wrongZipCodeTitle = By.xpath("//h3[contains(text(),'Sorry, We can not find any dealership with ZIPCODE 2000')]");
//logo motor safety link
	By MotorSafetyLogoLink = By.xpath("//a[contains(@class,'navbar-brand nuxt-link-active')]");

	By DealershipWithZipCode = By.xpath("//h1");
//Enter 17 digit VIN Number
	By Enter17digitVINNumberTxt = By.xpath("(//img[@alt='MotorSafety']//..//..//..//..//input)[1]");
	By Enter17digitVINNumberButton = By.xpath("(//img[@alt='MotorSafety']//..//..//..//..//span)[1]");

	By PleaseEnterYour17DigitVINMassege = By.xpath("//div[contains(text(),'Please enter your 17 digit VIN')]");

// enter Zip code to continue
	By enter5ZipCodeToContinueMassege = By.xpath("//input[@placeholder='Enter Zip code to continue']");
	By enterZipCodeToContinue = By.xpath("//input[@placeholder='Enter Zip code to continue']");
	By enterZipCodeToContinueButton = By
			.xpath("//input[@placeholder='Enter Zip code to continue']/..//span[@class='search-icon link-btn']");
	By PleaseEnterYour5DigitVINMassege = By.xpath("//div[contains(text(),'Please enter your 5 digit zip code')]");

//Recall Available
	By CurrentRecallMassege = By.xpath("//strong[contains(text(),'0 Recalls available')]");
//	browser dealers by make all links
	By allLinksOfBrowserDealersByMake = By.xpath("(//h2[@class='section-heading'])[1]/..//a");
//	Browser By State all links
	By allLinksOfBrowserByState = By.xpath("(//h2[@class='section-heading'])[1]/..//a");
//	verify all links title 
	By verifyTitleForAllLinks = By.xpath("//h2[@class='section-heading']");
//	verify card title and click to call 
	By verifyCardTitleandClickToCall = By.xpath("//h2[@class='section-heading']/..//a");
//	verify card click to chat button 
	By cardClickToChatButton = By.xpath("//h2[@class='section-heading']/..//a");
//	verify pop up title after clicking on card chat button 
	By verifyPopUPTitleAfterClickingOnCardChatButton = By.xpath("//h2[text()='Your conversations']");
//	pop up button 
	By popUpButton = By.xpath("//div[@class='intercom-1ed15uv e2ujk8f3']");

}
