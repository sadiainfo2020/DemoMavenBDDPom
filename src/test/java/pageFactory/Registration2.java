package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.MainClass;

public class Registration2 extends MainClass {
	
//	Actions action = new Actions(driver);
	
	@FindBy(name="firstName")
	WebElement enterFirstName;
	@FindBy(name="lastName")
	WebElement enterlastName;
	@FindBy(name="email")
	WebElement enterusername;
	@FindBy(name="password")
	WebElement enterpassword;
	@FindBy(name="confirmPassword")
	WebElement enterconfirmPassword;
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public Registration2() {
		PageFactory.initElements(driver,this);
		}

	public void FirstName(String firstname) {
		enterFirstName.sendKeys(firstname);
	}
	public void lastName(String lastname) {
		enterlastName.sendKeys(lastname);
	}
	public void email(String email) {
		enterusername.sendKeys(email);
	}
	public void password(String password) {
		enterpassword.sendKeys(password);
	}
	public void confirmPassword(String confirmPassword) {
		enterconfirmPassword.sendKeys(confirmPassword);
	}
	public void clickSubmitBtn() {
		submitBtn.click();

//		action.sendKeys(Keys.ENTER).build().perform();
		
	}
	
}
