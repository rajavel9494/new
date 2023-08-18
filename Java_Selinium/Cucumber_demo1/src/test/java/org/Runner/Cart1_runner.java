package org.Runner; 

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\featurefiles\\cart1.feature", glue="org.stepdefinition")


public class Cart1_runner {

	public static WebDriver driver;

	@BeforeClass
	public static void start() {
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--remote-allow-origns=*");
	driver=new ChromeDriver();
	

	} 

	}

