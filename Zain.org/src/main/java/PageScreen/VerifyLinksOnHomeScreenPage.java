package PageScreen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.BasePage;
import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;

public class VerifyLinksOnHomeScreenPage extends LoginPage {
	BasePage b = new BasePage();
	WebDriver driver = b.getWebDriver();

	public ArrayList<String> VerifyRecallNewsPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {

			// open url of page
			testSteps.add("<b>Checked Recall News Page link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.recallNewsPageButton).click();
			testSteps.add("Clicked On Recall News link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Recall News Link is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOfLatestNews), "Recall News Links is working");
			testSteps.add("Verified Recall News Links is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait15Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> VerifyLocateDealerPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {

			// open url of page
			testSteps.add("<b>Checked Locate Dealer Page link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.locateDealerButton).click();
			testSteps.add("Clicked On Locate Dealer Page link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate Dealer Page link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleLocateDealerpage),
					"Locate Dealer Page link is working");
			testSteps.add("Verified Locate Dealer Page link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> verifyloginPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {

			// open url of page
			testSteps.add("<b>Checked login Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Clicked On login Page Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate login Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleLoginpage), "login Page Link is working");
			testSteps.add("Verified login Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> verifyRecallMattersBlogPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			// open url of page
			testSteps.add("<b>Checked Recall Matters Blog Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			WebElement siteInformationRecallMattersBlogLinks = getWebDriver()
					.findElement(HomeScreenELements.siteInformationRecallMattersBlogLinks);
			// This will scroll the page till the element is found
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Waits.wait2Second();
			siteInformationRecallMattersBlogLinks.click();
			testSteps.add("Clicked On Recall Matters Blog Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate Recall Matters Blog Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOfLatestNews),
					"Recall Matters Blog Page Link is working");
			testSteps.add("Verified Recall Matters Blog Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// verify FAQ Page Link
	public ArrayList<String> verifyFAQPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			// open url of page
			testSteps.add("<b>Checked FAQ Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			WebElement siteInformationFAQLinks = getWebDriver().findElement(HomeScreenELements.siteInformationFAQLinks);
			// This will scroll the web page till end.
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Waits.wait2Second();
			siteInformationFAQLinks.click();
			testSteps.add("Clicked On FAQ Page Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate FAQ Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOfFrequentlyAskedQuestions),
					"FAQ Page Link is working");
			testSteps.add("Verified FAQ Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// verify About Us Page Link
	public ArrayList<String> verifyAboutUsPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			// open url of page
			testSteps.add("<b>Checked About Us Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			WebElement siteInformationFAQLinks = getWebDriver()
					.findElement(HomeScreenELements.siteInformationAboutUsLinks);
			// This will scroll the web page till end.
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Waits.wait2Second();
			siteInformationFAQLinks.click();
			testSteps.add("Clicked On About Us Page Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate About Us Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleAboutUsPage), "About Page Link is working");
			testSteps.add("Verified About Us Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// verify Contact Us Page Link
	public ArrayList<String> verifyContactUsPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			// open url of page
			testSteps.add("<b>Checked Contact Us Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			WebElement siteInformationFAQLinks = getWebDriver()
					.findElement(HomeScreenELements.siteInformationContactUsLinks);
			// This will scroll the web page till end.
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Waits.wait2Second();
			siteInformationFAQLinks.click();
			testSteps.add("Clicked On Contact Us Page Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate Contact Us Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleContactUsPage),
					"Contact Page Link is working");
			testSteps.add("Verified Contact Us Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// verify Terms Page Link
	public ArrayList<String> verifyTermsPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			// open url of page
			testSteps.add("<b>Checked Terms Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			WebElement siteInformationFAQLinks = getWebDriver().findElement(HomeScreenELements.termsPageLink);
			// This will scroll the web page till end.
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Waits.wait2Second();
			siteInformationFAQLinks.click();
			testSteps.add("Clicked On Terms Page Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate Terms Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOftermsPage), "Terms Page Link is working");
			testSteps.add("Verified Terms Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// verify Privacy Page Link
	public ArrayList<String> verifyPrivacyPageLink() throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			// open url of page
			testSteps.add("<b>Checked Privacy Page Link</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			WebElement siteInformationFAQLinks = getWebDriver().findElement(HomeScreenELements.termsPageLink);
			// This will scroll the web page till end.
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Waits.wait2Second();
			siteInformationFAQLinks.click();
			testSteps.add("Clicked On Privacy Page Link");
			Waits.wait10Second();

			Waits.wait5Second();
			// verify label is still showing in recall news page
			testSteps.add("Locate Privacy Page Link  is open");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOftermsPage), "Privacy Page Link is working");
			testSteps.add("Verified Privacy Page Link is working");

			testSteps.add("<b>Verify Home Logo of MotorSafety </b>");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

}
