package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		rk.get("https://www.google.com");
		Thread.sleep(2000);		
		
		WebElement search=rk.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		search.sendKeys("iphone latest");
		Thread.sleep(2000);
		
		List<WebElement> alloption=rk.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		System.out.println(alloption.size());
	String	exptext="iphone latest version";	
	Thread.sleep(2000);
	
		for(WebElement option: alloption) {
			
			System.out.println(option.getText());
			
			String acttext=option.getText();
			
			if(acttext.equals(exptext)) { 
				option.click();
				
				
			}
			
		}
	
		
	}
}
