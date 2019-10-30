package lib.page;

import lib.locator.ViewAd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;


public class ViewAdpage {

	public static final String URL = null;
	public static final String TITLE = null;
	
	public WebDriver driver;
	public WebDriverWait wait;

	public ViewAdpage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	
	public ViewAdpage launchUrl(String url){                                       /* Launches the Login page URL */
		driver.get(url);
		//assertEquals(url,driver.getCurrentUrl());
		return this;
	}

	public ViewAdpage verifyTitle(String title){                                  /*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}
	
	public ViewAdpage clickonManageButton() {                                    /* Clicks on Manage Advertisement button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ViewAd.MANAGE)));
		driver.findElement(By.cssSelector(ViewAd.MANAGE)).click();
		driver.navigate().to("http://stream-ads.com/home/advertisement");
		return this;
	}
	
	public ViewAdpage View() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ViewAd.AD)));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return this;
	}
	
	
	
}
