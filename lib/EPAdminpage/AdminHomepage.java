package lib.EPAdminpage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.locator.EPHome;


public class AdminHomepage {
	public static final String URL = null;
	public static final String TITLE = null;
	
	public WebDriver driver;
	public WebDriverWait wait;

	public AdminHomepage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	
	public AdminHomepage launchUrl(String url){                                       /* Launches the Login page URL */
		driver.get(url);
		return this;
	}

	public AdminHomepage verifyTitle(String title){                                  /*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}
	
	public AdminHomepage EPClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EPHome.EPACC)));
		driver.findElement(By.xpath(EPHome.EPACC)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//form[1]/mat-card[1]")));
		return this;
	}
	
	
}
