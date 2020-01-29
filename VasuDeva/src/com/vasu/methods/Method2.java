package com.vasu.methods;

public class Method2 
{
	
	
	//method with return type with-out  parameters
	
	
		public static int  add()
		{
			int a=30;
			int b=40;
			int  sum = a+b;
			return sum;
			
		}

	public static void main(String[] args) 
	{
		//Object Ref
		
				Method2 ns=new Method2();
				
				//ns.add(20, 50); //calling a method with method name,it won't return a value
				int res=ns.add();//calling a method with variable ,it will return a value
				
				System.out.println(res);

	}

}
