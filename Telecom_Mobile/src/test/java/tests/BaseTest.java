package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import utils.Utility;
import utils.Waits;
import utils.WebSetup;

public class BaseTest {
	ExtentReports extent;
	public static WebDriver driver;
	public static ExtentReports reports;
	public static String reportName;
	public static String code;
	public static String Number;
	public static String Email;
	public static String Message;
	public static String NewPassword;
	public static String Scenario;
	public static String ID;
	public static String customReportName="MotorSafety";
	
	public WebDriver driver() {
		return WebSetup.getInstance().initDriver();

	}

	public void refreshPage() throws InterruptedException {
		driver().navigate().refresh();
		Waits.wait10Second();
	}

	@BeforeTest
	public ExtentReports startReport() {
		reports = new ExtentReports(
//				System.getProperty("user.dir") + "/reports/LoginTest" + Utility.getTimeStamp() + ".html", true);
				System.getProperty("user.dir") + "/reports/"+ customReportName + Utility.getTimeStamp() + ".html", true);
		return reports;

	}
@AfterSuite
public void flush() {
	reports.flush();
}
	@AfterTest
	public void killDriver() {
		
		driver().close();
		WebSetup.getInstance().nullDriver();
	}

}
