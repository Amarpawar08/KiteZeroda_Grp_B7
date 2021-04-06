package frameworkFACEBOOK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginPOM_PAGefactry {

	// declare
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement un;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement loginbtn;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement closebtn;
	
	//initialise
	 public fbloginPOM_PAGefactry (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	
	public void setfbloginPOM_PAGefactryun() {
		un.sendKeys("POM PageFactory");
	}
	
	public void setfbloginPOM_PAGefactrypwd(){
		pwd.sendKeys("pompagefactry@1234");
	}
	
	public void clickfbloginPOM_PAGefactryloginbtn() {
		loginbtn.click();
	}
	
	public void clickfbloginPOM_PAGefactryCLOSEbtn() {
		closebtn.click();
	}
	
	
}
