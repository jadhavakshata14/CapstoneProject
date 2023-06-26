package org.capstone.PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage 
{
	WebDriver driver;
	
	public DeleteAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Account Deleted!']")
	public WebElement AccountDeleted;
	
	public void accountDeleted()
	{
		System.out.println(AccountDeleted.isDisplayed());
	}

}
