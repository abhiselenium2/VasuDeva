package com.vasu.methods;

public class Method1 
{

	//method with return type with parameters
	
	
	public  int  add(int a,int b)
	{
		
		int  sum = a+b;
		return sum;
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		//Object Ref
		
		Method1 ns=new Method1();
		
		//ns.add(20, 50); //calling a method with method name,it won't return a value
		int res=ns.add(40, 50);//calling a method with variable ,it will return a value
		
		System.out.println(res);
	}

}
