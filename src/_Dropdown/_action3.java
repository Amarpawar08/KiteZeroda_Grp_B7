package _Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _action3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		rk.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		rk.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	WebElement cart=rk.findElement(By.xpath("//span[text()='Cart']"));
	
	Actions act= new Actions(rk);
	
	//act.click(cart).perform();
	
	act.moveToElement(cart).perform();
	Thread.sleep(3000);
	act.click(cart).perform();
	act.
	//act.moveToElement(cart).click().build().perform();
		
		
	}

}
