package lib.page;
import lib.locator.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;

public class Loginpage {
	public static final String URL = null;
	public static final String TITLE = null;
	public static final String EMAIL = null;
	public static final String PASSWORD = null;

	public WebDriver driver;
	public WebDriverWait wait;

	public Loginpage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	
	public Loginpage launchUrl(String url){                                       /* Launches the Login page URL */
		driver.get(url);
		//assertEquals(url,driver.getCurrentUrl());
		return this;
	}
	
	public Loginpage verifyTitle(String title){                                  /*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}	
	public Loginpage enterEmail(String email){                                   /* Enters Email address for login*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.EMAIL)));
		driver.findElement(By.cssSelector(Login.EMAIL)).clear();
		driver.findElement(By.cssSelector(Login.EMAIL)).sendKeys(email);
		assertEquals(email, driver.findElement(By.cssSelector(Login.EMAIL)).getAttribute("value"), "Entered email not displayed");
		return this;
	}
	public Loginpage enterPassword(String password){                                /* Enters PAssword address for login*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.PASSWORD)));
		driver.findElement(By.cssSelector(Login.PASSWORD)).clear();
		driver.findElement(By.cssSelector(Login.PASSWORD)).sendKeys(password);
		assertEquals(password, driver.findElement(By.cssSelector(Login.PASSWORD)).getAttribute("value"), "Entered password not displayed");
		return this;
	}
	public Loginpage clickOnLoginButton(){                                             /*Clicks on Login button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Login.LOGINBTN)));
		driver.findElement(By.cssSelector(Login.LOGINBTN)).click();
		driver.navigate().to("http://stream-ads.com/home");
		return this;
	}
}
