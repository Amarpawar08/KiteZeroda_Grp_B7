package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2swtchto_4ways {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	Thread.sleep(3000);
	
	//1 frame name -string
	//2 frame id -string
	//3 frame index -int
	//4 frame webelement
	
	//rk.switchTo().frame("iframeResult");           //1
	//rk.switchTo().frame("iframeResult");           //2
	
	rk.switchTo().frame(rk.findElement(By.xpath("//iframe[@id='iframeResult']")));   //4     another way _3swtchto webelement class
	
	WebElement click= rk.findElement(By.xpath("//button[text()='Click Me!']"));
	click.click();
	
	//rk.switchTo().defaultContent();
      rk.switchTo().parentFrame();
}
}
