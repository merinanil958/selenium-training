package com.maven.project.demotour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginpage {
	WebElement txtusername ;
	WebElement txtpassword;
	WebElement btnsubmit;
	WebElement tabHome,tabFlights,tabHotels,tabCarRentals,tabCruises,tabDestinations, tabVacations ;
	WebDriver driver= null;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver; //localdriver
	}
	
	public register loginpage(String username,String password) {
		
		 txtusername = driver.findElement(By.name("username"));
		 txtpassword=driver.findElement(By.name("password"));
        btnsubmit=driver.findElement(By.name("submit"));
        tabHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
        tabFlights=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
        tabHotels=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a"));
        tabCarRentals=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
        tabCruises=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a"));
        tabDestinations=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a"));
        tabVacations=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
		
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btnsubmit.click();
		return new register(driver);
		
		
		
		
	}
	
	public flight loginpage() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click(); 
		return new flight(driver);	
	}
	
	public boolean isUsernameTextAvailable() {
		
		 txtusername = driver.findElement(By.name("username"));
		 boolean status;
		status=txtusername.getText().equals("username");
		return status;
	}
	

}
