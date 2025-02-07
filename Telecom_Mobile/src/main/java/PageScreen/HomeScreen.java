package PageScreen;

import static org.testng.Assert.assertEquals;

import java.awt.print.Printable;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import pages.HomeScreenPage;
import pages.LoginPage;
import utils.Constants;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;
import webelements.LoginElements;
import webelements.MoreElements;

public class HomeScreen extends HomeScreenPage {
	LoginPage loginPage = new LoginPage();
	HomeScreenPage homeScreenPage = new HomeScreenPage();

	public ArrayList<String> VerifyHomeScreen(String emailKey, String passwordKey, String Scenario)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		if (Scenario.contains("Log in and enter the home screen")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

//				Constants.cardHolderName;
				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
//             Actions actions = new Actions(getWebDriver());
//
//             // Scroll Up using Actions class
//             actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
//	
			this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true,
					"login or register text is not present");

			this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true,
					"Login or register icon is not present");
			loginPage.clickLoginOrRegisterIcon();
			testSteps.add("Clicked on <b>login or register icon</b>");

			this.AssertEqual(loginPage.isRemeberMeCheckBoxUnchecked(testSteps), true,
					"Remeber Me CheckBox is Selected");

			this.AssertEqual(loginPage.isMobileOrEmailFieldPresent(testSteps), true,
					"Mobile Number or Email Field is not present");
			loginPage.enterMobileOrEmail(emailKey, testSteps);
			this.AssertEqual(loginPage.isProceedButtonPresent(testSteps), true, "Proceed Button is Not present");
			loginPage.clickProceedButton();
			this.AssertEqual(loginPage.isPasswordFieldPresent(testSteps), true, "Password field Is not present");
			loginPage.enterPassword(passwordKey, testSteps);
			testSteps.add("Enter Password : <b>" + passwordKey + "</b>");

			this.AssertEqual(loginPage.isLoginButtonPresent(testSteps), true, "Login Button Is Not Present ");
			loginPage.clickLoginButton();
			verifyHomeScreen(testSteps);
		}

		else if (Scenario.contains("Open App without logging in and enter the home screen")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true,
					"login or register text is not present");

			this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true,
					"Login or register icon is not present");
			verifyHomeScreen(testSteps);
		}

		else if (Scenario.contains("Switch between Line types")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			clickData();
			testSteps.add("Click On Data Button");
			clickFiber();
			testSteps.add("Click On Fiber Button");
			clickVoice();
			testSteps.add("Click On Voice Button");

		} else if (Scenario.equals("Click on Next button without entering MSISDN")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			homeScreenPage.clickOnNextButton();
			testSteps.add("Verify <b>Missing Data</b> validation message is dispalying after entering : <b>"
					+ Constants.lessThan7DigitsVoiceLineNumber);
			Assert.assertEquals(getElementText(erorMessage).trim(), "Missing data",
					"Failed : Error message is mismatching");
			testSteps.add("Verified Missing data validation message is displaying");
		}

		else if (Scenario.equals("Voice - Click next when number entered is less than 7 digits")
				|| Scenario.equals("Voice - Click next when number entered is greater than 8 digits")
				|| Scenario.equals("Voice - Click next when number entered is an invalid number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			homeScreenPage.enterNumber(Scenario.contains("8 digits") ? Constants.lessThan7DigitsVoiceLineNumber + "123"
					: Constants.lessThan7DigitsVoiceLineNumber);
			homeScreenPage.clickOnNextButton();
			testSteps.add(
					"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : <b>"
							+ Constants.lessThan7DigitsVoiceLineNumber);
			Assert.assertEquals(getElementText(erorMessage).trim(), "You have entered an invalid number",
					"Failed : Error message is mismatching");
			testSteps.add("Verified Missing data validation message is displaying");
		} else if (Scenario.equals("Voice - Click next when number entered is a valid postpaid number") || Scenario
				.equals("Voice - Click next when number entered is a valid postpaid number with a zero prefix")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			homeScreenPage.enterNumber(Scenario.contains("zero prefix") ? "0" + Constants.postpaidVoiceLineNumber
					: Constants.postpaidVoiceLineNumber);
			homeScreenPage.clickOnNextButton();
			testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
			testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			testSteps.add("Verify <b>Custom Amount Tab</b> is displaying");
			Assert.assertTrue(homeScreenPage.isCustomAmountTabCheckedByDefault(),
					"Custom Amount Tab is not displaying");
			testSteps.add("Verified <b>Custom Amount Tab</b> is displaying");
			testSteps.add("Verify <b>Bill Amount Tab</b> is displaying");
			Assert.assertTrue(homeScreenPage.isBillAmountTabDisplayed(), "Bill Amount Tab is not displaying");
			testSteps.add("Verified <b>Bill Amount Tab</b> is displaying");
		} else if (Scenario.equals("Voice - Click next when number entered is a valid prepaid number") || Scenario
				.equals("Voice - Click next when number entered is a valid prepaid number with a zero prefix")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			homeScreenPage.enterNumber(Scenario.contains("zero prefix") ? "0" + Constants.prepaidVoiceLineNumber
					: Constants.prepaidVoiceLineNumber);
			homeScreenPage.clickOnNextButton();
			testSteps.add("Verify <b>Recharge Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
			testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			testSteps.add("Verify <b>Balannce Tab</b> is displaying");
			Assert.assertTrue(homeScreenPage.isBalanceTabDisplayed(), "Balance Tab is not displaying");
			testSteps.add("Verified <b>Balannce Tab</b> is displaying");
			testSteps.add("Verify <b>Data Tab</b> is displaying");
			Assert.assertTrue(homeScreenPage.isDataTabDisplayed(), "Data Tab is not displaying");
			testSteps.add("Verified <b>Data Tab</b> is displaying");
			testSteps.add("Verify <b>Voucher Tab</b> is displaying");
			Assert.assertTrue(homeScreenPage.isDataTabDisplayed(), "Data Tab is not displaying");
			testSteps.add("Verified <b>Voucher Tab</b> is displaying");
		} else if (Scenario.equals("Enter a postpaid Voice Line number and Pay without entering value")
				|| Scenario.equals("Enter a postpaid Voice Line number and enter zero amount and pay")
				|| Scenario.equals("Enter a postpaid Data Line number and Pay without entering value")
				|| Scenario.equals("Enter a postpaid Data Line number and enter zero amount and pay")
				|| Scenario.equals("Enter a postpaid Fiber Line number and Pay without entering value")
				|| Scenario.equals("Enter a postpaid Fiber Line number and enter zero amount and pay")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("Data Line") ? Constants.postpaidDataLineNumber : Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
			testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");

			if (Scenario.contains("Data Line") || Scenario.contains("Fiber Line")) {
				homeScreenPage.clickOnCustomAmountTab();
			}
			if (Scenario.contains("enter zero amount and pay")) {
				testSteps.add("Entered Amount : 0");
				homeScreenPage.enterAmount("0");
			}
			testSteps.add("Verify <b>Pay With Card</b>  is disabled.");
			Assert.assertFalse(homeScreenPage.isPayWithCardButtonIsDisabled(),
					"<b>Pay With Card</b> is enabled without entering value.");
			testSteps.add("Verified <b>Pay With Card</b>  is disabled.");
		} else if (Scenario.equals("Enter decimal amount and pay in Custom Amount for postpaid Voice Line Number")
				|| Scenario.equals("Enter decimal amount and pay in Custom Amount for postpaid Data Line Number")
				|| Scenario.equals("Enter decimal amount and pay in Custom Amount for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("Data Line") ? Constants.postpaidDataLineNumber : Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
			testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");

			if (Scenario.contains("Data Line") || Scenario.contains("Fiber Line")) {
				homeScreenPage.clickOnCustomAmountTab();
			}
			testSteps.add("Entered Amount : 0.25");
			homeScreenPage.enterDecimalcustomAmount();
			testSteps.add("Verify <b>Decimal </b> is not clickable from keyboard.");
			Assert.assertEquals(homeScreenPage.getAmountText(), "025",
					"Failed : Decimal Amount is allowed to enter into custom amount field");
			testSteps.add("Verified <b>Decimal </b> is not clickable from keyboard.");
		} else if (Scenario
				.equals("Pay with card Empty fields validation for All fields for postpaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation for All fields for prepaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation for All fields for prepaid Data Line Number")
				|| Scenario.equals(
						"Pay with card Empty fields validation for All fields for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
									: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			ArrayList<String> missingDataValidationMessages = new ArrayList<String>();
			missingDataValidationMessages.add("card-number");
			missingDataValidationMessages.add("exp-date");
			missingDataValidationMessages.add("cvv");
			missingDataValidationMessages.add("cardholder-name");
			testSteps.add("Verify <b>Missing Data </b> validation message is displaying for all fields");
			for (int i = 0; i < missingDataValidationMessages.size(); i++) {
				testSteps.add("Verify Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
				String path = "//input[@id='" + missingDataValidationMessages.get(i)
						+ "']//..//../div[@class='input-text__error-message']";
				Assert.assertTrue(getWebDriver().findElements(By.xpath(path)).size() > 0,
						"Failed : Missing data validation message is not displaying under "
								+ missingDataValidationMessages.get(i) + " field");
				testSteps.add("Verified Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
			}
		} else if (Scenario.equals("Pay with card Empty fields validation Card number for postpaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation Card number for prepaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation Card number for postpaid Data Line Number")
				|| Scenario.equals("Pay with card Empty fields validation Card number for prepaid Data Line Number")
				|| Scenario
						.equals("Pay with card Empty fields validation Card number for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterExpiryDate(Constants.expiryDate);
			homeScreenPage.enterCVV(Constants.cvv);
			homeScreenPage.enterCardHolderName(Constants.cardHolderName);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			ArrayList<String> missingDataValidationMessages = new ArrayList<String>();
			missingDataValidationMessages.add("card-number");
			for (int i = 0; i < missingDataValidationMessages.size(); i++) {
				testSteps.add("Verify Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
				String path = "//input[@id='" + missingDataValidationMessages.get(i)
						+ "']//..//../div[@class='input-text__error-message']";
				Assert.assertTrue(getWebDriver().findElements(By.xpath(path)).size() > 0,
						"Failed : Missing data validation message is not displaying under "
								+ missingDataValidationMessages.get(i) + " field");
				testSteps.add("Verified Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
			}
		} else if (Scenario
				.equals("Pay with card Empty fields validation Card holder name for postpaid Voice Line Number")
				|| Scenario
						.equals("Pay with card Empty fields validation Card holder name for prepaid Voice Line Number")
				|| Scenario
						.equals("Pay with card Empty fields validation Card holder name for postpaid Data Line Number")
				|| Scenario
						.equals("Pay with card Empty fields validation Card holder name for prepaid Data Line Number")
				|| Scenario.equals(
						"Pay with card Empty fields validation Card holder name for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterCardNumber(Constants.cardNumber);
			homeScreenPage.enterExpiryDate(Constants.expiryDate);
			homeScreenPage.enterCVV(Constants.cvv);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			ArrayList<String> missingDataValidationMessages = new ArrayList<String>();
			missingDataValidationMessages.add("card-number");
			for (int i = 0; i < missingDataValidationMessages.size(); i++) {
				testSteps.add("Verify Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
				String path = "//input[@id='" + missingDataValidationMessages.get(i)
						+ "']//..//../div[@class='input-text__error-message']";
				Assert.assertTrue(getWebDriver().findElements(By.xpath(path)).size() > 0,
						"Failed : Missing data validation message is not displaying under "
								+ missingDataValidationMessages.get(i) + " field");
				testSteps.add("Verified Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
			}
		} else if (Scenario.equals("Pay with card Empty fields validation Expiry Date for postpaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation Expiry Date for prepaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation Expiry Date for postpaid Data Line Number")
				|| Scenario.equals("Pay with card Empty fields validation Expiry Date for prepaid Data Line Number")
				|| Scenario
						.equals("Pay with card Empty fields validation Expiry Date for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterCardNumber(Constants.cardNumber);
			homeScreenPage.enterCVV(Constants.cvv);
			homeScreenPage.enterCardHolderName(Constants.cardHolderName);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			ArrayList<String> missingDataValidationMessages = new ArrayList<String>();
			missingDataValidationMessages.add("card-number");
			for (int i = 0; i < missingDataValidationMessages.size(); i++) {
				testSteps.add("Verify Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
				String path = "//input[@id='" + missingDataValidationMessages.get(i)
						+ "']//..//../div[@class='input-text__error-message']";
				Assert.assertTrue(getWebDriver().findElements(By.xpath(path)).size() > 0,
						"Failed : Missing data validation message is not displaying under "
								+ missingDataValidationMessages.get(i) + " field");
				testSteps.add("Verified Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
			}
		} else if (Scenario.equals("Pay with card Empty fields validation CVV for postpaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation CVV for prepaid Voice Line Number")
				|| Scenario.equals("Pay with card Empty fields validation CVV for postpaid Data Line Number")
				|| Scenario.equals("Pay with card Empty fields validation CVV for prepaid Data Line Number")
				|| Scenario.equals("Pay with card Empty fields validation CVV for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterCardNumber(Constants.cardNumber);
			homeScreenPage.enterExpiryDate(Constants.expiryDate);
			homeScreenPage.enterCardHolderName(Constants.cardHolderName);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			ArrayList<String> missingDataValidationMessages = new ArrayList<String>();
			missingDataValidationMessages.add("card-number");
			for (int i = 0; i < missingDataValidationMessages.size(); i++) {
				testSteps.add("Verify Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
				String path = "//input[@id='" + missingDataValidationMessages.get(i)
						+ "']//..//../div[@class='input-text__error-message']";
				Assert.assertTrue(getWebDriver().findElements(By.xpath(path)).size() > 0,
						"Failed : Missing data validation message is not displaying under "
								+ missingDataValidationMessages.get(i) + " field");
				testSteps.add("Verified Missing data validation message is displaying under "
						+ missingDataValidationMessages.get(i) + " field");
			}
		} else if (Scenario.equals("Pay with card Card number less than 16 digits for postpaid Voice Line Number")
				|| Scenario.equals("Pay with card Card number less than 16 digits for prepaid Voice Line Number")
				|| Scenario.equals("Pay with card Card number less than 16 digits for postpaid Data Line Number")
				|| Scenario.equals("Pay with card Card number less than 16 digits for prepaid Data Line Number")
				|| Scenario.equals("Pay with card Card number less than 16 digits for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterCardNumber(Constants.invalidcardNumber);
			homeScreenPage.enterExpiryDate(Constants.expiryDate);
			homeScreenPage.enterCardHolderName(Constants.cardHolderName);
			homeScreenPage.enterCVV(Constants.cvv);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			testSteps.add("Verify <b>Incomplete card number</b> validation message is displaying on card number field");
			Assert.assertEquals(homeScreenPage.incompleteCardNumberErrorMessage().trim(), "Incomplete card number",
					"Failed : Incomplete card number validation message is not displaying on card number field");
			testSteps.add(
					"Verified <b>Incomplete card number</b> validation message is displaying on card number field");
		} else if (Scenario.equals("Pay with card card number not visa mada mastercard for postpaid Voice Line Number")
				|| Scenario.equals("Pay with card card number not visa mada mastercard for prepaid Voice Line Number")
				|| Scenario.equals("Pay with card card number not visa mada mastercard for postpaid Data Line Number")
				|| Scenario.equals("Pay with card card number not visa mada mastercard for prepaid Data Line Number")
				|| Scenario
						.equals("Pay with card card number not visa mada mastercard for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterCardNumber("1111111111111111");
			homeScreenPage.enterExpiryDate(Constants.expiryDate);
			homeScreenPage.enterCardHolderName(Constants.cardHolderName);
			homeScreenPage.enterCVV(Constants.cvv);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			testSteps.add(
					"Verify <b>This card type is not supported</b> validation message is displaying on card number field");
			Assert.assertEquals(homeScreenPage.incompleteCardNumberErrorMessage().trim(),
					"This card type is not supported",
					"Failed : This card type is not supported validation message is not displaying on card number field");
			testSteps.add(
					"Verified <b>This card type is not supported</b> validation message is displaying on card number field");
		} else if (Scenario.equals(
				"Pay with card card number 16 digits and belongs to a valid payment type but is not valid for postpaid Voice Line Number")
				|| Scenario.equals(
						"Pay with card card number 16 digits and belongs to a valid payment type but is not valid for prepaid Voice Line Number")
				|| Scenario.equals(
						"Pay with card card number 16 digits and belongs to a valid payment type but is not valid for postpaid Data Line Number")
				|| Scenario.equals(
						"Pay with card card number 16 digits and belongs to a valid payment type but is not valid for prepaid Data Line Number")
				|| Scenario.equals(
						"Pay with card card number 16 digits and belongs to a valid payment type but is not valid for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			} else if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("postpaid Voice Line") ? Constants.postpaidVoiceLineNumber
					: Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
							: Scenario.contains("postpaid Data Line") ? Constants.postpaidDataLineNumber
									: Scenario.contains("prepaid Data Line") ? Constants.prepaidDataLineNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (Scenario.contains("postpaid")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
			} else if (Scenario.contains("prepaid")) {
				testSteps.add("Verify <b>Recharge Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
				testSteps.add("Verified <b>Recharge Screen</b> is displaying");
			}
			if (Scenario.contains("prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
			} else if (Scenario.contains("postpaid Voice Line Number")
					|| Scenario.contains("postpaid Fiber Line Number")
					|| Scenario.contains("postpaid Data Line Number")) {
				if (Scenario.contains("postpaid Fiber Line Number") || Scenario.contains("postpaid Data Line Number")) {
					homeScreenPage.clickOnCustomAmountTab();
				}
				homeScreenPage.enterAmount("16");
				homeScreenPage.clickOnPayWithCardButton();
			}
			homeScreenPage.enterCardNumber("5123455555555555");
			homeScreenPage.enterExpiryDate("06/22");
			homeScreenPage.enterCardHolderName("test");
			homeScreenPage.enterCVV("123");
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			Thread.sleep(4000);
			testSteps.add(
					"Verify <b>Transaction Failed</b> validation message is displaying after clicking on pay with card button.");
			Assert.assertTrue(homeScreenPage.isTransactionFailedErrorMessage(),
					"Failed : Transaction Failed validation message is not displaying after clicking on pay with card button");
			testSteps.add(
					"Verified <b>Transaction Failed</b> validation message is displaying after clicking on pay with card button.");
		} else if (Scenario.equals("Recharge Voucher Empty Field Validation for prepaid Voice Line Number")
				|| Scenario.equals("Recharge Voucher Empty Field Validation for prepaid Data Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			}
			homeScreenPage.enterNumber(Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
					: Constants.prepaidDataLineNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Recharge Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
			testSteps.add("Verified <b>Recharge Screen</b> is displaying");

			homeScreenPage.clickOnVoucherTab();
			Assert.assertTrue(homeScreenPage.isSubmitVoucherButtonIsEnabled(),
					"Failed : Voucher submit button is not enabled.");
			homeScreenPage.clickOnSubmitVoucherButton();
			testSteps.add(
					"Verify <b>Missing Data</b> validation message is displaying without entering any voutcher name.");
			Assert.assertEquals(homeScreenPage.getInvalidVoucherNumberMessage(), "Missing Data",
					"Failed : <b>Missing Data</b> validation message is not displaying without entering any voucher name.");
			testSteps.add(
					"Verified <b>Missing Data</b> validation message is displaying without entering any voucher name.");
		} else if (Scenario.equals("Recharge Voucher short voucher number 5 digits for prepaid Voice Line Number")
				|| Scenario.equals("Recharge Voucher short voucher number 5 digits for prepaid Data Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			}
			homeScreenPage.enterNumber(Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
					: Constants.prepaidDataLineNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Recharge Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
			testSteps.add("Verified <b>Recharge Screen</b> is displaying");

			homeScreenPage.clickOnVoucherTab();
			homeScreenPage.enterVoucherName("12345");
			homeScreenPage.clickOnSubmitVoucherButton();
			testSteps.add(
					"Verify <b>Invalid voucher number</b> validation message is displaying after entering invalid voucher number.");
			Assert.assertEquals(homeScreenPage.getInvalidVoucherNumberMessage(), "Invalid voucher number",
					"Failed : <b>Invalid voucher number</b> validation message is not displaying after entering invalid voucher number.");
			testSteps.add(
					"Verified <b>Invalid voucher number</b> validation message is displaying after entering invalid voucher number.");
		} else if (Scenario.equals("Recharge Voucher Long voucher number 20 digits for prepaid Voice Line Number")
				|| Scenario.equals("Recharge Voucher Long voucher number 20 digits for prepaid Data Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			}
			homeScreenPage.enterNumber(Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
					: Constants.prepaidDataLineNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Recharge Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
			testSteps.add("Verified <b>Recharge Screen</b> is displaying");

			homeScreenPage.clickOnVoucherTab();
			homeScreenPage.enterVoucherName("01234567890123456789");
			testSteps.add("Verify <b>More than 14 digits</b> are not allowed in voucher name field");
			Assert.assertEquals(homeScreenPage.getVoucherNameText().trim().length(), 14,
					"Failed :  <b>More than 14 digits</b> are allowed in voucher name field");
			testSteps.add("Verified <b>More than 14 digits</b> are not allowed in voucher name field");
		} else if (Scenario.equals("Recharge Voucher valid voucher for prepaid Voice Line Number")
				|| Scenario.equals("Recharge Voucher valid voucher for prepaid Data Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			}
			homeScreenPage.enterNumber(Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
					: Constants.prepaidDataLineNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Recharge Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
			testSteps.add("Verified <b>Recharge Screen</b> is displaying");

			homeScreenPage.clickOnVoucherTab();
			homeScreenPage.enterVoucherName("79296209393961");
			homeScreenPage.clickOnSubmitVoucherButton();
			Thread.sleep(3000);
			testSteps.add("Verify <b>Success Voucher Screen</b> is displayed");
			Assert.assertEquals(homeScreenPage.getSuccessVoucherMessage(), "Successful voucher recharge.",
					"Failed :  <b>More than 14 digits</b> are allowed in voucher name field");
			testSteps.add("Verify <b>Success Voucher Screen</b> is displayed");
		} else if (Scenario.equals("Recharge voucher Already used voucher for prepaid Voice Line Number")
				|| Scenario.equals("Recharge voucher Already used voucher for prepaid Data Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Data Line")) {
				clickData();
			}
			homeScreenPage.enterNumber(Scenario.contains("prepaid Voice Line") ? Constants.prepaidVoiceLineNumber
					: Constants.prepaidDataLineNumber);
			homeScreenPage.clickOnNextButton();

			testSteps.add("Verify <b>Recharge Screen</b> is displaying");
			Assert.assertTrue(homeScreenPage.isRechargeScreenDisplayed(), "Recharge Screen is not displaying");
			testSteps.add("Verified <b>Recharge Screen</b> is displaying");

			homeScreenPage.clickOnVoucherTab();
			homeScreenPage.enterVoucherName("79296209393961");
			homeScreenPage.clickOnSubmitVoucherButton();
			Thread.sleep(3000);
			testSteps.add("Verify <b>Recharge Failed Screen</b> is displayed");
			Assert.assertEquals(homeScreenPage.getInvalidVoucherNumberMessage().trim(), "Failed : Recharge Failed",
					"Failed : <b>Recharge Failed Screen</b> is not displayed");
			testSteps.add("Verified <b>Recharge Failed Screen</b> is displayed");
		} else if (Scenario
				.equals("Click next when number entered is less than 9 digits for postpaid Fiber Line Number")
				|| Scenario.equals(
						"Click next when number entered is greater than 9 digits for postpaid Fiber Line Number")
				|| Scenario.equals("Click next when number entered is an invalid number for postpaid Fiber Line Number")
				|| Scenario.equals(
						"Click next when number entered is a valid postpaid number with a zero prefix for postpaid Fiber Line Number")
				|| Scenario.equals(
						"Click next when number entered is a valid postpaid number for postpaid Fiber Line Number")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Fiber Line")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("less than 9") ? Constants.lessthan9DigitsFiberNumber
					: Scenario.contains("greater than 9") ? Constants.greaterthan9DigitsFiberNumber
							: Scenario.contains("invalid") ? Constants.invalidFiberNumber
									: Scenario.contains("zero prefix") ? "0" + Constants.fiberNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();

			if (!Scenario.contains("valid postpaid number")) {
				testSteps.add("Verify <b>You have entered an invalid number</b> is displayed");
				Assert.assertEquals(homeScreenPage.getInvalidNumberErrorMessage(), "You have entered an invalid number",
						"Failed : <b>You have entered an invalid number</b> is not displayed");
				testSteps.add("Verified <b>You have entered an invalid number</b> is displayed");
			} else if (Scenario.contains("valid postpaid number")) {
				testSteps.add("Verify <b>Pay Bill Screen</b> is displaying");
				Assert.assertTrue(homeScreenPage.isPayBillScreenDisplayed(), "Pay Bill Screen is not displaying");
				testSteps.add("Verified <b>Pay Bill Screen</b> is displaying");
				testSteps.add("Verify <b>Custom Amount Tab</b> is displaying");
				Assert.assertTrue(homeScreenPage.isCustomAmountTabDisplayed(), "Custom Amount Tab is not displaying");
				testSteps.add("Verified <b>Custom Amount Tab</b> is displaying");
				testSteps.add("Verify <b>Bill Amount Tab</b> is displaying");
				Assert.assertTrue(homeScreenPage.isBillAmountTabDisplayed(), "Bill Amount Tab is not displaying");
				testSteps.add("Verified <b>Bill Amount Tab</b> is displaying");

			}
		}

		else if (Scenario.equalsIgnoreCase("Fiber - Custom amount - enter amount greater that 15 SAR")
				|| Scenario.contains("Fiber - Transaction failed - Cancel")
				|| Scenario.contains("Fiber - Transaction Failed - Try again")
				|| Scenario.contains("Fiber - Custom amount - enter amount less that 15 SAR")) {
			loadPage(Utility.getValue("loginUrl"));
			if (!isElementPresent(LoginElements.LoginOrRegisterText)) {

				getWebDriver().findElement(HomeScreenELements.MoreButton).click();
				getWebDriver().findElement(MoreElements.LogoutButton).click();

			}
			if (Scenario.contains("Fiber")) {
				clickFiber();
			}
			homeScreenPage.enterNumber(Scenario.contains("less than 9") ? Constants.lessthan9DigitsFiberNumber
					: Scenario.contains("greater than 9") ? Constants.greaterthan9DigitsFiberNumber
							: Scenario.contains("invalid") ? Constants.invalidFiberNumber
									: Scenario.contains("zero prefix") ? "0" + Constants.fiberNumber
											: Constants.fiberNumber);
			homeScreenPage.clickOnNextButton();
			if (Scenario.contains("Custom amount")) {
				homeScreenPage.clickOnCustomAmountTab();
			}
			if (Scenario.contains("greater that 15")) {
				homeScreenPage.enterDesireAmount("20");
			} else if (Scenario.contains("less that 15")) {
				homeScreenPage.enterDesireAmount("14");
			}

			homeScreenPage.clickOnPayWithCardButton();
			homeScreenPage.enterCardHolderName(Constants.cardHolderName);
			homeScreenPage.enterCardNumber(Constants.cardNumber);
			homeScreenPage.enterCVV(Constants.cvv);
			homeScreenPage.enterExpiryDate(Constants.expiryDate);
			homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
			if (!Scenario.equalsIgnoreCase("Fiber - Custom amount - enter amount greater that 15 SAR")) {
				try {
					Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
					if (Result.equals(true)) {
						testSteps.add("Navigated To Transaction Failed Screen");
					}
				} catch (Exception e) {
					testSteps.add("Failed: Not Navigate to Transaction Failed Page On <b>PayWithcard Button<b> Click");// TODO:
																														// handle
																														// exception
				}
			} else {
				try {
					Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
					if (Result.equals(true)) {
						testSteps.add("Failed: Navigated To Transaction Failed Screen");
					}
				} catch (Exception e) {
					testSteps.add("Failed: Not Navigate to Success Page On <b>PayWithcard Button<b> Click");// TODO:
																											// handle
																											// exception
				}

			}

		} else if (Scenario.equalsIgnoreCase("Fiber - Click next when number entered is less than 9 digits")
				|| Scenario.equalsIgnoreCase(
						"Fiber - Click next when number entered is a valid postpaid number with a zero prefix")
				|| Scenario.equalsIgnoreCase("Fiber - Click next when number entered is a valid postpaid number")
				|| Scenario.equalsIgnoreCase("Fiber - Click next when number entered is an invalid number")
				|| Scenario.equalsIgnoreCase("Fiber - Click next when number entered is greater than 9 digits")) {
			loadPage(Utility.getValue("loginUrl"));

			if (Scenario.contains("Fiber")) {
				clickFiber();
			}
			if (!Scenario.equalsIgnoreCase("Fiber - Click next when number entered is an invalid number")) {
				homeScreenPage.enterNumber(Scenario.contains("zero prefix") ? "0" + Constants.fiberNumber
						: Scenario.contains("greater than 9") ? Constants.greaterthan9DigitsFiberNumber
								: Scenario.contains("less than 9") ? Constants.lessthan9DigitsFiberNumber
										: Constants.fiberNumber);
			} else {
				homeScreenPage.enterNumber(Constants.invalidFiberNumber);
			}

			homeScreenPage.clickOnNextButton();
			if (Scenario.contains("zero prefix")) {
				try {
					Waits.waitForElementToBeVisibile(erorMessage, driver);
				} catch (Exception e) {
					testSteps.add(
							"Failed: <b>You have entered an invalid number</b> validation message is not displaying after entering : <b>"
									+ "0" + Constants.fiberNumber);
				}
			} else if (Scenario.equalsIgnoreCase("Fiber - Click next when number entered is less than 9 digits")
					|| Scenario.equalsIgnoreCase("Fiber - Click next when number entered is an invalid number")
					|| Scenario.equalsIgnoreCase("Fiber - Click next when number entered is greater than 9 digits")) {
				if (Scenario.equalsIgnoreCase("Fiber - Click next when number entered is greater than 9 digits")) {
					testSteps.add(
							"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : null <b>"
									+ Constants.greaterthan9DigitsFiberNumber);
				} else if (Scenario.equalsIgnoreCase("Fiber - Click next when number entered is less than 9 digits")) {
					testSteps.add(
							"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : null <b>"
									+ Constants.lessthan9DigitsFiberNumber);
				} else {
					testSteps.add(
							"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : null <b>"
									+ Constants.invalidFiberNumber);
				}
				Assert.assertEquals(getElementText(erorMessage).trim(), "You have entered an invalid number",
						"Failed : Error message is mismatching");
				testSteps.add("Verified Missing data validation message is displaying");
			} else {
				try {
					Waits.waitForElementToBeVisibile(customAmountTabLabel, getWebDriver());
					testSteps.add("Custom Amount Tab is Visible On QuickPay Page");
				} catch (Exception e) {
					testSteps.add("Failed: Custom Amount Tab is Not Visible On QuickPay Page");
				}

				try {
					Waits.waitForElementToBeVisibile(billAmountLabel, getWebDriver());
					testSteps.add("Bill Amount Tab is Visible On QuickPay Page");
				} catch (Exception e) {
					testSteps.add("Failed: Bill Amount Tab is Not Visible On QuickPay Page");
				}
			}

		} else if (Scenario.equalsIgnoreCase("Data - Click next when number entered is less than 12 digits")
				|| Scenario.equalsIgnoreCase("Data - Click next when number entered is greater than 12 digits")
				|| Scenario.equalsIgnoreCase("Data - Click next when number entered is an invalid number")
				|| Scenario.equalsIgnoreCase("Data - Click next when number entered is a valid postpaid number")
				|| Scenario.equalsIgnoreCase(
						"Data - Click next when number entered is a valid postpaid number with a zero prefix")
				|| Scenario.equalsIgnoreCase(
						"Data - Click next when number entered is a valid prepaid number with a zero prefix")
				|| Scenario.equalsIgnoreCase("Data - Click next when number entered is a valid prepaid number")) {

			loadPage(Utility.getValue("loginUrl"));

			if (Scenario.contains("Data")) {
				clickData();
			}

			if (Scenario.contains("prepaid number")) {
				homeScreenPage.enterNumber(Scenario.contains("zero prefix") ? "0" + Constants.prepaidDataLineNumber
						: Constants.prepaidDataLineNumber);
			} else if (Scenario.contains("postpaid number")) {
				homeScreenPage.enterNumber(Scenario.contains("zero prefix") ? "0" + Constants.postpaidDataLineNumber
						: Constants.postpaidDataLineNumber);
			} else if (Scenario.contains("invalid number")) {
				homeScreenPage.enterNumber(Constants.invalidDataLineNumber);
			} else {
				homeScreenPage.enterNumber(Scenario.contains("less than 12") ? Constants.lessthan12DigitsDataLineNumber
						: Scenario.contains("greater than 12") ? Constants.greaterthan12DigitsDataLineNumber
								: Constants.prepaidDataLineNumber);
			}

			homeScreenPage.clickOnNextButton();
			if (Scenario.contains("zero prefix")) {
				try {
					Waits.waitForElementToBeVisibile(erorMessage, driver);
				} catch (Exception e) {
					if (Scenario.contains("prepaid number")) {
						testSteps.add(
								"Failed: <b>You have entered an invalid number</b> validation message is not displaying after entering : <b>"
										+ "0" + Constants.prepaidDataLineNumber);
					} else if (Scenario.contains("postpaid number")) {
						testSteps.add(
								"Failed: <b>You have entered an invalid number</b> validation message is not displaying after entering : <b>"
										+ "0" + Constants.postpaidDataLineNumber);
					}

				}
			} else if (Scenario.equalsIgnoreCase("Data - Click next when number entered is less than 12 digits")
					|| Scenario.equalsIgnoreCase("Data - Click next when number entered is greater than 12 digits")
					|| Scenario.equalsIgnoreCase("Data - Click next when number entered is an invalid number")) {
				if (Scenario.equalsIgnoreCase("Data - Click next when number entered is an invalid number")) {
					testSteps.add(
							"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : null <b>"
									+ Constants.invalidDataLineNumber);
				} else if (Scenario
						.equalsIgnoreCase("Data - Click next when number entered is greater than 12 digits")) {
					testSteps.add(
							"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : null <b>"
									+ Constants.greaterthan12DigitsDataLineNumber);
				} else if (Scenario.equalsIgnoreCase("Data - Click next when number entered is less than 12 digits")) {
					testSteps.add(
							"Verify <b>You have entered an invalid number</b> validation message is dispalying after entering : null <b>"
									+ Constants.lessthan12DigitsDataLineNumber);
				}

				Assert.assertEquals(getElementText(erorMessage).trim(), "You have entered an invalid number",
						"Failed : Error message is mismatching");
				testSteps.add("Verified Missing data validation message is displaying");
			} else {
				if (Scenario.contains("prepaid number")) {
					try {
						Waits.waitForElementToBeVisibile(dataTabLabel, getWebDriver());
						testSteps.add("Data Tab is Visible On Recharge Page");
					} catch (Exception e) {
						testSteps.add("Failed: Data Tab is Not Visible On Recharge Page");
					}

					try {
						Waits.waitForElementToBeVisibile(balanceTabLabel, getWebDriver());
						testSteps.add("Balance Tab is Visible On Recharge Page");
					} catch (Exception e) {
						testSteps.add("Failed: Balance Tab is Not Visible On Recharge Page");
					}
					try {
						Waits.waitForElementToBeVisibile(voucherTabLabel, getWebDriver());
						testSteps.add("Voucher Tab is Visible On Recharge Page");
					} catch (Exception e) {
						testSteps.add("Failed: Voucher Tab is Not Visible On Recharge Page");
					}

				} else if (Scenario.contains("postpaid number")) {
					try {
						Waits.waitForElementToBeVisibile(customAmountTabLabel, getWebDriver());
						testSteps.add("Custom Amount Tab is Visible On QuickPay Page");
					} catch (Exception e) {
						testSteps.add("Failed: Custom Amount Tab is Not Visible On QuickPay Page");
					}

					try {
						Waits.waitForElementToBeVisibile(billAmountLabel, getWebDriver());
						testSteps.add("Bill Amount Tab is Visible On QuickPay Page");
					} catch (Exception e) {
						testSteps.add("Failed: Bill Amount Tab is Not Visible On QuickPay Page");
					}
				}

			}
		} else if (Scenario.equalsIgnoreCase("Voice - Custom amount - enter amount greater that 15 SAR - Postpaid")

				|| Scenario.equalsIgnoreCase("Data - Custom amount - enter amount greater that 15 SAR - Postpaid")
				|| Scenario.equalsIgnoreCase("Data - Transaction failed - Cancel - Postpaid")
				|| Scenario.equalsIgnoreCase("Data - Transaction Failed - Try again - Postpaid")
				|| Scenario.equalsIgnoreCase("Data - Custom amount - enter amount less that 15 SAR - Postpaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge Data - Predefined amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Date - Recharge Data - pay with card - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge Voucher tab - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge balance custom amount - pay with card - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge balance pre-defined amount with card - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge Balance - Custom Amount - Decimal Amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge Balance - Custom Amount - Zero Amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge Balance - Custom amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Recharge Balance - Predefined amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge balance custom amount - pay with card - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge balance pre-defined amount with card - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Balance - Custom Amount - Decimal Amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Balance - Custom Amount - Zero Amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Balance - Custom amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Balance - Predefined amount - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Transaction Failed - Try again - Postpaid")
				|| Scenario.equalsIgnoreCase("Voice - Transaction failed - Cancel - Postpaid")
				|| Scenario.equalsIgnoreCase("Voice - Custom amount - enter amount less that 15 SAR - Postpaid")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Data - Predefined amount")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Data - pay with card")
				|| Scenario.equalsIgnoreCase("Voice - Recharge Voucher tab")) {

			loadPage(Utility.getValue("loginUrl"));

			if (Scenario.contains("Voice")) {
				clickVoice();
			} else if (Scenario.contains("Data")) {
				clickData();
			}
			if (Scenario.contains("Postpaid")) {
				if (Scenario.contains("Voice")) {
					homeScreenPage.enterNumber(Constants.postpaidVoiceLineNumber);
				} else if (Scenario.contains("Data")) {
					homeScreenPage.enterNumber(Constants.postpaidDataLineNumber);
				}

			} else {
				if (Scenario.contains("Voice")) {
					homeScreenPage.enterNumber(Constants.prepaidVoiceLineNumber);
				} else if (Scenario.contains("Data")) {
					homeScreenPage.enterNumber(Constants.prepaidDataLineNumber);
				}

			}

			homeScreenPage.clickOnNextButton();
			if (Scenario.contains("Recharge Data")) {
				homeScreenPage.clickData();
			} else if (Scenario.contains("Recharge Voucher")) {
				homeScreenPage.clickOnVoucherTab();
			} else if (Scenario.contains("Recharge Balance") || Scenario.contains("Recharge balance")) {
				homeScreenPage.clickOnBalanceTab();
			}

			if (Scenario.equalsIgnoreCase("Voice - Recharge Voucher tab")) {
				try {
					Waits.waitForElementToBeClickable(voucherTabInput, getWebDriver());
					homeScreenPage.enterVoucherName("1234");
					testSteps.add("Voucher Input Field Is Displayed");
				} catch (Exception e) {
					testSteps.add("Voucher Input Field Is Not Displayed");
				}
				try {
					Waits.waitForElementToBeClickable(submitVoucherTabButton, getWebDriver());
					testSteps.add("Submit Button Is Displayed");
				} catch (Exception e) {
					testSteps.add("Submit Button Is Displayed");
				}
			} else if (Scenario.equalsIgnoreCase("Data - Recharge Voucher tab - Prepaid")) {
				Boolean InputField = homeScreenPage.Vouchertab_VoucherNumberField();
				if (InputField == true) {
					testSteps.add("Voucher number field is Present");
				}
//				homeScreenPage.enterVoucherName("12345");
				Boolean SubmitButton = homeScreenPage.Vouchertab_SubmitButton();
				if (SubmitButton == true) {
					testSteps.add("Submit Button is Present");
				}

			} else if (Scenario
					.equalsIgnoreCase("Data - Custom amount - enter amount greater that 15 SAR - Postpaid")) {
				homeScreenPage.clickOnCustomAmountTab();
				homeScreenPage.enterDesireAmount("20");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Screen is Displayed");
				}

			} else if (Scenario.equalsIgnoreCase("Data - Transaction failed - Cancel - Postpaid")) {
				homeScreenPage.clickOnCustomAmountTab();
				homeScreenPage.enterDesireAmount("40");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Transaction Failed Screen is Displayed");
				}
				testSteps.add("Failed: Cancel Button Not Found");
			} else if (Scenario.equalsIgnoreCase("Data - Transaction Failed - Try again - Postpaid")) {
				homeScreenPage.clickOnCustomAmountTab();
				homeScreenPage.enterDesireAmount("40");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Transaction Failed Screen is Displayed");
				}
				testSteps.add("Failed: Try Again Button Not Found");
			} else if (Scenario.equalsIgnoreCase("Data - Recharge Data - Predefined amount - Prepaid")) {
				homeScreenPage.choosePreDefinedData();
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				String DataRecharge = homeScreenPage.getCardDetailsDataRechargeAmountValue();
				testSteps.add("Data Recharge: <b>" + DataRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				testSteps.add("VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				String ExpectedAmount = String.valueOf(Double.valueOf(DataRecharge) + Double.valueOf(VATAmount));
				assertEquals(String.valueOf(Double.valueOf(TotalPaymentAmount)), ExpectedAmount,
						"Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
			} else if (Scenario.equalsIgnoreCase("Date - Recharge Data - pay with card - Prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String DataRecharge = homeScreenPage.getCardDetailsDataRechargeAmountValue();
				testSteps.add("Data Recharge: <b>" + DataRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				testSteps.add("VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				String ExpectedAmount = String.valueOf(Double.valueOf(DataRecharge) + Double.valueOf(VATAmount));
				assertEquals(String.valueOf(Double.valueOf(TotalPaymentAmount)), ExpectedAmount,
						"Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Screen Error");
				}
			} else if (Scenario.equalsIgnoreCase("Data - Custom amount - enter amount less that 15 SAR - Postpaid")) {
				homeScreenPage.clickOnCustomAmountTab();
				homeScreenPage.enterDesireAmount("15");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Transaction Failed Screen is Displayed");
				}
				String ExpectedMessage = "The minimum amount to pay is 15 SAR";
				Boolean Message;
				try {
					Message = homeScreenPage.isMessageDisplay(ExpectedMessage);
					testSteps.add("Message Successfully Display On Screen: <b>" + ExpectedMessage);
				} catch (Exception e) {
					testSteps.add("Failed: To Match Required text: <b>" + ExpectedMessage);
				}

			} else if (Scenario.equalsIgnoreCase("Data - Recharge balance custom amount - pay with card - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("22");
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "22.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "3.30", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				String ExpectedAmount = String.valueOf(Double.valueOf(BalanceRecharge) + Double.valueOf(VATAmount));
				assertEquals(String.valueOf(Double.valueOf(TotalPaymentAmount)), ExpectedAmount,
						"Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Screen Error");
				}
			} else if (Scenario.equalsIgnoreCase("Data - Recharge balance pre-defined amount with card - Prepaid")) {
				homeScreenPage.select50SARBalance();
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "50.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "7.50", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				String ExpectedAmount = String.valueOf(Double.valueOf(BalanceRecharge) + Double.valueOf(VATAmount));
				assertEquals(String.valueOf(Double.valueOf(TotalPaymentAmount)), ExpectedAmount,
						"Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Screen Error");
				}
			} else if (Scenario
					.equalsIgnoreCase("Data - Recharge Balance - Custom Amount - Decimal Amount - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("0.25");
				String Amount = homeScreenPage.getAmountValue();
				AssertEqual(Amount, "025", "Failed:  to mismatch amount");
				testSteps.add("Decimal Point is Not Clickable");
			} else if (Scenario.equalsIgnoreCase("Data - Recharge Balance - Custom Amount - Zero Amount - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("0");
				Boolean isClickable = isclickableButton(payWithCardButtonOnCardDetailsScreen);
				if (isClickable == true) {
					homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
					testSteps.add("Failed: <b>You need to type an amount to be able to proceed<b> Not Display");
				} else {
					testSteps.add("Failed: Button is Disable");
				}

			} else if (Scenario.equalsIgnoreCase("Data - Recharge Balance - Custom amount - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("22");
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "22.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "3.30", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				assertEquals(TotalPaymentAmount, "25.30", "Failed: to match Total Payment Required");
				testSteps.add("Verified: Total Payment Required: <b>" + TotalPaymentAmount);
			} else if (Scenario.equalsIgnoreCase("Data - Recharge Balance - Predefined amount - Prepaid")) {
				homeScreenPage.select50SARBalance();
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "50.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "7.50", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				assertEquals(TotalPaymentAmount, "57.50", "Failed: to match Total Payment");
				testSteps.add("Verified: Total payment Required: <b>" + TotalPaymentAmount);
			} else if (Scenario.equalsIgnoreCase("Voice - Recharge balance custom amount - pay with card - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("22");
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "22.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "3.30", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				String ExpectedAmount = String.valueOf(Double.valueOf(BalanceRecharge) + Double.valueOf(VATAmount));
				assertEquals(String.valueOf(Double.valueOf(TotalPaymentAmount)), ExpectedAmount,
						"Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Screen Error");
				}
			} else if (Scenario.equalsIgnoreCase("Voice - Recharge balance pre-defined amount with card - Prepaid")) {
				homeScreenPage.select50SARBalance();
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "50.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "7.50", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				String ExpectedAmount = String.valueOf(Double.valueOf(BalanceRecharge) + Double.valueOf(VATAmount));
				assertEquals(String.valueOf(Double.valueOf(TotalPaymentAmount)), ExpectedAmount,
						"Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Screen Error");
				}

			} else if (Scenario
					.equalsIgnoreCase("Voice - Recharge Balance - Custom Amount - Decimal Amount - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("0.25");
				String Amount = homeScreenPage.getAmountValue();
				AssertEqual(Amount, "025", "Failed:  to mismatch amount");
				testSteps.add("Decimal Point is Disabled");

			} else if (Scenario.equalsIgnoreCase("Voice - Recharge Balance - Custom amount - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("22");
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "22.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "3.30", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				assertEquals(TotalPaymentAmount, "25.30", "Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);
			} else if (Scenario.equalsIgnoreCase("Voice - Recharge Balance - Custom Amount - Zero Amount - Prepaid")) {
				homeScreenPage.selectCustomBalance();
				homeScreenPage.enterAmount("0");
				Boolean IsClick = homeScreenPage.isclickableButton(payWithCardButtonOnCardDetailsScreen);
				if (IsClick == false) {
					testSteps.add("Failed: Button is Disable");
				} else {
					homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
					testSteps.add("Failed: <b>You need to type an amount to be able to proceed<b> Not Displayed");
				}
			}

			else if (Scenario.equalsIgnoreCase("Voice - Recharge Balance - Predefined amount - Prepaid")) {
				homeScreenPage.select50SARBalance();
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				String BalanceRecharge = homeScreenPage.getCardDetailsBalanceRechargeAmountValue();
				assertEquals(BalanceRecharge, "50.00", "Failed: to match DataRecharge Amount");
				testSteps.add("Verified: Balance Recharge: <b>" + BalanceRecharge);
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				assertEquals(VATAmount, "7.50", "Failed: to match VAT Amount");
				testSteps.add("Verified: VAT charge: <b>" + VATAmount);
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();
				assertEquals(TotalPaymentAmount, "57.50", "Failed: to match TotalPayment ");
				testSteps.add("Verified: Total Payment: <b>" + TotalPaymentAmount);

			}

			else if (Scenario.equalsIgnoreCase("Voice - Transaction Failed - Try again - Postpaid")) {
				homeScreenPage.enterDesireAmount("20");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: try Again Button Not found");
				}

			} else if (Scenario.equalsIgnoreCase("Voice - Transaction failed - Cancel - Postpaid")) {
				homeScreenPage.enterDesireAmount("20");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("failed: Cancel Button Not found");
				}

			} else if (Scenario.equalsIgnoreCase("Voice - Custom amount - enter amount less that 15 SAR - Postpaid")) {
				homeScreenPage.enterDesireAmount("14");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean IsErrorDisplayed = homeScreenPage.isMinimumAmountErrorMessage();
				if (IsErrorDisplayed == true) {
					testSteps.add("Error: ===The minimum amount to pay is 15 SAR=== Displayed");

				}

			} else if (Scenario
					.equalsIgnoreCase("Voice - Custom amount - enter amount greater that 15 SAR - Postpaid")) {
				homeScreenPage.enterDesireAmount("20");
				homeScreenPage.clickOnPayWithCardButton();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Error");
				}

			} else if (Scenario.equalsIgnoreCase("Voice - Recharge Data - pay with card")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				homeScreenPage.enterCardHolderName(Constants.cardHolderName);
				homeScreenPage.enterCardNumber(Constants.cardNumber);
				homeScreenPage.enterCVV(Constants.cvv);
				homeScreenPage.enterExpiryDate(Constants.expiryDate);
				String DataRecharge = homeScreenPage.getCardDetailsDataRechargeAmountValue();
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();

				assertEquals(TotalPaymentAmount,
						String.valueOf(Double.valueOf(DataRecharge) + Double.valueOf(VATAmount)),
						"Failed: Amount mismatch");

				homeScreenPage.clickOnPayWithCardButtonOnCardDetailsPage();
				Boolean Result = homeScreenPage.isTransactionFailedErrorMessage();
				if (Result.equals(true)) {
					testSteps.add("Failed: Transaction Failed Error");
				} else {
					testSteps.add("Success Message Screen Displayed");
				}

			} else if (Scenario.equalsIgnoreCase("Voice - Recharge Data - Predefined amount")) {
				homeScreenPage.choosePreDefinedData();
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				String DataRecharge = homeScreenPage.getCardDetailsDataRechargeAmountValue();
				String VATAmount = homeScreenPage.getCardDetailsVATAmountValue();
				String TotalPaymentAmount = homeScreenPage.getCardDetailsTotalPaymentAmountValue();

				testSteps.add("DataRecharge: " + DataRecharge + "\n" + "VATAmount: " + VATAmount + "\n"
						+ "TotalPaymentAmount: " + TotalPaymentAmount);

			}

		}
		else if (Scenario.equalsIgnoreCase("Voice - Page design - Custom amount is selected - Postpaid")
				
				|| Scenario.equalsIgnoreCase("Fiber - Verify pay with card page design is implemented")
				|| Scenario.equalsIgnoreCase("Fiber - Page design - Custom amount is selected")
				|| Scenario.equalsIgnoreCase("Data - Verify pay with card page design is implemented - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Page design - Data tab is selected - Prepaid")
				|| Scenario.equalsIgnoreCase("Data - Verify pay with card page design is implemented - Postpaid")
				|| Scenario.equalsIgnoreCase("Data - Page design - Custom amount is selected - Postpaid")
				|| Scenario.equalsIgnoreCase("Voice - Verify pay with card page design is implemented - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Page design - Balance is selected - Prepaid")
				|| Scenario.equalsIgnoreCase("Voice - Verify pay with card page design is implemented - Postpaid")) {

			loadPage(Utility.getValue("loginUrl"));

			if (Scenario.contains("Voice")) {
				clickVoice();
			} else if (Scenario.contains("Data")) {
				clickData();
			} else if (Scenario.contains("Fiber")) {
				clickFiber();
			}
			if (Scenario.contains("Postpaid")) {
				if (Scenario.contains("Voice")) {
					homeScreenPage.enterNumber(Constants.postpaidVoiceLineNumber);
				} else if (Scenario.contains("Data")) {
					homeScreenPage.enterNumber(Constants.postpaidDataLineNumber);
				}

			} else if (Scenario.contains("Prepaid")) {
				if (Scenario.contains("Voice")) {
					homeScreenPage.enterNumber(Constants.prepaidVoiceLineNumber);
				} else if (Scenario.contains("Data")) {
					homeScreenPage.enterNumber(Constants.prepaidDataLineNumber);
				}
			}else {
				homeScreenPage.enterNumber(Constants.fiberNumber);
			}

			homeScreenPage.clickOnNextButton();
			if (Scenario.contains("Recharge Data")) {
				homeScreenPage.clickData();
			} else if (Scenario.contains("Recharge Voucher")) {
				homeScreenPage.clickOnVoucherTab();
			} else if (Scenario.contains("Recharge Balance") || Scenario.contains("Recharge balance")) {
				homeScreenPage.clickOnBalanceTab();
			}

			if (Scenario.equalsIgnoreCase("Voice - Page design - Custom amount is selected - Postpaid")) {
				try {
					homeScreenPage.isCustomAmountField();
					testSteps.add("Custom Amount Tab Is Selected By Default");
				} catch (Exception e) {
					testSteps.add("Failed: Custom Amount Tab Is Not Selected By Default");
				}

			}
			else if (Scenario.equalsIgnoreCase("Fiber - Page design - Custom amount is selected")) {
				try {
					homeScreenPage.isCustomAmountField();
					testSteps.add("Custom Amount Tab Is Selected By Default");
				} catch (Exception e) {
					testSteps.add("Failed: Custom Amount Tab Is Not Selected By Default");
				}
			}
			else if (Scenario.equalsIgnoreCase("Data - Page design - Data tab is selected - Prepaid")) {
				try {
					homeScreenPage.isElementPresent(PredefinedDatapackage);
					testSteps.add("Data Tab Is Selected By Default");
				} catch (Exception e) {
					testSteps.add("Failed: Data Tab Is Not Selected By Default");
				}
			}
			else if (Scenario.equalsIgnoreCase("Data - Page design - Custom amount is selected - Postpaid")) {
				try {
					homeScreenPage.isCustomAmountField();
					testSteps.add("Custom Amount Tab Is Selected By Default");
				} catch (Exception e) {
					testSteps.add("Failed: Custom Amount Tab Is Not Selected By Default");
				}
				
			}
			else if (Scenario.equalsIgnoreCase("Voice - Page design - Balance is selected - Prepaid")) {
				try {
					homeScreenPage.isElementPresent(SAR50_Balance);
					testSteps.add("Verified: <b>Balance<b> is selected By Default");
				} catch (Exception e) {
					testSteps.add("Failed: <b>Balance<b> is not selected By Default");
				}
				
			}
			else if (Scenario.equalsIgnoreCase("Fiber - Verify pay with card page design is implemented")) {
				homeScreenPage.clickOnCustomAmountTab();
				homeScreenPage.enterDesireAmount("100");
				homeScreenPage.clickOnPayWithCardButton();
				
				//CardDetails
				testSteps.add("=========Card UI Verifications========");
				//title verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalTitle);
					testSteps.add("Verified Title Element is Found: <b>"+homeScreenPage.getCardDetailsTitle());
				} catch (Exception e) {
					testSteps.add("Failed: Title Element is not Found");
				}
				//Subtitle verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalSubTitle);
					testSteps.add("Verified SubTitle Element is Found: <b>"+homeScreenPage.getCardDetailsSubTitle());
				} catch (Exception e) {
					testSteps.add("Failed: SubTitle Element is not Found");
				}
				//cardAmount
				try {
					homeScreenPage.isElementPresent(CardDetailsModalAmount);
					
					testSteps.add("Verified Amount is Found: <b>"+homeScreenPage.getCardDetailsAmount());
				} catch (Exception e) {
					testSteps.add("Failed: Amount is not Found");
				}
				
				//Button verification
				try {
					homeScreenPage.isElementPresent(submitButtonOnCardDetailsPage_1);
					testSteps.add("Verified Pay button is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Pay button is not Found");
				}
				
				
				//CardHolderNameField
				try {
					homeScreenPage.isElementPresent(cardHolderNameField);
					testSteps.add("Verified Card Holder Name Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Card Holder Name Field is not Found");
				}
				//CardCVVField
				try {
					homeScreenPage.isElementPresent(cvvField);
					testSteps.add("Verified CVV Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: CVV Field is not Found");
				}
				//CardNumberField
				try {
					homeScreenPage.isElementPresent(cardNumberField);
					testSteps.add("Verified card Number Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: card Number Field is not Found");
				}
				
				//CardExpirydateField
				try {
					homeScreenPage.isElementPresent(expiryDateField);
					testSteps.add("Verified Expiry Date Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Expiry Date Field is not Found");
				}
				
			}
			else if (Scenario.equalsIgnoreCase("Data - Verify pay with card page design is implemented - Prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				//CardDetails
				testSteps.add("=========Card UI Verifications========");
				//title verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalTitle);
					testSteps.add("Verified Title Element is Found: <b>"+homeScreenPage.getCardDetailsTitle());
				} catch (Exception e) {
					testSteps.add("Failed: Title Element is not Found");
				}
				//Subtitle verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalSubTitle);
					testSteps.add("Verified SubTitle Element is Found: <b>"+homeScreenPage.getCardDetailsSubTitle());
				} catch (Exception e) {
					testSteps.add("Failed: SubTitle Element is not Found");
				}
				//Data Recharge
				try {
					homeScreenPage.isElementPresent(CardDetailsDataChargeAmount);
					testSteps.add("Verified Balance Recharge Element is Found: <b>"+homeScreenPage.getCardDetailsDataRechargeAmountValue());
				} catch (Exception e) {
					testSteps.add("Failed: Balance Recharge Element is not Found");
				}
				
				//VAT
				try {
					homeScreenPage.isElementPresent(CardDetailsVATAmount);
					testSteps.add("Verified VAT charge Element is Found: <b>"+homeScreenPage.getCardDetailsVATAmountValue());
				} catch (Exception e) {
					testSteps.add("Failed: VAT charge Element is not Found");
				}
				
				//Total Payment Required
				try {
					homeScreenPage.isElementPresent(CardDetailsTotalPaymentAmount);
					testSteps.add("Verified Total Payment Required Element is Found: <b>"+homeScreenPage.getCardDetailsTotalPaymentAmountValue());
				} catch (Exception e) {
					testSteps.add("Failed: Total Payment Required Element is not Found");
				}
				
				
				
				
				
				//Button verification
				try {
					homeScreenPage.isElementPresent(submitButtonOnCardDetailsPage_1);
					testSteps.add("Verified Pay button is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Pay button is not Found");
				}
				
				
				//CardHolderNameField
				try {
					homeScreenPage.isElementPresent(cardHolderNameField);
					testSteps.add("Verified Card Holder Name Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Card Holder Name Field is not Found");
				}
				//CardCVVField
				try {
					homeScreenPage.isElementPresent(cvvField);
					testSteps.add("Verified CVV Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: CVV Field is not Found");
				}
				//CardNumberField
				try {
					homeScreenPage.isElementPresent(cardNumberField);
					testSteps.add("Verified card Number Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: card Number Field is not Found");
				}
				
				//CardExpirydateField
				try {
					homeScreenPage.isElementPresent(expiryDateField);
					testSteps.add("Verified Expiry Date Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Expiry Date Field is not Found");
				}
			}
			else if (Scenario.equalsIgnoreCase("Data - Verify pay with card page design is implemented - Postpaid")) {
				homeScreenPage.clickOnCustomAmountTab();
				homeScreenPage.enterDesireAmount("40");
				homeScreenPage.clickOnPayWithCardButton();
				//CardDetails
				testSteps.add("=========Card UI Verifications========");
				//title verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalTitle);
					testSteps.add("Verified Title Element is Found: <b>"+homeScreenPage.getCardDetailsTitle());
				} catch (Exception e) {
					testSteps.add("Failed: Title Element is not Found");
				}
				//Subtitle verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalSubTitle);
					testSteps.add("Verified SubTitle Element is Found: <b>"+homeScreenPage.getCardDetailsSubTitle());
				} catch (Exception e) {
					testSteps.add("Failed: SubTitle Element is not Found");
				}
				//cardAmount
				try {
					homeScreenPage.isElementPresent(CardDetailsModalAmount);
					
					testSteps.add("Verified Amount is Found: <b>"+homeScreenPage.getCardDetailsAmount());
				} catch (Exception e) {
					testSteps.add("Failed: Amount is not Found");
				}
				
				//Button verification
				try {
					homeScreenPage.isElementPresent(submitButtonOnCardDetailsPage_1);
					testSteps.add("Verified Pay button is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Pay button is not Found");
				}
				
				
				//CardHolderNameField
				try {
					homeScreenPage.isElementPresent(cardHolderNameField);
					testSteps.add("Verified Card Holder Name Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Card Holder Name Field is not Found");
				}
				//CardCVVField
				try {
					homeScreenPage.isElementPresent(cvvField);
					testSteps.add("Verified CVV Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: CVV Field is not Found");
				}
				//CardNumberField
				try {
					homeScreenPage.isElementPresent(cardNumberField);
					testSteps.add("Verified card Number Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: card Number Field is not Found");
				}
				
				//CardExpirydateField
				try {
					homeScreenPage.isElementPresent(expiryDateField);
					testSteps.add("Verified Expiry Date Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Expiry Date Field is not Found");
				}
				
			}
			else if (Scenario.equalsIgnoreCase("Voice - Verify pay with card page design is implemented - Prepaid")) {
				homeScreenPage.clickOnPayWithCardButtonForPrePaidNumbers();
				//CardDetails
				testSteps.add("=========Card UI Verifications========");
				//title verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalTitle);
					testSteps.add("Verified Title Element is Found: <b>"+homeScreenPage.getCardDetailsTitle());
				} catch (Exception e) {
					testSteps.add("Failed: Title Element is not Found");
				}
				//Subtitle verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalSubTitle);
					testSteps.add("Verified SubTitle Element is Found: <b>"+homeScreenPage.getCardDetailsSubTitle());
				} catch (Exception e) {
					testSteps.add("Failed: SubTitle Element is not Found");
				}
				//Balance Recharge
				try {
					homeScreenPage.isElementPresent(CardDetailsBalanceChargeAmount);
					testSteps.add("Verified Balance Recharge Element is Found: <b>"+homeScreenPage.getCardDetailsBalanceRechargeAmountValue());
				} catch (Exception e) {
					testSteps.add("Failed: Balance Recharge Element is not Found");
				}
				
				//VAT
				try {
					homeScreenPage.isElementPresent(CardDetailsVATAmount);
					testSteps.add("Verified VAT charge Element is Found: <b>"+homeScreenPage.getCardDetailsVATAmountValue());
				} catch (Exception e) {
					testSteps.add("Failed: VAT charge Element is not Found");
				}
				
				//Total Payment Required
				try {
					homeScreenPage.isElementPresent(CardDetailsTotalPaymentAmount);
					testSteps.add("Verified Total Payment Required Element is Found: <b>"+homeScreenPage.getCardDetailsTotalPaymentAmountValue());
				} catch (Exception e) {
					testSteps.add("Failed: Total Payment Required Element is not Found");
				}
				
				
				
				
				
				//Button verification
				try {
					homeScreenPage.isElementPresent(submitButtonOnCardDetailsPage_1);
					testSteps.add("Verified Pay button is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Pay button is not Found");
				}
				
				
				//CardHolderNameField
				try {
					homeScreenPage.isElementPresent(cardHolderNameField);
					testSteps.add("Verified Card Holder Name Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Card Holder Name Field is not Found");
				}
				//CardCVVField
				try {
					homeScreenPage.isElementPresent(cvvField);
					testSteps.add("Verified CVV Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: CVV Field is not Found");
				}
				//CardNumberField
				try {
					homeScreenPage.isElementPresent(cardNumberField);
					testSteps.add("Verified card Number Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: card Number Field is not Found");
				}
				
				//CardExpirydateField
				try {
					homeScreenPage.isElementPresent(expiryDateField);
					testSteps.add("Verified Expiry Date Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Expiry Date Field is not Found");
				}
				
			}
			
			else if (Scenario.equalsIgnoreCase("Voice - Verify pay with card page design is implemented - Postpaid")) {
				homeScreenPage.enterDesireAmount("40");
				homeScreenPage.clickOnPayWithCardButton();
				//CardDetails
				testSteps.add("=========Card UI Verifications========");
				//title verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalTitle);
					testSteps.add("Verified Title Element is Found: <b>"+homeScreenPage.getCardDetailsTitle());
				} catch (Exception e) {
					testSteps.add("Failed: Title Element is not Found");
				}
				//Subtitle verification
				try {
					homeScreenPage.isElementPresent(CardDetailsModalSubTitle);
					testSteps.add("Verified SubTitle Element is Found: <b>"+homeScreenPage.getCardDetailsSubTitle());
				} catch (Exception e) {
					testSteps.add("Failed: SubTitle Element is not Found");
				}
				//cardAmount
				try {
					homeScreenPage.isElementPresent(CardDetailsModalAmount);
					
					testSteps.add("Verified Amount is Found: <b>"+homeScreenPage.getCardDetailsAmount());
				} catch (Exception e) {
					testSteps.add("Failed: Amount is not Found");
				}
				//Button verification
				try {
					homeScreenPage.isElementPresent(submitButtonOnCardDetailsPage_1);
					testSteps.add("Verified Pay button is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Pay button is not Found");
				}
				
				
				//CardHolderNameField
				try {
					homeScreenPage.isElementPresent(cardHolderNameField);
					testSteps.add("Verified Card Holder Name Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Card Holder Name Field is not Found");
				}
				//CardCVVField
				try {
					homeScreenPage.isElementPresent(cvvField);
					testSteps.add("Verified CVV Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: CVV Field is not Found");
				}
				//CardNumberField
				try {
					homeScreenPage.isElementPresent(cardNumberField);
					testSteps.add("Verified card Number Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: card Number Field is not Found");
				}
				
				//CardExpirydateField
				try {
					homeScreenPage.isElementPresent(expiryDateField);
					testSteps.add("Verified Expiry Date Field is Found: <b>");
				} catch (Exception e) {
					testSteps.add("Failed: Expiry Date Field is not Found");
				}
				
				
				
			}
			

		}
		return testSteps;
	}
}
