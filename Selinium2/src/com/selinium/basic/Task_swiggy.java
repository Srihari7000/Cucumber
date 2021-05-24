package com.selinium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_swiggy {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\New\\Selinium2\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/restaurants");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement signin = driver.findElement(By.xpath("//a[text()='Sign up']"));
    signin.click();
    
    WebElement phone_no = driver.findElement(By.id("mobile"));
    phone_no.sendKeys("9094766357");
    
   WebElement login = driver.findElement(By.className("a-ayg"));
   login.click();
    

}

}
