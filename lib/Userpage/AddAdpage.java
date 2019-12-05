
package lib.Userpage;

import lib.Data.Testdata.AddAddata;
import lib.locator.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.junit.Assert;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;


	public class AddAdpage {

		public static final String URL = null;
		public static final String MTITLE = null;
		public static final String ADDADBTN = null;
		public static final String TITLE = null;		
		
		public WebDriver driver;
		public WebDriverWait wait;

		public AddAdpage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
		
		public AddAdpage verifyMTitle(String mtitle){                                  /*Verifies the title*/
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS) ;			
			assertEquals(mtitle, driver.getTitle());
			return this;
		}
		
		public AddAdpage clickonAddAdButton() {                                    /* Clicks on Manage Advertisement button*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddAd.ADDADBTN)));
			driver.findElement(By.cssSelector(AddAd.ADDADBTN)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]//span[1]/label[1]")));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;	
			return this;
		}
		 public AddAdpage AddTitle(String title) {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(AddAd.TITLE)));
			 driver.findElement(By.name(AddAd.TITLE)).clear();
			 driver.findElement(By.name(AddAd.TITLE)).sendKeys(title);
			return this;
		 }
		 
		 public AddAdpage AddCategory() {
			 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddAd.CATEGORY)));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddAd.CATEGORY)));
			 driver.findElement(By.xpath(AddAd.CATEGORY)).click();

			 driver.switchTo().activeElement();
			  Actions builder1 = new Actions(driver);
			  Action seriesOfActions1 = builder1
			  	.sendKeys(Keys.ARROW_DOWN)
			  	.sendKeys(Keys.ARROW_DOWN)
			  	.sendKeys(Keys.ARROW_DOWN)
			  	.sendKeys(Keys.ENTER)
			  	.build();
			  	seriesOfActions1.perform() ;
				driver.manage().timeouts().implicitlyWait(460, TimeUnit.SECONDS) ;
				
				return this;
			 
		 }
		 
		 public AddAdpage StartDate() {
			 wait = new WebDriverWait(driver,999972000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddAd.START)));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddAd.START)));
			 driver.findElement(By.xpath(AddAd.START)).click();
			 
			 driver.switchTo().activeElement();
			 Actions date1 = new Actions(driver);
			 Action dateSelect1 = date1
					 .sendKeys(Keys.ENTER)
					 .build();
			 	dateSelect1.perform();
			 	driver.manage().timeouts().implicitlyWait(460, TimeUnit.SECONDS) ;	

			 return this;
		 }
		 
		 public AddAdpage EndDate()
		 {
			 wait = new WebDriverWait(driver,999982000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddAd.END)));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddAd.END)));
			 driver.findElement(By.xpath(AddAd.END)).click();
			 
			 
			 driver.switchTo().activeElement();
			 Actions date2 = new Actions(driver);
			 Action dateSelect2 = date2
					 .sendKeys(Keys.ARROW_RIGHT)
					 .sendKeys(Keys.ENTER)
					 .build();
			 	dateSelect2.perform();
			 	driver.manage().timeouts().implicitlyWait(460, TimeUnit.SECONDS) ;	
			 
			 	return this;
		 }
		 
		 public AddAdpage SelectDevice() {
			 wait = new WebDriverWait(driver,999992000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddAd.DEVICE)));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddAd.DEVICE)));
			 driver.findElement(By.xpath(AddAd.DEVICE)).sendKeys(Keys.RETURN);
			 
			 //click on option
			  driver.switchTo().activeElement();
			  Actions builder2 = new Actions(driver);
			  Action seriesOfActions2 = builder2
			  	.sendKeys(Keys.ARROW_RIGHT)
			  	.sendKeys(Keys.ARROW_RIGHT)
			  	.sendKeys(Keys.ENTER)
			  	.build();
			  	seriesOfActions2.perform() ;
			 	driver.manage().timeouts().implicitlyWait(460, TimeUnit.SECONDS) ;	
			 
			 	return this;
		 }
		 
		 public AddAdpage File() {
			 wait = new WebDriverWait(driver,1100002000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddAd.CHOOSEFILE)));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddAd.CHOOSEFILE)));
			 driver.findElement(By.xpath(AddAd.CHOOSEFILE)).sendKeys(AddAddata.CHOOSEFILE);
			 	driver.manage().timeouts().implicitlyWait(460, TimeUnit.SECONDS) ;	
			 	
			 	return this;
		 }
		 
		 public AddAdpage Preview() {
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AddAd.PREVIEW)));
			 driver.findElement(By.xpath(AddAd.PREVIEW)).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-sidenav-content[1]//div[1]/mat-card[4]")));
			 
			 return this;
		 }
			
		 
		 public AddAdpage Proceed() {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddAd.PROCEED)));
			 driver.findElement(By.xpath(AddAd.PROCEED)).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-sidenav-content[1]/app-advertisement[1]/div[1]/div[2]/div[1]")));
			 try {
				    Thread.sleep(160);
				} catch (InterruptedException e) {

				    e.printStackTrace();
				}				
			 return this;
		 }
		 
		 
}
