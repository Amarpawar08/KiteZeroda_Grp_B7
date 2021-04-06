package frameworkFACEBOOK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpagePom_DDF {

	// declare
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement un;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement loginbtn;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement closebtn;
	
	//initialise
	 public fbloginpagePom_DDF (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	
	public void setfbloginpageun(String username) {
		un.sendKeys(username);
	}
	
	public void setfbloginpagepwd(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickfbloginpageloginbtn() {
		loginbtn.click();
	}
	
	public void clickfbloginpageCLOSEbtn() {
		closebtn.click();
	}
	
	
}
