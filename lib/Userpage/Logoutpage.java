package lib.Userpage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.locator.Logout;

public class Logoutpage {

	public static final String TITLE = null;
	public static final String LOGOUT = null;

	public WebDriver driver;
	public WebDriverWait wait;

	public Logoutpage(WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
}
	public Logoutpage verifyTitle(String title){ 
		/*Verifies the title*/
		assertEquals(title, driver.getTitle());
		return this;
	}
	
	public Logoutpage clickonLogoutButton() {   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Logout.LOGOUT)));
		driver.findElement(By.xpath(Logout.LOGOUT)).click();
		return this;
	}
}
