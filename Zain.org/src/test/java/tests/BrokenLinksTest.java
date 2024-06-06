package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.BrokenLinksPageScreen;
import PageScreen.LoginPageScreen;
import pages.BasePage;
import utils.Utility;
import utils.Waits;

public class BrokenLinksTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	BrokenLinksPageScreen brokenLinksPage = new BrokenLinksPageScreen();

	@Test(priority = 4)
	public void validateLinks() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Home Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinks(Utility.getValue("loginUrl")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}
	}

	@Test(priority = 1)
	public void brokenLinksOnLocateDealerPage() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Locate Dealer Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinksOnLocateDealerPage(Utility.getValue("loginUrl")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}

	}

	@Test(priority = 2)
	public void brokenLinksOnRecallNewsPage() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Recall News Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinksOnRecallNewsPage(Utility.getValue("loginUrl")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}

	}

	@Test(priority = 3)
	public void brokenLinksOnLoginPage() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Login Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinksOnLoginPage(Utility.getValue("loginUrl")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}

	}

	@Test(priority = 0)
	public void brokenLinksOnResetPasswordPage() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Reset Password Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinksOnResetPasswordPage(Utility.getValue("loginUrl")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}

	}

	@Test(priority = 5)
	public void brokenLinksOnCreateAccountPage() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Create Account Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinksOnCreateAccountPage(Utility.getValue("loginUrl")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}

	}

	@Test(priority = 6)
	public void brokenLinksOnAfterLoggedInPage() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate All Links On Logged In Page";
		TestDescription = "";
		TestCatagory = "";

		try {
			Waits.wait2Second();
			testStep.addAll(brokenLinksPage.brokenLinksOnAfterLoggedInPage(Utility.getValue("loginUrl"),
					Utility.getValue("validEmail"), Utility.getValue("password")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);

		}

	}
}
