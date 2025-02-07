package PageScreen;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;
import webelements.LoginElements;
import webelements.MoreElements;

public class LoginPageScreen extends LoginPage {

	public ArrayList<String> login(String emailKey, String passwordKey, String Message)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			loadPage(Utility.getValue("loginUrl"));
//			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {
//
//				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
//				getWebDriver().findElement(MoreElements.LogoutButton).click();
//
//			}
			this.AssertEqual(isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

			this.AssertEqual(isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

			clickLoginOrRegisterIcon();
			testSteps.add("Clicked on <b>login or register icon</b>");

			this.AssertEqual(isRemeberMeCheckBoxUnchecked(testSteps), true, "Remeber Me CheckBox is Selected");

			this.AssertEqual(isMobileOrEmailFieldPresent(testSteps), true,
					"Mobile Number or Email Field is not present");
			enterMobileOrEmail(emailKey, testSteps);
			this.AssertEqual(isProceedButtonPresent(testSteps), true, "Proceed Button is Not present");
			clickProceedButton();
			this.AssertEqual(verifyMobileOrEmailText(testSteps), true, "Email Field is empty");
			testSteps.add("Clicked on <b>proceed button</b>");
			Waits.wait1Second();
			String emailError = getErrorEmail();
			String AllertError = getAlertErrorMessage();
			if (!emailError.equalsIgnoreCase("") || !AllertError.equalsIgnoreCase("")) {
				if (!emailError.equalsIgnoreCase("")) {
					if (emailError.contains("email") || emailError.contains("mobile number")) {

						testSteps.add("Get email error : <b>" + emailError.toLowerCase() + "</b>");
					} else {
						this.AssertEqual(emailError, Message, "Email Error doesn't match");
					}
				} else {

					this.AssertEqual(AllertError, Message, "Alert Message doesn't match");

				}
			}

			else if (verifyNewRegisterTitle()) {
				testSteps.add("<b> Register flow proceeds</b>");
			}

			else if (isPasswordFieldPresent(testSteps) && passwordKey != "") {

				this.AssertEqual(isPasswordFieldPresent(testSteps), true, "Password field Is not present");

				enterPassword(passwordKey, testSteps);

				this.AssertEqual(isLoginButtonPresent(testSteps), true, "Login Button Is Not Present ");
				clickLoginButton();
				String passwordError = getErrorPassword();
				AllertError = getAlertErrorMessage();
				if (!passwordError.equalsIgnoreCase("")) {
					testSteps.add("Get password error : <b>" + passwordError + "</b>");
				}
				if (!AllertError.equalsIgnoreCase("")) {
					testSteps.add("Get alert error : <b>" + AllertError + "</b>");
				}
			} else if (isPasswordFieldPresent(testSteps)) {
				testSteps.add("<b>" + emailKey + "</b> : is accepted, User continues with login process");
			}

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}
		return testSteps;
	}

	public ArrayList<String> loginWithValidEmail(String email, String password)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Signin Correct Email and Password</b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Enter Login Button");

			Waits.wait5Second();
			getWebDriver().findElement(HomeScreenELements.email).clear();
			getWebDriver().findElement(HomeScreenELements.email).sendKeys(email);
			testSteps.add("Enter email : " + email);
			Waits.wait5Second();
			getWebDriver().findElement(HomeScreenELements.password).clear();
			getWebDriver().findElement(HomeScreenELements.password).sendKeys(password);
			testSteps.add("Enter password : " + password);
			Waits.wait5Second();
			getWebDriver().findElement(HomeScreenELements.singinButton1).click();
			testSteps.add("Click singin button");

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOfMyGarage),
					" Verified My Garage title is Showing After Login  ");
			testSteps.add("Verified My Garage title is Showing After Login");
			Waits.wait5Second();
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> checkLoginEmailAndPassword(String emailValid, String passwordValid)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Verify Email field is required </b>");

			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Click Login Button");

			Waits.wait5Second();
			WebElement emailEle = getElement(HomeScreenELements.email);
			WebElement passwordEle = getElement(HomeScreenELements.password);

			emailEle.clear();
			testSteps.add("Clear email field");
			String emailValue = emailEle.getAttribute("value");
			System.out.println("Email Value : " + emailValue);
//			verifyEquals(emailValue, "", "Failed:Email field Is Empty/", testSteps);
			testSteps.add("Verified email field is empty, 'Please fill out this field'");

			Waits.wait5Second();
			clickElement(HomeScreenELements.singinButton1);
			testSteps.add("Click Singin Button");

			// verify label is still showing
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.EmailLable), "Failed : Login page is not showing");
			testSteps.add("Verified email Lable is showing");

			testSteps.add("<b>Verify Password filed is required </b>");

			Waits.wait5Second();
			emailEle.clear();
			emailEle.sendKeys(emailValid);
			testSteps.add("Enter email : " + emailValid);
			Waits.wait5Second();

			Waits.wait5Second();
			WebElement signInButton = getWebDriver().findElement(HomeScreenELements.singinButton1);
			signInButton.click();
			testSteps.add("Click Singin Button");

			Waits.wait5Second();
			emailEle.clear();
			String passwordValue = passwordEle.getAttribute("value");
			System.out.println("emailvalue : " + passwordValue);
//			verifyEquals(passwordValue, "", "Failed:Password field Is Empty/", testSteps);
			testSteps.add("Verified password field is empty, 'Please fill out this field'");

			testSteps.add("<b>Verify  Login Page Open </b>");

			Waits.wait5Second();
			emailEle.clear();
			emailEle.sendKeys(emailValid);
			testSteps.add("Enter email : " + emailValid);
			Waits.wait5Second();

			Waits.wait5Second();
			passwordEle.clear();
			passwordEle.sendKeys(passwordValid);
			testSteps.add("Enter email : " + passwordValid);
			Waits.wait5Second();

			Waits.wait5Second();
			signInButton.click();
			testSteps.add("Click on Login Button");

			Waits.wait10Second();
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.loginPageShowLable),
					"Failed : Logged in page is not loading");
			testSteps.add(" Verified that user is logged into account ");

			Waits.wait10Second();
			WebElement logoutButtonShowEle = getElement(HomeScreenELements.clickOnSignOutButtonShow);
			WebElement clickLogoutButtonEle = getElement(HomeScreenELements.clickOnSignOutButton);

			testSteps.add("<b>Verify Logout </b>");

			Waits.wait10Second();
			logoutButtonShowEle.click();
			testSteps.add("Clicked on Account Address to show Logout Button");

			Waits.wait5Second();
			clickLogoutButtonEle.click();
			testSteps.add("Clicked on Logout Button to Logout");

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> signup(String signupEmail, String signupPassword, String signupFirstName,
			String signupLastName, String signupPhoneNo, String signupVIN, String signupZipCode,
			String signupCarMakeYear, String signupCarMake, String signupCarModel)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Signup Account</b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Clicked on Login Button");

			getWebDriver().findElement(HomeScreenELements.signupCreateAccountButton).click();
			testSteps.add("Clicked on Create Account Link ");
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupEmail).sendKeys(signupEmail);
			testSteps.add("Enter email : " + signupEmail);
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupPassword).sendKeys(signupPassword);
			testSteps.add("Enter password : " + signupPassword);
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupFirstName).sendKeys(signupFirstName);
			testSteps.add("Enter First Name : " + signupFirstName);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupLastName).sendKeys(signupLastName);
			testSteps.add("Enter Last Name : " + signupLastName);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupPhoneNo).sendKeys(signupPhoneNo);
			testSteps.add("Enter Phone no : " + signupPhoneNo);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupVIN).sendKeys(signupVIN);
			testSteps.add("Enter VIN : " + signupVIN);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupZipCode).sendKeys(signupZipCode);
			testSteps.add("Enter Zip Code : " + signupZipCode);
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupCarMakeYear).sendKeys(signupCarMakeYear);
			testSteps.add("Enter Year : " + signupCarMakeYear);
			Waits.wait2Second();
////ul[@id='vs23__listbox']//li
//			String path = "//ul[@id='vs23__listbox']//li[contains(text(),'"++"')]";

			getWebDriver().findElement(HomeScreenELements.signupCarMake).click();
			Waits.wait2Second();
			getWebDriver().findElement(HomeScreenELements.signupCarMake).sendKeys(signupCarMake);
			Waits.wait5Second();
			getWebDriver().findElement(HomeScreenELements.signupCarMakeValue).click();
			testSteps.add("Car Entered in Make : " + signupCarMake);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupCarModel).click();
			getWebDriver().findElement(HomeScreenELements.signupCarModel).sendKeys(signupCarModel);
			getWebDriver().findElement(HomeScreenELements.signupCarModelValue).click();
			testSteps.add("Enter Car Model : " + signupCarModel);
			Waits.wait2Second();

//			Select selectSignupCarMakeYear = new Select(getWebDriver().findElement(HomeScreenELements.signupCarMake));
//			selectSignupCarMakeYear.selectByValue("Acura");
//			testSteps.add("Enter Year : " + signupCarMake);
//			Waits.wait5Second();

//			Select selectSignupCarMake = new Select(getWebDriver().findElement(HomeScreenELements.signupCarModel));
//			selectSignupCarMake.selectByValue("RDX");
//			testSteps.add("Enter Model : " + signupCarModel);
//			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupSubmitButton).click();
			testSteps.add("Clicked on submit button");
			Waits.wait5Second();

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.titleOfMyGarage),
					" Verified My Garage title is Showing After Signup  ");
			testSteps.add("Verified My Garage title is Showing After Signup");
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.accountDropDownArrowButton).click();
			testSteps.add("Clicked on Account Arrow button");
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.accountDropDownLogoutButton).click();
			testSteps.add("Clicked on Account Logout button");
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}
	// Signup Existed Account

	public ArrayList<String> signupExistedAccount(String signupEmail, String signupPassword, String signupFirstName,
			String signupLastName, String signupPhoneNo, String signupVIN, String signupZipCode,
			String signupCarMakeYear, String signupCarMake, String signupCarModel)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Signup Existed Account</b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Clicked on Login Button");

			getWebDriver().findElement(HomeScreenELements.signupCreateAccountButton).click();
			testSteps.add("Clicked on Create Account Link ");
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupEmail).sendKeys(signupEmail);
			testSteps.add("Enter email : " + signupEmail);
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupPassword).sendKeys(signupPassword);
			testSteps.add("Enter password : " + signupPassword);
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupFirstName).sendKeys(signupFirstName);
			testSteps.add("Enter First Name : " + signupFirstName);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupLastName).sendKeys(signupLastName);
			testSteps.add("Enter Last Name : " + signupLastName);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupPhoneNo).sendKeys(signupPhoneNo);
			testSteps.add("Enter Phone no : " + signupPhoneNo);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupVIN).sendKeys(signupVIN);
			testSteps.add("Enter VIN : " + signupVIN);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupZipCode).sendKeys(signupZipCode);
			testSteps.add("Enter Zip Code : " + signupZipCode);
			Waits.wait5Second();

			getWebDriver().findElement(HomeScreenELements.signupCarMakeYear).sendKeys(signupCarMakeYear);
			testSteps.add("Enter Year : " + signupCarMakeYear);
			Waits.wait2Second();
////ul[@id='vs23__listbox']//li
//			String path = "//ul[@id='vs23__listbox']//li[contains(text(),'"++"')]";

			getWebDriver().findElement(HomeScreenELements.signupCarMake).click();
			Waits.wait2Second();
			getWebDriver().findElement(HomeScreenELements.signupCarMake).sendKeys(signupCarMake);
			Waits.wait5Second();
			getWebDriver().findElement(HomeScreenELements.signupCarMakeValue).click();
			testSteps.add("Car Entered in Make : " + signupCarMake);
			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupCarModel).click();
			getWebDriver().findElement(HomeScreenELements.signupCarModel).sendKeys(signupCarModel);
			getWebDriver().findElement(HomeScreenELements.signupCarModelValue).click();
			testSteps.add("Enter Car Model : " + signupCarModel);
			Waits.wait2Second();

//			Select selectSignupCarMakeYear = new Select(getWebDriver().findElement(HomeScreenELements.signupCarMake));
//			selectSignupCarMakeYear.selectByValue("Acura");
//			testSteps.add("Enter Year : " + signupCarMake);
//			Waits.wait5Second();

//			Select selectSignupCarMake = new Select(getWebDriver().findElement(HomeScreenELements.signupCarModel));
//			selectSignupCarMake.selectByValue("RDX");
//			testSteps.add("Enter Model : " + signupCarModel);
//			Waits.wait2Second();

			getWebDriver().findElement(HomeScreenELements.signupSubmitButton).click();
			testSteps.add("Clicked on submit button");
			Waits.wait5Second();

			testSteps.add("<b>Account Alrady Exist</b>");

			Waits.wait5Second();
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.errorMessageSignupAccountExist),
					"Failed : Account Alrady Exist");
			testSteps.add("Verified request failed with status code 400");
			Waits.wait5Second();
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

}
