package autosuggestionhdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitecontinuepage2 {

	//declaration
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	
	@FindBy(xpath="//button[text()='Continue ']") private WebElement contbtn;
	
	//initalization
	
	public kitecontinuepage2 (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}


	//usage
	public void enterpin() {
		pin.sendKeys("959594");
	}
	
	public void clickcontbtn() {
		contbtn.click();
	}
	
}
