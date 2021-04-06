package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testkitelogin {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(2000);
	
	kiteloginpage1 login= new kiteloginpage1(driver);
	login.enterun();
	login.enterpwd();
	login.clickloginbtn();
	
	kitecontinuepage2 continu= new kitecontinuepage2(driver);
	continu.enterpin();
	continu.clickcontbtn();
	
	kitehomepage home=new kitehomepage(driver);
	home.verifypn();
	home.clickpnbtn();
	//home.setkitehomepagesearchbox();
	//home.clickstock();
	
	
	//buystock stock= new buystock(driver);
	
	//stock.clickintradaychbx();
	//stock.setlotsize();
	//stock.clickmarkettbtn();
	//stock.clickbuybtn();
	//Thread.sleep(5000);
	//stock.clickcanal();
	
	Thread.sleep(8000);
     kitepeofilepage profile= new kitepeofilepage(driver);
     profile.clicklogout();
	

	Thread.sleep(3000);
//	driver.quit();
	
}
}
