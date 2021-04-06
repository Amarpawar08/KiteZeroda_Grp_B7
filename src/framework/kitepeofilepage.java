package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepeofilepage {

	@FindBy(xpath="(//ul[contains(@class,'list-flat dropdown')])//li[10]") private WebElement logout;
	
	public kitepeofilepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogout(){
		
		logout.click();
		
	}
	
	
	
}
