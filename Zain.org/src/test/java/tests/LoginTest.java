package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.ForgetPasswordScreen;
import PageScreen.LoginPageScreen;
import pages.BasePage;
import pages.LoginPage;
import utils.Utility;
import utils.Waits;

public class LoginTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	LoginPageScreen loginPage = new LoginPageScreen();

	@Test(priority = 0)
	public void validateLoginFields() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Login Fields";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to signup page Screen";

//login page Validation

		try {
			Waits.wait2Second();
			testStep.addAll(
					loginPage.checkLoginEmailAndPassword(Utility.getValue("validEmail"), Utility.getValue("password")));

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
	public void singupPage() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Signup Page";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to signup page Screen";

//singUp
		try {
			Waits.wait2Second();

			testStep.addAll(loginPage.signup(Utility.getValue("signupEmailChange"), Utility.getValue("signupPassword"),
					Utility.getValue("signupFirstName"), Utility.getValue("signupLastName"),
					Utility.getValue("signupPhoneNumber"), Utility.getValue("signupVIN"),
					Utility.getValue("signupZipCode"), Utility.getValue("signupcarYear"),
					Utility.getValue("signupcarMake"), Utility.getValue("signupCarModel")));

//login 
//			testStep.addAll(
//					loginPage.loginWithValidEmail(Utility.getValue("valdiEmail"), Utility.getValue("password")));

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
	public void signupExistedAccount() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate Signup Existed Account";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to signup page Screen";

//singUp Existed Account
		try {
			Waits.wait2Second();

			testStep.addAll(loginPage.signupExistedAccount(Utility.getValue("signupEmail"),
					Utility.getValue("signupPassword"), Utility.getValue("signupFirstName"),
					Utility.getValue("signupLastName"), Utility.getValue("signupPhoneNumber"),
					Utility.getValue("signupVIN"), Utility.getValue("signupZipCode"), Utility.getValue("signupcarYear"),
					Utility.getValue("signupcarMake"), Utility.getValue("signupCarModel")));

//login 
//			testStep.addAll(
//					loginPage.loginWithValidEmail(Utility.getValue("valdiEmail"), Utility.getValue("password")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

	@Test(priority = 3)
	public void loginPage() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Login Page";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to signup page Screen";

		try {
			Waits.wait2Second();

//login 
			testStep.addAll(
					loginPage.loginWithValidEmail(Utility.getValue("validEmail"), Utility.getValue("password")));

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