package org.step;

import java.io.IOException;

import org.base.open_base;
import org.openqa.selenium.WebDriver;
import org.pom.openbase_pom;
import org.runner.opencart_runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class opencart_step extends open_base {
	
	public static WebDriver driver =opencart_runner.driver;
	public static openbase_pom l =new openbase_pom (driver);

	@Given("To enter the URL")
	public void to_enter_the_url() {
		url(driver, "https://www.opencart.com/");                                 
	}
	@Given("To Maximize the Window")
	public void to_maximize_the_window() {
		maxi(driver);
	}
	@When("To Click the Features functionality")
	public void to_click_the_features_functionality() throws IOException {
		click(l.getFeatures());
		screenshot(driver, "pic1");
		
	}
	
	
	@When("Scroll down & to click unlimited Everything")
	public void scroll_down_to_click_unlimited_everything() throws IOException {
		scrolldown(driver, l.getUnlimited());
		click(l.getUnlimited());
		screenshot(driver, "pic2");
		
	}
	@When("Scroll up & To click Customer")
	public void scroll_up_to_click_customer() throws IOException {
		scrollup(driver, l.getCustomer());
		click(l.getCustomer());
		screenshot(driver, "pic3");
		
	}
	@When("Scroll down & To click Shipping,Payments and Reports")
	public void scroll_down_to_click_shipping_payments_and_reports() throws IOException {
		scrolldown(driver, l.getShipping());
		click(l.getShipping());
		screenshot(driver, "pic4");
		
		
		
	}
	
	@When("Scroll up & To click Extensions")
	public void scroll_up_to_click_extensions() throws IOException {
		scrollup(driver, l.getExtensions());
		click(l.getExtensions());
		screenshot(driver, "pic5");
		
	}
	@When("Scroll down & To click Mobile&Seo")
	public void scroll_down_to_click_mobile_seo() throws IOException {
		scrolldown(driver, l.getMobile());
		click(l.getMobile());
		screenshot(driver, "pic6");
		
	}
	@Then("Scroll up & Click developer")
	public void scroll_up_click_developer() throws IOException {
		scrollup(driver, l.getDeveloper());
		click(  l.getDeveloper());
		screenshot(driver, "pic7");
	
	}

}
