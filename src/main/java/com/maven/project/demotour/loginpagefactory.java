package com.maven.project.demotour;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class loginpagefactory {
	
	
	
	WebDriver driver;
	
	@FindBy(name= "username")//@findBy(locator,locatorvalue)
	WebElement txtusername ;
	
	
	@FindBy(css="input[name='password]")
	WebElement txtpassword;
	
	@FindBy(css="input[name='submit]")
	WebElement btnsubmit;
	
	@FindBy(css="a")
	List<WebElement> links;
	
	
	public loginpagefactory(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	
	public register loginpage(String username,String password) {
		
		// txtusername = driver.findElement(By.name("username"));
		 //txtpassword=driver.findElement(By.name("password"));
        btnsubmit=driver.findElement(By.name("submit"));
        
		
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btnsubmit.click();
		return new register(driver);
		
		
		
		
	}

}
