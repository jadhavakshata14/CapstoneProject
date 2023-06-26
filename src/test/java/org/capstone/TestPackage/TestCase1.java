package org.capstone.TestPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import org.capstone.BasePackage.BaseConfiguration;
import org.capstone.PagePackage.AccountCreatedPage;
import org.capstone.PagePackage.CreateAccountPage;
import org.capstone.PagePackage.DeleteAccountPage;
import org.capstone.PagePackage.HomePage;
import org.capstone.PagePackage.SignupLoginpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 extends BaseConfiguration
{
	public HomePage hp;
	public SignupLoginpage slp;
	public CreateAccountPage cap;
	public AccountCreatedPage acp;
	public DeleteAccountPage dap;
	public String port;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeMethod
	public void initialSetup(String Port) throws InterruptedException, MalformedURLException
	{
		this.port = Port;
		driver = setup(port);
		hp = new HomePage(driver);
 		slp = new SignupLoginpage(driver);
		cap = new CreateAccountPage(driver);
		acp = new AccountCreatedPage(driver);
		dap = new DeleteAccountPage(driver);
		
	}
	
	@Test
	public void testCase1() throws InterruptedException, IOException
	{
		hp.clickOnSignUpLoginTab();
		slp.verifySignupText();
		slp.signup(port);
		cap.createAccount();
		acp.clickOnContinueButton();
		hp.loggedInAs();
		hp.clickOnDeleteAccount();
		dap.accountDeleted();
		hp.quitBrowser();
	}
	

}
