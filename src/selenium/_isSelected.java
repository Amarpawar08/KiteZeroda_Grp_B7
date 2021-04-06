package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _isSelected {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	
	rk.get("https://www.facebook.com");
	
	rk.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
	//rk.findElement(By.xpath("//input[contains(@class,'5dba _2ph-')]")).sendKeys("rhul");
	//boolean female=rk.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
//	System.out.println(female);
	
	WebElement un=rk.findElement(By.xpath("(//input[@type='text'])[2]"));
         un.sendKeys("rahul rk");
         
      WebElement female=rk.findElement(By.xpath("(//input[@type='radio'])[1]"));
      Thread.sleep(3000);
      female.click();
      
      Thread.sleep(4000);
	if(female.isSelected()) {
		System.out.println("button already selected");	}
	else {
		female.click();
		if(female.isSelected()) {
			System.out.println("selected now");
		}
		else {
		System.out.println("not selected");
	}
	}
	
	Thread.sleep(3000);
	WebElement male=rk.findElement(By.xpath("(//input[@type='radio'])[2]"));
	male.click();
	boolean m=male.isSelected();
	System.out.println(m);
	
	Thread.sleep(2000);
	WebElement custom=rk.findElement(By.xpath("(//input[@type='radio'])[3]"));
	custom.click();
	boolean c=custom.isSelected();
	System.out.println(c);
	
	female.click();
	
	
	
	
	
	
	
}
}
