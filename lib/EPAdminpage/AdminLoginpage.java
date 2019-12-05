package lib.EPAdminpage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.locator.*;

public class AdminLoginpage {

	public static final String URL = null;
	public static final String TITLE = null;
	public static final String EMAIL = null;
	public static final String PASSWORD = null;

	public WebDriver driver;
	public WebDriverWait wait;

	public AdminLoginpage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	
	
	public AdminLoginpage verifyTitle(String title){                                  /*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}	
	public AdminLoginpage enterEmail(String email){                                   /* Enters Email address for login*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EPLogin.EMAIL)));
		driver.findElement(By.xpath(EPLogin.EMAIL)).clear();
		driver.findElement(By.xpath(EPLogin.EMAIL)).sendKeys(email);
		assertEquals(email, driver.findElement(By.xpath(EPLogin.EMAIL)).getAttribute("value"), "Entered email not displayed");
		return this;
	}
	public AdminLoginpage enterPassword(String password){                                /* Enters PAssword address for login*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EPLogin.PASSWORD)));
		driver.findElement(By.xpath(EPLogin.PASSWORD)).clear();
		driver.findElement(By.xpath(EPLogin.PASSWORD)).sendKeys(password);
		assertEquals(password, driver.findElement(By.xpath(EPLogin.PASSWORD)).getAttribute("value"), "Entered password not displayed");
		return this;
	}
	public AdminLoginpage clickOnLoginButton(){                                             /*Clicks on Login button*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Login.LOGINBTN)));
		driver.findElement(By.xpath(Login.LOGINBTN)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/input[1]")));
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {

		    e.printStackTrace();
		}				
	 return this;
	}
}
