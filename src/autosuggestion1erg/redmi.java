package autosuggestion1erg;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class redmi {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		
		
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@class,'LFyf ')]"));
		search.sendKeys("redmi");

		
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(alloption.size());
		
		
		//WebElement option = driver.findElement(By.xpath("//ul[@role='listbox']//li[4]"));
		//option.click();
		

		for(WebElement option:alloption)
		{
			String exptext="redmi note 9";
			String acttext= option.getText();
			if(acttext.equals(exptext)) {
		option.click();
			}
		}
		
	
		
		
		
		
		
	}
	

}
