package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage {

	@FindBy(xpath="//div[@class='avatar']//span") private WebElement pn;
	@FindBy(xpath="//input[@id='search-input']") private WebElement search;
	@FindBy(xpath="//div[@class='search-result']//li[1]") private WebElement infystock;
	
	public kitehomepage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifypn() {
		
		String actualpn =pn.getText();
		String exptpn ="KV";
		
		if(actualpn.equals(exptpn)) {
			
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		}
	public void clickpnbtn() {
		pn.click();
	}
	
	public void setkitehomepagesearchbox() {
		search.sendKeys("infy");
		
	}
	
	public void clickstock() {
		infystock.click();
	}
	
	

}
