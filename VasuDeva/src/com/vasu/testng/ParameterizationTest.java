package com.vasu.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest {

	@Test(dataProvider="getData")
	public void sample(String un,String pd)
	{
		System.out.println("UserName is : "+un);
		System.out.println("Password is : "+pd);
		
	}
	
	@DataProvider
	public Object[][]  getData()
	{
		
		Object [][] data=new Object[2][2];
		
		data[0][0]="Jaspreeth";
		data[0][1]="Abhinaya";
		data[1][0]="Jaspreeth1";
		data[1][1]="Abhinaya2";

		return data;
	}
}
