package AllTests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.HelpPageScreen;
import freemarker.core.ParseException;
import pages.BasePage;
import utils.Utility;
import utils.Waits;
import webelements.BaseTest;
public class HelpTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	HelpPageScreen helpPage = new HelpPageScreen();
	ArrayList<String> listOfElement = new ArrayList<String>();

//	
	@Test(priority = 0)
	public void validateHelpTabsValidEmailC24335() throws IOException, InterruptedException, ParseException {
		Scenario = "While loggedin click on Help tab";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24335";
		TestCatagory = "C24335";
		listOfElement.add("Knowledgebase");
		listOfElement.add("How to Contact us");
		listOfElement.add("Open Support Ticket");
		listOfElement.add("Give us Feedback");
		listOfElement.add("Social Media");
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.VerifyListHelp(Utility.getValue("email"), "Test123####", listOfElement, Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}

	@Test(priority = 1)
	public void validateHelpTabsValidEmailC23408() throws IOException, InterruptedException, ParseException {
		Scenario = "While loggedout cick on help tab";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C23408";
		TestCatagory = "C23408";
		listOfElement.add("Knowledgebase");
		listOfElement.add("Open Support Ticket");
		listOfElement.add("Give us Feedback");
		listOfElement.add("Social Media");
		listOfElement.add("How to Contact us");
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.VerifyListHelp("", "", listOfElement, Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
	@Test(priority = 2)
	public void validateHelpTabsC24339() throws IOException, InterruptedException, ParseException {
		Scenario = "While logged out click on How to contact us";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24339";
		TestCatagory = "C24339";
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.Help("", "", Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
	@Test(priority = 3)
	public void validateHelpTabsC24340() throws IOException, InterruptedException, ParseException {
		Scenario = "While loggedin click on How to contact us";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24340";
		TestCatagory = "C24340";
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.Help(Utility.getValue("email"), "Test123####", Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
	@Test(priority = 4)
	public void validateHelpTabsC24573() throws IOException, InterruptedException, ParseException {
		Scenario = "Click on twitter link";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24573";
		TestCatagory = "C24573";
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.Help("", "", Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
	@Test(priority = 5)
	public void validateHelpTabsC24575() throws IOException, InterruptedException, ParseException {
		Scenario = "Click on WhatsApp number link";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24575";
		TestCatagory = "C24575";
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.Help("", "", Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
//	
	
	@Test(priority = 6)
	public void validateHelpTabsC24346() throws IOException, InterruptedException, ParseException {
		Scenario = "Verify FeedBack Status";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24346";
		TestCatagory = "C24346";
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.Help("", "", Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
	
	@Test(priority = 7)
	public void validateHelpTabsC24578() throws IOException, InterruptedException, ParseException {
		Scenario = "Select Great FeedBack Status";
		testStep.clear();
		TestName = Scenario;
		TestDescription = "C24578";
		TestCatagory = "C24578";
		try {
			Waits.wait2Second();
			testStep.addAll(helpPage.Help("", "", Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}

	}
}