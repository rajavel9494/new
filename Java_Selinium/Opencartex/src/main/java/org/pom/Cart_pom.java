package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_pom {
	
	
public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse-header\"]/div/a[1]")
	private WebElement registerlogin;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")
	private WebElement login;
	
	
	
	public Cart_pom(WebDriver driver1) {
		   
		   this.driver=driver1;
		   PageFactory.initElements(driver, this);
		
	}


	public WebElement getRegisterlogin() {
		return registerlogin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	

}
