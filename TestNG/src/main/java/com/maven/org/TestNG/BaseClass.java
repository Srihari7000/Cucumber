package com.maven.org.TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Drivers\\\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Drivers\\\\iedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		}
		return driver;

	}

//for get URL
	public static void geturl(String url) {
		driver.get(url);
	}

	// for drop down
	public static void dropdown(WebElement element, String option, String Value) {
		Select Sc = new Select(element);

		if (option.equalsIgnoreCase("index")) {
			Sc.selectByIndex(Integer.parseInt(Value));
		} else if (option.equalsIgnoreCase("value")) {
			Sc.selectByValue(Value);
		} else if (option.equalsIgnoreCase("text")) {
			Sc.selectByVisibleText(Value);
		}

	}

	// for send keys
	public static void inputelement(WebElement element, String text) {
		element.sendKeys(text);
	}

	// close
	public static void close() {
		driver.close();
	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// click
	public static void clickon(WebElement element) {
		element.click();

	}

// navigate
	public static void navigate(String type, String url) {
		if (type.equalsIgnoreCase("navigate to")) {
			driver.navigate().to(url);
		} else if (type.equalsIgnoreCase("navigate back")) {
			driver.navigate().back();
		} else if (type.equalsIgnoreCase("navigate forward")) {
			driver.navigate().forward();
		} else if (type.equalsIgnoreCase("navigate refresh")) {
			driver.navigate().refresh();
		}

		// alert

	}

	public static void alert(WebElement element, String Type, String Value) {
		if (Type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (Type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (Type.equalsIgnoreCase("text")) {
			element.sendKeys(Value);
		}
	}

	// Actions
	public static void action(WebElement element, String Value) {
		Actions ac = new Actions(driver);
		if (Value.equalsIgnoreCase("move to element")) {
			ac.moveToElement(element).build().perform();
		} else if (Value.equalsIgnoreCase("context click")) {
			ac.contextClick(element).build().perform();
		} else if (Value.equalsIgnoreCase("double click")) {
			ac.doubleClick(element).build().perform();
		}
	}

	// drag and drop
	public static void dragDrop(WebElement from, WebElement to) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(from, to).build().perform();

	}

	// Frames
	public static void Frames(WebElement element, String value) {
		if (value.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(value));
		} else if (value.equalsIgnoreCase("string")) {
			driver.switchTo().frame(value);
		} else if (value.equalsIgnoreCase("path")) {
			driver.switchTo().frame(element);
		}

	}

	// Robot
	public static void robot(String value) throws AWTException {
		Robot rb = new Robot();
		if (value.equalsIgnoreCase("down")) {
			rb.keyPress(KeyEvent.VK_DOWN);
		} else if (value.equalsIgnoreCase("up")) {
			rb.keyPress(KeyEvent.VK_UP);
		} else if (value.equalsIgnoreCase("enter")) {
			rb.keyPress(KeyEvent.VK_ENTER);
		}
	}

}
