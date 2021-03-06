package com.adactin.project.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.project.AdactinCucumber.BaseClass;
import com.adactin.project.Runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefition extends BaseClass{

public static WebDriver Driver = Runner.driver;
@Given("^user launch of adactin application$")
public void user_launch_of_adactin_application() throws Throwable {
	geturl("https://adactinhotelapp.com/index.php");
    
}

@When("^user enter \"([^\"]*)\" as username$")
public void user_enter_as_username(String arg1) throws Throwable {
	inputelement(driver.findElement(By.id("username")), arg1);
    
}

@When("^user enter \"([^\"]*)\" as password$")
public void user_enter_as_password(String arg1) throws Throwable {
    inputelement(driver.findElement(By.id("password")), arg1);
    
}

@When("^user click login button$")
public void user_click_login_button() throws Throwable {
    
    clickon(driver.findElement(By.id("login")));
}

@Then("^user validate valid username and valid password$")
public void user_validate_valid_username_and_valid_password() throws Throwable {
    
    
}

}
