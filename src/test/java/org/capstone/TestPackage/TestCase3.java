package org.capstone.TestPackage;

import java.io.IOException;

import org.capstone.BasePackage.BaseConfiguration;
import org.capstone.PagePackage.HomePage;
import org.capstone.PagePackage.SignupLoginpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase3 extends BaseConfiguration
{
	public HomePage hp;
	public SignupLoginpage slp;
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
	}
	
	@Test
	public void testCase3() throws IOException
	{
		hp.clickOnSignUpLoginTab();
		slp.verifyLoginText();
		slp.loginWithIncorrectCredentials();
		slp.verifyIncorrectCredentials();
		hp.quitBrowser();
	}

}
