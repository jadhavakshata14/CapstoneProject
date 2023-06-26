package org.capstone.PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	WebDriver driver;
	 public CartPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
	 public WebElement RemoveProduct1;
	 
	 @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
	 public WebElement RemoveProduct2;
	 
	 @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
	 public WebElement RemoveProduct3;
	 
	 @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
	 public WebElement RemoveProduct4;
	 
	 @FindBy(xpath="//a[@class='cart_quantity_delete']")
	 public WebElement RemoveProduct5;
	 
	 public void removeProduct() throws InterruptedException
	 {
		 RemoveProduct1.click();
		 Thread.sleep(2000);
		 RemoveProduct2.click();
		 Thread.sleep(2000);
		 RemoveProduct3.click();
		 Thread.sleep(2000);
		 RemoveProduct4.click();
		 Thread.sleep(2000);
		 RemoveProduct5.click();
	 }
	 
	 @FindBy(xpath="//*[text()='Cart is empty!']")
	 public WebElement CartEmptyText;
	 
	 public void verifyCartEmptyText()
	 {
		 System.out.println(CartEmptyText.isDisplayed());
	 }

}
