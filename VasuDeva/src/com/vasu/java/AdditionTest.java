package com.vasu.java;

import com.vasu.methods.Method1;
import com.vasu.methods.StaticMethodsTest;

public class AdditionTest
{

	public static void main(String[] args) 
	{
		//re using non-static methods
		Method1 ns=new Method1();
		int res=ns.add(40, 50);//calling a method with variable ,it will return a value
		
		System.out.println(res);
		
		//reusing static method
		
		int res1=StaticMethodsTest.add(100,200);//calling static method with variable
		System.out.println(res1);

	}

}
