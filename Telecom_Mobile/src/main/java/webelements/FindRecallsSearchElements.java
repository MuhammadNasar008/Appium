package webelements;

import org.openqa.selenium.By;

public interface FindRecallsSearchElements {

	By findRecallsTxtYear = By.xpath("//input[@class='home-form-input']");
	By findRecallsTxtZipCode = By.xpath("//input[@class='form-control home-form-input']");

	By findRecallsDropDownCarMake = By
			.xpath("//h2[text()='Find Recalls']/..//label[text()='Make']/..//*[@class='vs__open-indicator']");
	By findRecallsDropDownCarModel = By
			.xpath("//h2[text()='Find Recalls']/..//label[text()='Model']/..//*[@class='vs__open-indicator']");

	By findRecallsDropDownCarMakeInput = By.xpath("//h2[text()='Find Recalls']/..//label[text()='Make']/..//input");
	By findRecallsDropDownCarModelInput = By.xpath("//h2[text()='Find Recalls']/..//label[text()='Model']/..//input");

	By findRecallsDropDownCarMakeSelect = By.xpath("//li[contains(text(),'Audi')]");
	By findRecallsDropDownCarModelSelect = By.xpath("//li[contains(text(),'A3')]");
	By findRecallsSubmitButton = By.xpath("//button[@class='btn btn-primary btn-lg text-center text-md-left']");

	By findRecallsSearchByVINLinkClick = By.xpath("//span[text()='Vin']");
	By findRecallsSearchByMakeLinkClick = By.xpath("//span[text()='Make']");

	By findRecallsTxtVIN = By.xpath("//input[@class='home-form-input']");
//	By findRecallsTxtZipCode = By.xpath("//input[@class='form-control home-form-input']");

	By findRecallsTitleOfSearchOnOpenPage = By.xpath("//h4[contains(text(),'Current recall')]");

// when click direct on Make dropdown
	By findRecallsclickDirectOnMakeDropdown = By.xpath("//li[contains(text(),'Please enter year first')]");
//when click direct on Model dropdown
	By findRecallsclickDirectOnModelDropdown = By.xpath("//li[contains(text(),'Please input year and make first')]");

// cheack recall search today.............................................................................

	By checkRecallSearchTodayTxtYear = By.xpath("//input[@class='year-input form-control']");
	By checkRecallSearchTodayTxtZipCode = By.xpath("//input[@class='form-control w-100 form-control']");

	By checkRecallSearchTodayDropDownCarMake = By.xpath(
			"//h2[contains(text(),'Check your recall service today')]/../../..//label[text()='Make']/..//*[@class='vs__open-indicator']");
	By checkRecallSearchTodayDropDownCarModel = By.xpath(
			"//h2[contains(text(),'Check your recall service today')]/../../..//label[text()='Model']/..//*[@class='vs__open-indicator']");

	By checkRecallSearchTodayDropDownCarMakeInput = By
			.xpath("//h2[contains(text(),'Check your recall service today')]/../../..//label[text()='Make']/..//input");
	By checkRecallSearchTodayDropDownCarModelInput = By.xpath(
			"//h2[contains(text(),'Check your recall service today')]/../../..//label[text()='Model']/..//input");

	By checkRecallSearchTodayDropDownCarMakeSelect = By.xpath("//li[contains(text(),'Audi')]");
	By checkRecallSearchTodayDropDownCarModelSelect = By.xpath("//li[contains(text(),'A3')]");
	By checkRecallSearchTodaySubmitButton = By
			.xpath("//button[@class='btn btn-primary btn-block btn-lg text-center text-md-left']");

	By checkRecallSearchTodaySearchByVINLinkClick = By.xpath("//span[text()='VIN' and @class='v-make link-btn']");
	By checkRecallSearchTodaySearchByMakeLinkClick = By.xpath("//span[text()='Make' and @class='v-make link-btn']");

	By checkRecallSearchTodayTxtVIN = By.xpath("//input[@class='year-input form-control']");

	By checkRecallSearchTodayTitleOfSearchOnOpenPage = By.xpath("//h4[contains(text(),'Current recall')]");

// when click direct on Make dropdown
	By checkRecallSearchTodayclickDirectOnMakeDropdown = By.xpath("//li[contains(text(),'Please enter year first')]");
//when click direct on Model dropdown
	By checkRecallSearchTodayclickDirectOnModelDropdown = By
			.xpath("//li[contains(text(),'Please input year and make first')]");

}
