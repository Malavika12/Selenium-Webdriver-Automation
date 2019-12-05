package Requirment;
import org.testng.annotations.Test;
import config.Configuration;
import lib.Data.Testdata.*;
import lib.Userpage.*;

public class Homestream extends Configuration {
	@Test(priority=1) /* Priority given for executing test cases in order*/ 
	public void Home()throws Exception{ /*exception handler */

	/*PAGE INSTANTIATIONS : instantiating required page classes*/
	Homepage Hom = new Homepage(super.driver, super.wait);


	/*ASSERTIONS /
	/ PAGE METHODS /
	/ Object.method(); */
	Hom.launchUrl(Homedata.URL)
	.verifyTitle(Homedata.TITLE)
	.clickOnLoginButton();
	}
	 
	

		@Test(priority=2) /* Priority given for executing test cases in order*/ 
		public void Login()throws Exception{ /*exception handler */

		/*PAGE INSTANTIATIONS : instantiating required page classes*/
		Loginpage Log = new Loginpage(super.driver, super.wait);


		/*ASSERTIONS /
		/ PAGE METHODS /
		/ Object.method(); */
		Log.verifyTitle(Logindata.TITLE)
		.enterEmail(Logindata.EMAIL)
		.enterPassword(Logindata.PASSWORD)
		.clickOnLoginButton();
		}
		
		@Test(priority=3) /* Priority given for executing test cases in order*/ 
		public void ViewAd()throws Exception{ /*exception handler */

		/*PAGE INSTANTIATIONS : instantiating required page classes*/
		ViewAdpage Ad = new ViewAdpage(super.driver, super.wait);


		/*ASSERTIONS /
		/ PAGE METHODS /
		/ Object.method(); */
		Ad.verifyTitle(ViewAddata.TITLE)
		.clickonManageButton()
		.View();
		
		}
		
		@Test(priority=4) /* Priority given for executing test cases in order*/ 
		public void Logout()throws Exception{ /*exception handler */

		/*PAGE INSTANTIATIONS : instantiating required page classes*/
		Logoutpage lg = new Logoutpage(super.driver, super.wait);


		/*ASSERTIONS /
		/ PAGE METHODS /
		/ Object.method(); */
		lg.verifyTitle(Logoutdata.TITLE)
		.clickonLogoutButton();
		}
}
