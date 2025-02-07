package PageScreen;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.FindRecallsSearchElements;
import webelements.HomeScreenELements;

public class FindRecallsSearchPageScreen extends LoginPage {

	public ArrayList<String> checkFindRecallsSearch(String year, String zipCode, String carMake, String carModel)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Verify 'Find Recalls' Search fields</b>");

			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			Waits.wait10Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsTxtYear).sendKeys(year);
			testSteps.add("Enter Car Year : " + year);
			Waits.wait5Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsTxtZipCode).sendKeys(zipCode);
			testSteps.add("Enter Car Year : " + zipCode);
			Waits.wait5Second();

			// select car make
			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarMake).click();
			testSteps.add("Clicked on Make DropDown");
			Waits.wait5Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarMakeInput).sendKeys(carMake);
			testSteps.add("Enter Car Make Type : " + carMake);
			Waits.wait10Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarMakeSelect).click();
			testSteps.add("Selected Car Make Type  ");
			Waits.wait5Second();

			// select car model
			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarModel).click();
			testSteps.add("Clicked on Model DropDown");
			Waits.wait5Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarModelInput).sendKeys(carModel);
			testSteps.add("Enter Car Model Type : " + carModel);
			Waits.wait10Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarModelSelect).click();
			testSteps.add("Selected Car Model Type  ");
			Waits.wait5Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsSubmitButton).click();
			testSteps.add("Clicked on Submit Button of Find Recalls");
			Waits.wait5Second();

			Waits.wait5Second();

			Assert.assertTrue(isElementDisplayed(FindRecallsSearchElements.findRecallsTitleOfSearchOnOpenPage),
					"Your Search is Finded");
			testSteps.add("Your Search is" + "Make" + carMake + "Model" + carModel);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> checkFindRecallsSearchThroughVIN(String VIN, String zipCode, String carMake,
			String carModel) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Verify 'Find Recalls' Search Through VIN </b>");

			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			Waits.wait10Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsSearchByVINLinkClick).click();
			testSteps.add("Find Recalls Search By VIN Link Click");
			Waits.wait10Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsTxtVIN).sendKeys(VIN);
			testSteps.add("Enter Car VIN 17 digits number : " + VIN);
			Waits.wait5Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsTxtZipCode).sendKeys(zipCode);
			testSteps.add("Enter Car Year : " + zipCode);
			Waits.wait5Second();

			// click submit button
			getWebDriver().findElement(FindRecallsSearchElements.findRecallsSubmitButton).click();
			testSteps.add("Clicked on Submit Button of Find Recalls");
			Waits.wait5Second();

			Waits.wait5Second();

			Assert.assertTrue(isElementDisplayed(FindRecallsSearchElements.findRecallsTitleOfSearchOnOpenPage),
					"Your Search is Finded");
			testSteps.add("Your Search is" + "Make" + carMake + "Model" + carModel);
			Waits.wait5Second();

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.logoMotorsafetyLinksInRecentRecall).click();
			testSteps.add("Clicked On Logo of MotorSafety");
			Waits.wait10Second();
//verified Home Logo of MotorSafety
			testSteps.add("Verified  Home Logo of MotorSafety");
			Assert.assertTrue(isElementDisplayed(HomeScreenELements.logoMotorsafetyLinks),
					"Verified  Home Logo of MotorSafety");
			testSteps.add("Verified Recall News Links is working");
			Waits.wait10Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> validatRecallsSearchFieldMakeAndModelClickFirst(String txtClickDirectOnMakeDropdownC,
			String txtClickDirectOnModelDropdownC) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Verify If click First on Make DropDown </b>");

			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			Waits.wait10Second();

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarMake).click();
			testSteps.add("Clicked on Make DropDown");
			String txtClickDirectOnMakeDropdown = getWebDriver()
					.findElement(FindRecallsSearchElements.findRecallsclickDirectOnMakeDropdown).getAttribute("value");
			Assert.assertEquals(txtClickDirectOnMakeDropdown, txtClickDirectOnMakeDropdownC);
			testSteps.add("Varified : Please enter year first");
			Waits.wait5Second();

			testSteps.add("<b>Verify If click First on Model DropDown </b>");

			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarModel).click();
			testSteps.add("Clicked on Model DropDown");
			String txtClickDirectOnModelDropdown = getWebDriver()
					.findElement(FindRecallsSearchElements.findRecallsclickDirectOnMakeDropdown).getAttribute("value");
			Assert.assertEquals(txtClickDirectOnMakeDropdown, txtClickDirectOnModelDropdownC);
			testSteps.add("Varified : Please enter year first");
			Waits.wait5Second();

//			getWebDriver().findElement(FindRecallsSearchElements.findRecallsDropDownCarModel).click();
//			testSteps.add("Clicked on Make DropDown");
//			Assert.assertTrue(isElementDisplayed(FindRecallsSearchElements.findRecallsclickDirectOnModelDropdown),
//					"Please enter year first");
//			testSteps.add("Varified :Please input year and make first");
//			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

}
