package org.capstone.TestPackage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.capstone.BasePackage.BaseConfiguration;
import org.capstone.PagePackage.HomePage;
import org.capstone.PagePackage.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase6 extends BaseConfiguration
{
	public HomePage hp;
	public ProductsPage pp;
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
	}
	
	@Test
	public void testCase6() throws InterruptedException, IOException
	{
		hp.clickOnProductTab();
		pp.addReview();
		hp.quitBrowser();
	}
}
