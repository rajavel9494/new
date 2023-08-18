package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selenium_demo {
	public static WebDriver driver;
	public static void main(String[] args)  {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
		
		//driver.get("https://demoqa.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click(); 
		//WebElement ref = driver.findElement(By.xpath("//*[@id=\"item-4\"]"));
		//ref.click();
		//Actions ac =new Actions(driver);
		//ac.moveToElement(ref).perform() ;          
		
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("userName"));
		Actions ar =new Actions(driver);
		ar.moveToElement(e).perform();
		ar.keyDown(Keys.SHIFT).perform();
		e.sendKeys("rajavel");
		ar.keyUp(Keys.SHIFT).perform();
		
		
}
}