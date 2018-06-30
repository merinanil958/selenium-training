package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flight {
	WebDriver driver;
	WebElement txtflightfinder,txtonewaypassengers,txtdepartingfrom,txtdate,txtarrivingin,txtreturning,txtserviceclass,txtairline,btnSubmit ;
	
	public flight(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	public boolean isWelcomeTextAvailable() {
		
		 txtflightfinder = driver.findElement(By.name("Register"));
		 boolean status;
		status=txtflightfinder.getText().equals("Flight Finder");
		return status;
	}
	
	public loginpage flight() {
		txtonewaypassengers = driver.findElement(By.name("onewaypassengers"));
		txtdepartingfrom = driver.findElement(By.name("departingfrom"));
		txtdate = driver.findElement(By.name("date"));
		txtarrivingin = driver.findElement(By.id("arrivingin"));
		txtreturning = driver.findElement(By.name("returning"));
		txtserviceclass = driver.findElement(By.name("serviceclass"));
		txtairline = driver.findElement(By.name("airline"));
		
		btnSubmit = driver.findElement(By.name("continue"));
		
		
		txtonewaypassengers.sendKeys("2");
		txtdepartingfrom.sendKeys("Poland");
		txtdate.sendKeys("July 1st");
		txtarrivingin.sendKeys("Sydney");
		txtreturning.sendKeys("Sep-2nd");
		txtserviceclass.sendKeys("Business");
		txtairline.sendKeys("United Airlines");
		
		btnSubmit.click();
		return new loginpage(driver);
	}

}
