package webelements;

import org.openqa.selenium.By;

public interface MyGarageElements {
//My garage add vehicle
	By enterVINTxt = By.xpath("//h3[contains(text(),'My Garage')]/..//input[@class='form-control']");
	By addVehicleButton = By.xpath("//h3[contains(text(),'My Garage')]/..//button[@class='btn btn-primary']");
//add by make	
	By searchByMakeLink = By.xpath("//h3[contains(text(),'My Garage')]/..//span[@class='v-make link-btn']");
	By makeYearTxt = By.xpath("//input[@class='year-input form-control']");
//Car make drop down	
	By makeCarDropDownButton = By.xpath("(//*[contains(@class,'vs__open-indicator')])[1]");
	By makeCarDropDownInput = By.xpath("(//input[contains(@class,'vs__search')])[1]");
	By makeCarDropDownSelect = By.xpath("//li[contains(text(),'Alfa Romeo')]");
//Car model drop down	
	By modelCarDropDownButton = By.xpath("(//*[contains(@class,'vs__open-indicator')])[2]");
	By modelCarDropDownInput = By.xpath("(//*[contains(@class,'vs__search')])[2]");
	By modelCarDropDownSelect = By.xpath("//li[contains(text(),'Stelvio')]");
//VIN link
	By searchByVIN = By.xpath("//span[@class='v-make link-btn']");
//deleting of car make
	By deleteButtonOfCar = By.xpath("(//button[@class='btn btn-danger btn-sm'])[3]");
	By deleteButtonOfVIN = By.xpath("(//button[@class='btn btn-danger btn-sm'])[3]");
//deleting of car make
//	By deleteButtonOfCar = By.xpath("(//button[@class='btn btn-danger btn-sm'])[3]");

//delete YES button of please confirm
	By yesButtonOfPleaseConfirmDelete = By.xpath("//button[contains(text(),'YES')]");
//delete NO button of please confirm
	By noButtonOfPleaseConfirmDelete = By.xpath("//button[contains(text(),'NO')]");
//cancel button of please confirm delete
	By cancelButtonOfPleaseConfirmDelete = By.xpath("//button[contains(text(),'×')]");
//after delete update garage successfully
	By updateGarageSuccessfullyAfterDeleteTitel = By.xpath("//strong[@class='mr-2']");

//VIN already existed in your garage
	By VINAleadyExistedTitle = By.xpath("//strong[text()='Failed to add VIN']");

//Vehicle already existed in your garage
	By VehicleAleadyExistedTitle = By.xpath("//strong[text()='Failed to add vehicle']");
//home page account drop down button
	By homePageAccountDropDownArrowButton = By.xpath("(//*[@class='ml-auto svg-inline--fa fa-angle-down fa-w-10'])[1]");
//home page account drop down select my Garage
	By homePageAccountDropDownSelectMyGarage = By.xpath("(//a[@class='dropdown-item'])[1]");
//My Garage Add Vehicle Button
	By myGarageAddVehicleButton = By.xpath("//button[@class='btn btn-primary btn-add']");
//My Garage Added Vehicle Title
	By myGarageAddedVehicleTitle = By.xpath("//div[contains(text(),'Alfa Romeo - Stelvio -2020')]");
//My Garage Added Vehicle Title
//	By myGarageAddedVehicleTitle = By.xpath("//strong[contains(text(),'Failed to add vehicle')]");

}
