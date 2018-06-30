package com.maven.project.demotour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logindemotour {
	@FindBy(name="username")
	WebElement txtusername ;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="submit")
	WebElement btnsubmit;
	WebElement tabHome,tabFlights,tabHotels,tabCarRentals,tabCruises,tabDestinations, tabVacations ;
	WebDriver driver= null;
	
	public logindemotour(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	
	public void setusername(String usernameData)
	{
		
	}
	
	public void setpassword(String passwordData)
	{
		
	}
	
	public welcomepage clicksubmitbutton()
	{
		btnsubmit.click();
		welcomepage w=new welcomepage(driver);
		return w;
		
	}
	
		
	
	
	
	
}
