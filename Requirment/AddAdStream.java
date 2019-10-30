package Requirment;

import config.Configuration;
import org.testng.annotations.Test;
import lib.Data.Testdata.*;
import lib.page.*;

public class AddAdStream extends Configuration {
	
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
		Log.launchUrl(Logindata.URL)
		.verifyTitle(Logindata.TITLE)
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
		Ad.launchUrl(ViewAddata.URL)
		.verifyTitle(ViewAddata.TITLE)
		.clickonManageButton()
		.View();
		
		}
		
		@Test(priority=4) /*Priority given for executing test cases in order*/
		public void AddAd()throws Exception{
			
			AddAdpage Add= new AddAdpage(super.driver, super.wait);
			Add.launchUrl(AddAddata.URL)
			.verifyMTitle(AddAddata.MTITLE)
			.clickonAddAdButton()
			.AddTitle(AddAddata.TITLE)
			.AddCategory()
			.StartDate(AddAddata.START)
			.EndDate(AddAddata.END)
			.SelectDevice(AddAddata.DEVICE)
			.File(AddAddata.CHOOSEFILE)
			.Preview()
			.Proceed();
		}
	
}

