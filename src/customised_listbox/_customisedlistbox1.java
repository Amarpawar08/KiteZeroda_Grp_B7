package customised_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _customisedlistbox1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");

	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Actions act= new Actions(driver);
	
	act.moveToElement(month).click().build().perform();
}
}
