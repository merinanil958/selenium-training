package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class welcomepage {

	WebElement txtWelcome ;
	WebDriver driver;
	
	public welcomepage(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	
	//** this method validates the text
	//return method
		
	public boolean isWelcomeTextAvailable() {
		
		 txtWelcome = driver.findElement(By.name("FLIGHT FINDER"));
		 boolean status;
		status=txtWelcome.getText().equals("Register");
		return status;
	}
}
