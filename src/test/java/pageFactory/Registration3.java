package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class Registration3 extends MainClass {

	@FindBy(xpath="//b[contains(text(),'Note: Your user name is test12.')]")
	WebElement Yourusernameistest12; 
	
	
	public Registration3() {
		PageFactory.initElements(driver,this);
		}
	
	public boolean successMsg() {
		return Yourusernameistest12.isDisplayed();	
	}
	public String actualpageTitle() {
		return driver.getTitle();
	}
}
