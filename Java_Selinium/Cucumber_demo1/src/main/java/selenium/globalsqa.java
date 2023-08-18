package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class globalsqa {

	public static WebDriver driver;

	public static void main(String[] args)  {
		ChromeOptions start = new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(start);

		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		driver.manage().window().maximize();
		
		
		WebElement f1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(f1);
		
		
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL);
		
		
		WebElement f2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		ac.click(f2).perform();
		
		WebElement f3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		ac.click(f3).perform();
		
		WebElement f4 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		ac.click(f4).perform();
		
		WebElement f5 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		ac.click(f5).perform();
		
		WebElement f6 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
		ac.click(f6).perform();
		
		WebElement f7 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
		ac.click(f7).perform();
		
		WebElement f8 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]"));
		ac.click(f8).perform();
		
		ac.keyUp(Keys.CONTROL);
		
		
		
        
		
		
		
	}
}