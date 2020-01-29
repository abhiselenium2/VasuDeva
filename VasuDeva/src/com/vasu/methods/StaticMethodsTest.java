package com.vasu.methods;

public class StaticMethodsTest 
{
	//static method with return type with parameters
	
	
		public static int  add(int a,int b)
		{
			
			int  sum = a+b;
			return sum;
			
		}
		
		public static void main(String[] args) 
		{
			int res=StaticMethodsTest.add(20, 30);//calling a static method --->classname.methodname
			System.out.println(res);
		}
}
