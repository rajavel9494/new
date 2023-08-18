package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linkedin {
	
	public WebDriver driver;
	
	@FindBy(id ="username")
	private WebElement username;
	
	
    @FindBy(name="session_password")
    private WebElement password;
    
    
    @FindBy(css="[type='submit']")
    private WebElement signin;
    
    
   public Linkedin(WebDriver driver1) {
	   
	   this.driver=driver1;
	   PageFactory.initElements(driver, this);
	
}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSignin() {
		return signin;
	}
    

}
