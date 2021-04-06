package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _getFirstSelectedOption {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		
		rk.get("https://www.facebook.com");
		
		rk.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
	
		WebElement month=rk.findElement(By.xpath("//select[@title='Month']"));
		
		Select s=new Select(month);
		//s.selectByVisibleText("Dec");
		//Thread.sleep(3000);
		System.out.println(s.getFirstSelectedOption().getText());
		//Select s=new Select(month);
		//WebElement selectedoption=s.getFirstSelectedOption();
		//String text = selectedoption.getText();
		//System.out.println(text);
		
		
}
}
