package com.vasu.java;

public class StringValidationTest {

	public static void main(String[] args) 
	{
		/*String data="Selenium VasuDeva";
		String data1="Selenium";
		//validation
		if(data.equals(data1))//false
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		
		String data="Selenium VasuDeva";
		String data1="Abhinaya";
		
		if (data.contains(data1))
		{
			System.out.println("Exist");
		}else
		{
			System.out.println("Not Exist");
		}
		
	}

}
