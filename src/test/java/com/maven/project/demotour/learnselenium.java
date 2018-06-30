package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class learnselenium extends Baseclass{
	
	WebElement txtusername ;
	WebElement txtpassword;
	WebElement btnsubmit;
	
	
	@BeforeMethod
	public void launch() {
	
	//WebDriver driver= new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	 txtusername = driver.findElement(By.name("username"));
	 txtpassword=driver.findElement(By.name("password"));
	 btnsubmit=driver.findElement(By.name("submit"));
	}
	
	@Test
	public void testregister() {
		
		 txtusername = driver.findElement(By.name("username"));
		 txtpassword=driver.findElement(By.name("password"));
         btnsubmit=driver.findElement(By.name("submit"));
		
		
		txtusername.sendKeys("merin");
		txtpassword.sendKeys("merin@1");
		btnsubmit.click();
		Assert.assertEquals("", "");
	}
	
	@Test
	
public void testlogin() {
		
		
		
		
		txtusername.sendKeys("merin");
		txtpassword.sendKeys("merin@1");
		btnsubmit.click();
		Assert.assertEquals("", "");
	}
}
