package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _listbox {
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	
	rk.get("https://www.facebook.com");
	
	rk.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
	
	//step1
	WebElement month=rk.findElement(By.xpath("//select[@title='Month']"));
	
	//step2
	Select m=new Select(month);
	System.out.println(m.getOptions().size());
	//step3
	//m.selectByValue("8");
	//m.selectByVisibleText("Aug");
	//m.selectByIndex(8);

	WebElement date=rk.findElement(By.xpath("//select[@title='Day']"));
	
	Select d=new Select(date);
	System.out.println(d.getOptions().size());
	//d.selectByIndex(6);
	d.selectByValue("6");
	//d.selectByVisibleText("6");

	WebElement year=rk.findElement(By.xpath("//select[@title='Year']"));
	
	Select y=new Select(year);
	System.out.println(y.getOptions().size());
	//y.selectByIndex(1995);
	y.selectByValue("1995");
	//y.selectByVisibleText("1995");
	
	
	
	
}
}
