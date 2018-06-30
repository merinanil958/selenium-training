package com.maven.project.demotour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumtest {
	public static void main(String[] args)  {
		
		 System.setProperty("webdriver.chrome.driver",
                 "C:\\learntesting\\demotour\\chromedriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 //String baseUrl = "http://newtours.demoaut.com/";
		 		
		driver.get("http://newtours.demoaut.com/");
	}
	
}
/* Xpath of username = /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input
 *          password =//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input
 *          signin   = /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input
 * Registration form 
 *        first name = //input [@name='firstName']
 *          lastname = //input [@name='lastName']
 *          phone    = //input [@name='phone']
 *          email    = #userName
 *          address  = //input [@name='address1']	
 *          city     = //input [@name='city']
 *          state    = //input [@name='state']	
 *        postalcode = //input [@name='postalCode']	
 *          country  = //select [@name='country']	
 *          username = #email
 *          password = //input[@name='password']	
 *   confirmpassword = //input[@name='confirmPassword']
 *          submit   = //input[@name='register]	
 */