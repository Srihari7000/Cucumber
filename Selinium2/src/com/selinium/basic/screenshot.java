package com.selinium.basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New\\Selinium2\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
driver.manage().window().maximize();

Thread.sleep(2000);
TakesScreenshot ts = (TakesScreenshot) driver;
File sourcefile = ts.getScreenshotAs(OutputType.FILE);
File desfile = new File("D:\\New\\Selinium2\\Screenshot\\greenshomepage.png");
FileUtils.copyFile(sourcefile, desfile);


}

}

