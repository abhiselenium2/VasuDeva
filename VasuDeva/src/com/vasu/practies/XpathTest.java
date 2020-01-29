package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("Vasudeva");

	}

}
