package com.selinium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\New\\Selinium2\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQjw9YWDBhDyARIsADt6sGaM4XWKw5j6IhKCCFPZXpscwLokcfawUUxBGxGqnKEhf4BupIy6ueQaAlbKEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjw9YWDBhDyARIsADt6sGaM4XWKw5j6IhKCCFPZXpscwLokcfawUUxBGxGqnKEhf4BupIy6ueQaAlbKEALw_wcB");
	driver.manage().window().maximize();
	WebElement logo = driver.findElement(By.xpath("//div[@class=\"nav-logo-base nav-sprite\"]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView();", logo);

}
}
