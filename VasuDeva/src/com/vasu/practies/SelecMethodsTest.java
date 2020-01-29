package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecMethodsTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		sl.selectByIndex(26);//total 42 
		//sl.selectByVisibleText("Music");
		//sl.selectByValue("search-alias=automotive");

		//capture all the items from the dropdown by using select class method
		/*
		List<WebElement> dropList=sl.getOptions();
		
		System.out.println(dropList.size());
		for (WebElement element : dropList)
		{
			System.out.println(element.getText());
		}*/
		
		////print the first selected item from dropdownlist
		//System.out.println(sl.getFirstSelectedOption().getText());
		//verify is it possible to select multiple item 
		//System.out.println(sl.isMultiple());
		
		List<WebElement> selectedItems=sl.getAllSelectedOptions();
		
		System.out.println(selectedItems.size());
		for (int i = 0; i < selectedItems.size(); i++)
		{
			System.out.println(selectedItems.get(i).getText());
		}
		
		
	}

}
