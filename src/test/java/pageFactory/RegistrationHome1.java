package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class RegistrationHome1 extends MainClass {
	
	Actions action = new Actions(driver);
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	WebElement RegistrationBtn;
	
	public RegistrationHome1() {
		PageFactory.initElements(driver,this);
		}
	
	public void clickRegistrationBtn() {
		RegistrationBtn.click();
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	
}
