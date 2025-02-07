package utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebSetup {
	public static WebSetup instance;

	private WebDriver driver;

	public static WebSetup getInstance() {
		if (instance == null)
			instance = new WebSetup();
		return instance;
	}

	public void nullDriver() {
		driver = null;
	}

	public WebDriver initDriver() {
		if (driver == null) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("prefs", prefs);
			System.setProperty("webdriver.chrome.driver",
					(System.getProperty("user.dir") + "/driver/chromedriver.exe"));
			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}