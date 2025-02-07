package PageScreen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;
import webelements.LocateDealerPageElements;
import webelements.MyGarageElements;

public class MyGarageScreen extends LoginPage {
	public ArrayList<String> myGarageAddVehicleThroughVIN(String email, String password, String myGarageEnterVIN)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Add Vehicle Through VIN In My Garage</b>");
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

	public ArrayList<String> myGarageDeleteVIN(String email, String password, String myGarageEnterVIN)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Delete Vehicle Through VIN In My Garage</b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownArrowButton).click();
			testSteps.add("Clicked on Arrow button of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownSelectMyGarage).click();
			testSteps.add("Clicked on 'My Garage' Drop Down of My Account");
			Waits.wait5Second();

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.deleteButtonOfVIN).click();
			testSteps.add("Clicked on Delete button of VIN");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.noButtonOfPleaseConfirmDelete).click();
			testSteps.add("Clicked on 'NO' button of Please Confirm delete");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.deleteButtonOfVIN).click();
			;
			testSteps.add("Clicked on Delete button of VIN");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.cancelButtonOfPleaseConfirmDelete).click();
			testSteps.add("Clicked on 'Cancel' button of Please Confirm delete");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.deleteButtonOfVIN).click();
			testSteps.add("Clicked on Delete button of VIN");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.yesButtonOfPleaseConfirmDelete).click();
			testSteps.add("Clicked on 'YES' button of Please Confirm delete");
			Waits.wait2Second();

			Waits.wait2Second();
			Assert.assertTrue(isElementDisplayed(MyGarageElements.updateGarageSuccessfullyAfterDeleteTitel),
					"Update Garage Successfully Deleted ");
			testSteps.add("Update Garage Successfully Deleted " + myGarageEnterVIN);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> myGarageVINAlreadyExist(String email, String password, String myGarageEnterVIN)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Validate VIN Number Already Existed </b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownArrowButton).click();
			testSteps.add("Clicked on Arrow button of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownSelectMyGarage).click();
			testSteps.add("Clicked on 'My Garage' Drop Down of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.enterVINTxt).clear();
			getWebDriver().findElement(MyGarageElements.enterVINTxt).sendKeys(myGarageEnterVIN);
			testSteps.add("Enter VIN Number : " + myGarageEnterVIN);

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.addVehicleButton).click();
			testSteps.add("Clicked on Add Vehicle button of VIN");
			Waits.wait2Second();

			Waits.wait2Second();
			Assert.assertTrue(isElementDisplayed(MyGarageElements.VINAleadyExistedTitle),
					"VIN Number Already Existed ");
			testSteps.add("VIN Number Already Existed" + myGarageEnterVIN);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> myGarageAddVehicleThroughMakeAlreadyExist(String email, String password,
			String myGarageCarYear, String myGarageCarMake, String myGarageCarModel)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Validate Vihicle Already Existed </b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownArrowButton).click();
			testSteps.add("Clicked on Arrow button of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownSelectMyGarage).click();
			testSteps.add("Clicked on 'My Garage' Drop Down of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.searchByMakeLink).click();
			testSteps.add("Clicked on 'make' link to search by");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.makeYearTxt).clear();
			getWebDriver().findElement(MyGarageElements.makeYearTxt).sendKeys(myGarageCarYear);
			testSteps.add("Entered Car Year : " + myGarageCarYear);
			Waits.wait2Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.makeCarDropDownButton).click();
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.makeCarDropDownInput).sendKeys(myGarageCarMake);
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.makeCarDropDownSelect).click();
			testSteps.add("Entered Car Make : " + myGarageCarMake);
			Waits.wait2Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.modelCarDropDownButton).click();
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.modelCarDropDownInput).sendKeys(myGarageCarModel);
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.modelCarDropDownSelect).click();
			testSteps.add("Entered Car Model : " + myGarageCarModel);
			Waits.wait2Second();

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.myGarageAddVehicleButton).click();
			testSteps.add("Clicked on Add Vehicle button of Make");
			Waits.wait2Second();

			Waits.wait2Second();
			Assert.assertTrue(isElementDisplayed(MyGarageElements.VehicleAleadyExistedTitle),
					"Vehicle Already Existed ");
			testSteps.add("Vehicle Already Existed" + myGarageCarMake + " " + myGarageCarModel + " " + myGarageCarYear);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	public ArrayList<String> myGarageAddVehicleThroughMake(String email, String password, String myGarageCarYear,
			String myGarageCarMake, String myGarageCarModel) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			testSteps.add("<b>Validate VIN Number Already Existed </b>");
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownArrowButton).click();
			testSteps.add("Clicked on Arrow button of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.homePageAccountDropDownSelectMyGarage).click();
			testSteps.add("Clicked on 'My Garage' Drop Down of My Account");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.searchByMakeLink).click();
			testSteps.add("Clicked on 'make' link to search by");
			Waits.wait5Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.makeYearTxt).clear();
			getWebDriver().findElement(MyGarageElements.makeYearTxt).sendKeys(myGarageCarYear);
			testSteps.add("Entered Car Year : " + myGarageCarYear);
			Waits.wait2Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.makeCarDropDownButton).click();
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.makeCarDropDownInput).sendKeys(myGarageCarMake);
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.makeCarDropDownSelect).click();
			testSteps.add("Entered Car Make : " + myGarageCarMake);
			Waits.wait2Second();

			Waits.wait5Second();
			getWebDriver().findElement(MyGarageElements.modelCarDropDownButton).click();
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.modelCarDropDownInput).sendKeys(myGarageCarModel);
			Waits.wait2Second();
			getWebDriver().findElement(MyGarageElements.modelCarDropDownSelect).click();
			testSteps.add("Entered Car Model : " + myGarageCarModel);
			Waits.wait2Second();

			Waits.wait10Second();
			getWebDriver().findElement(MyGarageElements.myGarageAddVehicleButton).click();
			testSteps.add("Clicked on Add Vehicle button of Make");
			Waits.wait2Second();

			Waits.wait2Second();
			Assert.assertTrue(isElementDisplayed(MyGarageElements.myGarageAddedVehicleTitle), "Added Vehicle Name ");
			testSteps.add("Added Vehicle Name" + myGarageCarMake + "  " + myGarageCarModel + " " + myGarageCarYear);
			Waits.wait5Second();

		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}
}
