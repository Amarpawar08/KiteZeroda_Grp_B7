package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void openbrowser() {
		Reporter.log("open browser", true);
	}
	
	@AfterMethod
	public void logoutfromapp() {
		Reporter.log("logout from app..", true);
	}
	
	@BeforeMethod
	public void logintoApp() {
	Reporter.log("login to app...", true);
	}
	
	@Test
	public void verifyPN() {
		Reporter.log("verifying prof name tc1", true);
	}
	
	@Test
	public void verifyusername() {
		Reporter.log("verifying userid tc2", true );
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser ", true);
		
	}
	
	
}
