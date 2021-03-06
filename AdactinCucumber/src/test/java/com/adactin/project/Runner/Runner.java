package com.adactin.project.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.project.AdactinCucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\project\\Feature", glue = "com\\adactin\\project\\step_definition", monochrome = true, dryRun = false, strict = true)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = BaseClass.browserLaunch("chrome");

	}

	@AfterClass
	public static void teardown() {
		//driver.quit();
	}
}
