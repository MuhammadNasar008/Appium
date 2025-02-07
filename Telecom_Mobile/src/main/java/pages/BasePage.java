package pages;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utils.Utility;
import utils.WebSetup;

public class BasePage {
	public static String screenshotName;
	public static WebDriver driver;

	public static WebDriver getWebDriver() {
		return WebSetup.getInstance().initDriver();
	}
	
	public static void ScrollToElement(WebElement element, WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		// Wait.wait2Second();
	}

	public void loadPage(String base_url) {

		getWebDriver().get(base_url);
		System.out.println("load url in browser");
	}

	public void clickElement(By path) {
		WebElement element = getWebDriver().findElement(path);
		element.click();
	}

	public String getElementText(By path) {
		WebElement element = getWebDriver().findElement(path);
		return element.getText();
	}
	public String getElementInput(By path) {
		WebElement element = getWebDriver().findElement(path);
		return element.getAttribute("value");
	}

	public void sendKeysToElement(WebElement element, String keys) {
		element.clear();
		element.sendKeys(keys);
	}
	public WebElement waitForElementToBePresent(By webElement, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(webElement));
	}

	public boolean isElementPresent(By element) {

		try {
			waitForElementToBePresent(element, 5);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static void AddTest_IntoReport(ArrayList<String> test_steps, ExtentReports report, String TestName,
			String TestDescription, String TestCatagory) {
		ExtentTest extent = report.startTest(TestName, TestDescription).assignCategory(TestCatagory);
		for (int i = 0; i < test_steps.size(); i++) {
			if (test_steps.get(i).contains("Failed") || test_steps.get(i).contains("Assertion")) {
				
				extent.log(LogStatus.FAIL, test_steps.get(i));
				captureAndAddScreenshot();
				extent.log(LogStatus.FAIL,extent.addScreenCapture(System.getProperty("user.dir") + "\\screenshots\\" + screenshotName));
				
			} else {

				extent.log(LogStatus.PASS, test_steps.get(i));
			}
			
		}
		if (!test_steps.get(test_steps.size()-1).contains("Failed")) {
			captureAndAddScreenshot();
			extent.log(LogStatus.PASS,extent.addScreenCapture(System.getProperty("user.dir") + "\\screenshots\\" + screenshotName));
				
				
		}else {
			test_steps.clear();
		}	
		/*
		if (test_steps.get(test_steps.size()-1).contains("Failed")) {
			test_steps.clear();
			assertTrue(false);
		}
		*/

	}

	public void AssertEqual(Object actualResult, Object expecttedResult, String message) {
	
		Assert.assertEquals(actualResult, expecttedResult, message);
	}

	public void verifyEquals(String expected, String actual, String message, ArrayList<String> testSteps) {
		testSteps.add(expected);
		testSteps.add(actual);
		Assert.assertEquals(actual, expected, message);
	}
	
	
	public static void captureScreenshot() {
		File scrFile = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.FILE);
		
		screenshotName = "Zain"+Utility.getTimeStamp() + ".jpg";
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\screenshots\\" + screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void captureAndAddScreenshot() {
	try {
			captureScreenshot();
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotName).build();
		} catch (IOException e) {
		}
	}
	public boolean verifyElementIsClickable(WebElement element) {
		return element.isEnabled();
	}
	
	public boolean isElementDisplayed(By actualResult) {
		WebElement element=getWebDriver().findElement(actualResult);
		return element.isDisplayed();
	}

	public WebElement getElement(By locator) {
		
		return getWebDriver().findElement(locator);
	}
	
}
