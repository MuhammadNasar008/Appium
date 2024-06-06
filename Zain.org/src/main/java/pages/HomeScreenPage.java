package pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import javax.swing.UIClientPropertyKey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import utils.Waits;
import webelements.HomeScreenELements;

public class HomeScreenPage extends BasePage implements HomeScreenELements{

	public void verifyHomeScreen(ArrayList<String> test_steps) throws InterruptedException {
		Waits.wait1Second();
		test_steps.add("Verify <b>DashBoard</b> button is dispaly or not");
		assertEquals(isElementDisplayed(Dashboard), true);
		test_steps.add("Verified <b>DashBoard</b> button is dispaly");
		test_steps.add("Verify <b>Help</b> button is dispaly or not");
		assertEquals(isElementDisplayed(HelpButton), true);
		test_steps.add("Verified <b>Help</b> button is dispaly");
		test_steps.add("Verified <b>More</b> button is dispaly");
		assertEquals(isElementDisplayed(MoreButton), true);
		test_steps.add("Verify <b>DashBoard</b> button is dispaly or not");
		test_steps.add("Verify <b>Pay Bill Or Recharge Line</b> text is dispaly or not");
		assertEquals(isElementDisplayed(PayBillOrRechargeLineText), true);
		test_steps.add("Verified <b>Pay Bill Or Recharge Line</b> text is dispaly");
		test_steps.add("Verify <b>Voice</b> button is dispaly or not");
		assertEquals(isElementDisplayed(VoiceButton), true);
		test_steps.add("Verified <b>Voice</b> button is dispaly");
		test_steps.add("Verify <b>Data</b> button is dispaly or not");
		assertEquals(isElementDisplayed(DataButton), true);
		test_steps.add("Verified <b>Data</b> button is dispaly");
		test_steps.add("Verify <b>Fiber</b> button is dispaly or not");
		assertEquals(isElementDisplayed(FiberButton), true);
		test_steps.add("Verified <b>Fiber</b> button is dispaly");
		test_steps.add("Verify <b>phone No</b> for quick pay is dispaly or not");
		assertEquals(isElementDisplayed(phoneNoField), true);
		test_steps.add("Verified <b>phone No</b> for quick pay is dispaly");
		test_steps.add("Verify <b>Quick Pay Submit</b> button is dispaly or not");
		assertEquals(isElementDisplayed(QuickPaySubmitButton), true);
		test_steps.add("Verified <b>Quick Pay Submit</b> button is dispaly");
		test_steps.add("Verify <b>Direct Access</b> text is dispaly or not");
		assertEquals(isElementDisplayed(DirectAccessText), true);
		test_steps.add("Verified <b>Direct Access</b> text is dispaly");
		test_steps.add("Verify <b>Direct Access</b> button is dispaly or not");
		
		assertEquals(isElementDisplayed(DirectAccessButton), true);
		test_steps.add("Verified <b>Direct Access</b> button is dispaly");
		test_steps.add("Verify <b>Plans And Services</b> text is dispaly or not");
		assertEquals(isElementDisplayed(PlansAndServicesText), true);
		test_steps.add("Verified <b>Plans And Services</b> text is dispaly");
		test_steps.add("Verify <b>Zain World</b> text is dispaly or not");
		assertEquals(isElementDisplayed(ZainWorldText), true);
		test_steps.add("Verified <b>Zain World</b> text is dispaly");
	
	}
	public void clickData() {
		clickElement(DataButton);
	}
	public void choosePreDefinedData() {
		clickElement(PredefinedDatapackage);
	}
	public void clickVoice() {
		clickElement(VoiceButton);
	}
	public void clickFiber() {
		clickElement(FiberButton);
	}
	
	public void enterNumber(String number) {
		waitForElementToBePresent(inputLineNumber, 5);
		sendKeysToElement(getWebDriver().findElement(inputLineNumber), number);
	}
	
	public void clickOnNextButton() {
		clickElement(nextButton);
	}
	
	public boolean isPayBillScreenDisplayed() {
		return isElementPresent(payBillScreen);
	}
	
	public boolean isCustomAmountTabDisplayed() {
		return isElementPresent(customAmountTab);
	}
	
	public boolean isBillAmountTabDisplayed() {
		return isElementPresent(billAmountTab);
	}
	
	public boolean isCustomAmountTabCheckedByDefault() {
		return getWebDriver().findElement(customAmountTab).isSelected();
	}
	
	public boolean isBalanceTabDisplayed() {
		return isElementPresent(balanceTab);
	}
	public boolean isPresent50SARBalance() {
		return isElementPresent(SAR50_Balance);
	}
	public void select50SARBalance() {
		 clickElement(SAR50_Balance);
	}
	public void selectCustomBalance() {
		 clickElement(Custom_Balance);
	}
	
	public boolean isDataTabDisplayed() {
		return isElementPresent(dataTab);
	}
	
	public boolean isVoucherTabDisplayed() {
		return isElementPresent(voucherTab);
	}
	
	public boolean isBalanceTabSelected() {
		return getWebDriver().findElement(balanceTab).isSelected();
	}
	
	public boolean isRechargeScreenDisplayed() {
		return isElementPresent(rechargeScreen);
	}
	
	public boolean isPayWithCardButtonIsDisabled() {
		return getWebDriver().findElement(payWithCardButton).isEnabled();
	}
	
	
	
	public String getCardDetailsTitle() {
		return getWebDriver().findElement(CardDetailsModalTitle).getText();
	}
	
	
	public String getCardDetailsSubTitle() {
		return getWebDriver().findElement(CardDetailsModalSubTitle).getText();
	}
	
	public void enterAmount(String amount) {
		sendKeysToElement(getWebDriver().findElement(enterAmount), amount);
		
	}
	
	public void clickOnCustomAmountTab() {
		clickElement(customAmountTabLabel);
	}
	
	public void enterDesireAmount(String Amount) {
		clickElement(entercustomAmount);
		WebElement element = getWebDriver().findElement(entercustomAmount);
		element.sendKeys(Amount);
	}
	public Boolean isCustomAmountField() {
		Waits.waitForElementToBeVisibile(entercustomAmount, getWebDriver());
		return isElementPresent(entercustomAmount);
	}
	
	
	
	public void enterDecimalcustomAmount() {
		clickElement(enterAmount);
		WebElement element = getWebDriver().findElement(enterAmount);
		element.sendKeys(Keys.NUMPAD0);
		element.sendKeys(Keys.DECIMAL);
		element.sendKeys(Keys.NUMPAD2);
		element.sendKeys(Keys.NUMPAD5);
	}
	
	public String getAmountValue() {
		return getElementInput(enterAmount).trim();
	}
	public String getCardDetailsDataRechargeAmountValue() {
		return getElementText(CardDetailsDataChargeAmount).trim();
	}
	public String getCardDetailsBalanceRechargeAmountValue() {
		return getElementText(CardDetailsBalanceChargeAmount).trim();
	}
	public String getCardDetailsVATAmountValue() {
		return getElementText(CardDetailsVATAmount).trim();
	}
	public String getCardDetailsTotalPaymentAmountValue() {
		return getElementText(CardDetailsTotalPaymentAmount).trim();
	}
	
	public void clickOnPayWithCardButtonForPrePaidNumbers() {
		clickElement(payWithCardButtonOnCardDetailsScreen);
	}
	public Boolean isclickableButton(By xpath) {
		Boolean clickable = false;
		try {
			Waits.waitForElementToBeVisibile(xpath, getWebDriver());
			Waits.waitForElementToBeClickable(xpath, getWebDriver());
			clickable = true;
		} catch (Exception e) {
			clickable = false;
		}
		
		return clickable;
	}
	
	public void clickOnPayWithCardButtonOnCardDetailsPage() {
		try {
			Waits.waitForElementToBeClickable(submitButtonOnCardDetailsPage_1, getWebDriver());
			clickElement(submitButtonOnCardDetailsPage_1);
		} catch (Exception e) {
			Waits.waitForElementToBeClickable(submitButtonOnCardDetailsPage, getWebDriver());
			clickElement(submitButtonOnCardDetailsPage);
		}
		
	}
	
	public String getCardDetailsAmount() {
		return getElementText(CardDetailsModalAmount);
	}
	public void clickOnPayWithCardButton() {
		clickElement(payWithCardButton);
	}
	
	public void enterCardNumber(String value) {
		sendKeysToElement(getWebDriver().findElement(cardNumberField), value);		
	}
	
	public void enterExpiryDate(String value) {
		sendKeysToElement(getWebDriver().findElement(expiryDateField), value);		
	}
	
	public void enterCVV(String value) {
		sendKeysToElement(getWebDriver().findElement(cvvField), value);		
	}
	
	public void enterCardHolderName(String value) {
		sendKeysToElement(getWebDriver().findElement(cardHolderNameField), value);		
	}
	
	public String incompleteCardNumberErrorMessage() {
		return getElementText(By.xpath("//input[@id='card-number']//..//../div[@class='input-text__error-message']"));
	}
	
	public boolean isTransactionFailedErrorMessage() {
		Waits.waitForElementToBeVisibile(transactionFailedErrorMessage, getWebDriver());
		return isElementPresent(transactionFailedErrorMessage);
	}
	
	public boolean isMessageDisplay(String Message) {
		String Messagexpath = "//*[text()='"+Message+"']";
		Waits.waitForElementToBeVisibile(By.xpath(Messagexpath), getWebDriver());
		return isElementPresent(transactionFailedErrorMessage);
	}
	
	public boolean isMinimumAmountErrorMessage() {
		Waits.waitForElementToBeVisibile(MinimunAmountErrorMessage, getWebDriver());
		return isElementPresent(MinimunAmountErrorMessage);
	}
	
	public void clickOnVoucherTab() {
		clickElement(voucherTabLabel);
	}
	public void clickOnBalanceTab() {
		clickElement(BalanceTabLabel);
	}
	
	public void enterVoucherName(String name) {
		sendKeysToElement(getWebDriver().findElement(voucherTabInput), name);
	}
	
	
	public void clickOnSubmitVoucherButton() {
		clickElement(submitVoucherTabButton);
	}
	
	public boolean isInvalidVoucherNumberValidationMessageIsDisplayed() {
		return isElementPresent(invalidVoucherNumberErrorMessage);
	}
	
	public boolean Vouchertab_VoucherNumberField() {
		return isElementPresent(voucherTabInput);
	}
	public boolean Vouchertab_SubmitButton() {
		return isElementPresent(submitVoucherTabButton);
	}
	
	public String getInvalidVoucherNumberMessage() {
		return getElementText(invalidVoucherNumberErrorMessage);
	}
	public boolean isSubmitVoucherButtonIsEnabled() {
		return getWebDriver().findElement(submitVoucherTabButton).isEnabled();		
	}
	public String getVoucherNameText() {
		return getWebDriver().findElement(voucherTabInput).getAttribute("value");
		//return getElementText(voucherTabInput);
	}
	
	public String getSuccessVoucherMessage() {
		return getElementText(successfulVoucherRecharge).trim();
	}
	
	public String getAmountText() {
		return getElementText(amountText);
	}
	
	public String getInvalidNumberErrorMessage() {
		return getElementText(erorMessage).trim();
	}
	
}
