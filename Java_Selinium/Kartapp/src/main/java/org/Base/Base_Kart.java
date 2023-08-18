package org.Base;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Base_Kart {
		
		WebDriver driver;

		public static void url(WebDriver driver, String s) {
			driver.get(s);
		}

		public static void max(WebDriver driver) {
			driver.manage().window().maximize();
		}

		public static void signin(WebElement w) {
			w.click();
		}
		
		public static void tohold(WebDriver driver, int i) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
		}
		
		public static void username(WebElement b, String c) {

			b.sendKeys(c);
		}

	}


