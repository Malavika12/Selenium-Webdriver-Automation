package lib.page;
import lib.locator.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;

public class Homepage {
	public static final String URL = null;
	public static final String TITLE = null;
	
	public WebDriver driver;
	public WebDriverWait wait;

	public Homepage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	
	public Homepage launchUrl(String url){                                       /* Launches the Login page URL */
		driver.get(url);
		//assertEquals(url,driver.getCurrentUrl());
		return this;
	}

	public Homepage verifyTitle(String title){                                  /*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}
	
	
	
	public Homepage clickOnLoginButton(){                                             /*Clicks on Login button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Home.LOGBTN)));
		driver.findElement(By.xpath(Home.LOGBTN)).click();
		driver.navigate().to("http://stream-ads.com/#home");
		return this;
	}
	
}
