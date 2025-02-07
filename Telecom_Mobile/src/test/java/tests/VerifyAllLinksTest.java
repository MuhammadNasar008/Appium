package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.LoginPageScreen;
import PageScreen.VerifyLinksOnHomeScreenPage;
import pages.BasePage;
import utils.Utility;
import utils.Waits;

public class VerifyAllLinksTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	VerifyLinksOnHomeScreenPage homeScreenPage = new VerifyLinksOnHomeScreenPage();

	@Test(priority = 0)
	public void validateLoginFields() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Recall News Link";
		TestDescription = "Proceed to Recall News Screen";
		TestCatagory = "Proceed to Recall News Screen";

//login page Validation

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.VerifyRecallNewsPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

	@Test(priority = 1)
	public void locateDealerPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate locate Dealer Page Link";
		TestDescription = "Proceed to locate Dealer Screen";
		TestCatagory = "Proceed to locate Dealer Screen";

//login page Validation

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.VerifyLocateDealerPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

	@Test(priority = 2)
	public void verifyloginPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate login Page Link";
		TestDescription = "Proceed to login Page Screen";
		TestCatagory = "Proceed to login Page Screen";

//login page Validation

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyloginPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//Recall Matters Blog Page Validation
	@Test(priority = 3)
	public void verifyRecallMattersBlogPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Recall Matters Blog Page Link";
		TestDescription = "Proceed to Recall Matters Blog Page Screen";
		TestCatagory = "Proceed to Recall Matters Blog Page Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyRecallMattersBlogPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//verify FAQ Page Link Validation
	@Test(priority = 4)
	public void verifyFAQPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate FAQ Page Link";
		TestDescription = "Proceed to FAQ Page Screen";
		TestCatagory = "Proceed to FAQ Page Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyFAQPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//verify About Us Page Link
	@Test(priority = 5)
	public void verifyAboutUsPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate About Us Page Link";
		TestDescription = "Proceed to About Us Page Screen";
		TestCatagory = "Proceed to About Us Page Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyAboutUsPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//verify Contact Us Page Link
	@Test(priority = 6)
	public void verifyContactUsPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Contact Us Page Link";
		TestDescription = "Proceed to Contact Us Page Screen";
		TestCatagory = "Proceed to Contact Us Page Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyContactUsPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//verify Terms Page Link
	@Test(priority = 7)
	public void verifyTermsPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Terms Page Link";
		TestDescription = "Proceed to Terms Page Screen";
		TestCatagory = "Proceed to Terms Page Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyTermsPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//verify Privacy Page Link
	@Test(priority = 8)
	public void verifyPrivacyPageLink() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Privacy Page Link";
		TestDescription = "Proceed to Privacy Page Screen";
		TestCatagory = "Proceed to Privacy Page Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(homeScreenPage.verifyPrivacyPageLink());

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

}
