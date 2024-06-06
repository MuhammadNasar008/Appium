package pages;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

import utils.Constants;
import utils.Waits;
import webelements.HelpPageElements;
import webelements.HomeScreenELements;

public class HelpPage extends BasePage implements HelpPageElements{
	public void clickHelpButton() {
		clickElement(HomeScreenELements.HelpButton);
	}
	public void clickHowToContactButton() {
		clickElement(HowToContactButton);
	}
	public void clickTwitterLink() {
		clickElement(TwiterLink);
	}
	public void verifyTwitterUrl() throws InterruptedException {
		Waits.wait1Second();
		getWebDriver().navigate().to(Constants.TwitterURl);
		String FoundUrl=getWebDriver().getCurrentUrl();
		assertEquals(FoundUrl,Constants.TwitterURl);
		getWebDriver().navigate().back();

	}
	public void clickWhatsappLink() {
		clickElement(WhatsappLink);
	}
	public void verifyWhatsappUrl() throws InterruptedException {
		Waits.wait3Second();
		getWebDriver().navigate().to(Constants.WhatscappURL);
		String FoundUrl=getWebDriver().getCurrentUrl();
		assertEquals(FoundUrl,Constants.WhatscappURL);
		getWebDriver().navigate().back();

	}
	public void VerifyHowToContactListIsClickable(ArrayList<String> test_steps) throws InterruptedException {
	test_steps.add("<b>Verify how to contact list is clickable</b>");
		Waits.wait1Second();
		WebElement TwiterLinkElement = getWebDriver().findElement(TwiterLink);
		assertTrue(verifyElementIsClickable(TwiterLinkElement));
		
		test_steps.add("<b>Verified twiter link is clickable</b>");
		Waits.wait1Second();
		WebElement CallLinkElement = getWebDriver().findElement(CallLink);
		assertTrue(verifyElementIsClickable(CallLinkElement));
		test_steps.add("<b>Verified call link is clickable</b>");
		WebElement WhatsappLinkElement = getWebDriver().findElement(WhatsappLink);
		assertTrue(verifyElementIsClickable(WhatsappLinkElement));
		test_steps.add("<b>Verified whatsapp link is clickable</b>");
		Waits.wait1Second();
		WebElement OpenASupportTicketButtonElement = getWebDriver().findElement(OpenASupportTicketButton);
		assertTrue(verifyElementIsClickable(OpenASupportTicketButtonElement));
		test_steps.add("<b>Verified open a support ticket button is clickable</b>");
	}

	public void verifyList(ArrayList<String> testSteps,ArrayList<String> list) throws InterruptedException {
		testSteps.add("<b>Verify Tabs In Help</b>");
		ArrayList<String> foundListOfTabs=new ArrayList<String>();
		
		try {
		for(int i=0;i<list.size();i++) {
			Waits.wait1Second();
			List<WebElement> element=getWebDriver().findElements(ListOfHelpBlock);
			String value=element.get(i).getText();
			foundListOfTabs.add(value);
			
			}
		Collections.sort(list);
		Waits.wait1Second();
		Collections.sort(foundListOfTabs);
		
		assertEquals(list, foundListOfTabs,"Not");
		for(int i=0;i<list.size();i++) {
		testSteps.add("Verified Tabs In Help <b>"+list.get(i)+"</b>");
		}
			}
		catch (AssertionError e) {
			e.printStackTrace();
		}
	
	}
	
	public void clickGiveUsfeedBack() {
		clickElement(GiveUsFeedbackButton);
	}
	public void verifyExperienceText(ArrayList<String> test_steps) {
		test_steps.add("<b>Verify How Was Your Experience Text is Displayed or not</b>");
		isElementPresent(HowWasYourExperienceText);
		test_steps.add("<b>Verified How Was Your Experience Text is Displayed</b>");
	}
	public void verifyFeedBackStatus(ArrayList<String> test_steps) {
		test_steps.add("<b>Verify Feed Back Status </b>");
		List<WebElement> element = getWebDriver().findElements(ListOfFeedBack);
		for(int i=0;i<element.size();i++) {
			element.get(i).click();
			String value = getElementText(FeedBackStatus);
			test_steps.add("Verified Feed Back Status<b> "+ value+"</b>");
		}
	}
	
	public void selectFeedBack(ArrayList<String> test_steps,String status) {
		test_steps.add("<b>Select Feed Back </b>");
		List<WebElement> element = getWebDriver().findElements(ListOfFeedBack);
		
			if(status.equalsIgnoreCase("Terible")) {
				element.get(0).click();
				clickElement(SubmitFeedBack);
				test_steps.add("Click On Submit Button");
				test_steps.add("Select Feed Back<b> "+ status+"</b>");
			}
			else if(status.equalsIgnoreCase("Bad")) {
				element.get(1).click();
				clickElement(SubmitFeedBack);
				test_steps.add("Click On Submit Button");
				test_steps.add("Select Feed Back<b> "+ status+"</b>");
			}
			else if(status.equalsIgnoreCase("Okay")) {
				element.get(2).click();
				clickElement(SubmitFeedBack);
				test_steps.add("Click On Submit Button");
				test_steps.add("Select Feed Back<b> "+ status+"</b>");
			}
			else if(status.equalsIgnoreCase("Good")) {
				element.get(3).click();
				clickElement(SubmitFeedBack);
				test_steps.add("Click On Submit Button");
				test_steps.add("Select Feed Back<b> "+ status+"</b>");
			}

			else {
				element.get(4).click();
				clickElement(SubmitFeedBack);
				test_steps.add("Click On Submit Button");
				test_steps.add("Select Feed Back<b> "+ status+"</b>");
			}
			
		
	}
	public void verifySocial(ArrayList<String> test_steps) {
		test_steps.add("<b>Verify Feed Back Status </b>");
		List<WebElement> element = getWebDriver().findElements(ListOfFeedBack);
		for(int i=0;i<element.size();i++) {
			element.get(i).click();
			String value = getElementText(FeedBackStatus);
			test_steps.add("Verified Feed Back Status<b> "+ value+"</b>");
		}
	}
}

