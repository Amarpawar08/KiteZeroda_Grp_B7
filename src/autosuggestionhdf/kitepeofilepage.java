package autosuggestionhdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepeofilepage {

	@FindBy(xpath="//span[@class='icon icon-exit']") private WebElement logout;
	
	public kitepeofilepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogout(){
		
		logout.click();
		
	}
	
	
	
}
