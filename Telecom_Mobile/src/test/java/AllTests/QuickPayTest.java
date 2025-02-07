package AllTests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import PageScreen.HomeScreen;
import pages.BasePage;
import utils.Utility;
import utils.Waits;
import webelements.BaseTest;
import utils.DataProviderClass;

public class QuickPayTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	HomeScreen homeScreen = new HomeScreen();
	
	@Test(priority = 0)

	public void QuickPayWithC26851() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26851";
		Scenario="Open App without logging in and enter the home screen";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234";
		
		try {
			Waits.wait2Second();
			
			testStep.addAll(homeScreen.VerifyHomeScreen("","", Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(priority = 1)

	public void QuickPayWithC26852() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26852";
		Scenario="Log in and enter the home screen";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234";
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 2)

	public void QuickPayWithC26854() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26854";
		Scenario="Switch between Line types";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(priority = 3)

	public void QuickPayWithC26855() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26855";
		Scenario="Click on Next button without entering MSISDN";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 4)

	public void QuickPayWithC26856() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26856";
		Scenario="Voice - Click next when number entered is less than 7 digits";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 5)

	public void QuickPayWithC26857() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26857";
		Scenario="Voice - Click next when number entered is greater than 8 digits";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 6)

	public void QuickPayWithC26858() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26858";
		Scenario="Voice - Click next when number entered is an invalid number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 7)

	public void QuickPayWithC26859() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26859";
		Scenario="Voice - Click next when number entered is a valid postpaid number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 8)

	public void QuickPayWithC26860() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26860";
		Scenario="Voice - Click next when number entered is a valid postpaid number with a zero prefix";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 9)

	public void QuickPayWithC26861() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26861";
		Scenario="Voice - Click next when number entered is a valid prepaid number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 10)

	public void QuickPayWithC26862() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26862";
		Scenario="Voice - Click next when number entered is a valid prepaid number with a zero prefix";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 11)

	public void QuickPayWithC26974() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26974";
		Scenario="Enter a postpaid Voice Line number and Pay without entering value";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 12)

	public void QuickPayWithC26975() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C26975";
		Scenario="Enter a postpaid Voice Line number and enter zero amount and pay";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 13)

	public void QuickPayWithC27000() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C27000";
		Scenario="Enter a postpaid Data Line number and Pay without entering value";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 14)

	public void QuickPayWithC27001() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C27001";
		Scenario="Enter a postpaid Data Line number and enter zero amount and pay";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 15)

	public void QuickPayWithC27020() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C27020";
		Scenario="Enter a postpaid Fiber Line number and Pay without entering value";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 16)

	public void QuickPayWithC27021() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C27021";
		Scenario="Enter a postpaid Fiber Line number and enter zero amount and pay";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "decimal-Number-Not-Allowed-TestCases", dataProviderClass = DataProviderClass.class,priority = 17)

	public void decimalPointNotAllowed(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		
		Scenario=testCaseId.equals("C26976") ? "Enter decimal amount and pay in Custom Amount for postpaid Voice Line Number" : testCaseId.equals("C27002") ? "Enter decimal amount and pay in Custom Amount for postpaid Data Line Number" : "Enter decimal amount and pay in Custom Amount for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "missing-Data-Validation-Message", dataProviderClass = DataProviderClass.class,priority = 18)

	public void missingDataValidationMessagesForCardDetailsScreen(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		
		Scenario=testCaseId.equals("C26980") ? "Pay with card Empty fields validation for All fields for postpaid Voice Line Number" : testCaseId.equals("C27257") ? "Pay with card Empty fields validation for All fields for prepaid Voice Line Number" : testCaseId.equals("C27287") ? "Pay with card Empty fields validation for All fields for prepaid Data Line Number" : "Pay with card Empty fields validation for All fields for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "missing-Data-Validation-Message-Card-Number", dataProviderClass = DataProviderClass.class,priority = 19)

	public void missingDataValidationMessagesForCardNumberField(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		
		Scenario=testCaseId.equals("C26981") ? "Pay with card Empty fields validation Card number for postpaid Voice Line Number" : testCaseId.equals("C27258") ? "Pay with card Empty fields validation Card number for prepaid Voice Line Number" : testCaseId.equals("C27246") ? "Pay with card Empty fields validation Card number for postpaid Data Line Number" : testCaseId.equals("C27288") ? "Pay with card Empty fields validation Card number for prepaid Data Line Number" : "Pay with card Empty fields validation Card number for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "missing-Data-Validation-Message-Card-Holder-Name", dataProviderClass = DataProviderClass.class,priority = 20)

	public void missingDataValidationMessagesForCardHolderNameField(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		
		Scenario=testCaseId.equals("C26982") ? "Pay with card Empty fields validation Card holder name for postpaid Voice Line Number" : testCaseId.equals("C27259") ? "Pay with card Empty fields validation Card holder name for prepaid Voice Line Number" : testCaseId.equals("C27247") ? "Pay with card Empty fields validation Card holder name for postpaid Data Line Number" : testCaseId.equals("C27289") ? "Pay with card Empty fields validation Card holder name for prepaid Data Line Number" : "Pay with card Empty fields validation Card holder name for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "missing-Data-Validation-Message-Expiry-Date", dataProviderClass = DataProviderClass.class,priority = 21)

	public void missingDataValidationMessagesForExpiryDateField(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		
		Scenario=testCaseId.equals("C26983") ? "Pay with card Empty fields validation Expiry Date for postpaid Voice Line Number" : testCaseId.equals("C27260") ? "Pay with card Empty fields validation Expiry Date for prepaid Voice Line Number" : testCaseId.equals("C27248") ? "Pay with card Empty fields validation Expiry Date for postpaid Data Line Number" : testCaseId.equals("C27290") ? "Pay with card Empty fields validation Expiry Date for prepaid Data Line Number" : "Pay with card Empty fields validation Expiry Date for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "missing-Data-Validation-Message-CVV", dataProviderClass = DataProviderClass.class,priority = 22)

	public void missingDataValidationMessagesForCVVField(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		
		Scenario=testCaseId.equals("C26984") ? "Pay with card Empty fields validation CVV for postpaid Voice Line Number" : testCaseId.equals("C27261") ? "Pay with card Empty fields validation CVV for prepaid Voice Line Number" : testCaseId.equals("C27249") ? "Pay with card Empty fields validation CVV for postpaid Data Line Number" : testCaseId.equals("C27291") ? "Pay with card Empty fields validation CVV for prepaid Data Line Number" : "Pay with card Empty fields validation CVV for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "incomplete-Number-Message", dataProviderClass = DataProviderClass.class,priority = 23)

	public void verifyIncompleteCardNumberMessageIsDisplaying(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C26985") ? "Pay with card Card number less than 16 digits for postpaid Voice Line Number" : testCaseId.equals("C27262") ? "Pay with card Card number less than 16 digits for prepaid Voice Line Number" : testCaseId.equals("C27250") ? "Pay with card Card number less than 16 digits for postpaid Data Line Number" :testCaseId.equals("C27292") ? "Pay with card Card number less than 16 digits for prepaid Data Line Number" : "Pay with card Card number less than 16 digits for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "card-Not-Supported-Number-Message", dataProviderClass = DataProviderClass.class,priority = 23)

	public void verifyCardNotSupportedNumberMessageIsDisplaying(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C26986") ? "Pay with card card number not visa mada mastercard for postpaid Voice Line Number" : testCaseId.equals("C27263") ? "Pay with card card number not visa mada mastercard for prepaid Voice Line Number" : testCaseId.equals("C27251") ? "Pay with card card number not visa mada mastercard for postpaid Data Line Number" :testCaseId.equals("C27293") ? "Pay with card card number not visa mada mastercard for prepaid Data Line Number" : "Pay with card card number not visa mada mastercard for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "transaction-Failed-Error-Message", dataProviderClass = DataProviderClass.class,priority = 24)

	public void transactionFailedErrorMessage(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C26989") ? "Pay with card card number 16 digits and belongs to a valid payment type but is not valid for postpaid Voice Line Number" : testCaseId.equals("C27264") ? "Pay with card card number 16 digits and belongs to a valid payment type but is not valid for prepaid Voice Line Number" : testCaseId.equals("C27252") ? "Pay with card card number 16 digits and belongs to a valid payment type but is not valid for postpaid Data Line Number" :testCaseId.equals("C27294") ? "Pay with card card number 16 digits and belongs to a valid payment type but is not valid for prepaid Data Line Number" : "Pay with card card number 16 digits and belongs to a valid payment type but is not valid for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(dataProvider = "recharge-voucher-Empty-Field-Validation", dataProviderClass = DataProviderClass.class,priority = 25)

	public void rechargeVoucherEmptyFieldValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C27225") ? "Recharge Voucher Empty Field Validation for prepaid Voice Line Number" : "Recharge Voucher Empty Field Validation for prepaid Data Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "invalid-Voucher-Number-Validation", dataProviderClass = DataProviderClass.class,priority = 26)

	public void invalidVoutcherNumberValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C27226") ? "Recharge Voucher short voucher number 5 digits for prepaid Voice Line Number" : "Recharge Voucher short voucher number 5 digits for prepaid Data Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "greater-Than-Fourteen-Digits-Voucher-Number-Validation", dataProviderClass = DataProviderClass.class,priority = 27)

	public void greaterThan14DigitsVoucherNumberValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C27227") ? "Recharge Voucher Long voucher number 20 digits for prepaid Voice Line Number" : "Recharge Voucher Long voucher number 20 digits for prepaid Data Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "success-Screen-Voucher-Number", dataProviderClass = DataProviderClass.class,priority = 28)

	public void successVoucherTransactionDisplayed(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C27227") ? "Recharge Voucher valid voucher for prepaid Voice Line Number" : "Recharge Voucher valid voucher for prepaid Data Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(dataProvider = "recharge-Failed-Voucher-Number", dataProviderClass = DataProviderClass.class,priority = 29)

	public void rechargeFailedMessageDisplayed(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C27227") ? "Recharge voucher Already used voucher for prepaid Voice Line Number" : "Recharge voucher Already used voucher for prepaid Data Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(dataProvider = "fiber-Number-Validation", dataProviderClass = DataProviderClass.class,priority = 30)

	public void invalidFiberNumberValidationMessage(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C26969") ? "Click next when number entered is less than 9 digits for postpaid Fiber Line Number" : testCaseId.equals("C26970") ? "Click next when number entered is greater than 9 digits for postpaid Fiber Line Number" : testCaseId.equals("C26971") ? "Click next when number entered is an invalid number for postpaid Fiber Line Number" : testCaseId.equals("C26973") ? "Click next when number entered is a valid postpaid number with a zero prefix for postpaid Fiber Line Number" : "Click next when number entered is a valid postpaid number for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(dataProvider = "Amount-Validation", dataProviderClass = DataProviderClass.class, priority = 31)

	public void AmountValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID = testCaseId;
		Scenario = testCaseId.equals("C27026") ? "Fiber - Custom amount - enter amount greater that 15 SAR"
				: testCaseId.equals("C27025") ? "Fiber - Transaction failed - Cancel"
				: testCaseId.equals("C27024") ? "Fiber - Transaction Failed - Try again"
				: testCaseId.equals("C27023") ? "Fiber - Custom amount - enter amount less that 15 SAR"
						: "Click next when number entered is a valid postpaid number for postpaid Fiber Line Number";
		Email = "CodeAutomation@gmail.com";
		TestName = Scenario + " having ID <b> " + ID + "</b>";
		TestDescription = ID;
		TestCatagory = ID;
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"),
					Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}
	}

	@Test(dataProvider = "Enter-Number-Validation", dataProviderClass = DataProviderClass.class,priority = 32)

	public void NumberValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C26969") ? "Fiber - Click next when number entered is less than 9 digits":testCaseId.equals("C26973") ? "Fiber - Click next when number entered is a valid postpaid number with a zero prefix":testCaseId.equals("C26972") ? "Fiber - Click next when number entered is a valid postpaid number":testCaseId.equals("C26971") ? "Fiber - Click next when number entered is an invalid number":testCaseId.equals("C26970") ? "Fiber - Click next when number entered is greater than 9 digits":"Click next when number entered is a valid postpaid number for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(dataProvider = "data-Number-Validation", dataProviderClass = DataProviderClass.class,priority = 33)

	public void DatalineNumberValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID=testCaseId;
		Scenario=testCaseId.equals("C26962") ? "Data - Click next when number entered is less than 12 digits":testCaseId.equals("C26963") ? "Data - Click next when number entered is greater than 12 digits":testCaseId.equals("C26964") ? "Data - Click next when number entered is an invalid number":testCaseId.equals("C26965") ? "Data - Click next when number entered is a valid postpaid number":testCaseId.equals("C26966") ? "Data - Click next when number entered is a valid postpaid number with a zero prefix":testCaseId.equals("C26968") ? "Data - Click next when number entered is a valid prepaid number with a zero prefix":testCaseId.equals("C26967") ? "Data - Click next when number entered is a valid prepaid number":"Click next when number entered is a valid postpaid number for postpaid Fiber Line Number";
		Email="CodeAutomation@gmail.com";
		TestName=Scenario +" having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"), Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(dataProvider = "dataandvoiceline-Number-Validation", dataProviderClass = DataProviderClass.class, priority = 34)

	public void DataANDVoicelineNumberValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID = testCaseId;
		Scenario = testCaseId.equals("C26978") ? "Voice - Custom amount - enter amount greater that 15 SAR - Postpaid"
				
				: testCaseId.equals("C27006") ? "Data - Custom amount - enter amount greater that 15 SAR - Postpaid"
				: testCaseId.equals("C27005") ? "Data - Transaction failed - Cancel - Postpaid"
				: testCaseId.equals("C27004") ? "Data - Transaction Failed - Try again - Postpaid"
				: testCaseId.equals("C27003") ? "Data - Custom amount - enter amount less that 15 SAR - Postpaid"
				: testCaseId.equals("C27277") ? "Data - Recharge Data - Predefined amount - Prepaid"
				: testCaseId.equals("C27278") ? "Date - Recharge Data - pay with card - Prepaid"
				: testCaseId.equals("C27280") ? "Data - Recharge Voucher tab - Prepaid"
				: testCaseId.equals("C27275") ? "Data - Recharge balance custom amount - pay with card - Prepaid"
				: testCaseId.equals("C27273") ? "Data - Recharge balance pre-defined amount with card - Prepaid"
				: testCaseId.equals("C27272") ? "Data - Recharge Balance - Custom Amount - Decimal Amount - Prepaid"
				: testCaseId.equals("C27271") ? "Data - Recharge Balance - Custom Amount - Zero Amount - Prepaid"
				: testCaseId.equals("C27270") ? "Data - Recharge Balance - Custom amount - Prepaid"
				: testCaseId.equals("C27269") ? "Data - Recharge Balance - Predefined amount - Prepaid"
				: testCaseId.equals("C27232") ? "Voice - Recharge balance custom amount - pay with card - Prepaid"
				: testCaseId.equals("C27230") ? "Voice - Recharge balance pre-defined amount with card - Prepaid"
				: testCaseId.equals("C26997") ? "Voice - Recharge Balance - Custom Amount - Decimal Amount - Prepaid"
				: testCaseId.equals("C26996") ? "Voice - Recharge Balance - Custom Amount - Zero Amount - Prepaid"
				: testCaseId.equals("C26995") ? "Voice - Recharge Balance - Custom amount - Prepaid"
				: testCaseId.equals("C26994") ? "Voice - Recharge Balance - Predefined amount - Prepaid"
				: testCaseId.equals("C26988") ? "Voice - Transaction failed - Cancel - Postpaid"
				: testCaseId.equals("C26987") ? "Voice - Transaction Failed - Try again - Postpaid"
				: testCaseId.equals("C26977") ? "Voice - Custom amount - enter amount less that 15 SAR - Postpaid"
				: testCaseId.equals("C26998") ? "Voice - Recharge Data - Predefined amount"
						: testCaseId.equals("C27234") ? "Voice - Recharge Data - pay with card"
								: testCaseId.equals("C27224") ? "Voice - Recharge Voucher tab"
										: "Click next when number entered is a valid postpaid number for postpaid Fiber Line Number";
		Email = "CodeAutomation@gmail.com";
		TestName = Scenario + " having ID <b> " + ID + "</b>";
		TestDescription = ID;
		TestCatagory = ID;
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"),
					Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {

			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}
	}
	
	@Test(dataProvider = "PageDesignUI-Validation", dataProviderClass = DataProviderClass.class, priority = 35)

	public void UIDesignValidation(String testCaseId) throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID = testCaseId;
		Scenario = testCaseId.equals("C26846") ? "Voice - Page design - Custom amount is selected - Postpaid"
				
				:testCaseId.equals("C27027") ? "Fiber - Verify pay with card page design is implemented"
				:testCaseId.equals("C27019") ? "Fiber - Page design - Custom amount is selected"
				:testCaseId.equals("C27286") ? "Data - Verify pay with card page design is implemented - Prepaid"
				:testCaseId.equals("C27268") ? "Data - Page design - Data tab is selected - Prepaid"
				:testCaseId.equals("C27007") ? "Data - Verify pay with card page design is implemented - Postpaid"
				:testCaseId.equals("C26999") ? "Data - Page design - Custom amount is selected - Postpaid"
				:testCaseId.equals("C27256") ? "Voice - Verify pay with card page design is implemented - Prepaid"
				:testCaseId.equals("C26847") ? "Voice - Page design - Balance is selected - Prepaid"
				:testCaseId.equals("C26979") ? "Voice - Verify pay with card page design is implemented - Postpaid"
										: "Click next when number entered is a valid postpaid number for postpaid Fiber Line Number";
		Email = "CodeAutomation@gmail.com";
		TestName = Scenario + " having ID <b> " + ID + "</b>";
		TestDescription = ID;
		TestCatagory = ID;
		try {
			Waits.wait2Second();
			testStep.addAll(homeScreen.VerifyHomeScreen(Utility.getValue("email"), Utility.getValue("validPassword"),
					Scenario));
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {

			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		}
	}

}
