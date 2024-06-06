package PageScreen;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.LoginPage;
import utils.Utility;
import utils.Waits;
import webelements.HomeScreenELements;

public class BrokenLinksPageScreen extends LoginPage {

//links on Home Page	
	public ArrayList<String> brokenLinks(String homePage) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Home Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

			// Number of links
			System.out.println("Number of total links on Home page" + " " + links.size());
			testSteps.add("Number of total links on this page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(homePage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of links
//			System.out.println(links.size());
//			testSteps.add("Number of links" + links.size());

//			for (int i = 0; i < links.size(); i++) {
//				// by using href attribute we can get URL of required links
//				WebElement element = links.get(i);
//				String url = element.getAttribute("href");
//
//				URL link = new URL(url);
//
//				// create a connection using url object 'link'
//				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
//				// wait for 2 sec
//				Thread.sleep(2000);
//
//				// establish connection
//				httpconn.connect();
//
//				int rescode = httpconn.getResponseCode();// return response code. if res code is above 400:broken links
//
//				if (rescode >= 400) {
//					System.out.println(url + " - " + "is broken link");
//					testSteps.add(url + " - " + "is broken link");
//				} else {
//					System.out.println(url + " - " + "is a valid link");
//					testSteps.add(url + " - " + "is a valid link");
//				}
//			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

//links on Locate Dealer Page
	public ArrayList<String> brokenLinksOnLocateDealerPage(String recallNewsPage)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Locate Dealer Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.locateDealerButton).click();
			Waits.wait10Second();

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));
//number of links 
			System.out.println("Number of total links on Locate Dealer page" + " " + links.size());
			testSteps.add("Number of total links on this page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(recallNewsPage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

//links on Recall News Page
	public ArrayList<String> brokenLinksOnRecallNewsPage(String RecallNewsPage)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Recall News Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.recallNewsPageButton).click();
			Waits.wait10Second();

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

			// number of links
			System.out.println("Number of total links on Recall News page" + " " + links.size());
			testSteps.add("Number of total links on this page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(RecallNewsPage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

//links on login page
	public ArrayList<String> brokenLinksOnLoginPage(String RecallNewsPage) throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Login Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			Waits.wait10Second();

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

			// number of links
			System.out.println("Number of total links on login page " + " " + links.size());
			testSteps.add("Number of total links on this page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(RecallNewsPage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// links on reset password
	public ArrayList<String> brokenLinksOnResetPasswordPage(String resetPasswordPage)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Reset Password Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Click on Login Button");
			Waits.wait10Second();

			Waits.wait5Second();
			getWebDriver().findElement(webelements.LoginPage.resetPasswordButton).click();
			testSteps.add("Click on Reset Password Button");
			Waits.wait10Second();

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

			// number of links
			System.out.println("Number of total links on Reset Password page" + " " + links.size());
			testSteps.add("Number of total links on this page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(resetPasswordPage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// links on Create Account Page
	public ArrayList<String> brokenLinksOnCreateAccountPage(String createAccountPage)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Create Account Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.loginButton).click();
			testSteps.add("Click on Login Button");
			Waits.wait10Second();

			Waits.wait15Second();
			getWebDriver().findElement(HomeScreenELements.signupCreateAccountButton).click();
			testSteps.add("Click on Create Account Button");
			Waits.wait10Second();

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

			// number of links
			System.out.println("Number of total links on Create Account page" + " " + links.size());
			testSteps.add("Number of total links on Create Account page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(createAccountPage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}

	// links on Logged in Page
	public ArrayList<String> brokenLinksOnAfterLoggedInPage(String AfterLoggedInPage, String email, String password)
			throws IOException, InterruptedException {
		ArrayList<String> testSteps = new ArrayList<String>();
		try {
			// open url of page
			testSteps.add("<b>Checked All Links On Logged In Page</b>");
			getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loadPage(Utility.getValue("loginUrl"));
			testSteps.add("Load Url");

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

			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;

			Thread.sleep(5000);

			Waits.wait10Second();
			// capture links from a webpage
			List<WebElement> links = getWebDriver().findElements(By.tagName("a"));

			// number of links
			System.out.println("Number of total links on After Logged In Page" + " " + links.size());
			testSteps.add("Number of total links on After Logged In Page" + links.size());

			Iterator<WebElement> it = links.iterator();

			while (it.hasNext()) {

				url = it.next().getAttribute("href");

				System.out.println(url);

				if (url == null || url.isEmpty()) {
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}

				if (!url.startsWith(AfterLoggedInPage)) {
					System.out.println("URL belongs to another domain, skipping it.");
					continue;
				}

				try {
					huc = (HttpURLConnection) (new URL(url).openConnection());

					huc.setRequestMethod("HEAD");

					huc.connect();

					respCode = huc.getResponseCode();

					if (respCode >= 400) {
						System.out.println(url + " - " + "is broken link");
						testSteps.add(url + " - " + "is broken link");
					} else {
						System.out.println(url + " - " + "is a valid link");
						testSteps.add(url + " - " + "is a valid link");
					}

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// Number of
		} catch (AssertionError e) {
			testSteps.add("Failed : " + e.toString());
		}

		return testSteps;
	}
}
