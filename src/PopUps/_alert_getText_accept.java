package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _alert_getText_accept {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	Thread.sleep(2000);
	
	    WebElement clickme=rk.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
	clickme.click();
	
	String text=rk.switchTo().alert().getText();
	System.out.println(text);
	
	Thread.sleep(1000);
	
	Alert al=rk.switchTo().alert();
	Thread.sleep(1000);
	al.accept();
	
	
}
}
