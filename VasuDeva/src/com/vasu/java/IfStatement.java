package com.vasu.java;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) 
	{
		// Program to Check the given no is "even" / "odd"
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=444;
		
		if(n%2==0)
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}

	}

}
