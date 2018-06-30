package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register {
	WebDriver driver;
	WebElement txtregister ;
	WebElement txtfirstname,txtlastname,txtphone,txtemail,txtaddress,txtcity,txtstate,txtpostalcode,txtcountry;
	WebElement txtusername,txtPassword ;
	WebElement btnSubmit ;
	public register(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	public boolean isWelcomeTextAvailable() {
		
		 txtregister = driver.findElement(By.name("Register"));
		 boolean status;
		status=txtregister.getText().equals("Register");
		return status;
	}
	
	public printpage register() {
		txtfirstname = driver.findElement(By.name("firstName"));
		txtlastname = driver.findElement(By.name("lastName"));
		txtphone = driver.findElement(By.name("phone"));
		txtemail = driver.findElement(By.id("userName"));
		txtaddress = driver.findElement(By.name("address1"));
		txtcity = driver.findElement(By.name("city"));
		txtstate = driver.findElement(By.name("state"));
		txtpostalcode = driver.findElement(By.name("postalCode"));
		txtcountry = driver.findElement(By.name("country"));
		txtusername = driver.findElement(By.id("email"));
		txtPassword = driver.findElement(By.name("password"));
		btnSubmit = driver.findElement(By.name("register"));

		
		btnSubmit.click();
		return new printpage(driver);
	}

}
