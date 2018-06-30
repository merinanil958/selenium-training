package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class studymethod {
	WebDriver driver;
	WebElement txta,txtb,txtc,btnsubmit;
	public studymethod(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	public boolean flight(String a,String b,String c) {
		boolean status;
		txta = driver.findElement(By.name("onewaypassengers"));
		txtb = driver.findElement(By.name("departingfrom"));
		txtc = driver.findElement(By.name("date"));
		btnsubmit = driver.findElement(By.id("arrivingin"));
		
		
		txta.sendKeys(a);
		if((a==null)||(a.equals(""))) {
		txtb.sendKeys(b);
		}
		txtc.sendKeys(c);
		status=!txta.getText().equals("");
	
		printMessage(status,"c is not available");
		btnsubmit.click();
		return status;
		
		 
     }
	
	public void printMessage(boolean status,String msg)
	{
		if(!status==false) {
		System.out.println(msg);
		}
	}
		public void interactions()
				{
			WebElement commonElement=driver.findElement(By.id(""));
				
	//dropdown
	new Select(commonElement).selectByIndex(1);
	new Select(commonElement).selectByVisibleText("New Zealand");
	
	commonElement.click();
	commonElement.isEnabled();
	
	Actions action = new Actions(driver);
	action.doubleClick();
	action.clickAndHold().release().build().perform();//if more than one action we need to build before perform
	action.moveToElement(commonElement);
	
	}

