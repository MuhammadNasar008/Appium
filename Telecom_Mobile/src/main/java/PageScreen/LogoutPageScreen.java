package PageScreen;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;
import webelements.LoginElements;
import webelements.MoreElements;

public class LogoutPageScreen extends LoginPage {

	public ArrayList<String> logout(String emailKey, String passwordKey,String NewPassword) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		
		try {
		loadPage(Utility.getValue("loginUrl"));
		   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
           	
           	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
           	getWebDriver().findElement(MoreElements.LogoutButton).click();
           	
           }
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
					enterPassword(NewPassword,testSteps);
					Waits.wait1Second();
					assertEquals(verifyPasswordFieldLineText(testSteps), true,"Next button is enable when user not enters a strong password");
					clickNextButton();
					Waits.wait2Second();
					assertTrue(verifyReEnterScreen(testSteps));
					Waits.wait1Second();
					enterPassword(NewPassword,testSteps);
					Waits.wait1Second();
					clickNextConfirmButton();
					testSteps.add("Successfully Change Password");
				}	
			 else if(isPasswordFieldPresent(testSteps)&&passwordKey!="") {
			
			this.AssertEqual(isPasswordFieldPresent(testSteps),true,"Password field Is not present");
			enterPassword(passwordKey,testSteps);
			testSteps.add("Enter Password : <b>"+passwordKey+"</b>");
			
			this.AssertEqual(isLoginButtonPresent(testSteps),true,"Login Button Is Not Present ");
			clickLoginButton();
			String passwordError=getErrorPassword();
			String AllertError=getAlertErrorMessage();
			if(!passwordError.equalsIgnoreCase("")) {
				testSteps.add("Get password error : <b>"+passwordError+"</b>");
			}
			if(!AllertError.equalsIgnoreCase("")) {
				testSteps.add("Get alert error : <b>"+AllertError+"</b>");
			}
			}
			
		}
		catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}
		return testSteps;
	}
	
}
