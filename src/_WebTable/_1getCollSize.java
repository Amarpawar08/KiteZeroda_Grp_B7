package _WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1getCollSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("C:\\Users\\admin\\Documents\\webtable.html");
	Thread.sleep(2000);
	rk.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> allvalue=rk.findElements(By.xpath("//table[@border='10']//tr//th"));
	
	for(WebElement value:allvalue) {
		
		String val=value.getText();
		System.out.print(val);
	}
	System.out.println();
	List<WebElement> titlerow=rk.findElements(By.xpath("//table[@border='10']//tr[1]")); // matching 1 of 3
	
	for(WebElement row1:titlerow) {
	String printrow1=row1.getText();
	System.out.print(printrow1);
	}System.out.println();
	
	List<WebElement> rowall=rk.findElements(By.xpath("//table[@border='10']//tr"));
	List<WebElement> collall= rk.findElements(By.xpath("//table[@border='10']//tr//th[1]"));
	for(int i=1; i<=4; i++) {
		for(int j=1; j<=3;j++) {
			
			String text = rk.findElement(By.xpath("//table[@border='10']//tr["+i+"]//th["+j+"]")).getText();
			System.out.print(text+"  ");
		}System.out.println();
	}
		
	
	
}
}
