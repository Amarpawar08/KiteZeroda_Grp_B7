package selenium;



import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _getOptions {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		
		rk.get("https://www.facebook.com");
		
		rk.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		
		WebElement month=rk.findElement(By.xpath("//select[@title='Month']"));
		
		Select s=new Select(month);
		
		System.out.println(s.getOptions().size());
				List<WebElement>alloptions=s.getOptions();
				
				TreeSet tr=new TreeSet();
				for(WebElement str:alloptions){
					String text= str.getText();
					tr.add(text);
					
				}
				for(Object s1:tr) {
					
					System.out.println(s1);
					
				}
				
		System.out.println(alloptions.size());
		for(WebElement str:alloptions) {
			
			String text=str.getText();
			System.out.println(text);
			
		
		
		
		
		}		
}
}