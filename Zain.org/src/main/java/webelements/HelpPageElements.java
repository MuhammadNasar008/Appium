package webelements;

import org.openqa.selenium.By;

public interface HelpPageElements {
	By ListOfHelpBlock = By.xpath("//div[@class='help-blocks__list']//div[@class='help-blocks__block-title mb-1']");
	By KnowledgeButton = By.xpath("//div[contains(@class,'knowledgebase')]//a");
	By HowToContactButton = By.xpath("//div[contains(@class,'contact-us')]//a");
	By GiveUsFeedbackButton = By.xpath("//div[contains(@class,'block--bg-feedback')]//a");
	By SocialMediaButton = By.xpath("//div[contains(@class,'social-media')]//a");
	By TwiterLink = By.xpath("//img[@alt='Twitter']//..//span");
	By CallLink = By.xpath("//img[@alt='Call']//..//span");
	By WhatsappLink = By.xpath("//img[@alt='Whatsapp']//..//span");
	By OpenASupportTicketButton = By.xpath("//a[contains(@class,'contact-us__open-ticket')]");
	By HowWasYourExperienceText=By.xpath("//h2[text()='How was your experience?']");
	By ListOfFeedBack = By.xpath("//ul[contains(@class,'feedback__ratings-list list-unstyled')]//li");
	By SubmitFeedBack = By.id("btnFeedback");
	By FeedBackStatus = By.id("feedbackStatus");
	By ThankYouMessage = By.xpath("//h6[contains(text(),'Thank you')]");
	By WhyYourExperienceScreen = By.xpath("//h2[contains(text(),'Why was your experience')]");
	
	//SocialMedia
	By EnjoyTheExpeirceText = By.xpath("//h5[contains(text(),'Enjoying the Experience?')]");
	By ShareWithYourFriendButton = By.id("share-btn");
	By TwiterImage = By.xpath("//img[@alt='Twitter']");
	By FaceBookImage = By.xpath("//img[@alt='Facebook']");
	By InstagramImage = By.xpath("//img[@alt='Instagram']");
	By LinkedInImage = By.xpath("//img[@alt='LinkedIn']//..");
	
}

