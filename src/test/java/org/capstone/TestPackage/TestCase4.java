package org.capstone.TestPackage;

import java.net.MalformedURLException;

import org.capstone.BasePackage.BaseConfiguration;
import org.capstone.PagePackage.CartPage;
import org.capstone.PagePackage.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase4 extends BaseConfiguration
{
	public HomePage hp;
	public CartPage cp;
	public String port;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeMethod
	public void initialSetup(String Port) throws InterruptedException, MalformedURLException
	{
		this.port = Port;
		driver = setup(port);
		hp = new HomePage(driver);
		cp = new CartPage(driver);
	}
	
	@Test
	public void testCase4() throws InterruptedException
	{
		hp.addProductToCart();
		hp.clickOnCart();
		cp.removeProduct();
		cp.verifyCartEmptyText();
		hp.quitBrowser();
	}
}
