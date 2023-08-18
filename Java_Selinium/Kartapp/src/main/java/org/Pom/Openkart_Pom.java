package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Openkart_Pom {

	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse-header\"]/div/a[1]")
	private WebElement LoginDetails;
	
	@FindBy(id="input-email")
	private WebElement username;
	
	@FindBy(id="input-password")
	private WebElement userpassword;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[2]/div[2]/div[1]/form/div[3]/div[1]/button[2]")
	private WebElement login;

	
	
	public WebElement getLoginDetails() {
		return LoginDetails;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getLogin() {
		return login;
	}
	 
}
