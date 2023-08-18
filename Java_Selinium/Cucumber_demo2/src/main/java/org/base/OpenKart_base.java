package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenKart_base {

	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}

	public static void max(WebDriver driver) {
		driver.manage().window().maximize();

	}

	public static void signin(WebElement w) {
		w.click();
	}

	public static void screenshot(WebDriver driver, String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\rajav\\eclipse-workspace\\rajavel\\Java_Selinium\\Cucumber_demo1\\Screenshot" + picname
						+ ".png");
		FileUtils.copyFile(sr, destination);
	}
	
	public static void scrolldown(WebDriver driver, WebElement web) {
        JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arugments[0].scrollIntoView()", web);
	}

	public static void scrollup(WebDriver driver, WebElement web) {
        JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arugments[0].scrollIntoView(false)", web);
	}

	

}
