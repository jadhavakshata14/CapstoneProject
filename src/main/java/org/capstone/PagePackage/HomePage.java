package org.capstone.PagePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	public WebElement SignUpLoginTab;
	
	@FindBy(xpath="//a[text()=' Products']")
	public WebElement ProductTab;
	
	public void clickOnSignUpLoginTab()
	{
		SignUpLoginTab.click();	
	}
	
	public void clickOnProductTab()
	{
		ProductTab.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		 ProductTab.click();
	}
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	 public WebElement AddToCart1;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[3]")
	 public WebElement AddToCart2;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[5]")
	 public WebElement AddToCart3;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[7]")
	 public WebElement AddToCart4;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[9]")
	 public WebElement AddToCart5;
	 
	 @FindBy(xpath="//button[text()='Continue Shopping']")
	 public WebElement ContinueShoppingButton;
	
	public void addProductToCart()
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,450)", "");
        
        Actions act = new Actions(driver);
        act.moveToElement(AddToCart1).click().build().perform();
	 ContinueShoppingButton.click();
	 act.moveToElement(AddToCart2).click().build().perform();
	 ContinueShoppingButton.click();
	act.moveToElement(AddToCart3).click().build().perform();
	 ContinueShoppingButton.click();
	 
	 JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,450)", "");
        
	 act.moveToElement(AddToCart4).click().build().perform();
	 ContinueShoppingButton.click();
	 act.moveToElement(AddToCart5).click().build().perform();
	 ContinueShoppingButton.click();
	}
	
	@FindBy(xpath="//*[text()=' Cart']")
	public WebElement CartButton;
	
	public void clickOnCart()
	{
		CartButton.click();
	}
	
	@FindBy(xpath="//*[text()=' Logged in as ']")
	public WebElement LoggedInAs;
	
	public void loggedInAs()
	{
		System.out.println(LoggedInAs.isDisplayed());
	}
	
	@FindBy(xpath="//a[text()=' Delete Account']")
	public WebElement DeleteAccount;
	
	public void clickOnDeleteAccount()
	{
		DeleteAccount.click();
	}
	
	@FindBy(xpath="//a[text()=' Logout']")
	public WebElement LogOutButton;
	
	public void clickOnLogout()
	{
		LogOutButton.click();
	}
	public void quitBrowser()
	{
		driver.quit();
	}

}
