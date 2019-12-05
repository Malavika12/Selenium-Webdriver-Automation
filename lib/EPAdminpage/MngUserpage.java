package lib.EPAdminpage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import lib.locator.MngUsr;


public class MngUserpage {
	public static final String URL = null;
	public static final String TITLE = null;
	
	public WebDriver driver;
	public WebDriverWait wait;

	public MngUserpage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	

	public MngUserpage verifyTitle(String title){ 
		/*Verifies the title*/
		assertEquals(title, driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;	
		return this;
	}
	
	public MngUserpage clickonMngUsr() {                                    /* Clicks on Manage Advertisement button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MngUsr.MANAGE)));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;	
		driver.findElement(By.xpath(MngUsr.MANAGE)).click();
		return this;
	}
	
	public MngUserpage UsrView() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/table[1]")));
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {

		    e.printStackTrace();
		}		
		return this;
	}


}
