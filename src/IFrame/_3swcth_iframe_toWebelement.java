package IFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3swcth_iframe_toWebelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		rk.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		Thread.sleep(3000);
		
		
		WebElement iframe =rk.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		rk.switchTo().frame(iframe);
		
		WebElement target=rk.findElement(By.xpath("//button[text()='Click Me!']"));
        Thread.sleep(2000);
		   target.click();
		   
		   
		   //rk.switchTo().parentFrame();
		   rk.switchTo().defaultContent();
		   
		WebElement home=rk.findElement(By.xpath("//a[@id='tryhome']"));
		home.click();
		Thread.sleep(2000);
	
		Set<String> ids=rk.getWindowHandles();
		ArrayList<String> al= new ArrayList<String>(ids);
		
		String childid = al.get(1);
		System.out.println(childid);
		rk.switchTo().window(childid);
		
		
		WebElement login=rk.findElement(By.xpath("//button[@id='w3loginbtn']"));
		login.click();
		
		Set<String> id= rk.getWindowHandles();
	ArrayList<String> al2=new ArrayList<String>(id);
		String main =al2.get(2);
		rk.switchTo().window(main);
		
		
		WebElement un=rk.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("rahulkere");
	}
	
	
	
}
