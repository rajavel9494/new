package org.stepdefinition;

import java.io.IOException;

import org.Runner.Cart1_runner;

import org.base.Cart1_base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.pom.Cart1_pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cart1_stepdef extends Cart1_base {

	public static WebDriver driver = Cart1_runner.driver;
	public static Cart1_pom l = new Cart1_pom(driver); 

	@Given("To enter the url")
	public void to_enter_the_url() {
		url(driver, "https://www.opencart.com/");
	}

	@Given("To maximise the window")
	public void to_maximise_the_window() {
		max(driver);
	}

	@Given("To click The feature function")
	public void to_click_the_feature_function() throws IOException {
		signin(l.getFeature());
		screenshot(driver, "image1");
	}

	@Given("To scroll down &up the admin function")
	public void to_scroll_down_up_the_admin_function() throws IOException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,2500)");
		screenshot(driver, "image2 ");
	
        jse.executeScript("window.scrollTo(2500,0)");

	}

	@When("To click the unlimited everything")
	public void to_click_the_unlimited_everything() {

		signin(l.getUnlimited());
	}

	@Then("To scroll down &up")
	public void to_scroll_down_up() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,2500)");
        jse.executeScript("window.scrollTo(2500,0)");
	}

}
