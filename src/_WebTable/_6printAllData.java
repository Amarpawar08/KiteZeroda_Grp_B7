package _WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6printAllData {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("file:///C:/Users/admin/Documents/webtable.html");
	Thread.sleep(2000);
	for(int i=1; i<=5;i++) {
		
		for(int j=1;j<=3;j++) {
			
			if(i==1) {
				String text=rk.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//th["+j+"]")).getText();
				System.out.print(text+" ");
			}else {
				String text=rk.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//th["+j+"]")).getText();
				System.out.print(text+" ");
				}
			
			
		}System.out.println();
	}
	
}
}
