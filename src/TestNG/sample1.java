package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1{

	
	@Test
	public void TC1() {
		Reporter.log("RUNNING TC1", true); //CONSOLE+EMAIL REPORT
		System.out.println("running tc1....");  //ONLY CONSOLE
	}
	
	@Test
	public void TC2() {
		System.out.println("running tc2.....");
	}
	

	@Test
	public void verifyPN() {
		
		Reporter.log("running tc1", true);
	}
	
	@Test
	public void verifyUserId() {
		
		Reporter.log("running tc2", true);
	}
	
	
	
}
