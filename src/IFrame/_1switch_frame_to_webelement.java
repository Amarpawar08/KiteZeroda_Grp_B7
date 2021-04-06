package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1switch_frame_to_webelement {      // exception nosuchelement due to IFRAME
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	Thread.sleep(3000);
	
	WebElement click=rk.findElement(By.xpath("//button[text()='Click Me!']"));
	
	click.click();
	
	
	
	
	
}
}
