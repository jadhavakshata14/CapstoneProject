package org.capstone.BasePackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseConfiguration
{
String nodeURL;
	
	static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public WebDriver getDriver(){
			return driver.get();
		}
		
		public void setDriver(WebDriver driver) {
			BaseConfiguration.driver.set(driver);
		}
	
	public WebDriver setup(String Port) throws MalformedURLException {
		if (Port.equalsIgnoreCase("5555")) {
			nodeURL = "http://192.168.43.25:4444/wd/hub";
			System.out.println("Chrome Browser Initiated");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);

			setDriver( new RemoteWebDriver(new URL(nodeURL), capabilities));
			
			getDriver().get("https://www.automationexercise.com/");
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}

		else if (Port.equalsIgnoreCase("6666")) {
			nodeURL = "http://192.168.43.25:4444/wd/hub";
			System.out.println("Microsoft Edge Browser Initiated");
			DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
			capabilities1.setBrowserName("MicrosoftEdge");
			capabilities1.setPlatform(Platform.WINDOWS);

			setDriver(new RemoteWebDriver(new URL(nodeURL), capabilities1));
		
			getDriver().get("https://www.automationexercise.com/");
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		return getDriver();
	}

}
