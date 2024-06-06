package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import PageScreen.LoginPageScreen;
import PageScreen.MyGarageScreen;
import pages.BasePage;
import utils.Utility;
import utils.Waits;

public class MyGarageTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	MyGarageScreen myGarageScreen = new MyGarageScreen();

//add VIN Number vehicle in My Garage 
	@Test(priority = 0)
	public void myGarageAddVehicleThroughVIN() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate My Garage, Add Vehicle Through VIN";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to My Garage Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(myGarageScreen.myGarageAddVehicleThroughVIN(Utility.getValue("validEmail"),
					Utility.getValue("password"), Utility.getValue("myGarageEnterVIN")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//Delete VIN Number in My Garage 
	@Test(priority = 4)
	public void myGarageDeleteVIN() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate My Garage, Delete Vehicle Through VIN";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to My Garage Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(myGarageScreen.myGarageDeleteVIN(Utility.getValue("validEmail"),
					Utility.getValue("password"), Utility.getValue("myGarageEnterVIN")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//Validate VIN Number Already Existed 
	@Test(priority = 3)
	public void myGarageVINAlreadyExist() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate VIN Number Already Existed";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to My Garage Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(myGarageScreen.myGarageVINAlreadyExist(Utility.getValue("validEmail"),
					Utility.getValue("password"), Utility.getValue("myGarageEnterVIN")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//My Garage Add Vehicle Through Make 
	@Test(priority = 1)
	public void myGarageAddVehicleThroughMake() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate 'My Garage' Add Vehicle Through Make";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to My Garage Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(myGarageScreen.myGarageAddVehicleThroughMake(Utility.getValue("validEmail"),
					Utility.getValue("password"), Utility.getValue("myGarageCarYear"),
					Utility.getValue("myGarageCarMake"), Utility.getValue("myGarageCarModel")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}

//My Garage Add Vehicle Through Make 
	@Test(priority = 2)
	public void myGarageAddVehicleThroughMakeAlreadyExist() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName = "Validate 'My Garage' Add Vehicle Through Make Already Exist";
		TestDescription = "Proceed to Login Screen";
		TestCatagory = "Proceed to My Garage Screen";

		try {
			Waits.wait2Second();
			testStep.addAll(myGarageScreen.myGarageAddVehicleThroughMakeAlreadyExist(Utility.getValue("validEmail"),
					Utility.getValue("password"), Utility.getValue("myGarageCarYear"),
					Utility.getValue("myGarageCarMake"), Utility.getValue("myGarageCarModel")));

			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);

		} catch (Exception e) {
			e.printStackTrace();
			testStep.add("Failed : " + e.toString());
			BasePage.AddTest_IntoReport(testStep, this.reports, TestName, TestDescription, TestCatagory);
			assertTrue(false);
		} finally {
		}

	}
}
