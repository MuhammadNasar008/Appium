package PageScreen;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;

public class ForgetPasswordScreen extends LoginPage {
	public ArrayList<String> forgetPassword(String emailKey, String passwordKey,String NewPassword,String ConfirmPassword,String Scenario) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		
		if(Scenario.contains("Reset Password Button is disabled until user re-enters password to confirm it")) {
			try {
				loadPage(Utility.getValue("loginUrl"));
				
					this.AssertEqual(isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");
					
					this.AssertEqual(isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");
					
					clickLoginOrRegisterIcon();
					testSteps.add("Clicked on <b>login or register icon</b>");
					
					this.AssertEqual(isRemeberMeCheckBoxUnchecked(testSteps),true,"Remeber Me CheckBox is Selected");
					
					this.AssertEqual(isMobileOrEmailFieldPresent(testSteps),true,"Mobile Number or Email Field is not present");
					
				
					enterMobileOrEmail(emailKey,testSteps);
					
				
					this.AssertEqual(isProceedButtonPresent(testSteps),true,"Proceed Button is Not present");
					
					Waits.wait1Second();
					clickProceedButton();
					this.AssertEqual(verifyMobileOrEmailText(testSteps), true, "Email Field is empty");
					testSteps.add("Clicked on <b>proceed button</b>");
					Waits.wait1Second();
					 if(isPasswordFieldPresent(testSteps)&&NewPassword!=""){
							clickForgetButton();
							Waits.wait2Second();
							assertTrue(verifyForgetScreen(testSteps));
							Waits.wait1Second();
							enterOTP();
							Waits.wait1Second();
							assertEquals(VerifyNextButtonIsEnable(testSteps),false,"Next Button is Enable");
							enterPassword(NewPassword,testSteps);
							Waits.wait1Second();
							clickNextButton();
							
							Waits.wait2Second();
							assertTrue(verifyReEnterScreen(testSteps));
							Waits.wait1Second();
							assertEquals(VerifyNextConfirmButtonIsEnable(testSteps),false,"Next Confirm Button is Enable");
							
						}	
					
				}
				catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		else if(Scenario.contains("Next button is disabled until user enters a strong password")
				||Scenario.contains("password has been successfully updated and the user will automatically login to the dashboard.")
				||Scenario.contains("Passwords don't match validation message")){
		try {
		loadPage(Utility.getValue("loginUrl"));
		
			this.AssertEqual(isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");
			
			this.AssertEqual(isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");
			
			clickLoginOrRegisterIcon();
			testSteps.add("Clicked on <b>login or register icon</b>");
			Waits.wait2Second();
			
			this.AssertEqual(isRemeberMeCheckBoxUnchecked(testSteps),true,"Remeber Me CheckBox is Selected");
			
			this.AssertEqual(isMobileOrEmailFieldPresent(testSteps),true,"Mobile Number or Email Field is not present");
			
			Waits.wait2Second();
			enterMobileOrEmail(emailKey,testSteps);
			
		
			this.AssertEqual(isProceedButtonPresent(testSteps),true,"Proceed Button is Not present");
			
			Waits.wait1Second();
			clickProceedButton();
			AssertEqual(verifyMobileOrEmailText(testSteps), true, "Email Field is empty");
			testSteps.add("Clicked on <b>proceed button</b>");
			Waits.wait1Second();
			 if(isPasswordFieldPresent(testSteps)&&NewPassword!=""){
					clickForgetButton();
					Waits.wait2Second();
					assertTrue(verifyForgetScreen(testSteps));
					Waits.wait1Second();
					enterOTP();
					Waits.wait1Second();
					enterPassword(NewPassword,testSteps);
					Waits.wait1Second();
					assertEquals(verifyPasswordFieldLineText(testSteps), true,"Next button is enable when user not enters a strong password");
					clickNextButton();
					Waits.wait2Second();
					assertTrue(verifyReEnterScreen(testSteps));
					Waits.wait1Second();
					enterPassword(ConfirmPassword,testSteps);
					Waits.wait1Second();
					clickNextConfirmButton();
					Waits.wait1Second();
					if(verifyAlertErrorMessage()) {
						String value=getAlertErrorMessage();
						testSteps.add("Get Alert Message <b>"+value+"</b>");
					}
					else {
					AssertEqual(VerifyAfterPasswordChangePopup(testSteps), true, "password has been successfully updated notify is not display");
					AssertEqual(isLoginOrRegisterTextPresent(testSteps), false, "login or register text is not present");
					testSteps.add("Successfully Change Password");
					}
					
				}	
			
		}
		catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}
		}
		else if(Scenario.contains("You have entered a wrong OTP failure message")
				){
		try {
		loadPage(Utility.getValue("loginUrl"));
		
			this.AssertEqual(isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");
			
			this.AssertEqual(isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");
			
			clickLoginOrRegisterIcon();
			testSteps.add("Clicked on <b>login or register icon</b>");
			Waits.wait2Second();
			
			this.AssertEqual(isRemeberMeCheckBoxUnchecked(testSteps),true,"Remeber Me CheckBox is Selected");
			
			this.AssertEqual(isMobileOrEmailFieldPresent(testSteps),true,"Mobile Number or Email Field is not present");
			
			Waits.wait2Second();
			enterMobileOrEmail(emailKey,testSteps);
			
		
			this.AssertEqual(isProceedButtonPresent(testSteps),true,"Proceed Button is Not present");
			
			Waits.wait1Second();
			clickProceedButton();
			AssertEqual(verifyMobileOrEmailText(testSteps), true, "Email Field is empty");
			testSteps.add("Clicked on <b>proceed button</b>");
			Waits.wait1Second();
			 if(isPasswordFieldPresent(testSteps)&&NewPassword!=""){
					clickForgetButton();
					Waits.wait2Second();
					assertTrue(verifyForgetScreen(testSteps));
					Waits.wait1Second();
					enterWrongOTP();
					enterWrongOTP();
					getOTPErrorMessage(testSteps);
					assertEquals(verifyPasswordField(testSteps), false, "Password Field is present With Wrong OTP");
					
				}	
			
		}
		catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}
		}
		
		
		
		return testSteps;
	}
}
