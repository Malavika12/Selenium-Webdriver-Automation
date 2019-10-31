
package lib.page;

import lib.locator.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;


import java.util.concurrent.TimeUnit;


	public class AddAdpage {

		public static final String URL = null;
		public static final String MTITLE = null;
		public static final String ADDADBTN = null;
		public static final String TITLE = null;
		
		public static final String START = null;
		public static final String END = null;
		public static final String DEVICE = null;
		public static final String CHOOSEFILE = null;
		
		public WebDriver driver;
		public WebDriverWait wait;

		public AddAdpage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
		
		public AddAdpage launchUrl(String url){                                       /* Launches the Login page URL */
			driver.get(url);
			//assertEquals(url,driver.getCurrentUrl());
			return this;
		}

		public AddAdpage verifyMTitle(String title){                                  /*Verifies the title*/
			assertEquals(title, driver.getTitle());
			return this;
		}
		
		public AddAdpage clickonAddAdButton() {                                    /* Clicks on Manage Advertisement button*/
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddAd.ADDADBTN)));
			driver.findElement(By.cssSelector(AddAd.ADDADBTN)).click();
			driver.navigate().to("http://stream-ads.com/home/addAdvertisement");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
			return this;
		}
		 public AddAdpage AddTitle(String title) {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddAd.TITLE)));
			 driver.findElement(By.cssSelector(AddAd.TITLE)).clear();
			 driver.findElement(By.cssSelector(AddAd.TITLE)).sendKeys(title);
			return this;
		 }
		 
		 public AddAdpage AddCategory() {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-select-0\"]")));
			 driver.findElement(By.xpath("//span[contains(text(), 'Advertisement Category')]")).click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//span[contains(text(), 'Food')]/..")).click();
			 return this;
			 
		 }
		 
		 public AddAdpage StartDate(String start) {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddAd.START)));
			 driver.findElement(By.cssSelector(AddAd.START)).sendKeys(start);
			 return this;
		 }
		 
		 public AddAdpage EndDate(String end)
		 {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(AddAd.END)));
			 driver.findElement(By.cssSelector(AddAd.END)).sendKeys(end);
			 return this;
		 }
		 
		 public AddAdpage SelectDevice(String device) {
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(AddAd.DEVICE)));
			 driver.findElement(By.cssSelector(AddAd.DEVICE)).sendKeys(device);
			 return this;
		 }
		 
		 public AddAdpage File(String file) {
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(AddAd.CHOOSEFILE)));
			 driver.findElement(By.name(AddAd.CHOOSEFILE)).sendKeys(file);
			 return this;
		 }
		 
		 public AddAdpage Preview() {
			 wait.until(ExpectedConditions.elementToBeClickable(By.className(AddAd.PREVIEW)));
			 driver.findElement(By.className(AddAd.PREVIEW)).click();
			 //driver.navigate().to("http://stream-ads.com/home/preview");
			 return this;
		 }
		 
		 public AddAdpage Proceed() {
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(AddAd.PROCEED)));
			 driver.findElement(By.className(AddAd.PROCEED)).click();
			 driver.navigate().refresh();
			 return this;
		 }
}
