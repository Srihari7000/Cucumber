package com.selinium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_concepts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New\\Selinium2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Simple_alert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	    Simple_alert.click();
	    Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
      WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
      confirm_alert.click();
      WebElement confirmbox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
      confirmbox.click();
      driver.switchTo().alert().dismiss();
      Thread.sleep(2000);
      WebElement prompt_ALert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
      prompt_ALert.click();
      WebElement prompt_box = driver.findElement(By.xpath("(//button[contains(text(),'click ')])[3]"));
      prompt_box.click();
      driver.switchTo().alert().sendKeys("Srihari");
      driver.switchTo().alert().accept();
      
      
      
      
	}

}
