package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Base_Method_Example {

	// url
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}

	// maxi
	public static void max(WebDriver driver) {
		driver.manage().window().maximize();

	}

	// username
	public static void username(WebElement b, String c) {

		b.sendKeys(c);

	}
	// password

	public static void pass(WebElement d, String e) {

		d.sendKeys(e);
	}

	// click

	public static void signin(WebElement w) {
		w.click();
	}

	// close
	public static void close(WebDriver driver) {
		driver.close();
	}

	// title
	public static void title(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// geturl
	public static void geturl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// pagesource
	public static void pagesource(WebDriver driver) {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	// switch to
	public static void switchto(WebDriver driver) {
		TargetLocator switchTo = driver.switchTo();
		System.out.println(switchTo);
	}

	// move to element
	public static void movetoelement(WebElement a, WebDriver d) {
		Actions ac = new Actions(d);
		ac.moveToElement(a).build().perform();
	}

	// implict wait
	public static void tohold(WebDriver driver, int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}

	// clear

	public static void clear(WebElement e) {
		e.clear();
	}

	// quit
	public static void quit(WebDriver d) {
		d.quit();
	}

	// submit
	public static void submit(WebElement d) {
		d.submit();
	}

	// navigate
	public static void navigate(WebDriver d) {
		d.navigate();
	}

	// getattribute
	public static void getattribute(WebElement e) {
		e.getAttribute("");

	}

	// enter key
	public static void enterkey(WebElement e) {
		e.sendKeys(Keys.ENTER);
	}

	// size
	public static void size(WebElement e) {
		org.openqa.selenium.Dimension size = e.getSize();
		System.out.println(size);
	}

	// boolean
	public static boolean isdisply(WebElement x) {
		boolean displayed = x.isDisplayed();
		return displayed;
	}
	// dropdown value

	public static void DropDown(WebElement e, String s) {
		Select ob = new Select(e);
		ob.selectByValue(s);
	}
	// DropDown_Visible

	public static void DropDown_visibletxt(WebElement a, String b) {
		Select s = new Select(a);
		s.selectByVisibleText(b);
	}

	// DropDown_index

	public static void DropDown_index(WebElement a, int i) {
		Select s = new Select(a);
		s.selectByIndex(i);
	}

	// DragAndDrop

	public static void DragAndDrop(WebDriver a, WebElement b, WebElement c) {
		Actions ac = new Actions(a);
		ac.dragAndDrop(b, c).perform();
	}

	// screenshot
	
	public static void screenshot(WebDriver driver, String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("location"+picname+".png");
		FileUtils.copyFile(sr,destination);
	}
	
     //scrollup
	
	public static void scrollup(WebDriver driver,WebElement webele) {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arugments[0].scrollIntoView(false)",webele);
	}

	 //scrolldown
	
		public static void scrolldown(WebDriver driver,WebElement webele) {
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arugments[0].scrollIntoView(true)",webele);
		}
	// Keypress

	public static void keypress() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	// Mousepress

	public static void mousepress() throws AWTException {
		Robot r = new Robot();
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	// Alert_Accept

	public static void alert_accept(WebDriver a) {
		a.switchTo().alert().accept();
	}

	// Alert_Dismiss

	public static void alert_cancel(WebDriver a) {
		a.switchTo().alert().dismiss();
	}
	


}
