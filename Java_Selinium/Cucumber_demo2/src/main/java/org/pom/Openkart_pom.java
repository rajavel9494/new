package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Openkart_pom {
	
	public WebDriver driver;
	 
	
	@FindBy(xpath="//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")
	private WebElement feature;
	
	
	
	@FindBy(xpath="//*[@id=\"tab-admin\"]/div[5]/a")
	private WebElement unlimited;
	
	
	@FindBy(xpath="//*[@id=\"cms-feature\"]/div[2]/ul/li[3]/a")
	private WebElement customer;
	
	@FindBy(xpath="//*[@id=\"tab-customer\"]/div[5]/a")
	private WebElement shipping;
	
	
	@FindBy(xpath="//*[@id=\"cms-feature\"]/div[2]/ul/li[5]/a")
	private WebElement extension ;
	
	
	@FindBy(xpath="//*[@id=\"tab-extension\"]/div[5]/a")
	private WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a")
	private WebElement developer;
	
	
	@FindBy(xpath="//*[@id=\"tab-developer\"]/div[2]/div/div/div[1]/h2")
	private WebElement screenshot;
	
	@FindBy(xpath="//*[@id=\"cms-feature\"]/div[1]/div/h1")
	private WebElement scrollup;
	
	@FindBy(xpath = "//h3[normalize-space()='Affiliates']")
	private WebElement ScrollDown;
	
	
	public Openkart_pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFeature() {
		return feature;
	}

	public WebElement getUnlimited() {
		return unlimited;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getExtension() {
		return extension;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getDeveloper() {
		return developer;
	}

	public WebElement getScreenshot() {
		return screenshot;
	}

	public WebElement getScrollup() {
		return scrollup;
	}

	public WebElement getScrollDown1() {
		return ScrollDown;
	}


	

	
	
	
	
	
	
	
	
}
