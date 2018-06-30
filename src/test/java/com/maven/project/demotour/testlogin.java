package com.maven.project.demotour;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testlogin {

	WebDriver driver;
	@Test
	public void login_001()
	{
		System.setProperty("webdriver.chrome.driver",
	            "chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		logindemotour Loginpage=new logindemotour(driver);
		Loginpage.setusername("varghese");
		Loginpage.setpassword("varghese");
		
		welcomepage w=Loginpage.clicksubmitbutton();
		Boolean result=w.isWelcomeTextAvailable();
		
		Assert.assertTrue(result,"couldnot not login to activate");
		System.out.println("Login1--Pass");
	}
}
