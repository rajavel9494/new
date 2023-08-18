package org.StepDefinition;

import org.Runner.Runner_Linked;
import org.base.Base_linkedin;
import org.openqa.selenium.WebDriver;
import org.pom.Linkedin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_linked extends Base_linkedin{
	
public static WebDriver driver= Runner_Linked.driver;
public static Linkedin l=new Linkedin(driver); //pom class

	@Given("To enter the url")
	public void to_enter_the_url() {
		url(driver,"https://www.linkedin.com/login");
	   
	}
	@Given("To maxmize the window")
	public void to_maxmize_the_window() {
		max(driver);
		 
	}
	@When("To enter the Username")
	public void to_enter_the_username() {
		username(l.getUsername(),"rajavelk89");
	}
	@When("To enter the password")
	public void to_enter_the_password() {
		pass(l.getPassword(),"12345677");
	
	    
	}
	@Then("To click signin")
	public void to_click_signin() {
	signin(l.getSignin());
	    
	}





}
