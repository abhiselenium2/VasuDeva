package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KsrtcTest {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("New User Register")).click();
		
		//validation
		if(driver.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[1]/label")).isDisplayed())
		{
			System.out.println("pass");
		}else
		{
			System.out.println("Fail");
		}

	}

}
