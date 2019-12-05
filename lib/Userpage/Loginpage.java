package lib.Userpage;
//import lib.Data.Testdata.Logindata;
import lib.locator.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

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
	
	
	public Loginpage verifyTitle(String title){                                  /*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}	
	public Loginpage enterEmail(String email){                                   /* Enters Email address for login*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Login.EMAIL)));
		driver.findElement(By.name(Login.EMAIL)).clear();
		driver.findElement(By.name(Login.EMAIL)).sendKeys(email);
		assertEquals(email, driver.findElement(By.name(Login.EMAIL)).getAttribute("value"), "Entered email not displayed");
		return this;
	}
	public Loginpage enterPassword(String password){                                /* Enters PAssword address for login*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Login.PASSWORD)));
		driver.findElement(By.name(Login.PASSWORD)).clear();
		driver.findElement(By.name(Login.PASSWORD)).sendKeys(password);
		assertEquals(password, driver.findElement(By.name(Login.PASSWORD)).getAttribute("value"), "Entered password not displayed");
		return this;
	}
	public Loginpage clickOnLoginButton(){                                             /*Clicks on Login button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Login.LOGINBTN)));
		driver.findElement(By.xpath(Login.LOGINBTN)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		return this;
	}
}
