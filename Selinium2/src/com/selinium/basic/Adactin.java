package com.selinium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adactin extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = browserLaunch("chrome");

		geturl("https://adactinhotelapp.com/index.php");
		Loginpage lp = new Loginpage(driver);

		inputelement(lp.getUsername(), "srihariarun");
		inputelement(lp.getPassword(), "12345678");
		clickon(lp.getLogin_btn());

		// search hotel
		dropdown(driver.findElement(By.id("location")), "text", "Brisbane");
		dropdown(driver.findElement(By.id("hotels")), "index", "2");
		dropdown(driver.findElement(By.id("room_type")), "value", "Standard");
		dropdown(driver.findElement(By.id("room_nos")), "text", "3 - Three");
		inputelement(driver.findElement(By.id("datepick_in")), "18/04/2021");
		inputelement(driver.findElement(By.id("datepick_out")), "21/04/2021");
		dropdown(driver.findElement(By.id("adult_room")), "index", "1");
		dropdown(driver.findElement(By.id("child_room")), "index", "0");
		clickon(driver.findElement(By.id("Submit")));
		clickon(driver.findElement(By.id("radiobutton_0")));
		clickon(driver.findElement(By.id("continue")));
		inputelement(driver.findElement(By.id("first_name")), "Srihari");
		inputelement(driver.findElement(By.id("last_name")), "Arunachalam");
		inputelement(driver.findElement(By.id("address")), "no:8/29,sanjay gandhi nagar");
		inputelement(driver.findElement(By.id("cc_num")), "1234567890123456");
		dropdown(driver.findElement(By.id("cc_type")), "text", "VISA");
		dropdown(driver.findElement(By.id("cc_exp_month")), "text", "February");
		dropdown(driver.findElement(By.id("cc_exp_year")), "text", "2022");
		inputelement(driver.findElement(By.id("cc_cvv")), "456");
		clickon(driver.findElement(By.id("book_now")));
		clickon(driver.findElement(By.linkText("Logout")));
	}
}
