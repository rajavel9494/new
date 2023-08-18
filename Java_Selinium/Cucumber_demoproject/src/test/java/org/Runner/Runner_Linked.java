package org.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\linkedin" ,glue="org.StepDefinition")

public class Runner_Linked {
	
	public static WebDriver driver;
	public static WebDriver driver1;
	
	
	@BeforeClass
	public static void start() {
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--remote-allow-origns=*");
	driver=new ChromeDriver();
	

		
}
}