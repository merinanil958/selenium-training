package com.maven.project.demotour;

import org.openqa.selenium.WebElement;

public class basepage {

	public void click(WebElement element)throws Exception
	{
		try {
		element.click();
		}
		catch(Exception e)
		{
			throw new Exception("issue in click on the element"+element.getText()+element.getCssValue(""));
		}
	}
}
