package PageScreen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.google.inject.Key;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.FindRecallsSearchElements;
import webelements.HomeScreenELements;
import webelements.LocateDealerPageElements;

public class LocateDealerPageScreen extends LoginPage {
	public ArrayList<String> locateDealerLocationSearch(String wrongLocaton, String correctLocation)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			Waits.wait10Second();
			testSteps.add("<b>Checked Locate Dealer Location Search</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.locateDealerButton).click();
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterLocation).sendKeys(wrongLocaton);
			testSteps.add("Wrong Location Address");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterLocation).clear();
			getWebDriver().findElement(LocateDealerPageElements.enterLocation).sendKeys(correctLocation);
			testSteps.add("Location Address is searching");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.searchLocation2).click();
			testSteps.add("click on Location Address ");
			Waits.wait10Second();

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.findLocationPage), "Your Search is Finded");
			testSteps.add("Your Search is " + correctLocation);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> locateDealerZipCodeSearch(String wrongZipCode, String correctZipCode)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			Waits.wait10Second();
			testSteps.add("<b>Checked Locate Dealer Zip Code Search</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.locateDealerButton).click();
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZip).sendKeys(wrongZipCode);
			testSteps.add("Wrong Zip Code");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZipButton).click();
			Waits.wait5Second();

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.wrongZipCodeTitle),
					"Sorry, We can not find any dealership with ZIPCODE 2000");
			testSteps.add("Wrong Zip Code " + wrongZipCode);
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.MotorSafetyLogoLink).click();
			testSteps.add("Clicked On Motor Safety logo");
			Waits.wait5Second();

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.locateDealerButton).click();
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZip).clear();
			getWebDriver().findElement(LocateDealerPageElements.enterZip).sendKeys(correctZipCode);
			testSteps.add("Dealer Location on Zip Code Address is searching");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZipButton).click();
			testSteps.add("clicked on Zip Code Button ");
			Waits.wait5Second();

			Waits.wait10Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.DealershipWithZipCode),
					"Your Dealerships with ZIP Code Search is Finded ");
			testSteps.add("Your Zip Code Search is " + correctZipCode);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> locateDealerEnter17digitVINNumberSearch(String lessThen17VINDigits, String VIN17Digits,
			String lessThen5DigitZipCode, String ZipCode5Digits) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			Waits.wait10Second();
			testSteps.add("<b>Checked Locate Dealer 'Enter 17 digit VIN Number' Search</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.locateDealerButton).click();
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.Enter17digitVINNumberTxt).sendKeys(lessThen17VINDigits);
			testSteps.add("VIN number is less then 17. please enter 17 digit VIN number");
			Waits.wait5Second();

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.PleaseEnterYour17DigitVINMassege),
					"VIN number is less then 17. please enter 17 digit VIN number");
			testSteps.add("please enter 17 digit VIN number. your VIN number is " + lessThen17VINDigits);
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.Enter17digitVINNumberTxt).clear();
			getWebDriver().findElement(LocateDealerPageElements.Enter17digitVINNumberTxt).sendKeys(VIN17Digits);
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.Enter17digitVINNumberButton).click();
			testSteps.add("Clicked On 'Enter 17 digit VIN Number' Search Button");
			Waits.wait5Second();

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.enter5ZipCodeToContinueMassege),
					"Enter Zip Code To Continue Text Box is shown");
			testSteps.add("Enter Zip Code To Continue Text Box  is shown ");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZipCodeToContinue).clear();
			getWebDriver().findElement(LocateDealerPageElements.enterZipCodeToContinue).sendKeys(lessThen5DigitZipCode);
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZipCodeToContinueButton).click();
			testSteps.add("clicked on Zip Code Continue Button ");
			Waits.wait5Second();

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.PleaseEnterYour5DigitVINMassege),
					"Zip Code number is less then 5. please enter 5 digit Zip Code");
			testSteps.add("please enter 5 digit Zip Code. your Zip Code is " + lessThen5DigitZipCode);
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZipCodeToContinue).clear();
			getWebDriver().findElement(LocateDealerPageElements.enterZipCodeToContinue).sendKeys(ZipCode5Digits);
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(LocateDealerPageElements.enterZipCodeToContinueButton).click();
			testSteps.add("clicked on Zip Code Continue  Button ");
			Waits.wait5Second();

			Waits.wait10Second();
			Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.CurrentRecallMassege),
					"Your Current Recall Information For This Vehicle ");
			testSteps.add("Your Current Recall Information For This Vehicle" + VIN17Digits);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}
}
