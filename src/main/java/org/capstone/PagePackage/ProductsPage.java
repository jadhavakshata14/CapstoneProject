package org.capstone.PagePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	WebDriver driver;
	 public ProductsPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	@FindBy(xpath="//*[text()='All Products']")
	public WebElement AllProducts;
	
	@FindBy(id="search_product")
	public WebElement SearchTextbox;
	
	@FindBy(id="submit_search")
	public WebElement SearchButton;
	
	@FindBy(xpath="//*[text()='Searched Products']")
	public WebElement SearchedProduct;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	 public WebElement AddSearchToCart1;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[3]")
	 public WebElement AddSearchToCart2;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[5]")
	 public WebElement AddSearchToCart3;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[7]")
	 public WebElement AddSearchToCart4;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[9]")
	 public WebElement AddSearchToCart5;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[11]")
	 public WebElement AddSearchToCart6;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[13]")
	 public WebElement AddSearchToCart7;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[15]")
	 public WebElement AddSearchToCart8;
	 
	 @FindBy(xpath="(//*[text()='Add to cart'])[17]")
	 public WebElement AddSearchToCart9;
	 
	 
	 @FindBy(xpath="//button[text()='Continue Shopping']")
	 public WebElement ContinueShoppingButton;
	 
	 public void addAllProductToCart()
	 {
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		 
		 AllProducts.isDisplayed();
		 SearchTextbox.sendKeys("dress");
		 SearchButton.click();
		 //SearchedProduct.isDisplayed();
		 
		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
	        js3.executeScript("window.scrollBy(0,450)", "");
	        
	        Actions act1 = new Actions(driver);
	        act1.moveToElement(AddSearchToCart1).click().build().perform();
		 ContinueShoppingButton.click();
		 act1.moveToElement(AddSearchToCart2).click().build().perform();
		 ContinueShoppingButton.click();
		act1.moveToElement(AddSearchToCart3).click().build().perform();
		 ContinueShoppingButton.click();
		 
		 JavascriptExecutor js4 = (JavascriptExecutor) driver;
	        js4.executeScript("window.scrollBy(0,450)", "");
	        
		 act1.moveToElement(AddSearchToCart4).click().build().perform();
		 ContinueShoppingButton.click();
		 act1.moveToElement(AddSearchToCart5).click().build().perform();
		 ContinueShoppingButton.click();
		 act1.moveToElement(AddSearchToCart6).click().build().perform();
		 ContinueShoppingButton.click();
		 
		 JavascriptExecutor js5 = (JavascriptExecutor) driver;
	        js5.executeScript("window.scrollBy(0,450)", "");
	        
		 act1.moveToElement(AddSearchToCart7).click().build().perform();
		 ContinueShoppingButton.click();
		 act1.moveToElement(AddSearchToCart8).click().build().perform();
		 ContinueShoppingButton.click();
		 act1.moveToElement(AddSearchToCart9).click().build().perform();
		 ContinueShoppingButton.click();
	 }
	 
	 @FindBy(xpath="(//*[text()='View Product'])[1]")
	 public WebElement ViewProduct;
	 
	 @FindBy(xpath="//*[@placeholder='Your Name']")
	 public WebElement Name;
	 
	 @FindBy(id="email")
	 public WebElement Email;
	 
	 @FindBy(id="review")
	 public WebElement AddReview;
	 
	 @FindBy(id="button-review")
	 public WebElement SubmitReview;
	 
	 public void addReview() throws InterruptedException, IOException
	 {
		 FileInputStream file1 = new FileInputStream("C:\\Users\\jadhav\\eclipse-workspace\\Capstone\\src\\main\\java\\org\\capstone\\BasePackage\\config.properties");
			Properties Prop = new Properties();
			Prop.load(file1);
			
		 ViewProduct.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		 //ViewProduct.click();
		 Thread.sleep(2000);
		 JavascriptExecutor js6 = (JavascriptExecutor) driver;
	        js6.executeScript("window.scrollBy(0,250)", "");
	       String name=Prop.getProperty("Cname");
		 Name.sendKeys(name);
		 String email=Prop.getProperty("Cemail");
		 Email.sendKeys(email);
		 String review=Prop.getProperty("Review");
		 AddReview.sendKeys(review);
		 SubmitReview.click();
	 }

}
