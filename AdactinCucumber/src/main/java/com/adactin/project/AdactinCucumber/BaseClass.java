package com.adactin.project.AdactinCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
public static WebDriver driver;
 public static WebDriver browserLaunch(String browser ) {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);}
		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\\\iedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);}
	return driver;
	
 }
//for get URL
 public static void geturl(String url) {
	driver.get(url);
}
 //for drop down
 public static void dropdown(WebElement element, String option, String Value) {
	Select Sc = new Select(element);
	
	if (option.equalsIgnoreCase("index")) {
Sc.selectByIndex(Integer.parseInt(Value));		
	}else if (option.equalsIgnoreCase("value")) {
		Sc.selectByValue(Value);
	}else if (option.equalsIgnoreCase("text")) {
		Sc.selectByVisibleText(Value);
			}
		
	}
	//for send keys
 public static void inputelement(WebElement element, String text) {
	 element.sendKeys(text);}
 //close
 public static void close() {
	driver.close();}
 //quit
  public static void quit() {
	  driver.quit();}
  //click
  public static void clickon(WebElement element) {
	element.click();





}
	

}
 
 
 

