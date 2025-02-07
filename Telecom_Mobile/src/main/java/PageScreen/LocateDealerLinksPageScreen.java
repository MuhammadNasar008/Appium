package PageScreen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;
import webelements.LocateDealerPageElements;
import webelements.MyGarageElements;

public class LocateDealerLinksPageScreen extends LoginPage {
	public ArrayList<String> myGarageAddVehicleThroughVIN(String email, String password, String myGarageEnterVIN)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Add Vehicle Through VIN In My Garage</b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			List<WebElement> allLinksOfBrowserDealersByMake = getWebDriver()
					.findElements(LocateDealerPageElements.allLinksOfBrowserDealersByMake);

			List<WebElement> allLinksOfBrowserByState = getWebDriver()
					.findElements(LocateDealerPageElements.allLinksOfBrowserByState);

			List<WebElement> verifyCardTitleandClickToCall = getWebDriver()
					.findElements(LocateDealerPageElements.verifyCardTitleandClickToCall);

			List<WebElement> cardClickToChatButton = getWebDriver()
					.findElements(LocateDealerPageElements.cardClickToChatButton);

			for (WebElement allLinksBDM : allLinksOfBrowserDealersByMake) {
				allLinksBDM.click();
				testSteps.add("Clicked on link : " + allLinksBDM.getText());
				for (WebElement allLinksBDS : allLinksOfBrowserByState) {
					allLinksBDS.click();
					testSteps.add("Clicked on link : " + allLinksBDS.getText());

					Waits.wait2Second();
					Assert.assertTrue(isElementDisplayed(LocateDealerPageElements.verifyTitleForAllLinks),
							"Verify Title For All Links ");
					testSteps.add("Verify Title of Recall Repair Centers After clicked on State Link :"
							+ allLinksBDS.getText());
					Waits.wait5Second();

					for (WebElement cardTitleandClickToCall : verifyCardTitleandClickToCall) {
						String nameOfRepairer = cardTitleandClickToCall.getText();
						String verifyNameOfRepairer = nameOfRepairer;
						AssertEqual(nameOfRepairer, verifyNameOfRepairer, "verify name of repairer");
						
						cardTitleandClickToCall.click();
						
						for(WebElement cardClickToCB : cardClickToChatButton) {
							cardClickToCB.click();
							verifyElementIsClickable(allLinksBDM);
						}
					}

				}
			}
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
			testSteps.add("Click login button");

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.enterVINTxt).clear();
			getWebDriver().findElement(MyGarageElements.enterVINTxt).sendKeys(myGarageEnterVIN);
			testSteps.add("Enter VIN Number : " + myGarageEnterVIN);

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.addVehicleButton).click();
			testSteps.add("Clicked on 'Add Vehicle' button");
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

}
