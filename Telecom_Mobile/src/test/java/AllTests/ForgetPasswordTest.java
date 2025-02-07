package AllTests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.ForgetPasswordScreen;
import pages.BasePage;
import pages.LoginPage;
import utils.Waits;
import webelements.BaseTest;

public class ForgetPasswordTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	ForgetPasswordScreen forgetPassword=new ForgetPasswordScreen();
	
	@Test(priority = 0)

	public void ForgetPasswordWithC24603() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C24603";
		Email="CodeAutomation@gmail.com";
		TestName="Enter a weak password having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234";
		Scenario="A strength check is made and displayed for user as orange color and the attributes that should be "
				+ "available for a strong password"
				+ "Next button is disabled until user enters a strong password";
		try {
			Waits.wait2Second();
			testStep.addAll(forgetPassword.forgetPassword(Email, "",NewPassword,NewPassword,Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 1)

	public void ForgetPasswordWithC24604() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C24603";
		Email="CodeAutomation@gmail.com";
		TestName="Enter a medium password having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test123#";
		Scenario="A strength check is made and displayed for user as orange color and the attributes that should be "
				+ "available for a strong password"
				+ "Next button is disabled until user enters a strong password";
		try {
			Waits.wait2Second();
			testStep.addAll(forgetPassword.forgetPassword(Email, "",NewPassword,NewPassword,Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 2)

	public void forgetPasswordWithC24605() throws IOException, InterruptedException, ParseException {
		testStep.clear();
	ID="C24605";
		Email="CodeAutomation@gmail.com";
		TestName="Proceed without entering new passwords having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234@";
		Scenario="Next button is disabled until user enters a strong password";
		try {
			Waits.wait2Second();
			testStep.addAll(forgetPassword.forgetPassword(Email, "","","",Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 3)

	public void forgetPasswordWithC24606() throws IOException, InterruptedException, ParseException {
		testStep.clear();
	 ID="C24606";
		Email="CodeAutomation@gmail.com";
		TestName="Proceed without confirming password having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234@";
		Scenario="Reset Password Button is disabled until user re-enters password to confirm it";
		
		try {
			Waits.wait2Second();
			LoginPage loginPage = new LoginPage();
			testStep.addAll(forgetPassword.forgetPassword(Email, "",NewPassword,"",Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 4)

	public void forgetPasswordWithC24607() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C24607";
		Email="CodeAutomation@gmail.com";
		TestName="Proceed with passwords that are not matching having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234@@";
		String ConfirmPassword="Test1234@";
		Scenario="Passwords don't match validation message";
		
		try {
			Waits.wait2Second();
			testStep.addAll(forgetPassword.forgetPassword(Email, "",NewPassword,ConfirmPassword,Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 5)

	public void forgetPasswordWithC24608() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C24608";
		Email="CodeAutomation@gmail.com";
		TestName="Enter wrong OTP<b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test1234@@";
		String ConfirmPassword="Test1234@";
		Scenario="You have entered a wrong OTP failure message";
		
		try {
			Waits.wait2Second();
			testStep.addAll(forgetPassword.forgetPassword(Email, "",NewPassword,ConfirmPassword,Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 6)

	public void ForgetPasswordWithC24600() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		ID="C24600";
		Email="CodeAutomation@gmail.com";
		TestName="Enter Email and click on Forgot password having ID <b> "+ID+"</b>";
		TestDescription=ID;
		TestCatagory=ID;
		NewPassword="Test123####";
		Scenario="User will be notified that the password has been successfully updated and the user will automatically login to the dashboard. ";
		try {
			Waits.wait2Second();
			
			testStep.addAll(forgetPassword.forgetPassword(Email, "",NewPassword,NewPassword,Scenario));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
}
