package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class printpage {
	WebDriver driver;
	public printpage(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	
	public loginpage printpage() {
		System.out.println("Dear Thank you for registering.You may now sign-in using the username and password you've just entered");
		return new loginpage(driver);	
	}

}
