package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_welemnt1 {
public static void main(String[] args) throws InterruptedException {
	
	//Webelement is Interface use to perform action on element present IN browser
	//web element methods:
	
	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver rk= new ChromeDriver();
	
	rk.get("https://www.facebook.com");
	//rk.findElement(By.xpath("//input[@id='email']")).sendKeys("rahul");
//	Thread.sleep(2000);
	//rk.findElement(By.xpath("//input[@id='email']")).clear();
	//Thread.sleep(2000);
	
	//rk.findElement(By.xpath("//a[contains(text(),'Forgo')]")).click();
	WebElement un =rk.findElement(By.xpath("//input[@id='email']"));
	un.sendKeys("rahul");
	Thread.sleep(3000);	
	un.clear();
	
	String f=un.getText();
			System.out.println(f);
			
			WebElement d=rk.findElement(By.xpath("//a[text()='Forgotten password?']"));
			
			String k=d.getText();
			System.out.println(k);
			
			WebElement s=rk.findElement(By.xpath("//a[text()='Create New Account']"));
			
			String w=s.getText();
			System.out.println(w);
			
			s.click();
			Thread.sleep(4000);
			WebElement p=rk.findElement(By.xpath("(//input[@type='text'])[2]"));
			p.sendKeys("rahul");
			Thread.sleep(3000);
			p.clear();
			boolean r=p.isEnabled();
			System.out.println(r);
			
			boolean r1=p.isSelected();
			System.out.println(r1);  //FALSE
			boolean r2=p.isDisplayed();
			System.out.println(r2);
			
			
			
				Thread.sleep(3000);
			WebElement a=rk.findElement(By.xpath("(//input[@type='text'])[3]"));
			
			a.sendKeys("kere");
			a.click();
			Thread.sleep(3000);
			a.clear();
			boolean q=a.isDisplayed();
			System.out.println(q);
			
			boolean q1=a.isEnabled();
			System.out.println(q1);
		
			boolean q2=a.isSelected();
			System.out.println(q2);     //FALSE
			
			
			WebElement male=rk.findElement(By.xpath("(//input[contains(@type,'radio')])[2]"));
			male.click();
			
			boolean l=male.isSelected();
			System.out.println(l);         //true
			
		    if(male.isSelected()) {
		    	System.out.println("button selected");
		    }
		    else {
		    	System.out.println("not selected");
		    }
			
		    Thread.sleep(3000);
			WebElement female=rk.findElement(By.xpath("//input[@type='radio'][1]"));
			
			boolean x=female.isSelected();
			System.out.println(x);             //FALSE
			
			if(female.isSelected()) {
				System.out.println("selected");
			}
			else {
				System.out.println("not selected");
			}
			
			
			
			
			
			
			
			
			
}
	
}
