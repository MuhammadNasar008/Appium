package PageScreen;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

import pages.HelpPage;
import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;
import webelements.LoginElements;
import webelements.MoreElements;

public class HelpPageScreen extends HelpPage {
	LoginPage loginPage=new LoginPage();
	public ArrayList<String> Help(String emailKey, String passwordKey,String Scenario)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		 if(Scenario.contains("While logged out click on How to contact us")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
                    if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
                    	
                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
                    	
                    }
                    
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickHowToContactButton();
					testSteps.add("Clicked on <b>How To Contact Button</b>");
					VerifyHowToContactListIsClickable(testSteps);
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		 else  if(Scenario.contains("While loggedin click on How to contact us")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
					  if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
	                    	
	                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
	                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
	                    	
	                    }
	                    
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					loginPage.clickLoginOrRegisterIcon();
					testSteps.add("Clicked on <b>login or register icon</b>");

					this.AssertEqual(loginPage.isRemeberMeCheckBoxUnchecked(testSteps), true, "Remeber Me CheckBox is Selected");

					this.AssertEqual(loginPage.isMobileOrEmailFieldPresent(testSteps), true,
							"Mobile Number or Email Field is not present");
					loginPage.enterMobileOrEmail(emailKey, testSteps);
					this.AssertEqual(loginPage.isProceedButtonPresent(testSteps), true, "Proceed Button is Not present");
					loginPage.clickProceedButton();
					this.AssertEqual(loginPage.isPasswordFieldPresent(testSteps),true,"Password field Is not present");
					loginPage.enterPassword(passwordKey,testSteps);
					testSteps.add("Enter Password : <b>"+passwordKey+"</b>");
					
					this.AssertEqual(loginPage.isLoginButtonPresent(testSteps),true,"Login Button Is Not Present ");
					loginPage.clickLoginButton();
					String passwordError=loginPage.getErrorPassword();
					String AllertError=loginPage.getAlertErrorMessage();
					if(!passwordError.equalsIgnoreCase("")) {
						testSteps.add("Get password error : <b>"+passwordError+"</b>");
					}
					if(!AllertError.equalsIgnoreCase("")) {
						testSteps.add("Get alert error : <b>"+AllertError+"</b>");
					}
					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickHowToContactButton();
					testSteps.add("Clicked on <b>How To Contact Button</b>");
					VerifyHowToContactListIsClickable(testSteps);
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		 else if(Scenario.contains("Click on twitter link")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
					   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
	                    	
	                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
	                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
	                    	
	                    }
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickHowToContactButton();
					testSteps.add("Clicked on <b>How To Contact Button</b>");
					clickTwitterLink();
					verifyTwitterUrl();
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		 else if(Scenario.contains("Click on WhatsApp number link")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
					   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
	                    	
	                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
	                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
	                    	
	                    }
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickHowToContactButton();
					testSteps.add("Clicked on <b>How To Contact Button</b>");
					clickWhatsappLink();
					verifyWhatsappUrl();
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		 
		 else if(Scenario.contains("Verify FeedBack Status")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
					   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
	                    	
	                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
	                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
	                    	
	                    }
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickGiveUsfeedBack();
					testSteps.add("Clicked on <b>Give Us feedBack</b>");
					verifyExperienceText(testSteps);
					verifyFeedBackStatus(testSteps);
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		 
		 else if(Scenario.contains("Select Great FeedBack Status")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
					   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
	                    	
	                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
	                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
	                    	
	                    }
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickGiveUsfeedBack();
					testSteps.add("Clicked on <b>Give Us feedBack</b>");
					verifyExperienceText(testSteps);
					selectFeedBack(testSteps,"Great");
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
		 else if(Scenario.contains("Select Good FeedBack Status")) {
				
				try {
					loadPage(Utility.getValue("loginUrl"));
					   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
	                    	
	                    	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
	                    	getWebDriver().findElement(MoreElements.LogoutButton).click();
	                    	
	                    }
					this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

					this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

					clickHelpButton();
					testSteps.add("Clicked on <b>Help Button</b>");
					clickGiveUsfeedBack();
					testSteps.add("Clicked on <b>Give Us feedBack</b>");
					verifyExperienceText(testSteps);
					selectFeedBack(testSteps,"Great");
					

				} catch (AssertionError e) {
					testSteps.add("Failed : " + e.toString());
				}
		}
			return testSteps;
			
		
		
	}

	public ArrayList<String> VerifyListHelp(String emailKey, String passwordKey, ArrayList<String> tabs,String Scenario)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		if(Scenario.contains("While loggedin click on Help tab")) {
		
		try {
			loadPage(Utility.getValue("loginUrl"));
			   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
               	
               	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
               	getWebDriver().findElement(MoreElements.LogoutButton).click();
               	
               }
			this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

			this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");

			loginPage.clickLoginOrRegisterIcon();
			testSteps.add("Clicked on <b>login or register icon</b>");

			this.AssertEqual(loginPage.isRemeberMeCheckBoxUnchecked(testSteps), true, "Remeber Me CheckBox is Selected");

			this.AssertEqual(loginPage.isMobileOrEmailFieldPresent(testSteps), true,
					"Mobile Number or Email Field is not present");
			loginPage.enterMobileOrEmail(emailKey, testSteps);
			this.AssertEqual(loginPage.isProceedButtonPresent(testSteps), true, "Proceed Button is Not present");
			loginPage.clickProceedButton();
			this.AssertEqual(loginPage.isPasswordFieldPresent(testSteps),true,"Password field Is not present");
			loginPage.enterPassword(passwordKey,testSteps);
			testSteps.add("Enter Password : <b>"+passwordKey+"</b>");
			
			this.AssertEqual(loginPage.isLoginButtonPresent(testSteps),true,"Login Button Is Not Present ");
			loginPage.clickLoginButton();
			String passwordError=loginPage.getErrorPassword();
			String AllertError=loginPage.getAlertErrorMessage();
			if(!passwordError.equalsIgnoreCase("")) {
				testSteps.add("Get password error : <b>"+passwordError+"</b>");
			}
			if(!AllertError.equalsIgnoreCase("")) {
				testSteps.add("Get alert error : <b>"+AllertError+"</b>");
			}
			Waits.wait1Second();
			clickHelpButton();
			Waits.wait1Second();
			verifyList(testSteps, tabs);
			

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}
		}
		else if(Scenario.contains("While loggedout cick on help tab")) {
		
			try {
				loadPage(Utility.getValue("loginUrl"));
				   if(!isElementPresent(LoginElements.LoginOrRegisterText)) {
                   	
                   	getWebDriver().findElement(HomeScreenELements.MoreButton).click();
                   	getWebDriver().findElement(MoreElements.LogoutButton).click();
                   	
                   }
				this.AssertEqual(loginPage.isLoginOrRegisterTextPresent(testSteps), true, "login or register text is not present");

				this.AssertEqual(loginPage.isLoginOrRegisterIconPresent(testSteps), true, "Login or register icon is not present");
				Waits.wait1Second();
				clickHelpButton();
				Waits.wait1Second();
				testSteps.add("Clicked on <b>Help Button</b>");
				verifyList(testSteps, tabs);
				

			} catch (AssertionError e) {
				testSteps.add("Failed : " + e.toString());
			}
		}
			
			return testSteps;
			
		
		
	}
	
	
}