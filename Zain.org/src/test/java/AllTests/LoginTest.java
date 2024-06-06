package AllTests;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.testng.annotations.Test;
import PageScreen.LoginPageScreen;
import pages.BasePage;
import utils.Utility;
import utils.Waits;
import webelements.BaseTest;

public class LoginTest extends BaseTest {

	ArrayList<String> testStep = new ArrayList<String>();
	String TestName;
	String TestDescription;
	String TestCatagory;
	LoginPageScreen loginPage = new LoginPageScreen();
	
	@Test(priority = 0)
	public void loginWithInValidEmail() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		TestName="Login Test With Invalid Email";
		TestDescription="Proceed to Login Screen";
		 TestCatagory="Proceed to Login Screen";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(Utility.getValue("invalidmobileoremail"),"",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
		
	}
	@Test(priority = 1)
	public void loginWithC23297() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="0096659";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23297";
		TestCatagory="C23297";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"),"",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
		
	}
//	
	@Test(priority = 2)
	public void loginWithC23298() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="96659";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23298";
		TestCatagory="C23298";
		try {
			Waits.wait2Second();
		
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"),"",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
		
	}
	@Test(priority = 3)
	public void loginWithC23299() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="+96659";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23299";
		TestCatagory="C23299";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
		
	}
	@Test(priority = 4)

	public void loginTestWithC23300() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="059";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23299";
		TestCatagory="C23299";
		try {
			Waits.wait2Second();
		
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 5)

	public void loginTestWithC23301() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="59";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23301";
		TestCatagory="C23301";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 6)

	public void loginTestWithC23329() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="0096658";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23329";
		TestCatagory="C23329";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 7)

	public void loginTestWithC23330() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="96658";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23330";
		TestCatagory="C23330";
		try {
			Waits.wait2Second();
		
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 8)

	public void loginTestWithC23331() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="+96658";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23331";
		TestCatagory="C23331";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 9)

	public void loginTestWithC23332() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="058";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23299";
		TestCatagory="C23299";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 10)

	public void loginTestWithC233323() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="58";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C233323";
		TestCatagory="C233323";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 11)

	public void loginTestWithC23302() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Message="This appears to be a data number. You have to enter your mobile number or email, and then add the data line";
		String number="831032037218";
		TestName="Login Test With MBB(Data And Number)";
		TestDescription="C23302";
		TestCatagory="C23302";
		Message="This appears to be a data number. You have to enter your mobile number or email, and then add the data line";
		try {
			Waits.wait2Second();
		
			testStep.addAll(loginPage.login(number, "",Message));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 12)

	public void loginTestWithC23303() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="0096659";
		Number="123";
		TestName="Login Test With Code "+code+" With 3 digit Number";
		TestDescription="C23303";
		TestCatagory="C23303";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Number, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(priority = 13)

	public void loginTestWithC23304() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="9665";
		Number="12345";
		TestName="Login Test With Code "+code+" With 5 digit Number";
		TestDescription="C23304";
		TestCatagory="C23304";
		try {
			Waits.wait2Second();
		
			testStep.addAll(loginPage.login(code+Number, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}

	@Test(priority = 14)

	public void loginTestWithC23305() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="+6659";
		Number="1234";
		TestName="Login Test With Code "+code+" With 4 digit Number";
		TestDescription="C23305";
		TestCatagory="C23305";
		try {
			Waits.wait2Second();
			
			testStep.addAll(loginPage.login(code+Number, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 15)

	public void loginTestWithC23306() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="05";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23306";
		TestCatagory="C23306";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 16)

	public void loginTestWithC23307() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="5";
		Number="123456789";
		TestName="Login Test With Code "+code+" With 9 digit Number";
		TestDescription="C23307";
		TestCatagory="C23307";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Number, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 17)

	public void loginTestWithC23310() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="57";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23310";
		TestCatagory="C23310";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 18)

	public void loginTestWithC23311() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="56";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23311";
		TestCatagory="C23311";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 19)

	public void loginTestWithC23312() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="54";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23312";
		TestCatagory="C23312";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 20)

	public void loginTestWithC23313() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="55";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23313";
		TestCatagory="C23313";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 21)

	public void loginTestWithC23314() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="54";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23314";
		TestCatagory="C23314";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 22)

	public void loginTestWithC23315() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="50";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23315";
		TestCatagory="C23315";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 23)

	public void loginTestWithC23316() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		code="51";
		TestName="Login Test With Code "+code+" With 7 digit Number";
		TestDescription="C23316";
		TestCatagory="C23316";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(code+Utility.getValue("mobileoremail"), "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
	@Test(priority = 24)

	public void loginTestWithC23287() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="test@test.com";
		TestName="Login Test With Email "+Email;
		TestDescription="C23287";
		TestCatagory="C23287";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 25)

	public void loginTestWithC23319() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="testtest.com";
		TestName="Login Test With Email "+Email;
		TestDescription="C23319";
		TestCatagory="C23319";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 26)

	public void loginTestWithC23320() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="testtestcom";
		Message="Please enter a valid email";
		TestName="Login Test With Email "+Email;
		TestDescription="C23320";
		TestCatagory="C23320";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",Message));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 27)

	public void loginTestWithC23321() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="test.test@com";
		TestName="Login Test With Email "+Email;
		TestDescription="C23321";
		TestCatagory="C23321";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 28)

	public void loginTestWithC23322() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="test@test.com.lb";
		TestName="Login Test With Email "+Email;
		TestDescription="C23322";
		TestCatagory="C23322";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "","Please enter a valid email"));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 29)

	public void loginTestWithC23323() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="test@test@co.com";
		Message="Please enter a valid email";
		TestName="Login Test With Email "+Email;
		TestDescription="C23323";
		TestCatagory="C23323";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",Message));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 30)

	public void loginTestWithC23324() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="test12@test12.com";
		Message="Please enter a valid email";
		TestName="Login Test With Email "+Email;
		TestDescription="C23324";
		TestCatagory="C23324";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",Message));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 31)

	public void loginTestWithC23325() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="CodeAutomation@gmail.com";
		TestName="Login Test With Email "+Email;
		TestDescription="C23325";
		TestCatagory="C23325";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",Message));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 32)

	public void loginTestWithC23326() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="Code@gmail.com";
		TestName="Login Test With Email "+Email;
		TestDescription="C23326";
		TestCatagory="C23326";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",Message));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	@Test(priority = 33)

	public void loginTestWithC23352() throws IOException, InterruptedException, ParseException {
		testStep.clear();
		Email="test@test.com";
		TestName="Login Test With Email "+Email;
		TestDescription="C23352";
		TestCatagory="C23352";
		try {
			Waits.wait2Second();
			testStep.addAll(loginPage.login(Email, "",code));
			BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
			
			} catch (Exception e) {
				testStep.add("Failed : " + e.toString());
				BasePage.AddTest_IntoReport(testStep,this.reports,TestName, TestDescription,TestCatagory);
				assertTrue(false);
			}
	}
	
}