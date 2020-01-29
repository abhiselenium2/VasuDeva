package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		//Identify the dropdown By Using id and store into WebElement
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		//Capturing all the Items Present in dropdown and Store into webElement
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		
		System.out.println(dropList.size());
		
		for (int i = 0; i <dropList.size(); i++)
		{
			//capture the item names present in dropdownList
			//System.out.println(dropList.get(i).getText());
			//Select one by one item from dropdown
			//dropList.get(i).click();
			
			//Select Specific Item from dropDown List
			
			if(dropList.get(i).getText().equals("Baby"))
			{
				dropList.get(i).click();
			}
			
		}
	}

}
