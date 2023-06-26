package org.capstone.PagePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage
{
	WebDriver driver;
	
	public AccountCreatedPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Continue']")
	public WebElement ContinueButton;
	
	public void clickOnContinueButton() throws InterruptedException
	{
		ContinueButton.click();
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		 js5.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		 //Thread.sleep(2000);
		 ContinueButton.click();
		 Thread.sleep(2000);
	}

}
