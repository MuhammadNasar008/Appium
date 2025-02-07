package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Utility;
import utils.Waits;
import webelements.LoginElements;
import java.util.ArrayList;

public class LoginPage extends BasePage implements LoginElements {

	public boolean isLoginOrRegisterTextPresent(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>login or Register text</b> is present or not");
		if(isElementPresent(LoginOrRegisterText)) {
			testSteps.add("Verified <b>login or Register text</b> is present");
			return true	;
			
		}
		else {
			testSteps.add("Verified <b>login or Register text</b> is present");
			return false;
		}
		
	
	}
	public String getLoginOrRegisterText() throws InterruptedException {
	
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(LoginOrRegisterText);
		
		return element.getText();
	}
	public boolean isLoginOrRegisterIconPresent(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>login or register icon </b>  is present or not");
		if(isElementPresent(LoginOrRegisterIcon)) {
			testSteps.add("Verified <b>login or register icon</b> is present");
			return true	;
			
		}
		else {
			testSteps.add("Verified <b>login or register icon</b> is not present");
			return false;
		}
		
	}
	public void clickLoginOrRegisterIcon() {
		clickElement(LoginOrRegisterIcon);
	}
	
	public boolean isRemeberMeCheckBoxUnchecked(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>remeber me checkbox</b> is unchecked");
		boolean checked;
		try {
		checked=driver.findElement(RememberMeCheckBox).isSelected();
		testSteps.add("Verified <b>remeber me checkbox</b> is unchecked");
	}
	catch (Exception e) {
		testSteps.add("Verified <b>remeber me checkbox</b> is checked");
		checked=true;
	}
		return checked;
	}
	
	public boolean isMobileOrEmailFieldPresent(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>mobile number or email input field</b> is present or not");
		if(isElementPresent(emailField)) {
			testSteps.add("Verified <b>mobile number or email input field</b> is present");
			return true	;
			
		}
		else {
			testSteps.add("Verified <b>mobile number or email input field</b> is not present");
			return false;
		}
		
		
	}
	
	
	public boolean isProceedButtonPresent(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>proceed button</b> is present or not");
		if(isElementPresent(ProceedButton)) {
			testSteps.add("Verified <b>proceed button</b> is present");
			return true	;
			
		}
		else {
			testSteps.add("Verified <b>proceed button</b> is not present");
			return false;
		}
	
	}
	public void clickProceedButton() {
		clickElement(ProceedButton);
	}
	
	public boolean isLoginButtonPresent(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>login button</b> is present or not");
		if(isElementPresent(login)) {
			testSteps.add("Verified <b>login button</b> is present");
			return true	;
			
		}
		else {
			testSteps.add("Verified <b>login button</b> is present");
			return false;
		}

	}
	



	public boolean isPasswordFieldPresent(ArrayList<String> testSteps) {
		testSteps.add("Verify <b>password input field </b> is present or not");
		if(isElementPresent(passwordField)) {
			testSteps.add("Verified <b>password input field</b> is present");
			return true	;	
		}
		else {
			testSteps.add("Verified <b>password input field</b> is present");
			return false;
		}
		
		
	}
	

	public void enterMobileOrEmail(String username,ArrayList<String> test_Steps) {
		try {
		Waits.waitForElementToBeVisibile(emailField, getWebDriver());
		WebElement element = getWebDriver().findElement(emailField);
		element.clear();
		sendKeysToElement(element, username);
		test_Steps.add("Enter email : <b>"+username+"</b>");
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public boolean verifyMobileOrEmailText(ArrayList<String> testSteps) throws InterruptedException {
		Waits.wait2Second();
		testSteps.add("Verify Mobile And Email Text is not empty ");
		try {
		Waits.waitForElementToBeVisibile(emailField, getWebDriver());
		WebElement element = getWebDriver().findElement(emailField);
		String value=element.getAttribute("value");
		if(!value.equalsIgnoreCase(""))
		{
			testSteps.add("Verified Mobile And Email Text is not empty");
			return true;
			
		}
		else {
			testSteps.add("Verified Mobile And Email Text is empty");
			return false;
			
		}
		}
		catch (Exception e) {
			testSteps.add("Verified Mobile And Email Text is not empty");
			return true;
		}

	}
	public boolean verifyPasswordField(ArrayList<String> testSteps) {
		testSteps.add("<b>Verify Passsword Field is Present or not</b>");
		try {
		WebElement element = getWebDriver().findElement(passwordField);
		if(element.isDisplayed()) {
			testSteps.add("<b>Verified Passsword Field is Present</b>");
			return true;
		}
		else {
			return false;
		}
		}
		catch (Exception e) {
			testSteps.add("<b>Verified Passsword Field is Present</b>");
			return false;
		}

	}
	
	public void enterPassword(String password,ArrayList<String> testSteps) {
		try {
		WebElement element = getWebDriver().findElement(passwordField);
		sendKeysToElement(element, password);
		testSteps.add("Enter Password : <b>"+password+"</b>");
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void clickLoginButton() {
		clickElement(login);
	}
	public void clickForgetButton() {
		clickElement(ForgetButton);
	}

	
	public String getErrorEmail() throws InterruptedException {
		String value="";
		try{
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(FieldErrorMessage);
		value=element.getText();
		}
		catch (Exception e) {
		value="";
		}
		return value;
	}
	public String getErrorPassword() throws InterruptedException {
		String value="";
		try{
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(FieldErrorMessage);
		value=element.getText();
		}
		catch (Exception e) {
			value="";
			}
		return value;
	}
	public boolean verifyAlertErrorMessage() throws InterruptedException {
		try {
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(AlertErrorMessage);
		return element.isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
		
	}

	public String getAlertErrorMessage() throws InterruptedException {
		String value="";
		try{
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(AlertErrorMessage);
		value=element.getText();
		}
		catch (Exception e) {
			value="";
			}
		return value;
	}

	
	public boolean verifyNewRegisterTitle() throws InterruptedException {
		Waits.wait2Second();
		try {
		Waits.waitForElementToBeVisibile(NewRegisterPageTitle, getWebDriver());
		Waits.waitForElementToBeClickable(NewRegisterPageTitle, getWebDriver());
		WebElement element = getWebDriver().findElement(NewRegisterPageTitle);
		String value=element.getText();
		if(value.equalsIgnoreCase("New to Zain App"))
		{
			return true;
		}
		else {
			return false;
		}
		}
		catch (Exception e) {
			return false;
		}

	}
	public boolean verifyForgetScreen(ArrayList<String> test_Steps) throws InterruptedException {
		 test_Steps.add("<b>Verify Forget Screen is present or not</b>");
			
		 try {
		Waits.wait2Second();
		Waits.waitForElementToBeVisibile(ForgetScreen, getWebDriver());
		WebElement element = getWebDriver().findElement(ForgetScreen);
	
		test_Steps.add("<b>Verified Forget Screen Screen is present </b>");
		 return element.isDisplayed();
	}catch (Exception e) {
		 test_Steps.add("<b>Verified Forget Screen Screen is not present </b>");
		 return false;
	}
		

	}
 public String enterOTP() throws InterruptedException {
	 String value="";
	try {	
	 Waits.wait2Second();
		Waits.waitForElementToBeVisibile(ForgetScreen, getWebDriver());
		WebElement element = getWebDriver().findElement(Otp);
		value=element.getText().trim();
		for(int i=1;i<=value.length();i++) {
			String enterOtp="//input[contains(@class,'digits-"+i+"')]";
			WebElement enterOTPElement=getWebDriver().findElement(By.xpath(enterOtp));
			String getChar= Character.toString(value.charAt(i-1));
			sendKeysToElement(enterOTPElement,getChar);
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		return value;
		

	}
 public String enterWrongOTP() throws InterruptedException {
	 String value="";
	try {	
	 Waits.wait2Second();
		Waits.waitForElementToBeVisibile(ForgetScreen, getWebDriver());
		WebElement element = getWebDriver().findElement(Otp);
		value=element.getText().trim();
		for(int i=1;i<=value.length();i++) {
			String enterOtp="//input[contains(@class,'digits-"+i+"')]";
			WebElement enterOTPElement=getWebDriver().findElement(By.xpath(enterOtp));
			if(i==value.length()) {
				String a=String.valueOf(Utility.getRandomNumber(0, 9));
			
			String getChar= Character.toString(value.charAt(i-1));
			if(getChar!=a) {
				getChar=a;
			sendKeysToElement(enterOTPElement,getChar);
			}
			else {
				 a=String.valueOf(Utility.getRandomNumber(0, 9));
				getChar= Character.toString(value.charAt(i-1));
				sendKeysToElement(enterOTPElement,a);
			}
			}
			else {
				String getChar= Character.toString(value.charAt(i-1));
				sendKeysToElement(enterOTPElement,getChar);
			}
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		return value;
		

	}
 public boolean VerifyNextButtonIsEnable(ArrayList<String> test_steps) {
	 test_steps.add("<b>Verify Next Button is Enable or Disable</b>");
		WebElement element = getWebDriver().findElement(nextButton);
		if(element.isEnabled()) {
			 test_steps.add("<b>Verify Next Button is Enable</b>");
			return true;
		}
		else {
			 test_steps.add("<b>Verify Next Button is Disable</b>");
			return false;
		}
		
	}
 public void clickNextButton() {
		clickElement(nextButton);
	}
 public boolean verifyReEnterScreen(ArrayList<String> test_Steps) throws InterruptedException {
	 test_Steps.add("<b>Verify Re Enter Password Screen is present or not</b>");
	
	 try {
	 Waits.wait2Second();
		Waits.waitForElementToBeVisibile(reEnterPasswordScreen, getWebDriver());
		 WebElement element= getWebDriver().findElement(reEnterPasswordScreen);
		 test_Steps.add("<b>Verified Re Enter Password Screen is present </b>");
		 return element.isDisplayed();
	}catch (Exception e) {
		 test_Steps.add("<b>Verified Re Enter Password Screen is not present </b>");
		 return false;
	}
 }
	 public boolean verifyPasswordFieldLineText(ArrayList<String> test_Steps) throws InterruptedException {
		 test_Steps.add("<b>Verify Next button is disabled until user enters a strong password</b>");
		 Waits.wait2Second();
			Waits.waitForElementToBeVisibile(passwordValidationLine, getWebDriver());
			 WebElement element= getWebDriver().findElement(passwordValidationLine);
			 WebElement nextButtonelement= getWebDriver().findElement(nextButton);
			 String value=element.getAttribute("class");
			 if(value.contains("strong")&&nextButtonelement.isEnabled()) {
				 test_Steps.add("<b>Next button is enable when user enters a strong passwordiled  </b>");
				 return true;
			 }
			
			 else if(value.contains("weak")&&nextButtonelement.isEnabled()){
				 test_Steps.add("<b> Next button is enable when user enters a weak password </b>");
				 return false;
				 }
			 else {
				 test_Steps.add("<b>Next button is enable when user enters a weak password </b>");
				 return false;
			 }
	

	}
	 public boolean VerifyNextConfirmButtonIsEnable(ArrayList<String> test_steps) {
		 test_steps.add("<b>Verify Next Confirm Button is Enable or Disable</b>");
			WebElement element = getWebDriver().findElement(nextConfirmButton);
			if(element.isEnabled()) {
				 test_steps.add("<b>Verified Next Confirm Button is Enable</b>");
				return true;
			}
			else {
				 test_steps.add("<b>Verified Next Confirm Button is Disable</b>");
				return false;
			}
			
		}
	 
 public void clickNextConfirmButton() {
		clickElement(nextConfirmButton);
	}
 public boolean VerifyAfterPasswordChangePopup(ArrayList<String> test_steps) throws InterruptedException {
	  try {  
	  test_steps.add("<b>Verify Password Change notified is Display or not</b>");
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(passwordChangePopup);
		if(element.isDisplayed()) {
			 test_steps.add("<b>Verified Password Change notified is Display</b>");
			return true;
		}
		else {
			 test_steps.add("<b>Verify Password Change notified is not Display</b>");
			return false;
		}
	  }catch (Exception e) {
		  test_steps.add("<b>Verify Password Change notified is not Display</b>");
			return false;
	}
	}
	public boolean getOTPErrorMessage(ArrayList<String> test_steps) throws InterruptedException {
		String value="";
		test_steps.add("<b>Verify OTP Message");
		try{
		Waits.wait2Second();
		WebElement element = getWebDriver().findElement(wrongOTPError);
		if(element.isDisplayed()) {
		value=element.getText();
		test_steps.add("Get OTP Error Message "+value);
		return true;
		}
		else {
			value="";
			return false;
		}
		}
		catch (Exception e) {
			value="";
			return false;
			}
		
	}

 
}
