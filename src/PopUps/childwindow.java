package PopUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver rk= new ChromeDriver();
		
		rk.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(5000);
		
		//click on New Page of Main Page
		WebElement newtab=rk.findElement(By.xpath("//input[@name='NewTab']"));
		newtab.click();
		
		
		Set<String> ids=rk.getWindowHandles();
		ArrayList<String> al= new ArrayList<String>(ids);
		
		String childid = al.get(1);
		System.out.println(childid);
		rk.switchTo().window(childid);
		
		//click on training tab of child window
		Thread.sleep(5000);
		WebElement train=rk.findElement(By.xpath("(//span[text()='Training'])[1]"));
		train.click();
		
		
		
	}
	
}
