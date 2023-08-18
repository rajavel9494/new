package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart1_pom {
	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")
	private WebElement feature;

	@FindBy(xpath = "//*[@id=\"cms-feature\"]/div[2]/ul/li[2]/a")
	private WebElement unlimited;

	public Cart1_pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFeature() {
		return feature;
	}

	public WebElement getUnlimited() {
		return unlimited;
	}

}
