package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("u_0_6")).click();
		
	WebElement radio=driver.findElement(By.className("_5k_3"));
	//Handling all the three radio buttons
	/*List<WebElement> radioList=radio.findElements(By.tagName("input"));
	
	System.out.println(radioList.size());
	
	for (int i = 0; i < radioList.size(); i++)
	{
		radioList.get(i).click();
		
		for (int j = 0; j < radioList.size(); j++)
		{
			System.out.println(radioList.get(j).getAttribute("checked"));
		
		}
		System.out.println("########");
	}*/
	
	//capturing all the names of radiobuttons
	
List<WebElement> radioNames=radio.findElements(By.tagName("label"));
	
	System.out.println(radioNames.size());
	
	for (int i = 0; i < radioNames.size(); i++) 
	{
		System.out.println(radioNames.get(i).getText());
	}
	}

}
