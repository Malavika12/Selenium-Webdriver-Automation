package lib.Userpage;

import lib.locator.ViewAd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;
//import java.util.concurrent.TimeUnit;


public class ViewAdpage {

	public static final String URL = null;
	public static final String TITLE = null;
	
	public WebDriver driver;
	public WebDriverWait wait;

	public ViewAdpage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	

	public ViewAdpage verifyTitle(String title){ 
		/*Verifies the title*/
		assertEquals(title, driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;	
		return this;
	}
	
	public ViewAdpage clickonManageButton() {                                    /* Clicks on Manage Advertisement button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ViewAd.MANAGE)));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;	
		driver.findElement(By.cssSelector(ViewAd.MANAGE)).click();
		return this;
	}
	
	public ViewAdpage View() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("app-advertisement > div.content")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-advertisement//mat-form-field/div/div[1]/div")));
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {

		    e.printStackTrace();
		}		
		return this;
	}
	
	
	
	
	
}
