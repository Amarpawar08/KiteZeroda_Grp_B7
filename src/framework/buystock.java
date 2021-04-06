package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buystock {

	@FindBy(xpath="//input[@id='radio-170']") private WebElement intradaycheckbox; ////label[contains(@class,'su-radibel')]
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement lotsize;
	@FindBy(xpath="//label[contains(text(),'Market')]") private WebElement markettbtn;
	@FindBy(xpath="//button[@type='submit']") private WebElement buybtn;
	@FindBy(xpath="//button[text()='Cancel ']") private WebElement cancelbtn;
	public buystock (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickintradaychbx() {
		intradaycheckbox.click();
	}
	
	public void setlotsize() {
		lotsize.sendKeys("5");
	}
	
	public void clickmarkettbtn() {
		markettbtn.click();
	}
	
	public void clickbuybtn() {
		buybtn.click();
	}
	public void clickcanal() {
		cancelbtn.click();
	}
	
}
