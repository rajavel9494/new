package org.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rajav\\eclipse-workspace\\rajavel\\Java_Selinium\\openkart\\featurefile\\opencart.feature",glue="org.step")
public class opencart_runner{
	
	public static WebDriver driver;
	@BeforeClass
	public static void start() {
		ChromeOptions c =new ChromeOptions();
		c.addArguments("--remote-allow-orgins=*");
		driver=new ChromeDriver();
	}
	

}
