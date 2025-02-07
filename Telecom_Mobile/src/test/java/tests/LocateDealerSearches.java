package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import PageScreen.LocateDealerPageScreen;
import PageScreen.LoginPageScreen;
import pages.BasePage;
import utils.Utility;
import utils.Waits;

public class LocateDealerSearches extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	LocateDealerPageScreen loginPage = new LocateDealerPageScreen();


	@Test(priority = 2)
	public void locateDealerLocationSearch() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Locate Dealer Searching Through Location";
		TestDescription = "Proceed to Locate Dealer Screen";
		TestCatagory = "Proceed to Locate Dealer Screen";
//		customReportName = "Locate Dealer Searching Reports";
		try {
			Waits.wait2Second();

			testStep.addAll(loginPage.locateDealerLocationSearch(Utility.getValue("wrongLocaton"),
					Utility.getValue("correctLocation")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}

	@Test(priority = 1)
	public void locateDealerZipCodeSearch() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Locate Dealer Searching Through Zip Code ";
		TestDescription = "Proceed to Locate Dealer Screen";
		TestCatagory = "Proceed to Locate Dealer Screen";

		try {
			Waits.wait2Second();

			testStep.addAll(loginPage.locateDealerZipCodeSearch(Utility.getValue("wrongZipCode"),
					Utility.getValue("correctZipCode")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}

//searching reports 
	@Test(priority = 0)
	public void locateDealerEnter17digitVINNumberSearch() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Locate Dealer Searching Through VIN Number And Zip Code ";
		TestDescription = "Proceed to Locate Dealer Screen";
		TestCatagory = "Proceed to Locate Dealer Screen";
//		customReportName = "Locate Dealer Searching reports";
		try {
			Waits.wait2Second();

			testStep.addAll(loginPage.locateDealerEnter17digitVINNumberSearch(Utility.getValue("lessThen17VINDigits"),
					Utility.getValue("VIN17Digits"), Utility.getValue("lessThen5DigitsZipCode"),
					Utility.getValue("zipCode5Digits")));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
}
