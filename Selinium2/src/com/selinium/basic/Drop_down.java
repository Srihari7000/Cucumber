package com.selinium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Select;

import okio.Timeout;

public class Drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New\\Selinium2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		// WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("srihari");
//WebElement password = driver.findElement(By.id("pass"));
//password.sendKeys("*****");
		WebElement create_new = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create_new.click();
		Thread.sleep(3000);

		WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fn.click();
		fn.sendKeys("srihari");
		WebElement sn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sn.click();
		sn.sendKeys("arunachalam");
		WebElement phno = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		phno.click();
		phno.sendKeys("9094766357");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("****");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select sc = new Select(day);
		sc.selectByValue("5");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("Month"));
		Select sc2 = new Select(month);
		sc2.selectByValue("1");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select sc3 = new Select(year);
		sc3.selectByValue("1988");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.name("sex"));

		gender.click();
		WebElement signup = driver.findElement(By.xpath("//label[text()='Male']"));
		signup.click();

	}

}
