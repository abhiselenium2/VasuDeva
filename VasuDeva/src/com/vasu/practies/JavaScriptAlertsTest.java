package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertsTest 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		
		Thread.sleep(3000);
		//handle java script alert 
		
		Alert al=driver.switchTo().alert();
		
		//al.accept();//click on Ok
		
		//al.dismiss();//clicl on cancel
		
		//al.getText();//capture the text
		
		//al.sendKeys("vasudeva");//enter data 
		
		System.out.println(al.getText());
		
		al.accept();
		
		
		

	}

}
