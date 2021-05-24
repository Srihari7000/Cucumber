package com.selinium.basic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
public static void main(String[] args) throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver","D:\\New\\Selinium2\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

	search.sendKeys("laptop table for home");
	
WebElement click = driver.findElement(By.id("nav-search-submit-button"));
	click.click();
	
	WebElement table = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
	table.click();
	WebElement review = driver.findElement(By.xpath("//a[contains(@role,'button')][1]"));
	review.click();
		
	
	
}
}
	