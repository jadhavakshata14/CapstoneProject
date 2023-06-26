package org.capstone.TestPackage;

import java.io.IOException;

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

public class TestCase2 extends BaseConfiguration
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
	public void initialSetup(String Port) throws Exception
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
	public void testCase2() throws InterruptedException, IOException
	{
		hp.clickOnSignUpLoginTab();
		slp.signupForCorrectCredentials(port);
		cap.createAccount();
		acp.clickOnContinueButton();
		hp.clickOnLogout();
		hp.clickOnSignUpLoginTab();
		slp.verifyLoginText();
		slp.loginWithCorrectCredentials(port);
		hp.loggedInAs();
		hp.clickOnDeleteAccount();
		dap.accountDeleted();
		hp.quitBrowser();
	}


}
