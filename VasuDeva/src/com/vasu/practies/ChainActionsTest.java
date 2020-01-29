package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ceoandhra.nic.in/Forms.aspx");
		driver.manage().window().maximize();
		
		
		WebElement pdf=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[3]/a"));

		WebElement cc=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[3]/ul/li[2]/a"));
		WebElement teachers=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[3]/ul/li[2]/ul/li[2]/a"));

		
		Actions chain=new Actions(driver);
		
		chain.moveToElement(pdf).moveToElement(cc).pause(2000).moveToElement(teachers).click().build().perform();
	}

}
