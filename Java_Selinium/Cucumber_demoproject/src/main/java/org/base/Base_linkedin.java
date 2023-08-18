package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_linkedin {

	WebDriver driver;

	public static void url(WebDriver driver, String a) {

		driver.get(a);

	}

	public static void max(WebDriver driver) {

		driver.manage().window().maximize();
	}

	public static void username(WebElement b, String c) {

		b.sendKeys(c);

	}

	public static void pass(WebElement d, String e) {

		d.sendKeys(e);
	}

	public static void signin(WebElement w) {
		w.click();
	}
}
