package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlAlertsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();

		
		//handle html alert/pop up
		
		driver.findElement(By.xpath(".//*[@id='popupBoxClose']")).click();
	}

}
