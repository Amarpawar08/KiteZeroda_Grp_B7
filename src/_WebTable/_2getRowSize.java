package _WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2getRowSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver rk=new ChromeDriver();
		rk.get("file:///C:/Users/admin/Documents/webtable.html");
		Thread.sleep(2000);
		
		int rowsize =rk.findElements(By.xpath("//table[@id='1234']//tr")).size();    // matching 1 of 5
		System.out.println(rowsize);
		
	}
}
