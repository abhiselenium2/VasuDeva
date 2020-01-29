package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		
		/*// identify  the header section by id and store into webelement
		
		WebElement header=driver.findElement(By.id("nav-xshop"));
		
		//Capture all the links under header section and store into webElement
		
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		
		System.out.println(headerLinks.size());
		
		for (int i = 0; i <headerLinks.size(); i++) 
		{
			System.out.println(headerLinks.get(i).getText());
		}*/
		
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15')]/div/div/div/ul/li/span/span/b"));
		System.out.println(links.size());
		
		/*for (int i =0; i <links.size(); i++)
		{
			System.out.println(links.get(i).getText());
		}
*/
links.get(2).click();
	}

}
