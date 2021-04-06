package listbox;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class selectby3 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		
		rk.get("https://www.facebook.com");
		
		rk.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		
		WebElement month=rk.findElement(By.id("month"));
		System.out.println(month.isDisplayed());   //true
		System.out.println(month.isEnabled());     //true
		System.out.println(month.isSelected());    //false
	
		Select m= new Select(month);
		System.out.println(m.isMultiple());        //false
		m.selectByIndex(10);
		System.out.println(m.getFirstSelectedOption().getText());
		System.out.println(month.getText());
		
		
		System.out.println("****************************************");
		String y=month.getText();
		System.out.println(y);
	System.out.println("************************************");
		List<WebElement> r=m.getOptions();
		for(WebElement l:r) {
			
			String text=l.getText();
			System.out.println(text);
		}
		System.out.println(r.size());
		System.out.println("***********************************");
		List<WebElement> ascending=m.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(WebElement str:ascending) {
			String text=str.getText();
			ts.add(text);
		}
		for(Object s1:ts) {
		
			System.out.println(s1);
		}
		
      File source=((TakesScreenshot)rk).getScreenshotAs(OutputType.FILE);
		   System.out.println(source);
		
		   File desti=new File("C:\\Users\\admin\\Desktop\\screenshot\\abc1.jpg");
		   
		   FileHandler.copy(source, desti);
		
		
		
		
}
}





