package lib.EPAdminpage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.locator.MngAds;

public class MngAdspage {

	public static final String URL = null;
	public static final String TITLE = null;
	
	public WebDriver driver;
	public WebDriverWait wait;

	public MngAdspage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	

	public MngAdspage verifyTitle(String title){ 
		/*Verifies the title*/
		assertEquals(title, driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;	
		return this;
	}
	
	public MngAdspage clickonMngAds() {                                    /* Clicks on Manage Advertisement button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MngAds.MNGADS)));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;	
		driver.findElement(By.xpath(MngAds.MNGADS)).click();
		return this;
	}
	
	public MngAdspage AdsView() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-tab-body[1]//div[2]/div[1]")));
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {

		    e.printStackTrace();
		}		
		return this;
	}
}
