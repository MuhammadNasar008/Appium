package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void wait1Second() throws InterruptedException {
		Thread.sleep(1000);
	}

	public static void wait2Second() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void wait3Second() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void wait5Second() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void wait10Second() throws InterruptedException {
		Thread.sleep(10000);
	}

	public static void wait15Second() throws InterruptedException {
		Thread.sleep(16000);
	}

	public static void wait25Second() throws InterruptedException {
		Thread.sleep(26000);
	}
	public static void waitForElementToBeVisibile(By xpath, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));

	}

	public static void waitForElementToBeClickable(By xpath, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(xpath));

	}

}
