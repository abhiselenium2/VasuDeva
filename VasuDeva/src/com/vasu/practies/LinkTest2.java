package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest2 {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		
		//Capturing all the links by using tagName and store into webelement
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
			
		{
			/*//capturing all the link names
			//System.out.println(links.get(i).getText());
*/			
			/*//capturing links which has text property
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());	
			}
*/		
			//click on specific link
			
			if(links.get(i).getText().equals("Privacy"))
			{
				links.get(i).click();
			}
			}

	}

}
