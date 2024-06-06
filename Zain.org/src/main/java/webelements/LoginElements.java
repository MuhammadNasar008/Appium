package webelements;

import org.openqa.selenium.By;

public interface LoginElements {
	By login = By.id("btnLogin");
	By passwordField = By.id("txtPassword");
	By AlertErrorMessage= By.xpath("//div[@class='alert alert-danger alert-main text-center']");
	
	By emailField = By.id("txtMobileNumberEmail");
	By ProceedButton=By.xpath("//button[@type='submit']");
	By RememberMeCheckBox=By.xpath("//input[@id='chkRememberMe']//..//span");
	By FieldErrorMessage=By.xpath("//div[@class='input-text__error-message']");
	
	By LoginOrRegisterText=By.xpath("(//div[@class='home-box__info']//h4[text()='Login or Register'])[2]");
	By LoginOrRegisterIcon=By.xpath("(//div[@class='home-box__info']//img[@alt='Login or Register'])[2]");
	By NewRegisterPageTitle=By.xpath("//div[@class='form__header-content']//h2");
	
	By ForgetButton=By.xpath("//a[contains(text(),'forgot my password')]");
	By ForgetScreen=By.xpath("//h1[contains(text(),'Reset Password')]");
	By Otp=By.xpath("//div[contains(@class,'alert')]");
	By nextButton=By.id("btnCreatePassword");
	By nextConfirmButton=By.id("btnConfirmPassword");
	By reEnterPasswordScreen=By.xpath("//h1[contains(text(),'Re-Enter Password')]");
	By passwordValidationLine=By.xpath("//div[@id='inputCreatePassword']//..//div[2]");
	By passwordChangePopup=By.xpath("//*[contains(text(),'password has been successfully updated ')]");
	By wrongOTPError=By.xpath("//div[contains(text(),'Wrong OTP')]");
	
	
	}
