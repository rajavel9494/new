package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelements {
	public static WebDriver driver;
	public static Object select;

	public static void main(String[] args)  {
		ChromeOptions start = new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(start);

		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		driver.manage().window().maximize();
		
		
		//  List<WebElement> optionElements = selectElement.findElements(By.tagName("option"));
	     //   List<WebElement> optionList = select.getOptions();
	     //   Assertions.assertEquals(optionElements, optionList);
		 
       
		List<WebElement> fes = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
		// List<WebElement> selectedOptionList = select.getAllSelectedOptions();
}
}