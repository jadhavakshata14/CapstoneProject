package org.capstone.TestPackage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.capstone.BasePackage.BaseConfiguration;
import org.capstone.PagePackage.CartPage;
import org.capstone.PagePackage.HomePage;
import org.capstone.PagePackage.ProductsPage;
import org.capstone.PagePackage.SignupLoginpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase5 extends BaseConfiguration
{
	public HomePage hp;
	public ProductsPage pp;
	public CartPage cp;
	public SignupLoginpage slp;
	public String port;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeMethod
	public void initialSetup(String Port) throws InterruptedException, MalformedURLException
	{
		this.port = Port;
		driver = setup(port);
		hp = new HomePage(driver);
		pp = new ProductsPage(driver);
		cp = new CartPage(driver);
 		slp = new SignupLoginpage(driver);
	}
	
	@Test
	public void testCase5() throws IOException
	{
		hp.clickOnProductTab();
		pp.addAllProductToCart();
		hp.clickOnCart();
		hp.clickOnSignUpLoginTab();
		slp.loginWithCorrectCredentials(port);
		hp.clickOnCart();
		hp.quitBrowser();
	}
}
