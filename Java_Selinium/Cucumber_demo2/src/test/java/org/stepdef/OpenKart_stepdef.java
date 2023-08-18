package org.stepdef;

import java.io.IOException;

import org.base.OpenKart_base;
import org.openqa.selenium.WebDriver;
import org.pom.Openkart_pom;
import org.runner.Openkart_runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenKart_stepdef extends OpenKart_base {

	public static WebDriver driver = Openkart_runner.driver;
	public static Openkart_pom l = new Openkart_pom(driver);

	@Given("to enter the url")
	public void to_enter_the_url() {

		url(driver, "https://www.opencart.com/");
	}

	@Given("to maximise the window")
	public void to_maximise_the_window() {
		max(driver);
	}

	@When("to click the Feature")
	public void to_click_the_feature() {
		signin(l.getFeature());

	}

	@When("scroll down &click unlimited")
	public void scroll_down_click_unlimited() throws IOException {

		scrolldown(driver,l.getScrollDown1());

		signin(l.getUnlimited());

	}

	@When("Scroll up &click customer")
	public void scroll_up_click_customer() throws IOException {
		scrollup(driver, l.getScrollup());
		signin(l.getCustomer());

	}

	@When("Scroll down & click shiping pay")
	public void scroll_down_click_shiping_pay() throws IOException {
		scrolldown(driver, l.getShipping());
		signin(l.getShipping());

	}

	@When("scroll up &click extension")
	public void scroll_up_click_extension() throws IOException {
		scrollup(driver, l.getExtension());
		signin(l.getExtension());

	}

	@When("scroll down & click mobile")
	public void scroll_down_click_mobile() throws IOException {
		scrolldown(driver, l.getMobile());
		signin(l.getMobile());

	}

	@Then("scroll up &click developer")
	public void scroll_up_click_developer() throws IOException {
		scrollup(driver, l.getDeveloper());
		signin(l.getDeveloper());

	}

}
