package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _select_allcheckbox {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("C:\\Users\\admin\\Documents\\checkbox10.html");
	Thread.sleep(3000);
	
	List<WebElement> allcheck=rk.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement check:allcheck) {
		check.click();
		Thread.sleep(0000);                             //1-10   for each looop
	}
	
	//for(int i=0; i<=allcheck.size()-1; i++) {
	//allcheck.get(i).click();                           1-10      forward for loop
	//Thread.sleep(2000);
	//}
	
	Thread.sleep(10000);
	for(int i=allcheck.size()-1; i>=0;i--) {	
		allcheck.get(i).click();                              //10-1
		Thread.sleep(0000);
		}
	
	for(int i=0; i<=allcheck.size()-1; i++) {
		
		allcheck.get(i).click();
	}
	
	for(int i=allcheck.size()-1; i>=0; i--) {
		allcheck.get(i).click();
	}
}
}
