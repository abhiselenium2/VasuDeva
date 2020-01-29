package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{
		String expTitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		String actTitle=driver.getTitle();
		
		//validation
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Link is working");
		}else
		{
			System.out.println("Link is Not working");
		}
		
		
	}

}
