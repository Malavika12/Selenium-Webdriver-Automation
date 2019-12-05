package Requirment;

import org.testng.annotations.Test;

import config.Configuration;
import lib.Data.EPTestdata.*;
import lib.EPAdminpage.*;



public class EPAccStream extends Configuration {
		
	@Test(priority=1) /* Priority given for executing test cases in order*/ 
		public void EPHome()throws Exception{ /*exception handler */

		/*PAGE INSTANTIATIONS : instantiating required page classes*/
		AdminHomepage Adm = new AdminHomepage(super.driver, super.wait);


		/*ASSERTIONS /
		/ PAGE METHODS /
		/ Object.method(); */
		Adm.launchUrl(EPHomedata.URL)
		.verifyTitle(EPHomedata.TITLE)
		.EPClick();
		}
	
	@Test(priority=2) /* Priority given for executing test cases in order*/ 
	public void EPLogin()throws Exception{ /*exception handler */

	/*PAGE INSTANTIATIONS : instantiating required page classes*/
	AdminLoginpage Log = new AdminLoginpage(super.driver, super.wait);


	/*ASSERTIONS /
	/ PAGE METHODS /
	/ Object.method(); */
	Log.verifyTitle(EPLogindata.TITLE)
	.enterEmail(EPLogindata.EMAIL)
	.enterPassword(EPLogindata.PASSWORD)
	.clickOnLoginButton();
	}
	
	
	@Test(priority=3) /* Priority given for executing test cases in order*/ 
	public void MngUserpage()throws Exception{ /*exception handler */

	/*PAGE INSTANTIATIONS : instantiating required page classes*/
		MngUserpage Ad = new MngUserpage(super.driver, super.wait);


	/*ASSERTIONS /
	/ PAGE METHODS /
	/ Object.method(); */
	Ad.verifyTitle(MngUsrdata.TITLE)
	.clickonMngUsr()
	.UsrView();
	
	}
	
	@Test(priority=4) /* Priority given for executing test cases in order*/ 
	public void MngAdspage()throws Exception{ /*exception handler */

	/*PAGE INSTANTIATIONS : instantiating required page classes*/
		MngAdspage Ad = new MngAdspage(super.driver, super.wait);


	/*ASSERTIONS /
	/ PAGE METHODS /
	/ Object.method(); */
	Ad.verifyTitle(MngAdsdata.TITLE)
	.clickonMngAds()
	.AdsView();
	
	}
	
}
