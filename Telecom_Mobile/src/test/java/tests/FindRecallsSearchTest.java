package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.RecallsServiceTodaySearchPageScreen;
import PageScreen.FindRecallsSearchPageScreen;
import PageScreen.LoginPageScreen;
import pages.BasePage;
import utils.Utility;
import utils.Waits;

public class FindRecallsSearchTest extends BaseTest {
	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	FindRecallsSearchPageScreen FindRecallsSearchPage = new FindRecallsSearchPageScreen();

	@Test(priority = 0)
	public void validateLoginFields() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate Find Recalls Search Fields";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to Find Recalls Screen";

//Find Recalls page Validation

		try {
			Waits.wait2Second();
			testStep.addAll(FindRecallsSearchPage.checkFindRecallsSearch(Utility.getValue("findRecallsCarYear"),
					Utility.getValue("findRecallsZipCode"), Utility.getValue("findRecallsCarMake"),
					Utility.getValue("findRecallsCarModel")));

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
	public void checkFindRecallsSearchThroughVIN() throws IOException, InterruptedException, ParseException {

		testStep.clear();
		TestName = "Validate 'Find Recalls' Search Through VIN, Fields";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to Find Recalls Screen";

//Find Recalls page Validation

		try {
			Waits.wait2Second();
			testStep.addAll(FindRecallsSearchPage.checkFindRecallsSearchThroughVIN(Utility.getValue("findRecallsVIN"),
					Utility.getValue("findRecallsZipCode"), Utility.getValue("findRecallsCarMake"),
					Utility.getValue("findRecallsCarModel")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//	@Test(priority = 0)
//	public void validatRecallsSearchFieldMakeAndModelClickFirst()
//			throws IOException, InterruptedException, ParseException {
//
//		testStep.clear();
//		TestName = "validate 'Find Recalls' Search Field Make And Model Click First";
//		TestDescription = "Proceed to Login Screen";
//		TestCatagory = "Proceed to Find Recalls Screen";
//
////Find Recalls page Validation
//
//		try {
//			Waits.wait2Second();
//			testStep.addAll(FindRecallsSearchPage.validatRecallsSearchFieldMakeAndModelClickFirst(
//					Utility.getValue("txtClickDirectOnMakeDropdown"),
//					Utility.getValue("txtClickDirectOnModelDropdown")));
//
//			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			testStep.add("Failed : " + e.toString());
//			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
//			assertTrue(false);
//		} finally {
//		}
//
//	}

}
