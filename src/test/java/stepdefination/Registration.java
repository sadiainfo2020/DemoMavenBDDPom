package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Registration2;
import pageFactory.Registration3;
import pageFactory.RegistrationHome1;

public class Registration extends MainClass {

	RegistrationHome1 rh1 = new RegistrationHome1 ();
	Registration2 r2 = new Registration2();
	Registration3 r3 = new Registration3();
	
//  Scenario#1
	@Given("^user is in registration page$")
	public void user_is_in_registration_page() {
		rh1.clickRegistrationBtn();
	}
	
	  @When("^user provide all required information \"([^\"]*)\"and \"([^\"]*)\"$")
    public void user_provide_all_required_information_firstname_and_lastname(String firstname, String lastname ) {
    	r2.FirstName(firstname);
    	r2.lastName(lastname);
    	
	}
	    @Then("^user added \"([^\"]*)\"$")
	    public void user_added_username(String username) {
	    	r2.email(username);
	    }
    @And("^user added \"([^\"]*)\"and \"([^\"]*)\"$")
    public void user_added_password_and_confirmpassword(String password, String confirmpassword) {
    	
    	r2.password(password);
    	r2.confirmPassword(confirmpassword);
    }

    @And("^clicks Submit button$")
    public void clicks_submit_button() {
    	r2.clickSubmitBtn();
    }

	@Then("^user should be registered$")
	public void user_should_be_registered() {
		Assert.assertSame(r3.successMsg(),true);
		
	}
	

	@And("^user should see registration completed message$")
	public void user_should_see_registration_completed_message() {
		
			Assert.assertSame(r3.successMsg(),true);

	}

}