package com.maven.project.demotour;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testwelcome {
	WebDriver driver;
	@Test
	public void login()
	{
		loginpage Loginpage=new loginpage(driver);
		//welcomepage welcomepage=Loginpage.loginpage("merin","merin@");
		//Assert.assertTrue(welcomepage.isWelcomeTextAvailable(),"Welcome Text is not available");
		
	}
}
