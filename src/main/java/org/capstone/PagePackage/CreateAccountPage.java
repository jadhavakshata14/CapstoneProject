package org.capstone.PagePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage 
{
	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="uniform-id_gender2")
	public WebElement GenderRadio;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="days")
	public WebElement DayDropdown;
	
	@FindBy(id="months")
	public WebElement MonthDropdown;
	
	@FindBy(id="years")
	public WebElement YearDropdown;
	
	@FindBy(id="newsletter")
	public WebElement NewsletterCheckbox;
	
	@FindBy(id="optin")
	public WebElement OfferCheckbox;
	
	@FindBy(id="first_name")
	public WebElement FirstName;
	
	@FindBy(id="last_name")
	public WebElement LastName;
	
	@FindBy(id="company")
	public WebElement Company;
	
	@FindBy(id="address1")
	public WebElement Address1;
	
	@FindBy(id="address2")
	public WebElement Address2;
	
	@FindBy(id="state")
	public WebElement State;
	
	@FindBy(id="city")
	public WebElement City;
	
	@FindBy(id="zipcode")
	public WebElement Zipcode;
	
	@FindBy(id="mobile_number")
	public WebElement MobileNumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement CreateAccountButton;
	
	public void createAccount() throws IOException
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\jadhav\\git\\CapstoneProject\\CapstoneProject\\src\\main\\java\\config\\config.properties");
		Properties Prop = new Properties();
		Prop.load(file1);
		
		GenderRadio.click();
		String password=Prop.getProperty("password");
		Password.sendKeys(password);
		Select s = new Select(DayDropdown);
		s.selectByVisibleText("11");
		Select s1 = new Select(MonthDropdown);
		s1.selectByVisibleText("June");
		Select s2 = new Select(YearDropdown);
		s2.selectByVisibleText("2011");
		NewsletterCheckbox.click();
		OfferCheckbox.click();
		String fname=Prop.getProperty("Fname");
		FirstName.sendKeys(fname);
		String lname=Prop.getProperty("Lname");
		LastName.sendKeys(lname);
		String company=Prop.getProperty("Company");
		Company.sendKeys(company);
		String address1=Prop.getProperty("Address1");
		Address1.sendKeys(address1);
		String address2=Prop.getProperty("Address2");
		Address2.sendKeys(address2);
		String state=Prop.getProperty("State");
		State.sendKeys(state);
		String city=Prop.getProperty("City");
		City.sendKeys(city);
		String zipcode=Prop.getProperty("Zipcode");
		Zipcode.sendKeys(zipcode);
		String mobno=Prop.getProperty("MobileNumber");
		MobileNumber.sendKeys(mobno);
		CreateAccountButton.click();
	}

}
