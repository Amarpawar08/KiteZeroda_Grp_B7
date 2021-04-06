package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rahul=new ChromeDriver();
	rahul.get("http:ww.google.com");
	rahul.navigate().to("http:www.youtube.com");
	rahul.findElement(By.id("search")).sendKeys("Duniya song lukka chupi");
	rahul.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	rahul.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Luka Chuppi')]")).click();
	

}
}
