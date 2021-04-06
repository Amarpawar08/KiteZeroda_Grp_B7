package selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver drive=new ChromeDriver();
	drive.get("https://www.google.com");
	System.out.println(drive.manage().window().getPosition());
	
	Dimension d1=new Dimension(500, 500);
	drive.manage().window().setSize(d1);
	
	System.out.println(drive.manage().window().getPosition());
	System.out.println(drive.manage().window().getSize());
	
	drive.manage().window().maximize();
	
	Point p =new Point(600,600);
	drive.manage().window().setPosition(p);
	
	
	
	Dimension d2= new Dimension(100, 100);
	drive.manage().window().setSize(d2);
	
	Dimension f=new Dimension(800, 900);
	drive.manage().window().setSize(f);
}
}
