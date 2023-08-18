package org.Stepdef;

import org.Base.Cart_Base;
import org.Runner.Cart_Runner;
import org.openqa.selenium.WebDriver;
import org.pom.Cart_pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart_StepDefi extends Cart_Base {
	
	 public static WebDriver driver= Cart_Runner.driver;
	public static Cart_pom l= new Cart_pom(driver);//pom class



	@Given("To enter the url")
	public void to_enter_the_url() {
  url(driver, "https://www.opencart.com/");
		
		
	}
	@Given("To maximize the window")
	public void to_maximize_the_window() {
	max(driver);
	}
	@When("to click the loginDetails")
	public void to_click_the_login_details() {
    signin(l.getRegisterlogin());
    tohold(driver, 22);
	}
	@When("To enter the email")
	public void to_enter_the_email() {
	username(l.getEmail(),"rajavelk89@gmail.com");
	}
	@When("To enter the password")
	public void to_enter_the_password() {
		username(l.getPassword(), "Rajavelk94");
		
		
	}
	@Then("To click The login button")
	public void to_click_the_login_button() {
		signin(l.getLogin());
		
	}



}
