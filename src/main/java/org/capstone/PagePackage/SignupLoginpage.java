package org.capstone.PagePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class SignupLoginpage
{
	WebDriver driver;
	
	public SignupLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='New User Signup!']")
	public WebElement SignupText;
	
	public void verifySignupText()
	{
		System.out.println(SignupText.isDisplayed());
	}
	
	
	@FindBy(xpath="//*[text()='New User Signup!']")
	public WebElement NewSignupUser;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement SignupName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement SignupEmail;
	
	@FindBy(xpath="//button[text()='Signup']")
	public WebElement SignupButton;
	
	@Parameters({"Port"})
	public void signup(String Port) throws IOException
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\jadhav\\eclipse-workspace\\Capstone\\src\\main\\java\\org\\capstone\\BasePackage\\config.properties");
		Properties Prop = new Properties();
		Prop.load(file1);
		if(Port.equalsIgnoreCase("5555"))
		{
			String name=Prop.getProperty("Cname");
			SignupName.sendKeys(name);
			String email=Prop.getProperty("Cemail");
			SignupEmail.sendKeys(email);
			SignupButton.click();
		}
		else
		{
			String name=Prop.getProperty("Ename");
			SignupName.sendKeys(name);
			String email=Prop.getProperty("Eemail");
			SignupEmail.sendKeys(email);
			SignupButton.click();
		}
	}
	
	@FindBy(xpath="//*[text()='Login to your account']")
	public WebElement LoginText;
	
	public void verifyLoginText()
	{
		LoginText.isDisplayed();
	}
	
	public void signupForCorrectCredentials(String Port) throws IOException
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\jadhav\\eclipse-workspace\\Capstone\\src\\main\\java\\org\\capstone\\BasePackage\\config.properties");
		Properties Prop = new Properties();
		Prop.load(file1);
		if(Port.equalsIgnoreCase("5555"))
		{
			String name=Prop.getProperty("Cname1");
			SignupName.sendKeys(name);
			String email=Prop.getProperty("Cemail1");
			SignupEmail.sendKeys(email);
			SignupButton.click();
		
		}
		else
		{
			String name=Prop.getProperty("Ename1");
			SignupName.sendKeys(name);
			String email=Prop.getProperty("Eemail1");
			SignupEmail.sendKeys(email);
			SignupButton.click();
		}
	}
	@FindBy(xpath="(//*[@placeholder='Email Address'])[1]")
	public WebElement LoginEmail;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	public WebElement LoginPassword;
	
	@FindBy(xpath="//*[text()='Login']")
	public WebElement LoginButton;
	
	@Parameters({"Port"})
	public void loginWithCorrectCredentials(String Port) throws IOException
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\jadhav\\eclipse-workspace\\Capstone\\src\\main\\java\\org\\capstone\\BasePackage\\config.properties");
		Properties Prop = new Properties();
		Prop.load(file1);
		if(Port.equalsIgnoreCase("5555"))
		{
			String email=Prop.getProperty("Cemail1");
			LoginEmail.sendKeys(email);
			String password=Prop.getProperty("password");
			LoginPassword.sendKeys(password);
			LoginButton.click();
		}
		else
		{
			String email=Prop.getProperty("Cemail1");
			LoginEmail.sendKeys(email);
			String password=Prop.getProperty("password");
			LoginPassword.sendKeys(password);
			LoginButton.click();
		}
	}
	
	public void loginWithIncorrectCredentials() throws IOException
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\jadhav\\eclipse-workspace\\Capstone\\src\\main\\java\\org\\capstone\\BasePackage\\config.properties");
		Properties Prop = new Properties();
		Prop.load(file1);
		String email1=Prop.getProperty("email1");
		LoginEmail.sendKeys(email1);
		String password1=Prop.getProperty("password1");
		LoginPassword.sendKeys(password1);
		LoginButton.click();
	}
	
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']")
	public WebElement IncorrectCredentials;
	
	public void verifyIncorrectCredentials()
	{
		System.out.println(IncorrectCredentials.isDisplayed());
	}
}
