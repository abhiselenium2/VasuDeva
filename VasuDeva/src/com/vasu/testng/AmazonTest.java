package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonTest 
{
@Test
public void amazon()
{
			//Variable
			String searchElement="Harry Potter";
		
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
			//ChromeDriver driver=new ChromeDriver();
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("Http://amazon.in");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchElement);
			
			driver.findElement(By.className("nav-input")).sendKeys(Keys.ENTER);
			//validation
			if(driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span")).isDisplayed())
			{
				System.out.println("pass");
			}else
			{
				System.out.println("Fail");
			}
}
}
