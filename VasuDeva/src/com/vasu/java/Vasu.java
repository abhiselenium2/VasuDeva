package com.vasu.java;

public class Vasu
{
	//variable
	int i=30;
	
	//method
	public void add()
	{
		int a=70;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		//Object
		
Vasu v=new Vasu();
v.add();//method 
System.out.println(v.i);//variable
	}

}
