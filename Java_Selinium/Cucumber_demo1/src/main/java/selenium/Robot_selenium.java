package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot_selenium {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		ChromeOptions start = new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(start);

		Actions ac = new Actions(driver);
		Robot r = new Robot();
// right click actions		
		driver.get("https://www.facebook.com/");
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys("rajavelk89");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_X);

		driver.findElement(By.id("pass")).click();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
}