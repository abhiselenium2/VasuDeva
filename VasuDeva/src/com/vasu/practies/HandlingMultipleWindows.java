package com.vasu.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Parent page
		
		String parent =driver.getWindowHandle();
		
		//System.out.println(parent);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div")).click();
		//child page
		
		Set<String> Windows =driver.getWindowHandles();
		
		System.out.println(Windows.size());
		/*
		for (String child : Windows)
		{
			//capture all window id's
			//System.out.println(child);
			
			//close one by one window
			
			//driver.switchTo().window(child);
			
			//System.out.println(driver.getTitle());
			//driver.close();
			
			driver.switchTo().window(child);
			
			if (!driver.getTitle().equals("Tech Mahindra"))
			{
				driver.close();
			}
		}
*/
		
		/*Iterator<String> it=Windows.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next().toString());
			
			driver.switchTo().window(it.next().toString());
			System.out.println(driver.getTitle());
			driver.close();
		}*/
		
		List<String> tab=new ArrayList(Windows);
		
		driver.switchTo().window(tab.get(0));
		driver.close();
		
		driver.switchTo().window(tab.get(2));
		driver.close();
		
		
		
	}

}
