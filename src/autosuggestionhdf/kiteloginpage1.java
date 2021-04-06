package autosuggestionhdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage1 {
// declaration
	
	@FindBy(xpath="//input[@id='userid']") private WebElement un ;
	
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	
	@FindBy (xpath="//button[text()='Login ']") private WebElement login;
	
	// initialisation
	
	public kiteloginpage1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	// usage
	public void enterun(){
		un.sendKeys("DV1510");
	}
	
	public void enterpwd() {
		pwd.sendKeys("Vijay@123");
	}
	
	public void clickloginbtn() {
		login.click();
	}
	
}
