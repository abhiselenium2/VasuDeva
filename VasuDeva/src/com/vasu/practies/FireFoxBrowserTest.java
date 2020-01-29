package com.vasu.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.vasu.java.Vasu;

public class FireFoxBrowserTest //Test Cases
{

	public static void main(String[] args)
	{
		// Program to launch firefox browser and navigate to gmail
		
		FirefoxDriver driver=new FirefoxDriver();
		//naviagte to gmail
		driver.get("Http://gmail.com");
		

	}

}
